package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic2545SortTheStudentsTests {

    @Test
    public void sortTheStudents() {
        Topic2545SortTheStudents topic2545SortTheStudents = new Topic2545SortTheStudents();
        System.out.printf("res: %s\n", Arrays.deepToString(topic2545SortTheStudents.sortTheStudents(new int[][]{ { 10, 6, 9, 1 }, { 7, 5, 11, 2 }, { 4, 8, 3, 15 } }, 2)));
        System.out.printf("res: %s\n", Arrays.deepToString(topic2545SortTheStudents.sortTheStudents(new int[][]{ { 3, 4 }, { 5, 6 } }, 0)));
    }

}
