package vip.hyzt.questions;

import org.junit.Test;

public class Topic2325DecodeMessageTests {

    @Test
    public void decodeMessage() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.printf("%s \n", Topic2325DecodeMessage.decodeMessage(key, message));
    }

}
