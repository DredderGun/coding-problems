package dev.avyguzov.stepik.data.structures.queues;

import java.util.Scanner;

/**
 * An array to heap converter
 * <a href="https://stepik.org/lesson/41560/step/1">Problem description</a>
 */
public class AutoAnalyzePrograms {
    /**
     * Находит корень множества. Параллельно переприсваивает всем потомкам корень, чтобы потом поиск шёл быстрее.
     * @param parents массив с потомками
     * @param i индекс для которого ищем корень
     * @return индекс корня
     */
    static int find(int[] parents, int i) {
        if (parents[i] != i) {
            parents[i] = find(parents, parents[i]);
        }
        return parents[i];
    }

    /**
     * Union el1 and el2 in one set.
     * @param elements array with parents
     * @param el1 first element
     * @param el2 second element
     */
    static void union(int[] elements, int el1, int el2) {
        int parent1 = find(elements, el1);
        int parent2 = find(elements, el2);
        if (parent1 != parent2) {
            elements[el1] = parent1;
            elements[el2] = parent1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int d = in.nextInt();
        int[] numbers = new int[n + 1];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        for (int i = 1; i <= e; i++) {
            union(numbers, in.nextInt(), in.nextInt());
        }

        int parent1;
        int parent2;
        for (int i = 1; i <= d; i++) {
            parent1 = find(numbers, in.nextInt());
            parent2 = find(numbers, in.nextInt());
            if (parent1 == parent2) {
                System.out.println("0");
                return;
            }
        }

        System.out.println("1");
    }
}
