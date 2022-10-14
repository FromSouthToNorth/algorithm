package vip.hyzt.questions;

import org.junit.Test;

public class Topic940DistinctSubseqIITests {

    @Test
    public void distinctSubseqII() {
        String[] arr = {"abc", "aba", "aaa", "accb", "abcdefg", "zchmliaqdgvwncfatcfivphddpzjkgyygueikthqzyeeiebczqbqhdytkoawkehkbizdmcnilcjjlpoeoqqoqpswtqdpvszfaksn"};
        Topic940DistinctSubseqII topic940DistinctSubseqII = new Topic940DistinctSubseqII();
        for (String s : arr) {
            System.out.printf("%s 有 {%d} 个不同的子序列\n", s, topic940DistinctSubseqII.distinctSubseqII(s));
        }
    }

}
