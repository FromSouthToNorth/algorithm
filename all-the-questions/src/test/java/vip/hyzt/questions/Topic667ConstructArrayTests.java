package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic667ConstructArrayTests {

    @Test
    public void constructArray() {
        Topic667ConstructArray topic667ConstructArray = new Topic667ConstructArray();
        int[] result = topic667ConstructArray.constructArray(10, 9);
        System.out.printf("result: %s \n", Arrays.toString(result));
    }

}
