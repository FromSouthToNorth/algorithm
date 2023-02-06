package vip.hyzt.questions;

/**
 * <h1>2559. 统计范围内的元音字符串数</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/count-vowel-strings-in-ranges/">https://leetcode.cn/problems/count-vowel-strings-in-ranges/</a>
 */
public class Topic2559VowelStrings {

    public int[] vowelStrings(String[] words, int[][] queries) {
        int[] count = new int[words.length + 1], result = new int[queries.length];
        for (int i = 0; i < words.length; i++) {
            count[i + 1] = count[i] + (words[i].matches("[aeiou](.*[aeiou])?") ? 1 : 0);
        }
        for (int i = 0; i < queries.length; i++) {
            result[i] = count[queries[i][1] + 1] - count[queries[i][0]];
        }
        return result;
    }

}
