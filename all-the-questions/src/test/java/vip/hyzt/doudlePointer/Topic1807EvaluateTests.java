package vip.hyzt.doudlePointer;

import org.junit.Test;
import vip.hyzt.questions.Topic1807Evaluate;

import java.util.ArrayList;
import java.util.List;

public class Topic1807EvaluateTests {

    @Test
    public void evaluate() {
        Topic1807Evaluate topic1807Evaluate = new Topic1807Evaluate();
        ArrayList<List<String>> list1 = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>();
        strings1.add("name");
        strings1.add("bob");
        ArrayList<String> strings2 = new ArrayList<>();
        strings2.add("age");
        strings2.add("two");
        list1.add(strings1);
        list1.add(strings2);
        System.out.printf("res: %s\n", topic1807Evaluate.evaluate("(name)is(age)yearsold", list1));

        ArrayList<List<String>> list2 = new ArrayList<>();
        ArrayList<String> strings3 = new ArrayList<>();
        strings3.add("key");
        strings3.add("123");
        ArrayList<String> strings4 = new ArrayList<>();
        strings4.add("name");
        strings4.add("xm");
        list2.add(strings3);
        list2.add(strings4);
        System.out.printf("res: %s\n", topic1807Evaluate.evaluate("12,(key)i.s(age)98year-sold", list2));

        ArrayList<List<String>> list3 = new ArrayList<>();
        ArrayList<String> strings5 = new ArrayList<>();
        strings5.add("");
        strings5.add("");
        ArrayList<String> strings6 = new ArrayList<>();
        strings6.add("123");
        strings6.add("321");
        list3.add(strings5);
        list3.add(strings6);
        System.out.printf("res: %s\n", topic1807Evaluate.evaluate("1%2,${()}i.s${(123)}98year-sold", list3));
    }

}
