package vip.hyzt.datastructures.tress;

public class BinaryTree {

    static class TreeNode {
        /**
         * 节点数据
         */
        public int val;

        /**
         * 左节点
         */
        public TreeNode left;
        /**
         * 右节点
         */
        public TreeNode right;

        /**
         * 父节点
         */
        public TreeNode parent;

        public TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    /**
     * 查找树节点节点当中的值
     *
     * @param key 查找的值
     * @return 返回查找到的值得父节点
     */
    public TreeNode find(int key) {
        TreeNode current = this.root;
        while (current != null) {
            if (key < current.val) {
                if (current.left == null) {
                    return current;
                }
                current = current.left;
            } else if (key > current.val) {
                if (current.right == null) {
                    return current;
                }
                current = current.right;
            } else {
                return current;
            }
        }
        return null;
    }

    public void put(int val) {
        TreeNode node = new TreeNode(val);
        if (root == null) {
            root = node;
        }
        else {
            TreeNode parent = find(val);
            if (val < parent.val) {
                parent.left = node;
                parent.left.parent = parent;
            }
            else {
                parent.right = node;
                parent.right.parent = parent;
            }
        }
    }

}
