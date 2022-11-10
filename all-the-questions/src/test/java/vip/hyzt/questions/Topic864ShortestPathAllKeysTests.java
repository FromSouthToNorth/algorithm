package vip.hyzt.questions;

import org.junit.Test;

import java.util.Arrays;

public class Topic864ShortestPathAllKeysTests {

    @Test
    public void shortestPathAllKeys() {
        Topic864ShortestPathAllKeys topic864ShortestPathAllKeys = new Topic864ShortestPathAllKeys();
        String[][] grids = {{"@.a.#","###.#","b.A.B"}, {"@..aA","..B#.","....b"}, {"@Aa"}, {"a.B.b.@...","######A###","c.D.d..f.F","#########C","Ee........"}};
        for (String[] grid : grids) {
            System.out.printf("%s res: %d\n", Arrays.toString(grid), topic864ShortestPathAllKeys.shortestPathAllKeys(grid));
        }
    }

}
