package vip.hyzt.questions;

import org.junit.Test;
import vip.hyzt.questions.wc316.Topic2446HaveConflict;

public class Topic2446HaveConflictTests {

    @Test
    public void haveConflict() {
        Topic2446HaveConflict topic2446HaveConflict = new Topic2446HaveConflict();
        String[] event1 = {"14:00", "16:00"};
        String[] event2 = {"15:00", "16:00"};
        System.out.printf("res: %b\n", topic2446HaveConflict.haveConflict(event1, event2));
        String[] event21 = {"14:00", "16:00"};
        String[] event22 = {"17:00", "18:00"};
        System.out.printf("res: %b\n", topic2446HaveConflict.haveConflict(event21, event22));
    }

}
