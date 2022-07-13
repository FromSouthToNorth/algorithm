package vip.hyzt.questions;

import java.util.List;

/**
 * <h3>1773. 统计匹配检索规则的物品数量</h3>
 * @see <a href="https://leetcode.cn/problems/count-items-matching-a-rule/">https://leetcode.cn/problems/count-items-matching-a-rule/</a>
 * @author hy
 */
public class Topic1773CountMatches {

    public static int countMatches(List<List<String>> items, String key, String value) {
        int res = 0, typeIndex = 0;
        switch (key) {
            case "type":
                break;
            case "color":
                typeIndex = 1;
                break;
            case "name":
                typeIndex = 2;
                break;
            default:
        }
        for (List<String> item : items) {
            if (item.get(typeIndex).equals(value)) {
                res++;
            }
        }
        return res;
    }

}
