package vip.hyzt.algorithmsFourthEdition.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * 根据对象的 key 进行排序
 * @author hy
 */
public class ObjectByKeySort {

    public static Node[] sort(String[] ids, Node[] nodes) {
        int length = nodes.length;
        Node[] result = new Node[length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < length; i++) {
            map.put(ids[i], i);
        }
        for (Node node : nodes) {
            if (map.containsKey(node.id)) {
                result[map.get(node.id)] = node;
            }
        }
        return result;
    }

}
