package dev.avyguzov.shad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EulerFunAndBinomProblemTest {

    @Test
    public void simpleTest1() {
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        Assertions.assertEquals(72, o.solution(10, 5));
    }

    @Test
    public void simpleTest2() {
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        Assertions.assertEquals(1, o.solution(2, 0));
    }

    @Test
    public void simpleTest3() {
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        Assertions.assertEquals(4, o.solution(5, 1));
    }

    @Test
    public void simpleTest4() {
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        Assertions.assertEquals(1, o.solution(5, 5));
    }

    @Test
    public void simpleTest5() {
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        Assertions.assertEquals(126720, o.solution(23, 15));
    }

    @Test
    public void simpleTest6() {
        long startTime = System.currentTimeMillis();
        EulerFunAndBinomProblem o = new EulerFunAndBinomProblem();
        o.solution(500_000, 250_000);
//        Assertions.assertEquals(126720, o.solution(500_000, 250_000));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + "ms");
    }
}