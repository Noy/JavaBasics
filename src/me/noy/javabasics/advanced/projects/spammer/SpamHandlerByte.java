package me.noy.javabasics.advanced.projects.spammer;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by Noy on 11/13/2015.
 */
final class SpamHandlerByte implements SpamDelegate<Byte> {

    private final String message;

    /**
     * The reason for this class is because some people can't be trusted. The Primitive data type 'Byte' limits them to 127 times they can spam.
     * Believe me, it makes a difference...
     * @param message ignored
     */

    SpamHandlerByte(String message) { this.message = message; }

    @Override
    public void start(Byte amount) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        char[] chars = message.toCharArray();
        for (int x = 0; x < amount; x++) {
            for (char stroke : chars) {
                boolean upperCase = Character.isUpperCase(stroke);
                if (upperCase) robot.keyPress(KeyEvent.VK_SHIFT);
                robot.keyPress(Character.toUpperCase(stroke));
                Thread.sleep(5L);
                robot.keyRelease(stroke);
                if (upperCase) robot.keyRelease(KeyEvent.VK_SHIFT);
            }
            robot.keyPress(KeyEvent.VK_ENTER);
            Thread.sleep(5);
        }
    }

    @Override
    public void stop() { throw new RuntimeException(); }
}
