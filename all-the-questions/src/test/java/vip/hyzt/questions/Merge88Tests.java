package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Merge88Tests {

    @Test
    public void systemArraycopySortMerge() {
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] nums2 = {2, 5, 6, 7};
        Merge88.systemArraycopySortMerge(nums1, 4, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void doublePointerMerge() {
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] nums2 = {2, 4, 6, 7};
        Merge88.doublePointerMerge(nums1, 4, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void doublePointerReverseOrderMerge() {
        int[] nums1 = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] nums2 = {2, 4, 6, 7};
        Merge88.doublePointerReverseOrderMerge(nums1, 4, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void arraycopy() {
        int[] numsOne = {1, 2, 3, 4, 0, 0, 0, 0};
        int[] numsTwo = {5, 6, 7, 8};

        // 从 numsTwo 数组中 srcPos 的起始为, 复制到 numsOne destPos 位置开始复制 几个
        // srcPos: 0
        //         ↓
        //        [1, 2, 3, 4, 0, 0, 0, 0]
        //                     ↑
        //            destPos: 4
        //                    [5, 6, 7, 8] length: 4
        System.arraycopy(numsTwo, 0, numsOne, 4, numsTwo.length);
        System.out.println(Arrays.toString(numsOne));
    }

}
