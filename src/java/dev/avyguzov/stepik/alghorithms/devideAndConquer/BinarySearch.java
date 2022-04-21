package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class BinarySearch {
    private List<Integer> listForSearch;

    public void setListForSearch(List<Integer> list) {
        this.listForSearch = sortArray(list);
    }

    private List<Integer> sortArray(List<Integer> list) {
        list.sort(Comparator.naturalOrder());
        return list;
    }

    public Integer search(Integer numberForSearch) {
        int left = 1;
        int right = listForSearch.size();
        int i;
        while (left <= right) {
            i = (right + left) / 2;
            if (listForSearch.get(i - 1).equals(numberForSearch)) {
                return i;
            }
            if (listForSearch.get(i - 1) > numberForSearch) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch alg = new BinarySearch();
        Scanner s = new Scanner(System.in);
        int arraySize = s.nextInt();
        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < arraySize; i++) {
            al.add(s.nextInt());
        }
        alg.setListForSearch(al);

        arraySize = s.nextInt();
        for (int i = 0; i < arraySize; i++) {
            System.out.println(alg.search(s.nextInt()));
        }

        s.close();
    }
}
