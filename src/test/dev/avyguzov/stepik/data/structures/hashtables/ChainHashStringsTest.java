package dev.avyguzov.stepik.data.structures.hashtables;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ChainHashStringsTest {
    @Test
    public void test1() {
        ChainHashStrings o = new ChainHashStrings(5);

        o.add("world");
        o.add("HellO");
        Assertions.assertEquals("HellO world", o.check(4));
        Assertions.assertEquals("no", o.find("World"));
        Assertions.assertEquals("yes", o.find("world"));
        o.del("world");
        Assertions.assertEquals("HellO", o.check(4));
        o.del("HellO");
        o.add("luck");
        o.add("GooD");
        Assertions.assertEquals("GooD luck", o.check(2));
        o.del("good");
    }

    @Test
    public void test2() {
        ChainHashStrings o = new ChainHashStrings(4);

        o.add("test");
        o.add("test");
        Assertions.assertEquals("yes", o.find("test"));
        o.del("test");
        Assertions.assertEquals("no", o.find("test"));
        Assertions.assertEquals("no", o.find("Test"));
        o.add("Test");
        Assertions.assertEquals("yes", o.find("Test"));
    }

    @Test
    public void test3() {
        ChainHashStrings o = new ChainHashStrings(3);

        Assertions.assertEquals(" ", o.check(0));
        Assertions.assertEquals("no", o.find("help"));
        o.add("help");
        o.add("del");
        o.add("add");
        Assertions.assertEquals("yes", o.find("add"));
        Assertions.assertEquals("yes", o.find("del"));
        o.del("del");
        Assertions.assertEquals("no", o.find("del"));
        Assertions.assertEquals(" ", o.check(0));
        Assertions.assertEquals("add help", o.check(1));
        Assertions.assertEquals(" ", o.check(2));
    }

    @Test
    public void test4() {
        ChainHashStrings o = new ChainHashStrings(3);

        o.add("a");
        Assertions.assertEquals("no", o.find("d"));
    }
}