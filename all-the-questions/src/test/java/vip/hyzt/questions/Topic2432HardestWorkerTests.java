package vip.hyzt.questions;

import org.junit.Test;

public class Topic2432HardestWorkerTests {

    @Test
    public void hardestWorker() {
        Topic2432HardestWorker topic2432HardestWorker = new Topic2432HardestWorker();
        int n = 10;
        int[][] logs = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.printf("res: %d\n", topic2432HardestWorker.hardestWorker(n, logs));
    }

}
