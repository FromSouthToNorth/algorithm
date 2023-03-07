package vip.hyzt.questions.wc307;

import org.junit.Test;
import vip.hyzt.questions.wc307.Topic2384LargestPalindromic;

public class Topic2384LargestPalindromicTests {

    @Test
    public void largestPalindromic() {
        Topic2384LargestPalindromic largestPalindromic = new Topic2384LargestPalindromic();
        String nums = "444947137";
        String count = largestPalindromic.largestPalindromic(nums);
        System.out.printf("%s \n", count);
    }

}
