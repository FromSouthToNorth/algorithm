package vip.hyzt.algorithmsFourthEdition.sort;

import java.util.Map;
import java.util.TreeMap;

/**
 * <h3>根据对象的 key 进行排序</h3>
 * <p>根据 keys 顺序排序对象列表: </p>
 * <ul>
 *     <li>keys 中的每个元素 Keys[i] 等于 nodes[i].key</li>
 *     <li>keys 按照 Keys[i]，来排序 nodes </li>
 * </ul>
 * <pre>
 *     输入：
 *     keys: [2, 1, 3]
 *     nodes: [{key: 1, ...}, {key: 2, ...}, {key: 3, ...}]
 *     输出：[{key: 1, ...}, {key: 1, ...}, {key: 3, ...}]
 * </pre>
 * @author hy
 */
public class ObjectByKeySort {
    public static Node[] sort(String[] keys, Node[] nodes) {
        int length = nodes.length;
        Node[] result = new Node[length];
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < length; i++) {
            map.put(keys[i], i);
        }
        for (Node node : nodes) {
            if (map.containsKey(node.id)) {
                result[map.get(node.id)] = node;
            }
        }
        return result;
    }

}
