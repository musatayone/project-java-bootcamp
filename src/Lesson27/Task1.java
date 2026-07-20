package Lesson27;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Получить от пользователя строку
        //Заменить в строке все буквы 'а' на буквы 'б’
        //Вывести новую строку в консоль

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = sc.nextLine();

        String newText = "";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'а') {
                newText += 'б';
            } else newText += c;
        }

        System.out.println(newText);
    }
}
