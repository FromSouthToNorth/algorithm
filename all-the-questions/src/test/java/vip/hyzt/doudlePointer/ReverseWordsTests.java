package vip.hyzt.doudlePointer;

import org.junit.Test;
import vip.hyzt.doublePointer.ReverseWords;

public class ReverseWordsTests {

    @Test
    public void reverseWords() {
        String s = "Let's take LeetCode contest";
        String result = ReverseWords.reverseWords(s);
        System.out.println(result);
    }

}
