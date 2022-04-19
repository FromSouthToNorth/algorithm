package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic821ShortestToCharTests {

    @Test
    public void shortestToChar() {
        String s = "abcdefcd";
        char c = 'c';
        int[] ans = Topic821ShortestToChar.shortestToChar(s, c);
        System.out.printf("%s \n", Arrays.toString(ans));
    }

}
