package com.foxminded;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

    class ReverseTest {ReverseString anagram = new ReverseString();

    @Test
    void reverseText_shouldThrowNullPointerException_whenNullIsGiven() {
        assertThrows(NullPointerException.class, () -> anagram.reverseText(null));
    }

    @Test
    void reverseText_shouldReturnEmptyString_whenEmptyStringIsGiven() {
        assertEquals("", anagram.reverseText(""));
    }

    @Test
    void reverseText_shouldReturnEmptyString_whenSingleSpaceGiven() {
        assertEquals("", anagram.reverseText(" "));
    }

    @Test
    void reverseText_shouldReturnEmptyString_whenSeveralSpaceGiven() {
        assertEquals("", anagram.reverseText("  "));
        assertEquals("", anagram.reverseText("   "));
    }

    @Test
    void reverseText_shouldReturnSingleCharacter_whenSingleCharacterGiven() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (char ch : alphabet) {
            assertEquals(String.valueOf(ch), anagram.reverseText(String.valueOf(ch)));
        }
    }

    @Test
    void reverseText_shouldReturnSameLetter_whenSameLetterGiven() {
        assertEquals("vv", anagram.reverseText("vv"));
        assertEquals("cc", anagram.reverseText("cc"));
    }

    @Test
    void reverseText_shouldReturnReversedLowerAndUpperCharacter_whenLowerAndUpperCharacterGiven() {
        assertEquals("vV", anagram.reverseText("Vv"));
        assertEquals("cC", anagram.reverseText("Cc"));
    }

    @Test
    void reverseText_shouldReturnReversedWordWithDifferentLetters_whenWordWithDifferentLettersGiven() {
        assertEquals("msidioryhtarapopyhoduespoduesP", anagram.reverseText("Pseudopseudohypoparathyroidism"));
        assertEquals("dezimotcedioryhtaraporyhT", anagram.reverseText("Thyroparathyroidectomized"));
        //words from 10 longest word in english :))
    }

    @Test
    void reverseText_shouldReturnOnlySymbols_whenOnlySymbolsGiven() {
        assertEquals("!/.", anagram.reverseText("!/."));
        assertEquals("...", anagram.reverseText("..."));
    }

    @Test
    void reverseText_shouldReturnReversedSeveralWords_whenSeveralWordsGiven() {
        assertEquals("nodnol si eht latipac fo taerg niatirb", anagram.reverseText("london is the capital of great britain"));
        assertEquals("m'I suineg remmargorp", anagram.reverseText("I'm genius programmer"));
    }

    @Test
    void reverseText_shouldReturnOnlyNumbers_whenOnlyNumbersGiven() {
        assertEquals("321", anagram.reverseText("321"));
        assertEquals("321", anagram.reverseText("321"));
    }

    @Test
    void reverseText_shouldReverseOnlyLetters_whenNumbersGivenIsWell() {
        assertEquals("ol321", anagram.reverseText("lo321"));
        assertEquals("ro321", anagram.reverseText("or321"));
    }

}
