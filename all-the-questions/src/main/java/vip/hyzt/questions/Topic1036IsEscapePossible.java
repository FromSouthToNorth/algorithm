package vip.hyzt.questions;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/**
 * <h3>1036. 逃离大迷宫</h3>
 *
 * <p>在一个 106 x 106 的网格中，每个网格上方格的坐标为(x, y) 。</p>
 *
 * <p>现在从源方格source = [sx, sy]开始出发，意图赶往目标方格target = [tx, ty] 。数组 blocked 是封锁的方格列表，其中每个 blocked[i] = [xi, yi] 表示坐标为 (xi, yi) 的方格是禁止通行的。</p>
 *
 * <p>每次移动，都可以走到网格中在四个方向上相邻的方格，只要该方格 不 在给出的封锁列表blocked上。同时，不允许走出网格。</p>
 *
 * <p>只有在可以通过一系列的移动从源方格source 到达目标方格target 时才返回true。否则，返回 false。</p>
 *
 * <h3>示例 1：</h3>
 * <ul>
 *     <li>输入：blocked = [[0,1],[1,0]], source = [0,0], target = [0,2]</li>
 *     <li>输出：false</li>
 *     <li>解释：</li>
 *     <li>从源方格无法到达目标方格，因为我们无法在网格中移动。</li>
 *     <li>无法向北或者向东移动是因为方格禁止通行。</li>
 *     <li>无法向南或者向西移动是因为不能走出网格。</li>
 * </ul>
 *
 * <h3>示例 2：</h3>
 * <ul>
 *     <li>输入：blocked = [], source = [0,0], target = [999999,999999]</li>
 *     <li>输出：true</li>
 *     <li>解释：</li>
 *     <li>因为没有方格被封锁，所以一定可以到达目标方格。</li>
 * </ul>
 *
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode-cn.com/problems/escape-a-large-maze">链接：https://leetcode-cn.com/problems/escape-a-large-maze</a>
 */
public abstract class Topic1036IsEscapePossible {

    private static final int BLOCKED = -1;

    private static final int VALID = 0;

    private static final int FOUND = 1;

    private static final int[][] DIRS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    private static final int BOUNDARY = 1000000;

    public static boolean isEscapePossible(int[][] blocked, int[] source, int[] target) {
        if (blocked.length < 2) {
            return true;
        }

        Set<Pair> hashBlocked = new HashSet<>();
        for (int[] pos : blocked) {
            hashBlocked.add(new Pair(pos[0], pos[1]));
        }

        int result = check(blocked, source, target, hashBlocked);
        if (result == FOUND) {
            return true;
        }
        else if (result == BLOCKED) {
            return false;
        }
        else {
            result = check(blocked, target, source, hashBlocked);
            return result != BLOCKED;
        }
    }

    private static int check(int[][] blocked, int[] start, int[] finish, Set<Pair> hashBlocked) {
        int sx = start[0], sy = start[1];
        int fx = finish[0], fy = finish[1];
        int countdown = blocked.length * (blocked.length - 1) / 2;
        Pair startPair = new Pair(sx, sy);
        Queue<Pair> queue = new ArrayDeque<>();
        queue.offer(startPair);
        Set<Pair> visited = new HashSet<>();
        visited.add(startPair);
        while (!queue.isEmpty() && countdown > 0) {
            Pair pair = queue.poll();
            int x = pair.x, y = pair.y;
            for (int i = 0; i < 4; ++i) {
                int nx = x + DIRS[i][0], ny = y + DIRS[i][1];
                Pair newPair = new Pair(nx, ny);
                if (nx >= 0 && nx < BOUNDARY && ny >= 0 && ny < BOUNDARY && !hashBlocked.contains(newPair) && !visited.contains(newPair)) {
                    if (nx == fx && ny == fy) {
                        return FOUND;
                    }
                    --countdown;
                    queue.offer(newPair);
                    visited.add(newPair);
                }
            }
        }
        if (countdown > 0) {
            return BLOCKED;
        }
        return VALID;
    }

}
