package vip.hyzt.questions;

import org.junit.Test;

public class Topic2414LongestContinuousSubstringTests {

    @Test
    public void longestContinuousSubstring() {
        Topic2414LongestContinuousSubstring topic2414LongestContinuousSubstring = new Topic2414LongestContinuousSubstring();
        String[] strs = { "abc", "abacaba", "abcde" };
        for (String str : strs) {
            System.out.printf("%s: %d\n",str, topic2414LongestContinuousSubstring.longestContinuousSubstring(str));
        }
    }

}
