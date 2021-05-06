package dev.avyguzov.other;

public class YandexTask {
    public static String solution(String input) {
        char[] inputCharsArr = input.toCharArray();

        StringBuilder resultStr = new StringBuilder();
        int counter = 1;
        for (int i = 0; i < inputCharsArr.length; i++) {
            if (i + 1 == inputCharsArr.length && counter > 1) {
                resultStr.append(counter);
                resultStr.append(inputCharsArr[i]);
            } else if (i + 1 == inputCharsArr.length && counter == 1) {
                resultStr.append(inputCharsArr[i]);
            } else if (inputCharsArr[i] == inputCharsArr[i + 1]) {
                counter++;
            } else if (counter == 1) {
                resultStr.append(inputCharsArr[i]);
            } else {
                resultStr.append(counter);
                resultStr.append(inputCharsArr[i]);
                counter = 1;
            }
        }

        return resultStr.toString();
    }
}
