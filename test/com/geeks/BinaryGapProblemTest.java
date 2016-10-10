package com.geeks;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by b_ashish on 10-Oct-16.
 */
public class BinaryGapProblemTest {

    @Test
    public void testSolution() throws Exception {

//        BinaryGapProblem bp = new BinaryGapProblem();
        int solution = BinaryGapProblem.solution(15);
        Assert.assertEquals(0, solution);

        int solution1 = BinaryGapProblem.solution(1041);
        Assert.assertEquals(5, solution1);

        int solution2 = BinaryGapProblem.solution(20);
        Assert.assertEquals(1, solution2);

        int solution3 = BinaryGapProblem.solution(529);
        Assert.assertEquals(4, solution3);

        int solution4 = BinaryGapProblem.solution(9);
        Assert.assertEquals(2, solution4);
    }
}
