package org.javaacademy.wonder_field;

import java.util.Arrays;

import static org.javaacademy.wonder_field.Game.scanner;

public class Tableau {
    private String rightAnswer;
    private char letterOnTableau;
    private static char[] letters;

    public void init() {
        rightAnswer = scanner.nextLine();
        letters = new char[rightAnswer.length()];
    }

    public char[] openLetter(char letter) {
        if (checkAttribute(rightAnswer, letterOnTableau)) {
            char[] rightLetters = rightAnswer.toCharArray();
            for (int i = 0; i < rightLetters.length; i++) {
                if (letter == rightLetters[i]) {
                    letters[i] = letter;
                }
            }
        }
        return letters;
    }

    public void showOpenLetters(char[] letters) {
        if (checkAttribute(rightAnswer, letterOnTableau)) {
            System.out.println(Arrays.toString(letters));
        }
    }

    public void openWord(String guessedWord, String rightAnswer) {
        if (guessedWord.equalsIgnoreCase(rightAnswer)) {
            System.out.println("Открытое слово: " + guessedWord);
        }
    }

    public boolean containsUnknownLetters(char[] letters) {
        boolean result = false;
        for (char c : letters) {
            if (c == '_') {
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean checkAttribute(String rightAnswer, char letterOnTableau) {
        return (rightAnswer.isEmpty() || letterOnTableau == 0);
    }
}
