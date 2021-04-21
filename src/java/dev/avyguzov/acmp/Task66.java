package dev.avyguzov.acmp;

import java.util.Scanner;

// https://acmp.ru/index.asp?main=task&id_task=66
public class Task66 {
    public static char solution(String n) {
        char[] keyboard = new char[] {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's',
        'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        char targetChar = n.charAt(0);

        for (int i = 0; i < keyboard.length; i++) {
            if (keyboard[i] == targetChar && i == keyboard.length - 1) {
                return keyboard[0];
            } else if (keyboard[i] == targetChar) {
                return keyboard[i + 1];
            }
        }

        return 'q';
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n = s.nextLine();

        System.out.println(solution(n));
        s.close();
    }
}
