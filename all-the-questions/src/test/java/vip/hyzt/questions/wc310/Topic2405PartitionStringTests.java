package vip.hyzt.questions.wc310;

import org.junit.Test;
import vip.hyzt.questions.wc310.Topic2405PartitionString;

public class Topic2405PartitionStringTests {

    @Test
    public void partitionString() {
        Topic2405PartitionString topic2405PartitionString = new Topic2405PartitionString();
        String s = "abacaba";
        System.out.printf("res: %d\n", topic2405PartitionString.partitionString(s));
    }

}
