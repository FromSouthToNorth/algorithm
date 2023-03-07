package vip.hyzt.questions.wc334;

import org.junit.Test;
import vip.hyzt.questions.wc334.Topic2575DivisibilityArray;

import java.util.Arrays;

public class Topic2575DivisibilityArrayTests {

    @Test
    public void divisibilityArray() {
        Topic2575DivisibilityArray topic2575DivisibilityArray = new Topic2575DivisibilityArray();
        System.out.printf("res: %s\n", Arrays.toString(topic2575DivisibilityArray.divisibilityArray("998244353", 3)));
        System.out.printf("res: %s\n", Arrays.toString(topic2575DivisibilityArray.divisibilityArray("1010", 10)));
    }

}
