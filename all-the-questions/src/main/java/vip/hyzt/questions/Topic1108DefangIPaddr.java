package vip.hyzt.questions;

/**
 * <h3>1108.IP 地址无效化</h3>
 * <p>给一个有效的 IPv4 地址，返回 IP 地址的无效话版本。</p>
 * <p>所谓的无效 IP 地址，是指用 "[.]" 替换每个 "."。</p>
 * <h3>示例 1：</h3>
 * <pre>
 *     输入：address = "1.1.1.1"
 *     输出："1[.]1[.]1[.]1"
 * </pre>
 * <h3>示例 2：</h3>
 * <pre>
 *     输入：address = "255.100.50.0"
 *     输出："255[.]100[.]50[.]0"
 * </pre>
 * <h3>提示：</h3>
 * <li>给出的地址 address 是个有效的 IPv4 地址</li>
 * @see <a herf="https://leetcode.cn/problems/defanging-an-ip-address/">https://leetcode.cn/problems/defanging-an-ip-address/</a>
 * @author hy
 */
public class Topic1108DefangIPaddr {

    public static String defangIPaddr(String a) {
        StringBuilder sb = new StringBuilder();
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == '.') {
                sb.append("[.]");
            }
            else {
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }

}
