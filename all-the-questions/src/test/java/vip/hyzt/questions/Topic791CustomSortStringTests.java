package vip.hyzt.questions;

import org.junit.Test;

public class Topic791CustomSortStringTests {

    @Test
    public void customSortString() {
        Topic791CustomSortString topic791CustomSortString = new Topic791CustomSortString();
        System.out.printf("res: %s\n", topic791CustomSortString.customSortString("cba", "abcd"));
        System.out.printf("res: %s\n", topic791CustomSortString.customSortString("cbafg", "abcd"));
        System.out.printf("res: %s\n", topic791CustomSortString.customSortString("d", "abcdefg"));
    }

}
