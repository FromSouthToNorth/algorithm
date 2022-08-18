package vip.hyzt.algorithmsFourthEdition.sort;

/**
 * <h3>对象节点</h3>
 * @author hy
 */
public class Node {

    String id;

    String name;

    Node node;

    public Node() {
    }

    public Node(String id, String name) {
        this.id = id;
        this.name = name;
        this.node = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", node=" + node +
                '}';
    }
}
