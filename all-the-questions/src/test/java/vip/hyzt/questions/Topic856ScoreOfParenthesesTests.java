package vip.hyzt.questions;

import org.junit.Test;

public class Topic856ScoreOfParenthesesTests {

    @Test
    public void scoreOfParentheses() {
        Topic856ScoreOfParentheses topic856ScoreOfParentheses = new Topic856ScoreOfParentheses();
        String[] s = { "()", "(())", "()()", "(()(()))" };
        for (String s1 : s) {
            System.out.printf("res: %d\n", topic856ScoreOfParentheses.scoreOfParentheses(s1));
        }
    }

}
