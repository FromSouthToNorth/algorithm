import org.junit.Test;
import vip.hyzt.questions.wc356.Topic2799CountCompleteSubarrays;

public class Topic2799CountCompleteSubarraysTests {

    @Test
    public void countCompleteSubarrays() {
        Topic2799CountCompleteSubarrays topic2799CountCompleteSubarrays = new Topic2799CountCompleteSubarrays();
        int[] nums1 = { 1, 3, 1, 2, 2 };
        System.out.printf("res: %d\n", topic2799CountCompleteSubarrays.countCompleteSubarrays(nums1));
        int[] nums2 = { 5, 5, 5, 5 };
        System.out.printf("res: %d\n", topic2799CountCompleteSubarrays.countCompleteSubarrays(nums2));
    }
}
