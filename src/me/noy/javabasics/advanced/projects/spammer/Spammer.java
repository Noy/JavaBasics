package me.noy.javabasics.advanced.projects.spammer;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <p/>
 * Latest Change: 23/07/2014.
 * <p/>
 *
 * @author Noy
 * @since 23/07/2014.
 */
final class Spammer {

    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        print("Welcome to the Spammer, created by Noy!");
        print("Type either: Start/Stop!");
        String startOrStop = scanner.nextLine();
        final SpamHandlerInt spammer;
        if (startOrStop.contains("start")) {
            try {
                print("Type the message you want to spam!");
                String message = scanner.nextLine();
                spammer = new SpamHandlerInt(message);
                print("Type the amount of times you want this to spam!");
                final Integer times = scanner.nextInt();
                print("You have chosen " + times + " for the spammer to spam! 5 seconds until it starts!");
                Runnable runnable = () -> {
                    try {
                        spammer.start(times);
                    } catch (InterruptedException | AWTException e) {
                        e.printStackTrace();
                    }
                    SCHEDULED_EXECUTOR_SERVICE.shutdown();
                };
                SCHEDULED_EXECUTOR_SERVICE.schedule(runnable, 5L, TimeUnit.SECONDS);
            } catch (Exception e) { print("Not a recognised character!"); }
        } else if (startOrStop.contains("stop")) {
            spammer = new SpamHandlerInt(null);
            spammer.stop();
        }
    }

    @SafeVarargs
    private static <T> void print(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
}