package Lesson27;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Ввести с клавиатуры в одну строку фамилию, имя и отчество, разделив их пробелом.
        //Вывести фамилию и инициалы
        //Пример:
        //Введите фамилию, имя и отчество:
        //Иванов Петр Семёнович
        //П.С. Иванов

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите ФИО:");
        String text = sc.nextLine();

        String[] fio = text.split(" ");
        System.out.println(
                fio[1].charAt(0) + "." +
                        fio[2].charAt(0) + ". " +
                        fio[0]
        );
    }
}
