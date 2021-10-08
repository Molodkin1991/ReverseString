package com.foxminded;

import java.util.Scanner;

public class App {
    private static final String MESSAGE_FOR_INPUTTEXT = "Write some text:";
    private static final String OUTPUT_MESSAGE = "Reversed text: ";

    public static void main(String[] args) {
        ReverseString anagram = new ReverseString();
        String text = readText();
        String reversedText = anagram.reverseText(text);
        System.out.println(OUTPUT_MESSAGE + reversedText);
    }

    public static String readText() {
        Scanner in = new Scanner(System.in);
        System.out.println(MESSAGE_FOR_INPUTTEXT);
        return in.nextLine();
    }
}
