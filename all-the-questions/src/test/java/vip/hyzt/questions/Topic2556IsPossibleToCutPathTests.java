package vip.hyzt.questions;

import org.junit.Test;

public class Topic2556IsPossibleToCutPathTests {

    @Test
    public void isPossibleToCutPath() {
        Topic2556IsPossibleToCutPath topic2556IsPossibleToCutPath = new Topic2556IsPossibleToCutPath();
        System.out.printf("res: %b\n", topic2556IsPossibleToCutPath.isPossibleToCutPath(new int[][]{ { 1, 1, 1 }, { 1, 0, 0 }, { 1, 1, 1 } }));
        System.out.printf("res: %b\n", topic2556IsPossibleToCutPath.isPossibleToCutPath(new int[][]{ { 1, 1, 1 }, { 1,0,1 }, { 1, 1, 1 } }));
    }

}
