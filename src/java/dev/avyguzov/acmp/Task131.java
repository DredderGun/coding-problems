package dev.avyguzov.acmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

// https://acmp.ru/index.asp?main=task&id_task=131
public class Task131 {
    public static Integer solution(List<List<Integer>> people) {
        Integer maxCounter = 0;
        int indexWithMaxAge = -1;
        for (int i = 0; i<people.size(); i++) {
            List<Integer> currPerson = people.get(i);

            if (currPerson.get(1) == 1 && currPerson.get(0) > maxCounter) {
                maxCounter = currPerson.get(0);
                indexWithMaxAge = i + 1;
            }
        }

        return indexWithMaxAge;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        List<List<Integer>> people = new ArrayList<>();

        s.nextLine();
        for (int i = 0; i<N; i++) {
            String currPerson = s.nextLine();
            people.add(Arrays.stream(currPerson.split(" ")).map(Integer::parseInt).collect(Collectors.toList()));
        }

        System.out.println(solution(people));
        s.close();
    }
}
