package vip.hyzt.questions;

import org.junit.Test;

public class Topic388LengthLongestPathTests {

    @Test
    public void lengthLongestPath() {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext\n";
        int ans = Topic388LengthLongestPath.lengthLongestPath(input);
        System.out.printf("%d \n", ans);
    }

}
