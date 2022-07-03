package vip.hyzt.questions;

import org.junit.Test;

public class Topic6108DecodeMessageTests {

    @Test
    public void decodeMessage() {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.printf("%s \n", Topic6108DecodeMessage.decodeMessage(key, message));
    }

}
