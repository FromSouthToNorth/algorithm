package vip.hyzt.questions;

import org.junit.Test;
import vip.hyzt.binarySearch.Topic33Search;

public class Topic33SearchTests {

    @Test
    public void search() {
        int[] nums = {4,5,6,7,0,1,2};
        int ans = Topic33Search.search(nums, 0);
        System.out.printf("%d \n", ans);
    }

}
