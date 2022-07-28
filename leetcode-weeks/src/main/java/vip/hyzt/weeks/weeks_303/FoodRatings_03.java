package vip.hyzt.weeks.weeks_303;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * <h3>2353. 设计食物评分系统</h3>
 * <p>设计一个支持下述操作的食物评分系统：</p>
 * <ul>
 *     <li>修改 系统中列出的某种食物的评分。</li>
 *     <li>返回系统中某一类烹饪方式下评分最高的食物。</li>
 * </ul>
 * <p>实现 FoodRatings 类：</p>
 * <ul>
 *     <li>
 *         FoodRatings(String[] foods, String[] cuisines, int[] ratings) 初始化系统。食物由 foods、cuisines 和 ratings 描述，长度均为 n 。
 *         <ul>
 *             <li>foods[i] 是第 i 种食物的名字。</li>
 *             <li>cuisines[i] 是第 i 种食物的烹饪方式。</li>
 *             <li>ratings[i] 是第 i 种食物的最初评分。</li>
 *         </ul>
 *     </li>
 *     <li>void changeRating(String food, int newRating) 修改名字为 food 的食物的评分。</li>
 *     <li>String highestRated(String cuisine) 返回指定烹饪方式 cuisine 下评分最高的食物的名字。如果存在并列，返回 <strong>字典序较小</strong> 的名字。</li>
 * </ul>
 * <p>注意，字符串 x 的字典序比字符串 y 更小的前提是：x 在字典中出现的位置在 y 之前，也就是说，要么 x 是 y 的前缀，或者在满足 x[i] != y[i] 的第一个位置 i 处，x[i] 在字母表中出现的位置在 y[i] 之前。</p>
 * @see <a href="https://leetcode.cn/problems/design-a-food-rating-system/">https://leetcode.cn/problems/design-a-food-rating-system/</a>
 * @author hy
 */
public class FoodRatings_03 extends HashMap<String, TreeSet<String>> {

    private HashMap<String, Map.Entry<String, Integer>> map = new HashMap<>();

    public FoodRatings_03(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            map.put(foods[i], Map.entry(cuisines[i], ratings[i]));
            computeIfAbsent(cuisines[i],
                    t -> new TreeSet<>((o, p) -> map.get(o).getValue().equals(map.get(p).getValue()) ? o.compareTo(p)
                            : map.get(p).getValue() - map.get(o).getValue()))
                    .add(foods[i]);
        }
    }

    public void changeRating(String food, int newRating) {
        get(map.get(food).getKey()).remove(food);
        map.put(food, Map.entry(map.get(food).getKey(), newRating));
        get(map.get(food).getKey()).add(food);
    }

    public String highestRated(String cuisine) {
        return get(cuisine).first();
    }

}
