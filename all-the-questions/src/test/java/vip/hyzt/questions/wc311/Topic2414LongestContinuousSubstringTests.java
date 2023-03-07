package vip.hyzt.questions.wc311;

import org.junit.Test;
import vip.hyzt.questions.wc311.Topic2414LongestContinuousSubstring;

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
