package vip.hyzt.questions.wc315;

import org.junit.Test;
import vip.hyzt.questions.wc315.Topic2443SumOfNumberAndReverse;

public class Topic2443SumOfNumberAndReverseTests {

    @Test
    public void sumOfNumberAndReverse() {
        Topic2443SumOfNumberAndReverse topic2443SumOfNumberAndReverse = new Topic2443SumOfNumberAndReverse();
        int[] nums = {443, 63, 181, (int) 10e5, (int) 10e5 - 6, (int) 10e5 - 1};
        for (int num : nums) {
            System.out.printf("%d %b\n", num, topic2443SumOfNumberAndReverse.sumOfNumberAndReverse(num));
        }
    }

}
