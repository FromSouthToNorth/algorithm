package vip.hyzt.questions.wcb100;

import org.junit.Test;

public class Topic2592MaximizeGreatnessTests {

    @Test
    public void maximizeGreatness() {
        Topic2592MaximizeGreatness topic2592MaximizeGreatness = new Topic2592MaximizeGreatness();
        System.out.printf("res: %d\n", topic2592MaximizeGreatness.maximizeGreatness(new int[] { 1, 3, 5, 2, 1, 3, 1 }));
        System.out.printf("res: %d\n", topic2592MaximizeGreatness.maximizeGreatness(new int[] { 1, 2, 3, 4 }));
    }


}
