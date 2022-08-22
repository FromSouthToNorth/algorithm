package vip.hyzt.questions;

import org.junit.Test;

public class Topic6158ShiftingLettersTests {

    @Test
    public void shiftingLetters() {
        String s = "abc";
        int[][] shifts = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        Topic6158ShiftingLetters topic6158ShiftingLetters = new Topic6158ShiftingLetters();
        String res = topic6158ShiftingLetters.shiftingLetters(s, shifts);
        System.out.println(res);
    }

}
