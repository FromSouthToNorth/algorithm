package vip.hyzt.questions;

import org.junit.Test;

public class Topic6166LargestPalindromicTests {

    @Test
    public void largestPalindromic() {
        Topic6166LargestPalindromic largestPalindromic = new Topic6166LargestPalindromic();
        String nums = "444947137";
        String count = largestPalindromic.largestPalindromic(nums);
        System.out.printf("%s \n", count);
    }

}
