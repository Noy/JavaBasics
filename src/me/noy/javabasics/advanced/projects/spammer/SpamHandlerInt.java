package me.noy.javabasics.advanced.projects.spammer;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * <p/>
 * Latest Change: 23/07/2014.
 * <p/>
 *
 * @author Noy
 * @since 14/07/2014.
 */
final class SpamHandlerInt implements SpamDelegate<Integer> {

    private final String message;

    SpamHandlerInt(String message) { this.message = message; }

    @Override
    public void start(Integer amount) throws InterruptedException, AWTException {
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