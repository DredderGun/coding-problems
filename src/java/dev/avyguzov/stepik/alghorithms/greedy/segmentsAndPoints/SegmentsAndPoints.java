package dev.avyguzov.stepik.alghorithms.greedy.segmentsAndPoints;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SegmentsAndPoints {

    public ArrayList<Integer> start(int n, ArrayList<ArrayList<Integer>> inputAr) throws Exception {
        if (inputAr.size() != n) {
            throw new Exception("First argument must be equal to size of second array argument");
        }
        ArrayList<Integer> resultPoints = new ArrayList<>();

        ArrayList<ArrayList<Integer>> sortedInputAr = inputAr.stream()
                .sorted(Comparator.comparing(segment -> segment.get(1)))
                .collect(Collectors.toCollection(ArrayList::new));

        resultPoints.add(sortedInputAr.get(0).get(1));
        for (ArrayList<Integer> segment : sortedInputAr) {
            Integer lastPoint = resultPoints.get(resultPoints.size() - 1);
            if (lastPoint < segment.get(0)) {
                resultPoints.add(segment.get(1));
            }
        }
        return resultPoints;
    }

}
