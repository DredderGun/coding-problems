package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import app.devideAndConquer.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class BinarySearchTest {
    ArrayList<Integer> al = new ArrayList<>();
    BinarySearch binarySearch = new BinarySearch();

    @Before
    public void initArrayList() {
        for (int i = 0; i < 1000; i++) {
            al.add((int) Math.floor(Math.random() * 1000));
        }
        binarySearch.setListForSearch(al);
    }

    @Test
    public void searchForNumberTest() {
        al.add( 1200);
        Assert.assertEquals(new Integer(1001), binarySearch.search(1200));
    }

    @Test
    public void searchForNotExistingNumberTest() {
        Assert.assertTrue(binarySearch.search(999999) < 0);
    }

    @Test
    public void onlyOneElementTest() {
        al.clear();
        al.add(55);
        binarySearch.setListForSearch(al);

        Assert.assertTrue(binarySearch.search(999999) < 0);
        Assert.assertEquals(1, (int) binarySearch.search(55));
    }

    @Test
    public void twoElementsTest() {
        al.clear();
        al.add(55);
        al.add(7);
        binarySearch.setListForSearch(al);

        Assert.assertTrue(binarySearch.search(99999) < 0);
        Assert.assertEquals(new Integer(1), binarySearch.search(7));
        Assert.assertEquals(new Integer(2), binarySearch.search(55));
    }
}
