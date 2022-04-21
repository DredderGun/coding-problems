package dev.avyguzov.stepik.data.structures.basic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class NetworkPackagesTest {

    @Test
    void simpleTest() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List<NetworkPackages.Pack >>();
        Assertions.assertEquals("", n.solution(inputPackages, 1));
    }

    @Test
    void simpleTest1() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(0)));
        Assertions.assertEquals("0", n.solution(inputPackages, 1));
    }

    @Test
    void simpleTest2() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(1), new NetworkPackages.Pack(1)));
        Assertions.assertEquals("0\n-1", n.solution(inputPackages, 1));
    }

    @Test
    void simpleTest3() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(1)));
        inputPackages.put(1, Arrays.asList(new NetworkPackages.Pack(1)));
        Assertions.assertEquals("0\n1", n.solution(inputPackages, 1));
    }

    @Test
    void simpleTest4() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(7), new NetworkPackages.Pack(0)));
        inputPackages.put(2, Arrays.asList(new NetworkPackages.Pack(0)));
        inputPackages.put(3, Arrays.asList(new NetworkPackages.Pack(3)));
        inputPackages.put(4, Arrays.asList(new NetworkPackages.Pack(0)));
        inputPackages.put(5, Arrays.asList(new NetworkPackages.Pack(0)));
        Assertions.assertEquals("0\n7\n7\n-1\n-1\n-1", n.solution(inputPackages, 3));
    }

    @Test
    void simpleTest5() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(2), new NetworkPackages.Pack(0)));
        inputPackages.put(2, Arrays.asList(new NetworkPackages.Pack(0)));
        inputPackages.put(3, Arrays.asList(new NetworkPackages.Pack(3)));
        inputPackages.put(4, Arrays.asList(new NetworkPackages.Pack(0)));
        inputPackages.put(5, Arrays.asList(new NetworkPackages.Pack(0)));
        Assertions.assertEquals("0\n2\n2\n3\n6\n-1", n.solution(inputPackages, 2));
    }

    @Test
    void simpleTest6() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(1, Arrays.asList(new NetworkPackages.Pack(100), new NetworkPackages.Pack(100), new NetworkPackages.Pack(0)));
        Assertions.assertEquals("1\n101\n-1", n.solution(inputPackages, 2));
    }

    @Test
    void simpleTest7() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(999999, Arrays.asList(new NetworkPackages.Pack(1)));
        inputPackages.put(1000000, Arrays.asList(new NetworkPackages.Pack(0), new NetworkPackages.Pack(1),
                new NetworkPackages.Pack(0), new NetworkPackages.Pack(0)));
        Assertions.assertEquals("999999\n1000000\n1000000\n-1\n-1", n.solution(inputPackages, 1));
    }

    @Test
    void simpleTest8() {
        var n = new NetworkPackages();
        var inputPackages = new HashMap<Integer, List< NetworkPackages.Pack >>();
        inputPackages.put(0, Arrays.asList(new NetworkPackages.Pack(0), new NetworkPackages.Pack(0), new NetworkPackages.Pack(1)));
        inputPackages.put(1, Arrays.asList(new NetworkPackages.Pack(0), new NetworkPackages.Pack(0), new NetworkPackages.Pack(0),
                new NetworkPackages.Pack(1), new NetworkPackages.Pack(2), new NetworkPackages.Pack(3)));
        Assertions.assertEquals("0\n0\n0\n1\n1\n1\n1\n2\n-1", n.solution(inputPackages, 2));
    }
}
