package vip.hyzt.questions;

import org.junit.Test;

public class Topic2512TopStudentsTests {

    @Test
    public void topStudents() {
        Topic2512TopStudents topic2512TopStudents = new Topic2512TopStudents();
        System.out.printf("res: %s\n", topic2512TopStudents.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is studious", "the student is smart"}, new int[]{1, 2}, 2));
        System.out.printf("res: %s\n", topic2512TopStudents.topStudents(new String[]{"smart", "brilliant", "studious"}, new String[]{"not"}, new String[]{"this student is not studious", "the student is smart"}, new int[]{1, 2}, 2));
    }

}
