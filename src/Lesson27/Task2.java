package Lesson27;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Ввести с клавиатуры символьную строку и определить, сколько в ней слов.
        //Словом считается последовательности «непробельных» символов, отделенная с двух сторон пробелами (или стоящая с краю строки).
        //Слова могут быть разделены несколькими пробелами, в начале и в конце строки тоже могут быть пробелы.
        //Пример:
        //Введите строку:
        //  Вася  пошел      гулять
        //Найдено слов: 3

        Scanner sc = new Scanner(System.in);
        System.out.println("Ввидете текст: ");
        String text = sc.nextLine();

        int words = 0;
        boolean flag = false;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                if (!flag) {
                    words++;
                    flag = true;
                }
            } else flag = false;
        }

        System.out.println(words);
    }
}
