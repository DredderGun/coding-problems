package dev.avyguzov.timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// https://timus.online/problem.aspx?space=1&num=1787
public class Task1787 {
    public static int solution(int k, List<Integer> carNumbers) {
        int carRemains = 0;

        for (int currCars : carNumbers) {
            carRemains = currCars + carRemains - k;
            if (carRemains < 0) {
                carRemains = 0;
            }
        }

        return carRemains;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        int n = s.nextInt();
        List<Integer> carNumbers = new ArrayList<>();

        while (n > 0) {
            carNumbers.add(s.nextInt());
            n--;
        }

        System.out.println(solution(k, carNumbers));
        s.close();
    }
}
