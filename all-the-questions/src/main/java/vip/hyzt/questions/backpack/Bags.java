package vip.hyzt.questions.backpack;

/**
 * 0-1背包问题母代码(二维)
 *
 * @author hy
 */
public class Bags {

    public static int bags() {
        // 各个物品的重量
        int[] weight = {1, 3, 4};
        // 个物品对应的价值
        int[] value = {15, 20, 30};
        // 背包最大能承载的重量
        int bagWeight = 4;

        // 二维数组：状态定义:dp[i][j]表示从0-i个物品中选择不超过j重量的物品的最大价值
        int[][] dp = new int[weight.length + 1][bagWeight + 1];

        // 初始化：第一列都是0，第一行表示只选取0号物品最大值
        for (int j = bagWeight; j >= weight[0]; j--) {
            dp[0][j] = dp[0][j - weight[0]] + value[0];
        }

        for (int i = 1; i < weight.length; i++) {
            for (int j = 0; j <= bagWeight; j++) {
                if (j < weight[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]] + value[i]);
            }
        }

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.printf("[%d][%d]: {%d}\t ", i, j, dp[i][j]);
            }
            System.out.println();
        }

        return dp[weight.length - 1][bagWeight];
    }

    public static int oDBags() {
        // 各个物品的重量
        int[] weight = {1, 3, 4};
        // 个物品对应的价值
        int[] value = {15, 20, 30};
        // 背包最大能承载的重量
        int bagWeight = 4;
        int[] dp = new int[bagWeight + 1];

        for (int i = 0; i < weight.length; i++) {
            for (int j = bagWeight; j >= weight[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
            }
        }
        return dp[bagWeight];
    }

}
