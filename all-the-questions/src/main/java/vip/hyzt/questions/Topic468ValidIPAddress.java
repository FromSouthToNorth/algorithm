package vip.hyzt.questions;

/**
 * <h3>468.验证IP地址</h3>
 * <p>给定一个字符串 queryIP。如果是有效的 IPv4 地址，返回 "IPv4" ；如果是有效的 IPv6 地址，返回 "IPv6" ；如果不是上述类型的 IP 地址，返回 "Neither" 。</p>
 * <p>有效的IPv4地址 是 “x1.x2.x3.x4” 形式的IP地址。 其中 0 <= xi <= 255 且 xi 不能包含 前导零。例如: “192.168.1.1” 、 “192.168.1.0” 为有效IPv4地址， “192.168.01.1” 为无效IPv4地址; “192.168.1.00” 、 “192.168@1.1” 为无效IPv4地址。</p>
 * <p>一个有效的IPv6地址 是一个格式为“x1:x2:x3:x4:x5:x6:x7:x8” 的IP地址，其中:</p>
 * <ul>
 *     <li>1 <= xi.length <= 4</li>
 *     <li>xi 是一个 十六进制字符串 ，可以包含数字、小写英文字母( 'a' 到 'f' )和大写英文字母( 'A' 到 'F' )。在 xi 中允许前导零。</li>
 *     <li>例如 "2001:0db8:85a3:0000:0000:8a2e:0370:7334" 和 "2001:db8:85a3:0:0:8A2E:0370:7334" 是有效的 IPv6 地址，而 "2001:0db8:85a3::8A2E:037j:7334" 和 "02001:0db8:85a3:0000:0000:8a2e:0370:7334" 是无效的 IPv6 地址。</li>
 * </ul>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：queryIP = "172.16.254.1"
 *     输出："IPv4"
 *     解释：有效的 IPv4 地址，返回 "IPv4"
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：queryIP = "2001:0db8:85a3:0:0:8A2E:0370:7334"
 *     输出："IPv6"
 *     解释：有效的 IPv6 地址，返回 "IPv6"
 * </pre>
 * <h3><示例 3：/h3>
 * <pre>
 *      输入：queryIP = "256.256.256.256"
 *      输出："Neither"
 *      解释：既不是 IPv4 地址，又不是 IPv6 地址
 * </pre>
 * <h3>提示：</h3>
 * <ul>
 *     <li>queryIP 仅由英文字母，数字，字符 '.' 和 ':' 组成。</li>
 * </ul>
 * @author 力扣（LeetCode）
 * @author hy
 * @see <a href="https://leetcode.cn/problems/validate-ip-address/">链接：https://leetcode.cn/problems/validate-ip-address/</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Topic468ValidIPAddress {

    public static String validIPAddress(String ip) {
        if (ip.contains(".") && check4(ip)) return "IPv4";
        if (ip.contains(":") && check6(ip)) return "IPv6";
        return "Neither";
    }
    static boolean check4(String ip) {
        int n = ip.length(), cnt = 0;
        char[] cs = ip.toCharArray();
        for (int i = 0; i < n && cnt <= 3; ) {
            // 找到连续数字段，以 x 存储
            int j = i, x = 0;
            while (j < n && cs[j] >= '0' && cs[j] <= '9' && x <= 255) x = x * 10 + (cs[j++] - '0');
            // 非 item 字符之间没有 item
            if (i == j) return false;
            // 含前导零 或 数值大于 255
            if ((j - i > 1 && cs[i] == '0') || (x > 255)) return false;
            i = j + 1;
            if (j == n) continue;
            // 存在除 . 以外的其他非数字字符
            if (cs[j] != '.') return false;
            cnt++;
        }
        // 恰好存在 3 个不位于两端的 .
        return cnt == 3 && cs[0] != '.' && cs[n - 1] != '.';
    }
    static boolean check6(String ip) {
        int n = ip.length(), cnt = 0;
        char[] cs = ip.toCharArray();
        for (int i = 0; i < n && cnt <= 7; ) {
            int j = i;
            while (j < n && ((cs[j] >= 'a' && cs[j] <= 'f') || (cs[j] >= 'A' && cs[j] <= 'F') || (cs[j] >= '0' && cs[j] <= '9'))) j++;
            // 非 item 字符之间没有 item 或 长度超过 4
            if (i == j || j - i > 4) return false;
            i = j + 1;
            if (j == n) continue;
            // 存在除 : 以外的其他非数字字符
            if (cs[j] != ':') return false;
            cnt++;
        }
        // 恰好存在 7 个不位于两段的 :
        return cnt == 7 && cs[0] != ':' && cs[n - 1] != ':';
    }

}
