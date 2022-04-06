package vip.hyzt.bitArithmetic;

/**
 * <h3>位运算，主要操作二进制</h3>
 * @author hy
 */
public abstract class BitArithmetic {

    /**
     * <p>左移 <<</p>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = 5, bit = 1
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>
     *     `5` 转换二进制为：0000 0000 0000 0000 0000 0000 0000 0101
     *     向左移一位为:     0000 0000 0000 0000 0000 0000 0000 101<i style="color:red">0</i>
     *     `10`
     *     2^<sup>1</sup>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = -5, bit = 2
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>
     *     `-5` 转换二进制为：1111 1111 1111 1111 1111 1111 1111 1011
     *     向左移两位为:     1111 1111 1111 1111 1111 1111 1110 11<i style="color:red">00</i>
     *     `-20`
     *     2^<sup>2</sup>
     * </pre>
     * @param num 需要左移的数
     * @param bit 需要左移多少位
     * @return 左移 n 位的结果
     */
    public static int shiftLeft(int num, int bit) {
        return num << bit;
    }

    /**
     * <h3>右移 >></h3>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = 5, bit = 1
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>
     *     `5` 转换二进制为：0000 0000 0000 0000 0000 0000 0000 0101
     *     向左移一位为:     <i style="color:red">0</i>000 0000 0000 0000 0000 0000 0000 0010
     *     `2`
     *     5 / 2^<sup>1</sup>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = -5, bit = 2
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>
     *     `-5` 转换二进制为：1111 1111 1111 1111 1111 1111 1111 1011
     *     向左移两位为:     <i style="color:red">11</i>11 1111 1111 1111 1111 1111 1111 1110
     *     `-2`
     *     -5 / 2^<sup>2</sup>
     * </pre>
     * @param num 需要右移的数
     * @param bit 需要右移多少位
     * @return 右移 n 位的结果
     */
    public static int shiftRight(int num, int bit) {
        return num >> bit;
    }

    /**
     * <h3>无符号右移 >>></h3>
     * <pre>
     *     <strong>输入：</strong>num = 5, bit = 1
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>
     *     `5` 转换二进制为：0000 0000 0000 0000 0000 0000 0000 0101
     *     向左移一位为:     <i style="color:red">0</i>000 0000 0000 0000 0000 0000 0000 0010
     *     `2`
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = -5, bit = 2
     *     <strong>输出：</strong>20
     *     <strong>解释：</strong>1073741822
     *     `-5` 转换二进制为：1111 1111 1111 1111 1111 1111 1111 1011
     *     向左移两位为:     <i style="color:red">00</i>11 1111 1111 1111 1111 1111 1111 1110
     * </pre>
     * @param num 需要右移的数
     * @param bit 需要右移多少位
     * @return 右移 n 位的结果
     */
    public static int unsignedShiftRight(int num, int bit) {
        return num >>> bit;
    }

}
