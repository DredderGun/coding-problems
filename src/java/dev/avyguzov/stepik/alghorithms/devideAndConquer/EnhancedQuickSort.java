package dev.avyguzov.stepik.alghorithms.devideAndConquer;

public class EnhancedQuickSort {

    public void doSort(int[] listToSort) {
        quickSort(listToSort, 0, listToSort.length - 1);
    }

    private void quickSort(int[] listToSort, int startIndex, int endIndex) {
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

    private void switchElements(int[] listToSwap, int indexOne, int indexTwo) {
        int firstEl = listToSwap[indexOne];
        int secondEl = listToSwap[indexTwo];
        listToSwap[indexOne] = secondEl;
        listToSwap[indexTwo] = firstEl;
    }
}
