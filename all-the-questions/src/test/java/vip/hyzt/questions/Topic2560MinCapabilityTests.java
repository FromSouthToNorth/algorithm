package vip.hyzt.questions;

import org.junit.Test;

public class Topic2560MinCapabilityTests {

    @Test
    public void minCapability() {
        Topic2560MinCapability topic2560MinCapability = new Topic2560MinCapability();
        System.out.printf("res: %d\n", topic2560MinCapability.minCapability(new int[]{ 2, 3, 5, 9 }, 2));
        System.out.printf("res: %d\n", topic2560MinCapability.minCapability(new int[]{ 2, 7, 9, 3, 1 }, 2));
    }

}
