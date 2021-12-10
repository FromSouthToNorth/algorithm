package vip.hyzt.questions;

import org.junit.Test;

public class LengthOfLongestSubstring3Tests {

    @Test
    public void slidingWindow() {
        String str = "abcabcababcdc";
        System.out.println(LengthOfLongestSubstring3.slidingWindow(str));
    }

    @Test
    public void hashSlidingWindow() {
        String str = "cccyczceabd";
        System.out.println(LengthOfLongestSubstring3.hashSlidingWindow(str));
    }

    @Test
    public void bucketDingWindow() {
        System.out.println(LengthOfLongestSubstring3.bucketDingWindow("cccayczceabd"));
    }

}
