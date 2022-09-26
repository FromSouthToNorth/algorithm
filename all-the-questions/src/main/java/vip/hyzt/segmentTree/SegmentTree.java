package vip.hyzt.segmentTree;

import java.util.Arrays;

public class SegmentTree {

    static class Node {
        int left, right, count;

        public Node(int left, int right, int cnt) {
            this.left = left;
            this.right = right;
            this.count = cnt;
        }
    }

    private Node[] tree;

    public Node[] getTree() {
        return tree;
    }

    public void setTree(Node[] tree) {
        this.tree = tree;
    }

    public SegmentTree(int size) {
        this.tree = new Node[size * 4];
    }

    public void pushUp(int u) {
        tree[u].count = tree[u << 1].count + tree[u << 1 | 1].count;
    }

    public void build(int u, int left, int right) {
        if (left == right) {
            tree[u] = new Node(left, right, 0);
        }
        else {
            tree[u] = new Node(left, right, 0);
            int mid = left + right >> 1;
            build(u << 1, left, mid);
            build(u << 1 | 1, mid + 1, right);
            pushUp(u);
        }
    }

    public void update(int u, int x) {
        if (tree[u].left == x && tree[u].right == x) {
            tree[u].count = 1;
        }
        else {
            int mid = tree[u].left + tree[u].right >> 1;
            if (x <= mid) {
                update(u << 1, x);
            }
            else {
                update(u << 1 | 1, x);
            }
            pushUp(u);
        }
    }

    public int query(int u, int left, int right) {
        if (left <= tree[u].left && tree[u].right <= right) {
            return tree[u].count;
        }
        int mid = tree[u].left + tree[u].right >> 1;
        int res = 0;
        if (left <= mid) {
            res += query(u << 1, left, right);
        }
        if (right > mid) {
            res += query(u << 1 | 1, left, right);
        }
        return res;
    }

    public void show() {
        System.out.printf("%s \n", Arrays.toString(tree));
    }

}
