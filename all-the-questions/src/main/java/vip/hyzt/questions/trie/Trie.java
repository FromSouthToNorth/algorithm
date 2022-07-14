package vip.hyzt.questions.trie;

import java.util.Arrays;

/**
 * <h3>前缀树</h3>
 * <p>使用二维数组构建 前缀树</p>
 * @author hy
 */
public class Trie {

    static int N = 100009;

    static int[][] trie = new int[N][26];

    static int[] count = new int[N];

    static int index = 0;

    public Trie() {
        for (int row = index; row >= 0; row--) {
            Arrays.fill(trie[row], 0);
        }
        Arrays.fill(count, 0);
        index = 0;
    }

    public void insert(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (trie[p][c] == 0) {
                trie[p][c] = ++index;
            }
            p = trie[p][c];
        }
        count[p]++;
    }


    public boolean search(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - 'a';
            if (trie[p][c] == 0) {
                return false;
            }
            p = trie[p][c];
        }
        return count[p] != 0;
    }


    public boolean startsWith(String s) {
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (trie[p][u] == 0) {
                return false;
            }
            p = trie[p][u];
        }
        return true;
    }

}
