package vip.hyzt.questions;

import org.junit.Test;

public class Topic2516TakeCharactersTests {

    @Test
    public void takeCharacters() {
        Topic2516TakeCharacters topic2516TakeCharacters = new Topic2516TakeCharacters();
        System.out.printf("res: %d\n", topic2516TakeCharacters.takeCharacters("aabaaaacaabc", 2));
        System.out.printf("res: %d\n", topic2516TakeCharacters.takeCharacters("a", 1));
    }

}
