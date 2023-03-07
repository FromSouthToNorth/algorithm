package vip.hyzt.questions.wcb85;

import org.junit.Test;
import vip.hyzt.questions.wcb85.Topic2381ShiftingLetters;

public class Topic2381ShiftingLettersTests {

    @Test
    public void shiftingLetters() {
        String s = "abc";
        int[][] shifts = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        Topic2381ShiftingLetters topic2381ShiftingLetters = new Topic2381ShiftingLetters();
        String res = topic2381ShiftingLetters.shiftingLetters(s, shifts);
        System.out.println(res);
    }

}
