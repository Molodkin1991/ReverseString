package com.foxminded;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    private static final String DELIMITER = " ";

    public String reverseText(String text) {
        String[] words = text.split(DELIMITER);
        return Arrays.stream(words).map(this::reverseWord).collect(Collectors.joining(DELIMITER));
    }

    private String reverseWord(String word) {
        char[] wordCharacters = word.toCharArray();
        int i = 0;
        int j = wordCharacters.length-1;
        while (i < j ) {
            if (!Character.isAlphabetic(wordCharacters[i]))
                i++;
            else if (!Character.isAlphabetic(wordCharacters[j]))
                j--;
            else {
                swapChars(wordCharacters, i, j);
                i++;
                j--;
            }
        }
        return String.valueOf(wordCharacters);

    }

    private void swapChars(char[] wordCharacters, int i, int j) {
        char current = wordCharacters[i];
        wordCharacters[i] = wordCharacters[j];
        wordCharacters[j] = current;
    }

}
