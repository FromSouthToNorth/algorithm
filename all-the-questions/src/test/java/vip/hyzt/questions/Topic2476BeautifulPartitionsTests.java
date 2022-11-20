package vip.hyzt.questions;

import org.junit.Test;

public class Topic2476BeautifulPartitionsTests {

    @Test
    public void beautifulPartitions() {
        Topic2476BeautifulPartitions topic2476BeautifulPartitions = new Topic2476BeautifulPartitions();
        System.out.printf("res: %d\n", topic2476BeautifulPartitions.beautifulPartitions("23542185131", 3, 2));
        System.out.printf("res: %d\n", topic2476BeautifulPartitions.beautifulPartitions("23542185131", 3, 3));
        System.out.printf("res: %d\n", topic2476BeautifulPartitions.beautifulPartitions("3312958", 3, 1));
    }

}
