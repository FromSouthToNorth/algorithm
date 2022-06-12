package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic890FindAndReplacePatternTests {

    @Test
    public void findAndReplacePattern() {
        String[] words = new String[]{"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> ans = Topic890FindAndReplacePattern.findAndReplacePattern(words, pattern);
        System.out.println(ans);
    }

}
