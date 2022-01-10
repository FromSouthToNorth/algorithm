package vip.hyzt.questions;

import org.junit.Test;

public class Topic3LengthOfLongestSubstringTests {

    @Test
    public void slidingWindow() {
        String str = "abcabcbb";
        System.out.println(Topic3LengthOfLongestSubstring.slidingWindow(str));
    }

    @Test
    public void hashSlidingWindow() {
        String str = "cccyczceabd";
        System.out.println(Topic3LengthOfLongestSubstring.hashSlidingWindow(str));
    }

    @Test
    public void bucketDingWindow() {
        String str = "cccayczceabd";
        System.out.println(Topic3LengthOfLongestSubstring.bucketDingWindow(str));
    }

}
