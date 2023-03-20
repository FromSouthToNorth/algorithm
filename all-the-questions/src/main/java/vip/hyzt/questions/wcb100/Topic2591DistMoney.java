package vip.hyzt.questions.wcb100;

/**
 * <h1>2591. 将钱分给最多的儿童</h1>
 * <p></p>
 * <p>给你一个整数 money ，表示你总共有的钱数（单位为美元）和另一个整数 children ，表示你要将钱分配给多少个儿童。</p>
 * <p>你需要按照如下规则分配：</p>
 * <ul>
 *     <li>所有的钱都必须被分配。</li>
 *     <li>每个儿童至少获得 1 美元。</li>
 *     <li>没有人获得 4 美元。</li>
 * </ul>
 * <p>请你按照上述规则分配金钱，并返回 <strong>最多</strong> 有多少个儿童获得 <strong>恰好</strong> 8 美元。如果没有任何分配方案，返回 -1 。</p>
 * <p></p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：money = 20, children = 3
 *     输出：1
 *     解释：
 *     最多获得 8 美元的儿童数为 1 。一种分配方案为：
 *     - 给第一个儿童分配 8 美元。
 *     - 给第二个儿童分配 9 美元。
 *     - 给第三个儿童分配 3 美元。
 *     没有分配方案能让获得 8 美元的儿童数超过 1 。
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：money = 16, children = 2
 *     输出：2
 *     解释：每个儿童都可以获得 8 美元。
 * </pre>
 * <p></p>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= money <= 200</li>
 *     <li>2 <= children <= 30</li>
 * </ul>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/distribute-money-to-maximum-children/">https://leetcode.cn/problems/distribute-money-to-maximum-children/</a>
 */
public class Topic2591DistMoney {

    public int distMoney(int money, int children) {
        if (money == 8 * children) {
            return children;
        }
        if (money > 8 * children - 8 && money != 8 * children - 4) {
            return children - 1;
        }
        if (money < children) {
            return -1;
        }
        return Math.min(children - 2, (money - children) / 7);
    }

}
