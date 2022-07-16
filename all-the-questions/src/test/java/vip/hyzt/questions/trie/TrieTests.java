package vip.hyzt.questions.trie;

import org.junit.Test;

import java.math.BigDecimal;

public class TrieTests {

    @Test
    public void trieTest() {
        Trie trie = new Trie();
        trie.insert("apple");
        boolean res1 = trie.search("apple");
        boolean res2 = trie.search("app");
        boolean res3 = trie.startsWith("app");
        System.out.println("是否包含 \"apple\" 单词:" + res1);
        System.out.println("是否包含 \"app\" 单词:" + res2);
        System.out.println("是否包含前缀为 \"app\" 的单词: " + res3);
    }

}
