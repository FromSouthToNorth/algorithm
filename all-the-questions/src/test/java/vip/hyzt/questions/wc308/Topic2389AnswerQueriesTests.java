package vip.hyzt.questions.wc308;

import org.junit.Test;
import vip.hyzt.questions.wc308.Topic2389AnswerQueries;

import java.util.Arrays;

public class Topic2389AnswerQueriesTests {

    @Test
    public void answerQueries() {
        Topic2389AnswerQueries topic2389AnswerQueries = new Topic2389AnswerQueries();
        int[] nums = {4,5,2,1}, queries = {3,10,21};
        int[] ints = topic2389AnswerQueries.answerQueries(nums, queries);
        System.out.printf("%s \n", Arrays.toString(ints));
    }

}
