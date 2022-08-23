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
     *     <strong>输出：</strong>10
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
     *     <strong>输出：</strong>2
     *     <strong>解释：</strong>
     *     `5` 转换二进制为：0000 0000 0000 0000 0000 0000 0000 0101
     *     向左移一位为:     <i style="color:red">0</i>000 0000 0000 0000 0000 0000 0000 0010
     *     `2`
     *     5 / 2^<sup>1</sup>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = -5, bit = 2
     *     <strong>输出：</strong>-2
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
     *     <strong>输出：</strong>2
     *     <strong>解释：</strong>
     *     `5` 转换二进制为：0000 0000 0000 0000 0000 0000 0000 0101
     *     向左移一位为:     <i style="color:red">0</i>000 0000 0000 0000 0000 0000 0000 0010
     *     `2`
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = -5, bit = 2
     *     <strong>输出：</strong>1073741822
     *     <strong>解释：</strong>
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

    /**
     * <h3>位与 &</h3>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 5，num2 = 3
     *     <strong>输出：</strong>1
     *     <strong>解释：</strong>
     *     十进制 `5` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color: red">101</i>
     *     十进制 `3` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color: red">011</i>
     *     return `1` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color: red">001</i>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 4，num2 = 3
     *     <strong>输出：</strong>0
     *     <strong>解释：</strong>
     *     十进制 `4` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">100</i>
     *     十进制 `3` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">011</i>
     *     return `0` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">000</i>
     * </pre>
     * <pre>
     *     <strong>输入：</strong>num1 = 6，num2 = 4
     *     <strong>输出：</strong>4
     *     <strong>解释：</strong>
     *     十进制 `6` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">110</i>
     *     十进制 `4` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">100</i>
     *     return `4` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">100</i>
     * </pre>
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @return 如果两个操作数 n 位都为 1，结果 n 位则为 1，否则为 0
     */
    public static int bitAnd(int num1, int num2) {
        return num1 & num2;
    }

    /**
     * <h3>位或 |</h3>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 5, num2 = 3
     *     <strong>输出：</strong>7
     *     <strong>解释：</strong>
     *     十进制 `5` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">101</i>
     *     十进制 `3` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">011</i>
     *     return 十进制 `7` -> 二进制:0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">111</i>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 9, num2 = 8
     *     <strong>输出：</strong>9
     *     <strong>解释：</strong>
     *     十进制 `9` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1001</i>
     *     十进制 `8` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1000</i>
     *     return 十进制 `9` -> 二进制:0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1001</i>
     * </pre>
     * <p><b>示例 3：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 4, num2 = 8
     *     <strong>输出：</strong>12
     *     <strong>解释：</strong>
     *     十进制 `4` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">0100</i>
     *     十进制 `8` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1000</i>
     *     return 十进制 `12` -> 二进制:0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1100</i>
     * </pre>
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @return 如果两个操作数 n 位有一位为 1，那么结果的 n 位也为 1，否则为 0
     */
    public static int bitOr(int num1, int num2) {
        return num1 | num2;
    }

    /**
     * <h3>异位或 ^</h3>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 5, num2 = 3
     *     <strong>输出：</strong>6
     *     <strong>解释：</strong>
     *     十进制 `5` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">101</i>
     *     十进制 `3` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">011</i>
     *     return 十进制 `6` -> 二进制:0000 0000 0000 0000 0000 0000 0000 0<i style="color:red">110</i>
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 9, num2 = 4
     *     <strong>输出：</strong>13
     *     <strong>解释：</strong>
     *     十进制 `9` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1001</i>
     *     十进制 `4` -> 二进制：0000 0000 0000 0000 0000 0000 0000 <i style="color:red">0100</i>
     *     return 十进制 `13` -> 二进制:0000 0000 0000 0000 0000 0000 0000 <i style="color:red">1101</i>
     * </pre>
     * <p><b>示例 3：</b></p>
     * <pre>
     *     <strong>输入：</strong>num1 = 1, num2 = 1
     *     <strong>输出：</strong>0
     *     <strong>解释：</strong>
     *     十进制 `1` -> 二进制：0000 0000 0000 0000 0000 0000 0000 000<i style="color:red">1</i>
     *     十进制 `1` -> 二进制：0000 0000 0000 0000 0000 0000 0000 000<i style="color:red">1</i>
     *     return 十进制 `0` -> 二进制:0000 0000 0000 0000 0000 0000 0000 000<i style="color:red">0</i>
     * </pre>
     * @param num1 第一个操作数
     * @param num2 第二个操作数
     * @return 第一个操作数的第 `n` 位与第二个操作数的第 `n` 位相反，那么结果的 `n` 位为 `1`。相等则为 `0`
     */
    public static int bitXOR(int num1, int num2) {
        return num1 ^ num2;
    }


    /**
     * <h3>位非 ~</h3>
     * <p><b>示例 1：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = 5
     *     <strong>输出：</strong>-6
     *     <strong>解释：</strong>
     *     十进制 `5` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0101
     *     return 十进制 `-6` -> 二进制: 1111 1111 1111 1111 1111 1111 1111 1010
     * </pre>
     * <p><b>示例 2：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = 9
     *     <strong>输出：</strong>-10
     *     <strong>解释：</strong>
     *     十进制 `9` -> 二进制：0000 0000 0000 0000 0000 0000 0000 1001
     *     return 十进制 `-10` -> 二进制：1111 1111 1111 1111 1111 1111 1111 0110
     * </pre>
     * <p><b>示例 3：</b></p>
     * <pre>
     *     <strong>输入：</strong>num = 1
     *     <strong>输出：</strong>-2
     *     <strong>解释：</strong>
     *     十进制 `1` -> 二进制：0000 0000 0000 0000 0000 0000 0000 0001
     *     return 十进制 `-2` -> 二进制: 1111 1111 1111 1111 1111 1111 1111 1110
     * </pre>
     * @param num 需要操作的数
     * @return 操作数第 `n` 位为 `1`，那么结果的第 `n` 位为 `0`。反之 结果第 `n` 位为 `1`
     */
    public static int bitNot(int num) {
        return ~num;
    }

}
