package vip.hyzt.questions.doublePointer;

/**
 * <h2>557.反转字符串种的单词 3</h2>
 * <p>给定一个字符串 <i>s</i>，你需要反转字符串种每个单词的字符顺序，同时仍保留空格和单词的初始顺序。</p>
 *
 * <b>示例 1：</b>
 * <pre>
 *     <strong>输入：</strong>s = "Let's take LeetCode contest"
 *     <strong>输出：</strong>"s'teL ekat edoCteeL tsetnoc"
 * </pre>
 *
 * <b>示例 2：</b>
 * <pre>
 *     <strong>输入：</strong>s = "God Ding"
 *     <strong>输出：</strong>"doG gniD"
 * </pre>
 * @author hy
 */
public abstract class ReverseWords {

    public static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            int left = 0, right = chars.length - 1;
            while (left <= right) {
                char c = chars[left];
                chars[left] = chars[right];
                chars[right] = c;
                left++;
                right--;
            }
            sb.append(chars);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

}
