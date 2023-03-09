package vip.hyzt.questions.wc319;

import org.junit.Test;
import vip.hyzt.questions.wc319.Topic2472MaxPalindromes;

public class Topic2472MaxPalindromesTests {

    @Test
    public void maxPalindromes() {
        Topic2472MaxPalindromes topic2472MaxPalindromes = new Topic2472MaxPalindromes();
        System.out.printf("res: %d \n", topic2472MaxPalindromes.maxPalindromes("abaccdbbd", 3));
        System.out.printf("res: %d \n", topic2472MaxPalindromes.maxPalindromes("asdfghgfdsasdfghghghgqwertytrewqwertyt", 11));
        System.out.printf("res: %d \n", topic2472MaxPalindromes.maxPalindromes("adbcda", 2));
    }

}
