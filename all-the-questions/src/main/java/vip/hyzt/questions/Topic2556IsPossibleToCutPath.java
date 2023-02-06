package vip.hyzt.questions;

import java.util.ArrayDeque;

/**
 * <h1>2556. 二进制矩阵中翻转最多一次使路径不连通</h1>
 *
 * @author hy
 * @see <a href="https://leetcode.cn/problems/disconnect-path-in-a-binary-matrix-by-at-most-one-flip/">https://leetcode.cn/problems/disconnect-path-in-a-binary-matrix-by-at-most-one-flip/</a>
 */
public class Topic2556IsPossibleToCutPath {

    public boolean isPossibleToCutPath(int[][] grid) {
        boolean[][][] visited = new boolean[grid.length][grid[0].length][2];
        ArrayDeque<int[]> deque = new ArrayDeque<>();
        for (int i = 1; i < grid.length; i++) {
            deque.offer(new int[]{ i, 0, 0 });
        }
        for (int i = 0; i < grid[0].length - 1; i++) {
            deque.offer(new int[]{ grid.length - 1, i, 0 });
        }
        while (!deque.isEmpty()) {
            int[] p = deque.poll();
            if ((p[0] >= 0 && p[0] < grid.length - 1 && p[1] == grid[0].length - 1
                    || p[0] == 0 && p[1] > 0 && p[1] < grid[0].length) && p[2] + grid[p[0]][p[1]] < 2) {
                return true;
            }
            else if (p[0] >= 0 && p[0] < grid.length && p[1] >= 0 && p[1] < grid[0].length && p[2] < 2
                    && !visited[p[0]][p[1]][p[2]]) {
                visited[p[0]][p[1]][p[2]] = true;
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        deque.offer(new int[]{ p[0] + i, p[1] + j, p[2] + grid[p[0]][p[1]] });
                    }
                }
            }
        }
        return false;
    }

}
