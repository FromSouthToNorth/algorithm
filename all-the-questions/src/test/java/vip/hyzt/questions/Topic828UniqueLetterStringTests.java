package vip.hyzt.questions;

import org.junit.Test;

public class Topic828UniqueLetterStringTests {

    @Test
    public void uniqueLetterString() {
        Topic828UniqueLetterString topic828UniqueLetterString = new Topic828UniqueLetterString();
        String s1 = "ABC";
        System.out.printf("res: %d\n", topic828UniqueLetterString.uniqueLetterString(s1));
        String s2 = "ABA";
        System.out.printf("res: %d\n", topic828UniqueLetterString.uniqueLetterString(s2));
        String s3 = "LEETCODE";
        System.out.printf("res: %d\n", topic828UniqueLetterString.uniqueLetterString(s3));
    }

}
