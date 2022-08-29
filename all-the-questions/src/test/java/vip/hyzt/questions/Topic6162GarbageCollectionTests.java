package vip.hyzt.questions;

import org.junit.Test;

public class Topic6162GarbageCollectionTests {

    @Test
    public void garbageCollection() {
        String[] garbage = { "G","P","GP","GG" };
        int[] travel = { 2, 4, 3 };
        Topic6162GarbageCollection topic6162GarbageCollection = new Topic6162GarbageCollection();
        System.out.println(topic6162GarbageCollection.garbageCollection(garbage, travel));
    }

}
