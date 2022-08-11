package vip.hyzt.weeks.weeks_302;

/**
 * <h3>6120. 数组能形成多少数对</h3>
 * @see <a href="https://leetcode.cn/problems/maximum-number-of-pairs-in-array/">https://leetcode.cn/problems/maximum-number-of-pairs-in-array/</a>
 * @author hy
 */
public class NumberOfPairs_01 {

    public int[] numberOfPairs(int[] nums) {
//        int[] res = new int[2];
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int num : nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            int val = entry.getValue();
//            if ((val & 1) == 0) {
//                res[0] += val / 2;
//            }
//            else {
//                while (val != 1) {
//                    val -= 2;
//                    res[0]++;
//                }
//                res[1]++;
//            }
//        }
//        return res;

        int[] count = new int[101], res = new int[2];
        for (int num : nums) {
            count[num]++;
        }
        for (int i : count) {
            res[0] += i / 2;
            res[1] += i & 1;
        }
        return res;
    }

}
