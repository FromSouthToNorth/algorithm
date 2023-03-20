package vip.hyzt.questions.wcb100;

import org.junit.Test;

public class Topic2594RepairCarsTests {

    @Test
    public void repairCars() {
        Topic2594RepairCars topic2594RepairCars = new Topic2594RepairCars();
        System.out.printf("res: %d\n", topic2594RepairCars.repairCars(new int[] { 4, 2, 3, 1 }, 10));
        System.out.printf("res: %d\n", topic2594RepairCars.repairCars(new int[] { 5, 1, 8 }, 6));
    }

}
