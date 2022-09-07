package vip.hyzt.questions;

import org.junit.Test;

public class Topic1592ReorderSpacesTests {

    @Test
    public void reorderSpaces() {
        Topic1592ReorderSpaces topic1592ReorderSpaces = new Topic1592ReorderSpaces();
        String text = "  a ";
        System.out.printf("res: %s\n", topic1592ReorderSpaces.reorderSpaces(text));
        String text2 = "  this   is  a sentence ";
        System.out.printf("res: %s\n", topic1592ReorderSpaces.reorderSpaces(text2));
    }

}
