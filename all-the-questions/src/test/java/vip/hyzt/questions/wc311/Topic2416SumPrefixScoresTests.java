package vip.hyzt.questions.wc311;

import org.junit.Test;
import vip.hyzt.questions.wc311.Topic2416SumPrefixScores;

import java.util.Arrays;

public class Topic2416SumPrefixScoresTests {

    @Test
    public void sumPrefixScores() {
        Topic2416SumPrefixScores topic2416SumPrefixScores = new Topic2416SumPrefixScores();
        String[] words = {"abc", "ab", "bc", "b"};
        System.out.printf("res: %s\n", Arrays.toString(topic2416SumPrefixScores.sumPrefixScores(words)));
    }

}