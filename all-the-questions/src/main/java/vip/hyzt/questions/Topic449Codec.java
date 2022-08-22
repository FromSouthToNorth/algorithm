package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>449. 序列化和反序列化二叉搜索树</h3>
 * <p>序列化是将数据结构或对象转换为一系列位的过程，以便它可以存储在文件或内存缓冲区中，或通过网络连接链路传输，以便稍后在同一个或另一个计算机环境中重建。</p>
 * <p>设计一个算法来序列化和反序列化 <strong>二叉搜索树</strong> 。 对序列化/反序列化算法的工作方式没有限制。 您只需确保二叉搜索树可以序列化为字符串，并且可以将该字符串反序列化为最初的二叉搜索树。</p>
 * <h4>编码的字符串应尽可能紧凑。</h4>
 * <h3>示例 1：</h3>
 * <pre>
 *     <strong>输入：</strong>root = [2,1,3]
 *     <strong>输出：</strong>[2,1,3]
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     <strong>输入：</strong>root = []
 *     <strong>输出：</strong>[]
 * </pre>
 * <h3>提示：</h3>
 * <li>树中节点数范围是 [0, 10<sup>4</sup>]</li>
 * <li>0 <= Node.val <= 10<sup>4</sup></li>
 * <li>题目数据 <strong>保证</strong> 输入的树是一棵二叉搜索树。</li>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/serialize-and-deserialize-bst/">链接：https://leetcode.cn/problems/serialize-and-deserialize-bst/</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic449Codec {

    /**
     * 将树编码为单个字符串。
     */
    public String serialize(TreeNode root) {
        if (root == null) return null;
        List<String> list = new ArrayList<>();
        dfs1(root, list);
        int n = list.size();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(list.get(i));
            if (i != n - 1) sb.append(",");
        }
        return sb.toString();
    }

    /**
     * 将您的编码数据解码为树。
     */
    public TreeNode deserialize(String s) {
        if (s == null) return null;
        String[] ss = s.split(",");
        return dfs2(0, ss.length - 1, ss);
    }

    public void dfs1(TreeNode root, List<String> list) {
        if (root == null) return;
        list.add(String.valueOf(root.val));
        dfs1(root.left, list);
        dfs1(root.right, list);
    }

    public TreeNode dfs2(int l, int r, String[] ss) {
        if (l > r) return null;
        int j = l + 1, t = Integer.parseInt(ss[l]);
        TreeNode ans = new TreeNode(t);
        while (j <= r && Integer.parseInt(ss[j]) <= t) j++;
        ans.left = dfs2(l + 1, j - 1, ss);
        ans.right = dfs2(j, r, ss);
        return ans;
    }


}
