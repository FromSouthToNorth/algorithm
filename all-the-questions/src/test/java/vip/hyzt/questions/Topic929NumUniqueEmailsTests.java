package vip.hyzt.questions;

import org.junit.Test;

public class Topic929NumUniqueEmailsTests {

    @Test
    public void uniqueEmails() {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        int ans = Topic929NumUniqueEmails.numUniqueEmails(emails);
        System.out.printf("%d \n", ans);
    }

}
