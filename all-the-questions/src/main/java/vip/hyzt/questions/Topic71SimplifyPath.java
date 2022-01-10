package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <p>给你一个字符串 path ，表示指向某一文件或目录的Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。</p>给你一个字符串 path ，表示指向某一文件或目录的Unix 风格 绝对路径 （以 '/' 开头），请你将其转化为更加简洁的规范路径。
 *
 * <p>在 Unix 风格的文件系统中，一个点（.）表示当前目录本身；此外，两个点 （..）表示将目录切换到上一级（指向父目录）；两者都可以是复杂相对路径的组成部分。任意多个连续的斜杠（即，'//'）都被视为单个斜杠 '/' 。 对于此问题，任何其他格式的点（例如，'...'）均被视为文件/目录名称。</p>
 *
 * <p>请注意，返回的 规范路径 必须遵循下述格式：</p>
 *
 * <ul>
 *     <li>始终以斜杠 '/' 开头。</li>
 *     <li>两个目录名之间必须只有一个斜杠 '/' 。</li>
 *     <li>最后一个目录名（如果存在）不能 以 '/' 结尾。</li>
 *     <li>此外，路径仅包含从根目录到目标文件或目录的路径上的目录（即，不含 '.' 或 '..'）。</li>
 * </ul>
 * <p>返回简化后得到的 规范路径 。</p>
 *
 * <h3>示例 1：</h3>
 * <ul>
 *     <li>输入：path = "/home/"</li>
 *     <li>输出："/home"</li>
 *     <li>解释：注意，最后一个目录名后面没有斜杠。</li>
 * </ul>
 *
 * <h3>示例 2：</h3>
 * <ul>
 *     <li>输入：path = "/../"</li>
 *     <li>输出："/"</li>
 *     <li>解释：从根目录向上一级是不可行的，因为根目录是你可以到达的最高级。</li>
 * </ul>
 *
 * <h3>示例 3：</h3>
 * <ul>
 *     <li>输入：path = "/home//foo/"</li>
 *     <li>输出："/home/foo"</li>
 *     <li>解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。</li>
 * </ul>
 *
 * <h3>示例 4：</h3>
 * <ul>
 *     <li>输入：path = "/a/./b/../../c/"</li>
 *     <li>输出："/c"</li>
 * </ul>
 * <p>提示：</p>
 * <ul>
 *     <li>1 <= path.length <= 3000</li>
 *     <li>path 由英文字母，数字，'.'，'/' 或 '_' 组成。</li>
 *     <li>path 是一个有效的 Unix 风格绝对路径。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/simplify-path">链接：https://leetcode-cn.com/problems/simplify-path</a>
 */
public abstract class Topic71SimplifyPath {

    /**
     * 方法一：栈
     * 思路与算法
     * <p>我们首先将给定的字符串 \textit{path}path 根据 \texttt{/}/ 分割成一个由若干字符串组成的列表，记为 \textit{names}names。根据题目中规定的「规范路径的下述格式」，\textit{names}names 中包含的字符串只能为以下几种：</p>
     *
     * <p>空字符串。例如当出现多个连续的 \texttt{/}/，就会分割出空字符串；</p>
     *
     * <p>一个点 \texttt{.}.；</p>
     *
     * <p>两个点 \texttt{..}..；</p>
     *
     * <p>只包含英文字母、数字或 \texttt{\_}_ 的目录名。</p>
     *
     * <p>对于「空字符串」以及「一个点」，我们实际上无需对它们进行处理，因为「空字符串」没有任何含义，而「一个点」表示当前目录本身，我们无需切换目录。</p>
     *
     * <p>对于「两个点」或者「目录名」，我们则可以用一个栈来维护路径中的每一个目录名。当我们遇到「两个点」时，需要将目录切换到上一级，因此只要栈不为空，我们就弹出栈顶的目录。当我们遇到「目录名」时，就把它放入栈。</p>
     *
     * <p>这样一来，我们只需要遍历 \textit{names}names 中的每个字符串并进行上述操作即可。在所有的操作完成后，我们将从栈底到栈顶的字符串用 \texttt{/}/ 进行连接，再在最前面加上 \texttt{/}/ 表示根目录，就可以得到简化后的规范路径。</p>
     *
     * @param path 需要简化的路径
     * @return 简化后的路径
     */
    public static String stack(String path) {
        String[] names = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String name : names) {
            if ("..".equals(name)) {
                if (!stack.isEmpty()) {
                    stack.pollLast();
                }
            }
            else if (name.length() > 0 && !".".equals(name)) {
                stack.offerLast(name);
            }
        }

        StringBuilder ans = new StringBuilder();
        if (stack.isEmpty()) {
            ans.append('/');
        }
        else {
            while (!stack.isEmpty()) {
                ans.append('/');
                ans.append(stack.pollFirst());
            }
        }
        return ans.toString();
    }

}
