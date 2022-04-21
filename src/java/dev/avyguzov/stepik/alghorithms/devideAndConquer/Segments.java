package dev.avyguzov.stepik.alghorithms.devideAndConquer;

import java.util.*;

/*
 * A segments problem from Stepik https://stepik.org/lesson/13249/step/6?unit=3434.
 *
 */
public class Segments {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int segmentsCount = s.nextInt();
        int pointsCount = s.nextInt();

        int[] beginnings = new int[segmentsCount];
        int[] endings = new int[segmentsCount];
        int[] points = new int[pointsCount];

        for (int i = 0; i < segmentsCount; i++) {
            beginnings[i] = s.nextInt();
            endings[i] = s.nextInt();
        }

        for (int i = 0; i < pointsCount; i++) {
            points[i] = s.nextInt();
        }

        getSegmentsAndPointsCrossingAmounts(beginnings, endings, points);
    }

    private static int quickSearchLeft(int[] arrForSearch, Integer numberForSearch) {
        int left = 0;
        int right = arrForSearch.length;
        int i;
        while (left < right) {
            i = (right + left) / 2;
            if (arrForSearch[i] < numberForSearch) {
                left = i + 1;
            } else {
                right = i;
            }
        }
        return left;
    }

    private static int quickSearchRight(int[] arrForSearch, Integer numberForSearch) {
        int left = 0;
        int right = arrForSearch.length;
        int i;
        while (left < right) {
            i = (right + left) / 2;
            if (arrForSearch[i] > numberForSearch) {
                right = i;
            } else {
                left = i + 1;
            }
        }
        return left;
    }

    private static void quickSort(int[] listToSort, int startIndex, int endIndex) {
        int leftPointer = startIndex;
        int rightPointer = endIndex;
        int pivotalElement = listToSort[(endIndex + startIndex) / 2];

        while (leftPointer < rightPointer) {
            while (listToSort[leftPointer] < pivotalElement) {
                leftPointer++;
            }
            while (listToSort[rightPointer] > pivotalElement) {
                rightPointer--;
            }
            if (rightPointer >= leftPointer) {
                switchElements(listToSort, leftPointer++, rightPointer--);
            }
        }

        if (rightPointer > startIndex) {
            quickSort(listToSort, startIndex, rightPointer);
        }
        if (leftPointer < endIndex) {
            quickSort(listToSort, leftPointer, endIndex);
        }
    }

    private static void switchElements(int[] listToSwap, int indexOne, int indexTwo) {
        int firstEl = listToSwap[indexOne];
        int secondEl = listToSwap[indexTwo];
        listToSwap[indexOne] = secondEl;
        listToSwap[indexTwo] = firstEl;
    }

    public static List<Integer> getSegmentsAndPointsCrossingAmounts(int[] beginnings, int[] endings, int[] points) {
        ArrayList<Integer> eachPointCrossingsCount = new ArrayList<>();
        quickSort(beginnings, 0, beginnings.length - 1);
        quickSort(endings, 0, endings.length - 1);

        for (Integer point : points) {
            int indexInBeginnings = quickSearchRight(beginnings, point);
            int indexInEndings = quickSearchLeft(endings, point);

            System.out.println(indexInBeginnings - indexInEndings);
            eachPointCrossingsCount.add(indexInBeginnings - indexInEndings);
        }
        return eachPointCrossingsCount;
    }
}
