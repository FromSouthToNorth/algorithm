package vip.hyzt.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <h3>388.文件的最长绝对路径</h3>
 * <p>假设有一个同时存储文件和目录的文件系统。下图展示了文件系统的一个示例：</p>
 * <img style="width: 200px;" src="https://assets.leetcode.com/uploads/2020/08/28/mdir.jpg" />
 * <p>这里将 `dir` 作为根目录中的唯一目录。dir 包含两个子目录 `subdir1` 和 `subdir2` 。`subdir1` 包含文件 `file1.ext` 和子目录 `subsubdir1`；`subdir2` 包含子目录 `subsubdir2`，该子目录下包含文件 `file2.ext` 。</p>
 * <p>在文本格式中，如下所示(⟶表示制表符)：</p>
 * <pre>
 *     dir
 *     ⟶ subdir1
 *     ⟶ ⟶ file1.ext
 *     ⟶ ⟶ subsubdir1
 *     ⟶ subdir2
 *     ⟶ ⟶ subsubdir2
 *     ⟶ ⟶ ⟶ file2.ext
 * </pre>
 * <p>如果是代码表示，上面的文件系统可以写为 "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext" 。'\n' 和 '\t' 分别是换行符和制表符。</p>
 * <p>文件系统中的每个文件和文件夹都有一个唯一的 <b>绝对路径 </b>，即必须打开才能到达文件/目录所在位置的目录顺序，所有路径用 '/' 连接。上面例子中，指向 file2.ext 的 绝对路径 是 "dir/subdir2/subsubdir2/file2.ext" 。每个目录名由字母、数字和/或空格组成，每个文件名遵循 name.extension 的格式，其中name和extension由字母、数字和/或空格组成。</p>
 * <p>给定一个以上述格式表示文件系统的字符串 input ，返回文件系统中<i>指向<b>文件</b>的 <b>最长绝对路径</b> 的长度</i>。 如果系统中没有文件，返回0。</p>
 * <p><b>示例 1：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/08/28/dir1.jpg" />
 * <pre>
 *     <strong>输入：</strong>input = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"
 *     <strong>输出：</strong>20
 *     <strong>解释：</strong>只有一个文件，绝对路径为 "dir/subdir2/file.ext" ，路径长度 20
 * </pre>
 * <p><b>示例 2：</b></p>
 * <img src="https://assets.leetcode.com/uploads/2020/08/28/dir2.jpg" />
 * <pre>
 *     <strong>输入：</stronginput = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"
 *     <strong>输出：</strong>32
 *     <strong>解释：</strong>存在两个文件：
 *     "dir/subdir1/file1.ext" ，路径长度 21
 *     "dir/subdir2/subsubdir2/file2.ext" ，路径长度 32
 *     返回 32 ，因为这是最长的路径
 * </pre>
 * <p><b>示例 3：</b></p>
 * <pre>
 *     <strong>输入：</strong>input = "a"
 *     <strong>输出：</strong>0
 *     <strong>解释：</strong>不存在任何文件
 * </pre>
 * <p><b>示例 4：</b></p>
 * <pre>
 *     <strong>输入：</strong>input = "file1.txt\nfile2.txt\nlongfile.txt"
 *     <strong>输出：</strong>12
 *     <strong>解释：</strong>根目录下有 3 个文件。
 *     因为根目录中任何东西的绝对路径只是名称本身，所以答案是 "longfile.txt" ，路径长度为 12
 * </pre>
 * <p><b>提示：</b></p>
 * <li>1 <= input.length <= 10<sup>4</sup></li>
 * <li>input 可能包含小写或大写的英文字母，一个换行符 '\n'，一个制表符 '\t'，一个点 '.'，一个空格 ' '，和数字。</li>
 * @see <a href="https://leetcode-cn.com/problems/longest-absolute-file-path">链接：https://leetcode-cn.com/problems/longest-absolute-file-path</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic388LengthLongestPath {
    static int[] hash = new int[10010];
    public static int lengthLongestPath(String input) {
        Arrays.fill(hash, -1);
        int n = input.length(), ans = 0;
        for (int i = 0; i < n;) {
            int level = 0;
            while (i < n && input.charAt(i) == '\t' && ++level >= 0) i++;
            int j = i;
            boolean isDir = true;
            while (j < n && input.charAt(j) != '\n') {
                if (input.charAt(j++) == '.') isDir = false;
            }
            int cur = j - i;
            int prev = level - 1 >= 0 ? hash[level - 1] : -1;
            int path = prev + 1 + cur;
            if (isDir) hash[level] = path;
            else if (path > ans) ans = path;
            i = j + 1;
        }
        return ans;
    }

}
