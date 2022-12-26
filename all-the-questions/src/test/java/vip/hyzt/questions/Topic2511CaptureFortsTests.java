package vip.hyzt.questions;

import org.junit.Test;

public class Topic2511CaptureFortsTests {

    @Test
    public void captureForts() {
        Topic2511CaptureForts topic2511CaptureForts = new Topic2511CaptureForts();
        System.out.printf("res: %d\n", topic2511CaptureForts.captureForts(new int[]{1, 0, 0, -1, 0, 0, 0, 0, 1}));
        System.out.printf("res: %d\n", topic2511CaptureForts.captureForts(new int[]{0, 0, 0, 1, -1}));
    }

}
