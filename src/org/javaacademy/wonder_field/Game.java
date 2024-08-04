package org.javaacademy.wonder_field;

import java.util.Scanner;

public class Game {

    private static final int GAMERS = 3;
    private static final int ROUNDS = 4;
    private static final int GROUP_ROUND = 3;
    private static final int FINAL_ROUND_INDEX = 3;
    public static Scanner scanner = new Scanner(System.in);
    private String[] questions = new String[ROUNDS];
    private String[] answers = new String[ROUNDS];

    public String[] getQuestions() {
        return questions;
    }

    public String[] getAnswers() {
        return answers;
    }

//       Вопросы для игры:
// Какая страна не имеет столицы?
// Какое существо может задержать дыхание на 6 суток?
// Какое живое существо может спать, не просыпаясь 3 года?
// Какое животное имеет 3 глаза?

//       Ответы:
// Науру
// Скорпион
// Улитка
// Туатара


    public void init() {
        System.out.println("Запуск игры \"Поле Чудес\"");
        for (int i = 0; i < ROUNDS; i++) {
            System.out.println("Введите вопрос #" + (i + 1));
            String question = scanner.nextLine();
            questions[i] = question;
            System.out.println("Введите ответ на вопрос #" + (i + 1));
            String answer = scanner.nextLine();
            answers[i] = answer;
        }
        System.out.println("Инициализация закончена, игра начнется через 5 секунд");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }
}
