package vip.hyzt.questions;

import java.util.Arrays;

/**
 * <h1>322. 零钱兑换</h1>
 * <p>给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。</p>
 * <p>计算并返回可以凑成总金额所需的 <strong>最少的硬币个数</strong> 。如果没有任何一种硬币组合能组成总金额，返回 -1 。</p>
 * <p>你可以认为每种硬币的数量是无限的。</p>
 * <h2>示例 1：</h2>
 * <pre>
 *     输入：coins = [1, 2, 5], amount = 11
 *     输出：3
 *     解释：11 = 5 + 5 + 1
 * </pre>
 * <h2>示例 2：</h2>
 * <pre>
 *     输入：coins = [2], amount = 3
 *     输出：-1
 * </pre>
 * <h2>示例 3：</h2>
 * <pre>
 *     输入：coins = [1], amount = 0
 *     输出：0
 * </pre>
 * <h2>提示：</h2>
 * <ul>
 *     <li>1 <= coins.length <= 12</li>
 *     <li>1 <= coins[i] <= 2<sup>31</sup> - 1</li>
 *     <li>0 <= amount <= 10<sup>4</sup></li>
 * </ul>
 * <h2>js</h2>
 * <pre>
 * // Uncaught RangeError: Maximum call stack size exceeded
 * //
 * // const coinChange = function (coins, amount) {
 * //     if (amount < 1) {
 * //         return 0;
 * //     }
 * //     return f(coins, amount, new Array(amount).fill(0));
 * // };
 * // const f = function (coins, amount, count) {
 * //     if (amount < 0) {
 * //         return -1;
 * //     }
 * //     if (amount === 0) {
 * //         return 0;
 * //     }
 * //     if (count[amount - 1] !== 0) {
 * //         return count[amount - 1];
 * //     }
 * //     let min = Number.MAX_VALUE;
 * //     for (let coin of coins) {
 * //         let res = f(coins, amount - coin, count);
 * //         if (res >= 0 && res < min) {
 * //             min = 1 + res;
 * //         }
 * //     }
 * //     count[amount - 1] = (min === Number.MAX_VALUE) ? -1 : min;
 * //     return count[amount - 1];
 * // };
 * const coinChange = function (coins, amount) {
 *     const max = amount + 1;
 *     const dp = new Array(max).fill(max);
 *     dp[0] = 0;
 *     for (let i = 1; i <= amount; i++) {
 *         for (let coin of coins) {
 *             if (coin <= i) {
 *                 dp[i] = Math.min(dp[i], dp[i - coin] + 1);
 *             }
 *         }
 *     }
 *     return dp[amount] > amount ? -1 : dp[amount];
 * };
 * const coins = [1, 2, 5], amount = 11
 * console.log(coinChange(coins, amount));
 * console.log(coinChange([1], 100000));
 * </pre>
 * @see <a href="https://leetcode.cn/problems/coin-change/description/">https://leetcode.cn/problems/coin-change/description/</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic322CoinChange {

    public int coinChange(int[] coins, int amount) {
        //// 数据 amount>= 10e4 会抛出 java.lang.StackOverflowError 异常
        // if (amount < 1) {
        //     return 0;
        // }
        // return coinChange(coins, amount, new int[amount]);

        int max = amount + 1;
        int[] dp = new int[max];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    private int coinChange(int[] coins, int rem, int[] count) {
        if (rem < 0) {
            return -1;
        }
        if (rem == 0) {
            return 0;
        }
        if (count[rem - 1] != 0) {
            return count[rem - 1];
        }
        int min = Integer.MAX_VALUE;
        for (int coin : coins) {
            int res = coinChange(coins, rem - coin, count);
            if (res >= 0 && res < min) {
                min = 1 + res;
            }
        }
        count[rem - 1] = (min == Integer.MAX_VALUE) ? -1 : min;
        return count[rem - 1];
    }

}
