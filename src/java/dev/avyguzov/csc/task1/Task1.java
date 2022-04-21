package dev.avyguzov.csc.task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    private String run() {
        ArrayList<String> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String readLine;
        while (in.hasNextLine()) {
            readLine = in.nextLine();
            if (readLine.isEmpty()) {
                break;
            }
            result.add(readLine);
        }
        fastSortArray(result, 0, result.size() - 1);
        StringBuilder sb = new StringBuilder();
        for (int i = result.size() - 1; i >= 0; i--) {
            sb.append(result.get(i));
        }

        return sb.toString();
    }

    private void fastSortArray(List<String> inputArr, int start, int end) {
        if (start >= end || end >= inputArr.size()) {
            return;
        }
        int leftIndex = start + 1;
        int rightIndex = end;
        while (leftIndex <= rightIndex) {
            int compareResult = compareStrings(inputArr.get(leftIndex), inputArr.get(start));
            if (compareResult == -1) {
                leftIndex++;
            } else {
                replaceElements(inputArr, leftIndex, rightIndex);
                rightIndex--;
            }
        }
        replaceElements(inputArr, rightIndex, start);

        fastSortArray(inputArr, start, rightIndex - 1);
        fastSortArray(inputArr, leftIndex, end);
    }

    private int compareStrings(String one, String two) {
        if (one.equals(two)) {
            return 0;
        } else if (checkIfAllZeros(one)) {
            return -1;
        } else if(checkIfAllZeros(two)) {
            return 1;
        } if (one.length() <= two.length()) {
            return execComparing(one, two);
        } else {
            return -1 * execComparing(two, one);
        }
    }

    private boolean checkIfAllZeros(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') return false;
        }
        return true;
    }

    private int execComparing(String shorterStr, String longerStr) {
        for (int i = 0; i < shorterStr.length(); i++) {
            if (shorterStr.charAt(i) > longerStr.charAt(i)) {
                return 1;
            } else if (shorterStr.charAt(i) < longerStr.charAt(i)) {
                return -1;
            }
        }

        if (shorterStr.charAt(0) >= longerStr.charAt(shorterStr.length())) {
            return 1;
        } else {
            return -1;
        }
    }

    private void replaceElements(List<String> inputArr, int leftIndex, int rightIndex) {
        String temp = inputArr.get(leftIndex);
        inputArr.set(leftIndex, inputArr.get(rightIndex));
        inputArr.set(rightIndex, temp);
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Task1().run());
    }
}
