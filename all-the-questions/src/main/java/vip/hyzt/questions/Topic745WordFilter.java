package vip.hyzt.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h3>745. 前缀和后缀搜索</h3>
 * @see <a href="https://leetcode.cn/problems/prefix-and-suffix-search/">https://leetcode.cn/problems/prefix-and-suffix-search/</a>
 * @author hy
 */
public class Topic745WordFilter {

//    Map<String, Integer> map;
//
//    public Topic745WordFilter(String[] words) {
//        this.map = new HashMap<>();
//        for (int i = 0; i < words.length; i++) {
//            String w = words[i];
//            int m = w.length();
//            for (int j = 0; j <= m; j++) {
//                for (int k = 0; k <= m; k++) {
//                    map.put(w.substring(0, j) + "#" + w.substring(m - k), i);
//                }
//            }
//        }
//    }
//
//    public int f(String p, String s) {
//        return map.getOrDefault(p + "#" + s, -1);
//    }

    static class TrieNode {
        TrieNode[] tns = new TrieNode[26];
        List<Integer> idxs = new ArrayList<>();
    }
    void add(TrieNode p, String s, int idx, boolean isTurn) {
        int n = s.length();
        p.idxs.add(idx);
        for (int i = isTurn ? n - 1 : 0; i >= 0 && i < n; i += isTurn ? -1 : 1) {
            int u = s.charAt(i) - 'a';
            if (p.tns[u] == null) {
                p.tns[u] = new TrieNode();
            }
            p = p.tns[u];
            p.idxs.add(idx);
        }
    }
    int query(String a, String b) {
        int n = a.length(), m = b.length();
        TrieNode p = tr1;
        for (int i = 0; i < n; i++) {
            int u = a.charAt(i) - 'a';
            if (p.tns[u] == null) {
                return -1;
            }
            p = p.tns[u];
        }
        List<Integer> l1 = p.idxs;
        p = tr2;
        for (int i = m - 1; i >= 0; i--) {
            int u = b.charAt(i) - 'a';
            if (p.tns[u] == null) {
                return -1;
            }
            p = p.tns[u];
        }
        List<Integer> l2 = p.idxs;
        n = l1.size(); m = l2.size();
        for (int i = n - 1, j = m - 1; i >= 0 && j >= 0; ) {
            if (l1.get(i) > l2.get(j)) {
                i--;
            }
            else if (l1.get(i) < l2.get(j)) {
                j--;
            }
            else {
                return l1.get(i);
            }
        }
        return -1;
    }
    TrieNode tr1 = new TrieNode(), tr2 = new TrieNode();
    public Topic745WordFilter(String[] ss) {
        int n = ss.length;
        for (int i = 0; i < n; i++) {
            add(tr1, ss[i], i, false);
            add(tr2, ss[i], i, true);
        }
    }
    public int f(String a, String b) {
        return query(a, b);
    }

}
