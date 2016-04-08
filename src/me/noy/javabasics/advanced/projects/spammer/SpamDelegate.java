package me.noy.javabasics.advanced.projects.spammer;

import java.awt.*;

/**
 * <p/>
 * Latest Change: 23/07/2014.
 * <p/>
 *
 * @author Noy
 * @since 17/07/2014.
 */
interface SpamDelegate<T extends Number> {
    void start(T amount) throws InterruptedException, AWTException;
    void stop();
}