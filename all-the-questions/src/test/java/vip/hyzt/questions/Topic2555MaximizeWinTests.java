package vip.hyzt.questions;

import org.junit.Test;

public class Topic2555MaximizeWinTests {

    @Test
    public void maximizeWin() {
        Topic2555MaximizeWin topic2555MaximizeWin = new Topic2555MaximizeWin();
        System.out.printf("res: %d\n", topic2555MaximizeWin.maximizeWin(new int[]{ 1, 1, 2, 2, 3, 3, 5 }, 2));
        System.out.printf("res: %d\n", topic2555MaximizeWin.maximizeWin(new int[]{ 1, 2, 3, 4 }, 0));
    }

}
