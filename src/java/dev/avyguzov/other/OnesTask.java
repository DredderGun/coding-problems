package dev.avyguzov.other;

/*
 * Дан массив из нулей и единиц. Нужно определить, какой максимальный по длине подинтервал единиц можно получить, удалив ровно один элемент массива.
 * Удалять один элемент из массива обязательно.
 * Требуется решение без дополнительной памяти - O(1), и за линейное время - O(N), исходный массив менять нельзя
 *
 * size_t maxOnes(const std::vector<int>& v);
 */
public class OnesTask {
    public static int solution(int[] nums) {
        int prevOnesCounter = 0;
        int currOnesCounter = 0;
        int maxCounter = -1;
        for (int num : nums) {
            if (num == 1) {
                prevOnesCounter++;
                currOnesCounter++;
            } else {
                if (prevOnesCounter > maxCounter) {
                    maxCounter = prevOnesCounter;
                }
                prevOnesCounter = currOnesCounter;
                currOnesCounter = 0;
            }
        }

        if (prevOnesCounter > maxCounter) {
            maxCounter = prevOnesCounter;
        }

        return maxCounter;
    }
}
