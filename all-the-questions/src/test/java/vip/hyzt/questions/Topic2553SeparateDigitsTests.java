package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2553SeparateDigitsTests {

    @Test
    public void separateDigits() {
        Topic2553SeparateDigits topic2553SeparateDigits = new Topic2553SeparateDigits();
        System.out.printf("res: %s\n", Arrays.toString(topic2553SeparateDigits.separateDigits(new int[]{ 13, 25, 83, 77 })));
        System.out.printf("res: %s\n", Arrays.toString(topic2553SeparateDigits.separateDigits(new int[]{ 7, 1, 3, 9 })));
    }

}
