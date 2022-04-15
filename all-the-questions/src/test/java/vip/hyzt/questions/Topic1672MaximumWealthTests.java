package vip.hyzt.questions;

import org.junit.Test;

public class Topic1672MaximumWealthTests {

    @Test
    public void maximumWealth() {
        int[][] accounts = {{1, 2, 3}, {3, 7, 8}};
        System.out.printf("%d", Topic1672MaximumWealth.maximumWealth(accounts));
    }

}
