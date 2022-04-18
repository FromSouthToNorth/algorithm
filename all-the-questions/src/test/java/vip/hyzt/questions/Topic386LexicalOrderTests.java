package vip.hyzt.questions;

import org.junit.Test;

import java.util.List;

public class Topic386LexicalOrderTests {

    @Test
    public void lexicalOrder() {
        List<Integer> ans = Topic386LexicalOrder.lexicalOrder(13);
        System.out.println(ans);
    }

    @Test
    public void lexicalOrder2() {
        List<Integer> ans = Topic386LexicalOrder.lexicalOrder2(33);
        System.out.println(ans);
    }

}
