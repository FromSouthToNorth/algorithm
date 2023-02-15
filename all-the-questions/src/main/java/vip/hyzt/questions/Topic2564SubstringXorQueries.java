package vip.hyzt.questions;

import java.util.HashMap;

/**
 * <h1>6356. 子字符串异或查询</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/substring-xor-queries/">https://leetcode.cn/problems/substring-xor-queries/</a>
 */
public class Topic2564SubstringXorQueries {

    public int[][] substringXorQueries(String s, int[][] queries) {
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 30; i > 0; i--) {
            for (int j = s.length() - i; j >= 0; j--) {
                map.put(Integer.valueOf(s.substring(j, j + i), 2), new int[] { j, i + j - 1 });
            }
        }
        int[][] result = new int[queries.length][];
        for (int i = 0; i < queries.length; i++) {
            result[i] = map.getOrDefault(queries[i][0] ^ queries[i][1], new int[] { -1, -1 });
        }
        return result;
    }

}
