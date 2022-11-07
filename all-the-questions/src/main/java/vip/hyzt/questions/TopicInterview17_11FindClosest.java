package vip.hyzt.questions;

/**
 * <h3>面试题 17.11. 单词距离</h3>
 * <p>有个内含单词的超大文本文件，给定任意两个不同的单词，找出在这个文件中这两个单词的最短距离(相隔单词数)。如果寻找过程在这个文件中会重复多次，而每次寻找的单词不同，你能对此优化吗?</p>
 * <h3>示例：</h3>
 * <pre>
 *     输入：words = ["I","am","a","student","from","a","university","in","a","city"], word1 = "a", word2 = "student"
 *     输出：1
 * </pre>
 * <h3>提示：</h3>
 * <li>words.length <= 100000</li>
 * @see <a href="https://leetcode.cn/problems/find-closest-lcci/">链接：https://leetcode.cn/problems/find-closest-lcci/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class TopicInterview17_11FindClosest {

    public static int findClosest(String[] words, String word1, String word2) {
        int ans = words.length;
        int start = -1;
        int end = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                start = i;
            }
            if (words[i].equals(word2)) {
                end = i;
            }
            if (start >= 0 && end >= 0) {
                ans = Math.min(ans, Math.abs(start - end));
            }
        }
        return ans;
    }
}
