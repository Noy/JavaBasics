package me.noy.javabasics.advanced.projects.clickbot;

import java.awt.*;
import java.awt.event.InputEvent;

/**
 * <p/>
 * Latest Change: 21/09/2014.
 * <p/>
 *
 * @author Noy
 * @since 21/09/2014.
 */
final class ClickHandler {

    void start(Integer amount) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        for (int x = 0; x < amount; x++) {
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            Thread.sleep(5L);
        }
    }

    void stop() { throw new RuntimeException(); }
}
