package vip.hyzt.questions;

import org.junit.Test;

public class Topic2515ClosetTargetTests {

    @Test
    public void closetTarget() {
        Topic2515ClosetTarget topic2515ClosetTarget = new Topic2515ClosetTarget();
        System.out.printf("res: %d\n", topic2515ClosetTarget.closetTarget(new String[]{"hello", "i", "am", "leetcode", "hello"}, "hello", 1));
        System.out.printf("res: %d\n", topic2515ClosetTarget.closetTarget(new String[]{"a","b","leetcode"}, "leetcode", 0));
        System.out.printf("res: %d\n", topic2515ClosetTarget.closetTarget(new String[]{"i","eat","leetcode"}, "ate", 0));
    }

}
