package vip.hyzt.questions;

import org.junit.Test;

public class Topic2405PartitionStringTests {

    @Test
    public void partitionString() {
        Topic2405PartitionString topic2405PartitionString = new Topic2405PartitionString();
        String s = "abacaba";
        System.out.printf("res: %d\n", topic2405PartitionString.partitionString(s));
    }

}
