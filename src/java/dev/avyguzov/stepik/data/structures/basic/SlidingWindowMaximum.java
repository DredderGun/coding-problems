package dev.avyguzov.stepik.data.structures.basic;

import java.util.*;

/**
 * Find maximum inside a slide window with width m
 * https://stepik.org/lesson/41234/step/5?unit=19818
 *
 * Another PERFECT solution on Python!
 * if __name__ == '__main__':
 *     n, lst, w = int(input()), [int(i) for i in input().split()], int(input())
 *     que = [0]
 *     for i in range(n):
 *         if i >= w and que[0] == lst[i - w]: que.pop(0)
 *         while que and que[-1] < lst[i]: que.pop()
 *         que.append(lst[i])
 *         if i + 1 >= w: print(que[0], end=' ')
 */
public class SlidingWindowMaximum {
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

        public Integer getMaxInStackAndPopLastEl() {
            Integer el = maxElements.peek();
            this.pop();
            return el;
        }

        public Integer getMaxInStack() {
            if (super.size() == 0) {
                return Integer.MIN_VALUE;
            } else {
                return maxElements.peek();
            }
        }
    }

    public String solution(int[] nmbrs, int windowWidth) {
        var result = new StringBuilder();
        var leftStack = new StackWithMaxElement();
        var rightStack = new StackWithMaxElement();

        for (int i = windowWidth - 1; i >= 0; i--) {
            rightStack.push(nmbrs[i]);
        }
        result.append(rightStack.getMaxInStackAndPopLastEl()).append(" ");

        for (int i = windowWidth; i < nmbrs.length; i++) {
            int currNmbr = nmbrs[i];
            leftStack.push(currNmbr);
            if (rightStack.isEmpty()) {
                result.append(leftStack.getMaxInStack()).append(" ");
                while (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
                rightStack.pop();
            } else {
                result.append(Math.max(leftStack.getMaxInStack(), rightStack.getMaxInStack())).append(" ");
                rightStack.pop();
            }
        }

        return result.toString().strip();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nmbrs = new int[n];

        for (int i = 0; i < n; i++) {
            nmbrs[i] = in.nextInt();
        }
        int windowWidth = in.nextInt();

        var o = new SlidingWindowMaximum();
        System.out.println(o.solution(nmbrs, windowWidth));
    }
}
