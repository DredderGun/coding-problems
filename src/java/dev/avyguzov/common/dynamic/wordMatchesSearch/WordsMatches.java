package dev.avyguzov.common.dynamic.wordMatchesSearch;

import java.util.List;

/**
 * (Eng) This algorithm searches the most closest word among the wordsToCompare string list.
 * (Rus) Алгоритм для поиска самого похожего слова на inputWord из списка wordsToCompare.
 * @author Aleksandr Vyguzov
 */
public class WordsMatches {

    /**
     * Start search.
     *
     * @param  inputWord  a word to search
     * @param  wordsToCompare a list of available words, which will be compared with inputWord
     * @return      the closest word among wordsToCompare list
     */
    public String start(String inputWord, List<String> wordsToCompare) {
        String inputWordClone = inputWord.toLowerCase();

        int[][][] allStringsMatchesInfo = wordsToCompare.stream().map(String::toLowerCase).map(currentWord -> {
            int[][] matchingMatrix = new int[currentWord.length()][inputWordClone.length()];
            int i, j;
            matchingMatrix[0][0] = inputWordClone.charAt(0) == currentWord.charAt(0) ? 1 : 0;

            for (i = 1; i < currentWord.length(); i++) {
                for (j = 1; j < inputWordClone.length(); j++) {
                    matchingMatrix[i][j] =
                            inputWordClone.charAt(j) == currentWord.charAt(i) ? matchingMatrix[i - 1][j - 1] + 1 : 0;
                }
            }
            return matchingMatrix;
        }).toArray(int[][][]::new);

        int maxLengthSubsequence = 0;
        String mostMatchedWord = "";
        for (int i = 0; i < allStringsMatchesInfo.length; i++) {
            int[][] currentResultMatches = allStringsMatchesInfo[i];
            int resultOfMatching = currentResultMatches[wordsToCompare.get(i).length() - 1][inputWordClone.length() - 1];
            if (resultOfMatching > maxLengthSubsequence) {
                maxLengthSubsequence = resultOfMatching;
                mostMatchedWord = wordsToCompare.get(i);
            }
        }

        return mostMatchedWord;
    }
}
