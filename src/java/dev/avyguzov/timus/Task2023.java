package dev.avyguzov.timus;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2023 {
    public static int solution(String[] arrWithNames) {
        List<List<String>> postBoxes = Arrays.asList(
                Arrays.asList("Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"),
                Arrays.asList("Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"),
                Arrays.asList("Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie")
        );

        int counter = 0;
        int prevPosition = 0;
        for (String name : arrWithNames) {
            for (int i = 0; i < postBoxes.size(); i++) {
                if (postBoxes.get(i).contains(name)) {
                    counter += Math.abs(i - prevPosition);
                    prevPosition = i;
                    break;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] arrWithNames = new String[n];

        s.nextLine();
        for (int i = 0; i < arrWithNames.length; i++) {
            arrWithNames[i] = s.nextLine();
        }

        System.out.println(solution(arrWithNames));
    }

}
