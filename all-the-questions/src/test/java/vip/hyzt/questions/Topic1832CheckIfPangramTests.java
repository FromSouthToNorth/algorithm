package vip.hyzt.questions;

import org.junit.Test;

public class Topic1832CheckIfPangramTests {

    @Test
    public void checkIfPangram() {
        Topic1832CheckIfPangram topic1832CheckIfPangram = new Topic1832CheckIfPangram();
        System.out.printf("res: %b\n", topic1832CheckIfPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
        System.out.printf("res: %b\n", topic1832CheckIfPangram.checkIfPangram("leetcode"));
    }

}
