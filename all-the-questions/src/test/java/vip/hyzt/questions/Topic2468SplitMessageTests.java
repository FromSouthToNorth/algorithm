package vip.hyzt.questions;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Topic2468SplitMessageTests {

    @Test
    public void splitMessage() {
        Topic2468SplitMessage topic2468SplitMessage = new Topic2468SplitMessage();
        Map<Integer, String> map = new TreeMap<>();
        map.put(9, "this is really a very awesome message");
        map.put(15, "short message");
        map.put(18, "Today, nothing could be more useful than the Web, you can search for anything you want and receive myriads of different answers, but what if you want a device that meets all of your specific needs, then a new application called “apps” can help you. Apps are short for application, and an application is a computer program that helps people perform different activities. In the west, apps have been popular since 2008, there are plenty of people using apps, and they choose them as their favorite rather than the Web. Apps have become the handiest tool in their everyday lives. Apps can do such things for you: you can use it as an alarm clock to wake you up in your lightest sleep phase, or a restaurant guide that’ll help you work out the closest place to get the best meal. Apps are very convenient, it is like your life assistant, they can tell you everything you want to know about yourself. Compared to a computer, you don’t need to take the time to search the Internet, you just tell what you want to know, then the answer will be given to you quickly. Apps are one of the applications of science, there will be more such applications in the future.");
        for (int key : map.keySet()) {
            System.out.printf("res: %s\n", Arrays.toString(topic2468SplitMessage.splitMessage(map.get(key), key)));
        }
    }

}
