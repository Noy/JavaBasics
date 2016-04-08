package me.noy.javabasics.advanced.projects.clickbot;

import java.awt.*;
import java.util.Scanner;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * <p/>
 * Latest Change: 21/09/2014.
 * <p/>
 *
 * @author Noy
 * @since 21/09/2014.
 */
final class AutoClicker {

    private static final ScheduledExecutorService SCHEDULED_EXECUTOR_SERVICE = Executors.newSingleThreadScheduledExecutor();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print("Welcome to the ClickBot, created by Noy!");
        print("Type either start or stop!");
        String startOrStop = scanner.nextLine();
        final ClickHandler clickHandler;
        if (startOrStop.contains("start")) {
            try {
                clickHandler = new ClickHandler();
                print("How many times do you want it to click?");
                final Integer times = scanner.nextInt();
                print("You have chosen to click " + times + " times! 5 seconds until it starts!");
                Runnable runnable = () -> {
                    try {
                        clickHandler.start(times);
                    } catch (AWTException | InterruptedException e) {
                        e.printStackTrace();
                    }
                    SCHEDULED_EXECUTOR_SERVICE.shutdown();
                };
                SCHEDULED_EXECUTOR_SERVICE.schedule(runnable, 5L, TimeUnit.SECONDS);
            } catch (Exception e) {
                print("Not a recognised number, shutting down.");
            }
        } else if (startOrStop.contains("stop")) {
            clickHandler = new ClickHandler();
            clickHandler.stop();
        }
    }

    // As always
    @SafeVarargs
    private static <T> void print(T... args) {
        for (T t : args) {
            System.out.println(t);
        }
    }
}
