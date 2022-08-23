package vip.hyzt.questions;

/**
 * <h3>782. 变为棋盘</h3>
 * <p>难度 <span style="color: red">困难</span></p>
 * <p>一个 n x n 的二维网络 board 仅由 0 和 1 组成 。每次移动，你能任意交换两列或是两行的位置。</p>
 * <p>返回 将这个矩阵变为  “棋盘”  所需的最小移动次数 。如果不存在可行的变换，输出 -1。</p>
 * <p><strong>“棋盘”</strong> 是指任意一格的上下左右四个方向的值均与本身不同的矩阵。</p>
 * <h4>示例 1:</h4>
 * <img src="https://assets.leetcode.com/uploads/2021/06/29/chessboard1-grid.jpg">
 * <pre>
 *     输入: board = [[0,1,1,0],[0,1,1,0],[1,0,0,1],[1,0,0,1]]
 *     输出: 2
 *     解释:一种可行的变换方式如下，从左到右：
 *     第一次移动交换了第一列和第二列。
 *     第二次移动交换了第二行和第三行。
 * </pre>
 * <h4>示例 2:</h4>
 * <img src="https://assets.leetcode.com/uploads/2021/06/29/chessboard2-grid.jpg">
 * <pre>
 *     输入: board = [[0, 1], [1, 0]]
 *     输出: 0
 *     解释: 注意左上角的格值为0时也是合法的棋盘，也是合法的棋盘.
 * </pre>
 * <h4>示例 3:</h4>
 * <img src="https://assets.leetcode.com/uploads/2021/06/29/chessboard3-grid.jpg">
 * <pre>
 *     输入: board = [[1, 0], [1, 0]]
 *     输出: -1
 *     解释: 任意的变换都不能使这个输入变为合法的棋盘。
 * </pre>
 * <h4>提示：</h4>
 * <ul>
 *     <li>n == board.length</li>
 *     <li>n == board[i].length</li>
 *     <li>2 <= n <= 30</li>
 *     <li>board[i][j] 将只包含 0或 1</li>
 * </ul>
 * @see <a href="https://leetcode.cn/problems/transform-to-chessboard">https://leetcode.cn/problems/transform-to-chessboard</a>
 * @author 力扣（LeetCode）
 * @author hy
 */
public class Topic782MovesToChessboard {

    public int movesToChessboard(int[][] board) {
        int n = board.length;
        int rowMask = 0, colMask = 0;
        for (int i = 0; i < n; i++) {
            rowMask |= (board[0][i] << i);
            colMask |= (board[i][0] << i);
        }
        int reversRowMask = ((1 << n) - 1) ^ rowMask;
        int reversColMask = ((1 << n) - 1) ^ colMask;
        int rowCnt = 0, colCnt = 0;
        for (int i = 0; i < n; i++) {
            int currRowMask = 0;
            int currColMask = 0;
            for (int j = 0; j < n; j++) {
                currRowMask |= (board[i][j] << j);
                currColMask |= (board[j][i] << j);
            }
            if (currRowMask != rowMask && currRowMask != reversRowMask) {
                return -1;
            }
            else if (currRowMask == rowMask) {
                rowCnt++;
            }
            if (currColMask != colMask && currColMask != reversColMask) {
                return -1;
            }
            else if (currColMask == colMask) {
                colCnt++;
            }

        }
        int rowMoves = movesToChessboard(rowMask, rowCnt, n);
        int colMoves = movesToChessboard(colMask, colCnt, n);
        return (rowMoves == -1 || colMoves == -1) ? -1 : (rowMoves + colMoves);
    }

    public int movesToChessboard(int mask, int count, int n) {
        int ones = Integer.bitCount(mask);
        if ((n & 1) == 1) {
            if (Math.abs(n - 2 * ones) != 1 || Math.abs(n - 2 * count) != 1 ) {
                return -1;
            }
            if (ones == (n >> 1)) {
                return n / 2 - Integer.bitCount(mask & 0xAAAAAAAA);
            }
            else {
                return (n + 1) / 2 - Integer.bitCount(mask & 0x55555555);
            }
        }
        else {
            if (ones != (n >> 1) || count != (n >> 1)) {
                return -1;
            }
            int count0 = n / 2 - Integer.bitCount(mask & 0xAAAAAAAA);
            int count1 = n / 2 - Integer.bitCount(mask & 0x55555555);
            return Math.min(count0, count1);
        }
    }

}
