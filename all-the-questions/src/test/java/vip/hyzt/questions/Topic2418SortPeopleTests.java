package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2418SortPeopleTests {

    @Test
    public void sortPeople() {
        String[] names = { "a", "b", "c"};
        int[] heights = { 169, 168, 170 };
        Topic2418SortPeople topic2418SortPeople = new Topic2418SortPeople();
        System.out.printf("res: %s\n", Arrays.toString(topic2418SortPeople.sortPeople(names, heights)));
    }

}
