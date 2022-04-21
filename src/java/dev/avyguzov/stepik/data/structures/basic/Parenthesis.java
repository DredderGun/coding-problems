package dev.avyguzov.stepik.data.structures.basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Parenthesis {

    public static String solution(String input) {
        List<Character> openBrackets = Arrays.asList('[', '{', '(');
        List<Character> closeBrackets = Arrays.asList(']', '}', ')');

        LinkedList<Character> unclosedParenthesis = new LinkedList<>();
        LinkedList<Integer> lastIndexesOfUnclosedParenthesis = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            Character currChar = input.charAt(i);
            if (!(openBrackets.contains(currChar) || closeBrackets.contains(currChar))) {
                continue;
            }

            Character lastChar = unclosedParenthesis.peekLast();
            switch (currChar) {
                case ']':
                    if (lastChar == null || !lastChar.equals('[')) return String.valueOf(i + 1);
                    break;
                case '}':
                    if (lastChar == null || !lastChar.equals('{')) return String.valueOf(i + 1);
                    break;
                case ')':
                    if (lastChar == null || !lastChar.equals('(')) return String.valueOf(i + 1);
                    break;
            }
            if (closeBrackets.contains(currChar)) {
                unclosedParenthesis.removeLast();
                lastIndexesOfUnclosedParenthesis.removeLast();
            } else {
                unclosedParenthesis.addLast(currChar);
                lastIndexesOfUnclosedParenthesis.addLast(i);
            }
        }

        if (lastIndexesOfUnclosedParenthesis.isEmpty()) {
            return "Success";
        } else {
            return String.valueOf(lastIndexesOfUnclosedParenthesis.peekFirst() + 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(solution(in.nextLine()));
    }
}
