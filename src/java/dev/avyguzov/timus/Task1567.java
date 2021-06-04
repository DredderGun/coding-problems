package dev.avyguzov.timus;

import java.util.Scanner;

public class Task1567 {
    public static int solution(String sentence) {
        char[] phoneButtons = new char[] {
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
                'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', 0, '.', ',', '!', ' '
        };

        int counter = 0;
        for (char currSymbol : sentence.toCharArray()) {
            for (int i = 0; i < phoneButtons.length; i++) {
                if (phoneButtons[i] == currSymbol) {
                    counter += (i + 1) % 3 == 0 ? 3 : (i + 1) % 3;
                    break;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(solution(input));
    }
}
