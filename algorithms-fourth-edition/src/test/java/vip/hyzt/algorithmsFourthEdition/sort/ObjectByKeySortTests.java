package vip.hyzt.algorithmsFourthEdition.sort;

import org.junit.Test;

import java.util.Arrays;


public class ObjectByKeySortTests {

    @Test
    public void sort() {
        String[] ids = { "key2", "key1", "key3" };
        Node[] nodes = new Node[3];
        nodes[0] = new Node("key1","1");
        nodes[1] = new Node("key2","22");
        nodes[2] = new Node("key3","333");

        Node[] result = ObjectByKeySort.sort(ids, nodes);
        System.out.println(Arrays.toString(result));
    }

}
