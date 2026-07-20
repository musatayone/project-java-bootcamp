package Lesson27;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //К предыдущей задаче добавить:
        //Программа должна вывести самое длинное слово и его длину.
        //Пример:
        //Введите строку:
        //  Вася   пошел  гулять
        //Самое длинное слово: гулять, длина 6

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = sc.nextLine();

        int words = 0;
        boolean flag = false;

        String maxWord = "";
        int maxLength = 0;

        String currentWord = "";

        for (int i = 0; i < text.length(); i++) {

            char c = text.charAt(i);

            if (c != ' ') {

                if (!flag) {
                    words++;
                    flag = true;
                    currentWord = "";
                }

                currentWord += c;

            } else {

                if (currentWord.length() > maxLength) {
                    maxLength = currentWord.length();
                    maxWord = currentWord;
                }

                flag = false;
            }
        }

// Проверяем последнее слово,
// потому что строка может не заканчиваться пробелом
        if (currentWord.length() > maxLength) {
            maxLength = currentWord.length();
            maxWord = currentWord;
        }

        System.out.println("Количество слов: " + words);
        System.out.println("Самое длинное слово: " + maxWord);
        System.out.println("Длина: " + maxLength);
    }
}
