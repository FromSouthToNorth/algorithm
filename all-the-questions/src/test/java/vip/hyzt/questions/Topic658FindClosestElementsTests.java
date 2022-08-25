package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic658FindClosestElementsTests {

    @Test
    public void findClosestElements() {
        Topic658FindClosestElements topic658FindClosestElements = new Topic658FindClosestElements();
        int arr[] = {1, 2, 3, 4, 5}, k = 4, x = 3;
        List<Integer> closestElements = topic658FindClosestElements.findClosestElements(arr, k, x);
        System.out.println(closestElements);
    }

}
