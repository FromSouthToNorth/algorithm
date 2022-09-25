package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic6188SortPeopleTests {

    @Test
    public void sortPeople() {
        String[] names = { "a", "b", "c"};
        int[] heights = { 169, 168, 170 };
        Topic6188SortPeople topic6188SortPeople = new Topic6188SortPeople();
        System.out.printf("res: %s\n", Arrays.toString(topic6188SortPeople.sortPeople(names, heights)));
    }

}
