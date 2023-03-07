package vip.hyzt.questions.wc308;

import org.junit.Test;
import vip.hyzt.questions.wc308.Topic2391GarbageCollection;

public class Topic2391GarbageCollectionTests {

    @Test
    public void garbageCollection() {
        String[] garbage = { "G","P","GP","GG" };
        int[] travel = { 2, 4, 3 };
        Topic2391GarbageCollection topic2391GarbageCollection = new Topic2391GarbageCollection();
        System.out.println(topic2391GarbageCollection.garbageCollection(garbage, travel));
    }

}
