package vip.hyzt.questions;

import org.junit.Test;

public class Topic640SolveEquationTests {

    @Test
    public void solveEquation() {
        Topic640SolveEquation equation = new Topic640SolveEquation();
        String res = equation.solveEquation("x+5-3+x=6+x-2");
        System.out.println(res);
    }

}
