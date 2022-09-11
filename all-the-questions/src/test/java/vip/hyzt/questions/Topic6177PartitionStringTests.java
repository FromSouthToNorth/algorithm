package vip.hyzt.questions;

import org.junit.Test;

public class Topic6177PartitionStringTests {

    @Test
    public void partitionString() {
        Topic6177PartitionString topic6177PartitionString = new Topic6177PartitionString();
        String s = "abacaba";
        System.out.printf("res: %d\n", topic6177PartitionString.partitionString(s));
    }

}
