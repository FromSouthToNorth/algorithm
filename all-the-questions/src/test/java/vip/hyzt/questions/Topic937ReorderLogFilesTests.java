package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic937ReorderLogFilesTests {

    @Test
    public void reorderLogfiles() {
        Topic937ReorderLogFiles reorderLogFiles = new Topic937ReorderLogFiles();
        String[] logs = {"dig1 8 1 5 1", "let1 art can", "dig2 3 6", "let2 own kit dig", "let3 art zero"};
        String[] newLogs = reorderLogFiles.reorderLogFiles(logs);
        System.out.println(Arrays.toString(newLogs));
    }

}
