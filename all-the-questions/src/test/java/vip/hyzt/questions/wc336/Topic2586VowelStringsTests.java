package vip.hyzt.questions.wc336;

import org.junit.Test;

public class Topic2586VowelStringsTests {

    @Test
    public void vowelStrings() {
        Topic2586VowelStrings topic2586VowelStrings = new Topic2586VowelStrings();
        System.out.printf("res: %d\n", topic2586VowelStrings.vowelStrings(new String[] { "are", "amy", "u" }, 0, 2));
        System.out.printf("res: %d\n", topic2586VowelStrings.vowelStrings(new String[] { "hey", "aeo", "mu", "ooo", "artro" }, 1, 4));
        System.out.printf("res: %d\n", topic2586VowelStrings.vowelStrings(new String[] { "i", "aeo", "mu", "i", "artro", "a", "iou" }, 1, 4));
    }

}
