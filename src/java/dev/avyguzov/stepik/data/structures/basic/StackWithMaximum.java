package dev.avyguzov.stepik.data.structures.basic;

import java.util.Scanner;
import java.util.Stack;

public class StackWithMaximum {
    static class StackWithMaxElement extends Stack<Integer> {
        private final Stack<Integer> maxElements = new Stack<>();

        @Override
        public Integer push(Integer item) {
            int maxEl = this.size() > 0 ? Math.max(maxElements.peek(), item) : item;
            super.push(item);
            maxElements.push(maxEl);
            return item;
        }

        @Override
        public Integer pop() {
            Integer lastEl = super.pop();
            maxElements.pop();
            return lastEl;
        }

        public Integer getMaxInStack() {
            if (super.size() == 0) {
                return 0;
            } else {
                return maxElements.peek();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StackWithMaxElement stack = new StackWithMaxElement();
        StringBuilder result = new StringBuilder();

        while (n >= 0) {
            String currCmd = in.nextLine();
            if (currCmd.contains("push")) {
                Integer currEl = Integer.valueOf(currCmd.substring(4).strip());
                stack.push(currEl);
            } else if (currCmd.contains("pop")) {
                stack.pop();
            } else if (currCmd.contains("max")) {
                result.append(stack.getMaxInStack()).append("\n");
            }
            n--;
        }

        System.out.println(result.toString().strip());
    }
}
