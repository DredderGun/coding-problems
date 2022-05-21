package dev.avyguzov.stepik.data.structures.queues;

import java.util.Scanner;

/**
 * Table union
 * <a href="https://stepik.org/lesson/41560/step/3?unit=20013">Problem description</a>
 */
public class TableUnion {

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
     * Объеденить две таблицы в одну.
     * @param elements список таблиц
     * @param parents массив с потомками
     * @param dest в множество этого элемента добавим множество элемента @src
     * @param src множество этого элемента сливается с множеством элемента @dest
     * @return сумма всех элементов итогового множества
     */
    static int union(int[] elements, int[] parents, int dest, int src) {
        int parentDest = find(parents, dest);
        int parentSrc = find(parents, src);
        if (parentSrc != parentDest) {
            parents[parentSrc] = parentDest;
            elements[parentDest] = elements[parentSrc] + elements[parentDest];
            elements[parentSrc] = 0;
        }
        return elements[parentDest];
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int operationsCnt = in.nextInt();
        int[] elements = new int[n];
        int[] parents = new int[n];
        int maxTableSize = -1;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = in.nextInt();
            if (elements[i] > maxTableSize) {
                maxTableSize = elements[i];
            }
            parents[i] = i;
        }

        int dest;
        int src;
        int currTableSize;
        while (operationsCnt > 0) {
            dest = in.nextInt();
            src = in.nextInt();
            currTableSize = union(elements, parents, dest - 1, src - 1);
            if (currTableSize > maxTableSize) {
                maxTableSize = currTableSize;
            }
            System.out.println(maxTableSize);
            operationsCnt--;
        }
    }
}
