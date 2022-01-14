package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic373KSmallestPairsTest {

    @Test
    public void priorityQueue() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> lists = Topic373KSmallestPairs.priorityQueue(nums1, nums2, k);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

    @Test
    public void binarySearch() {
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> lists = Topic373KSmallestPairs.binarySearch(nums1, nums2, k);
        for (List<Integer> list : lists) {
            for (Integer integer : list) {
                System.out.println(integer);
            }
        }
    }

}
