package vip.hyzt.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h3>1773. 统计匹配检索规则的物品数量</h3>
 * @see <a href="https://leetcode.cn/problems/count-items-matching-a-rule/">https://leetcode.cn/problems/count-items-matching-a-rule/</a>
 * @author hy
 */
public class Topic1773CountMatches {

    public static int countMatches(List<List<String>> items, String key, String value) {
        int res = 0;
        int typeIndex = new HashMap<String, Integer>(3) {{
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }}.get(key);

        for (List<String> item : items) {
            if (item.get(typeIndex).equals(value)) {
                res++;
            }
        }
        return res;
    }

}
