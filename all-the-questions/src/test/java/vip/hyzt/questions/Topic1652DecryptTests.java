package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic1652DecryptTests {

    @Test
    public void decrypt() {
        Topic1652Decrypt topic1652Decrypt = new Topic1652Decrypt();
        System.out.printf("res: %s\n", Arrays.toString(topic1652Decrypt.decrypt(new int[]{5, 7, 1, 4}, 3)));
        System.out.printf("res: %s\n", Arrays.toString(topic1652Decrypt.decrypt(new int[]{5, 7, 1, 4}, 4)));
        System.out.printf("res: %s\n", Arrays.toString(topic1652Decrypt.decrypt(new int[]{1, 2, 3, 4}, 0)));
        System.out.printf("res: %s\n", Arrays.toString(topic1652Decrypt.decrypt(new int[]{2, 4, 9, 3}, -3)));
        System.out.printf("res: %s\n", Arrays.toString(topic1652Decrypt.decrypt(new int[]{2, 4, 9, 3}, -4)));
    }

}
