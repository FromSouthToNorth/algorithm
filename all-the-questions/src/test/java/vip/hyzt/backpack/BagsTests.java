package vip.hyzt.backpack;

import org.junit.Test;
import vip.hyzt.backpack.Bags;

public class BagsTests {

    @Test
    public void bags() {
        int ans = Bags.bags();
        System.out.printf("%d\n", ans);
    }

    @Test
    public void oDBags() {
        int ans = Bags.oDBags();
        System.out.printf("%d\n", ans);
    }

}
