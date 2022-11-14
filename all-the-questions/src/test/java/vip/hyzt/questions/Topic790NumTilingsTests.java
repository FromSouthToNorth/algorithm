package vip.hyzt.questions;

import org.junit.Test;

public class Topic790NumTilingsTests {

    @Test
    public void numTilings() {
        Topic790NumTilings topic790NumTilings = new Topic790NumTilings();
        long start = System.currentTimeMillis();
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(20));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(30));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(40));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(50));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(100));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(200));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(400));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(800));
        System.out.printf("res: %d\n", topic790NumTilings.numTilings(1000));
        long end = System.currentTimeMillis();
        System.out.printf("%d ms\n", end - start);
    }

}
