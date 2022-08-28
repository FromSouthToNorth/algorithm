package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic6160AnswerQueriesTests {

    @Test
    public void answerQueries() {
        Topic6160AnswerQueries topic6160AnswerQueries = new Topic6160AnswerQueries();
        int[] nums = {4,5,2,1}, queries = {3,10,21};
        int[] ints = topic6160AnswerQueries.answerQueries(nums, queries);
        System.out.printf("%s \n", Arrays.toString(ints));
    }

}
