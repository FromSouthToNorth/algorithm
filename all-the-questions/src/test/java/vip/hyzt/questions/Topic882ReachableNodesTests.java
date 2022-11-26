package vip.hyzt.questions;

import org.junit.Test;

public class Topic882ReachableNodesTests {

    @Test
    public void reachableNodes() {
        Topic882ReachableNodes topic882ReachableNodes = new Topic882ReachableNodes();
        System.out.printf("res: %d\n", topic882ReachableNodes.reachableNodes(new int[][]{{0, 1, 10}, {0, 2, 1}, {1, 2, 2}}, 6, 3));
        System.out.printf("res: %d\n", topic882ReachableNodes.reachableNodes(new int[][]{{0, 1, 4}, {1, 2, 6}, {0, 2, 8}, {1, 3, 1}}, 10, 4));
        System.out.printf("res: %d\n", topic882ReachableNodes.reachableNodes(new int[][]{{1, 2, 4}, {1, 4, 5}, {1, 3, 1}, {2, 3, 4}, {3, 4, 5}}, 17, 5));
    }

}
