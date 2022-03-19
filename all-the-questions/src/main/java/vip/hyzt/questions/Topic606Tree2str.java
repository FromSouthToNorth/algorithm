package vip.hyzt.questions;

/**
 * <h3>606.根据二叉树创建字符串</h3>
 * <p>你需要采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。</p>
 * <p>空节点则用一对空括号 "()" 表示。而且你需要省略所有不影响字符串与原始二叉树之间的一对一映射关系的空括号对。</p>
 * <p><b>示例 1：</b></p>
 * <pre>
 *     <strong>输入：</strong>二叉树：[1,2,3,4]
 *        1
 *      /   \
 *     2     3
 *    /
 *   4
 *  
 *     <strong>输出：</strong>"1(2(4))(3)"
 *
 *     <strong>解释：</strong>原本将是"1(2(4()))(3())"，
 *     在你省略所有不必要的空括号对之后，
 *     它将是 "1(2(4))(3)"
 * </pre>
 * <p><b>示例 2：</b></p>
 * <pre>
 *     <strong>输入：</strong> 二叉树：[1,2,3,null,4]
 *          1
 *        /   \
 *       2     3
 *        \
 *         4
 *     <strong>输出：</strong>"1(2()(4))(3)"
 *
 *     <strong>解释：</strong>和第一个示例相似，
 *     除了我们不能省略第一个对括号来中断输入和输出直接的一对一映射关系。
 * </pre>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/construct-string-from-binary-tree">606.根据二叉树创建字符串</a>
 */
public class Topic606Tree2str {

    static StringBuilder sb = new StringBuilder();

    public static String tree2str(TreeNode root) {
        dfs(root);
        return sb.substring(1, sb.length() - 1);
    }

    static void dfs(TreeNode root) {
        sb.append("(");
        sb.append(root.val);
        if (root.left != null) {
            dfs(root.left);
        }
        else if (root.right != null) {
            sb.append("()");
        }
        if (root.right != null) {
            dfs(root.right);
        }
        sb.append(")");
    }

}
