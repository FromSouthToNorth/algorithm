package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;
import vip.hyzt.algorithmsFourthEdition.util.Read;

import java.io.*;
import java.util.Arrays;

public class ShellTests {

    @Test
    public void shell() {
        Read read = new Read("/strs/tiny.txt");
        String[] a = read.readAllString();
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void shell1MTest() {
        Read read = new Read("/ints/1Mints.txt");
        Integer[] a = read.readAllInteger();
        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }

    @Test
    public void shell2MTest() throws IOException {

    }

}
