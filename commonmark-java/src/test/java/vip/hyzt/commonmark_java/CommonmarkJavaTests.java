package vip.hyzt.commonmark_java;

import org.junit.Test;

public class CommonmarkJavaTests {

    @Test
    public void markdownConversionJava() {
        String html = CommonmarkJava.markdownConversionJava();
        System.out.println(html);
    }

}
