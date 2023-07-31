package vip.hyzt.questions.wc356;

import org.junit.Test;

public class Topic2798NumberOfEmployeesWhoMetTargetTests {

    @Test
    public void numberOfEmployeesWhoMetTarget() {
        Topic2798NumberOfEmployeesWhoMetTarget numberOfEmployeesWhoMetTarget = new Topic2798NumberOfEmployeesWhoMetTarget();
        int[] hours1 = { 0, 1, 2, 3, 4 };
        System.out.printf("res:%d\n", numberOfEmployeesWhoMetTarget.numberOfEmployeesWhoMetTarget(hours1, 2));
        int[] hours2 = { 5, 1, 4, 2, 2 };
        System.out.printf("res:%d\n", numberOfEmployeesWhoMetTarget.numberOfEmployeesWhoMetTarget(hours1, 6));
    }

}
