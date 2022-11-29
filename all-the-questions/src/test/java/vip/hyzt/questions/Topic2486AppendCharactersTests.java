package vip.hyzt.questions;

import org.junit.Test;

public class Topic2486AppendCharactersTests {

    @Test
    public void appendCharacters() {
        Topic2486AppendCharacters topic2486AppendCharacters = new Topic2486AppendCharacters();
        System.out.printf("res: %d\n", topic2486AppendCharacters.appendCharacters("coaching", "coding"));
        System.out.printf("res: %d\n", topic2486AppendCharacters.appendCharacters("abcde", "a"));
        System.out.printf("res: %d\n", topic2486AppendCharacters.appendCharacters("z", "abcde"));
        System.out.printf("res: %d\n", topic2486AppendCharacters.appendCharacters("asdfgh", "awdrgyjil"));
    }

}
