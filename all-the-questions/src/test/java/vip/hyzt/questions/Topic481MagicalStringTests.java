package vip.hyzt.questions;

import org.junit.Test;

public class Topic481MagicalStringTests {

    @Test
    public void magicalString() {
        Topic481MagicalString topic481MagicalString = new Topic481MagicalString();
        System.out.printf("res: %d\n", topic481MagicalString.magicalString(6));
        System.out.printf("res: %d\n", topic481MagicalString.magicalString(7));
        System.out.printf("res: %d\n", topic481MagicalString.magicalString(11));
        System.out.printf("res: %d\n", topic481MagicalString.magicalString(1));
        System.out.printf("res: %d\n", topic481MagicalString.magicalString(100000));
    }

}
