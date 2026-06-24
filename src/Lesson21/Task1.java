package Lesson21;

import java.io.FileWriter;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        //Вывести в текстовый файл английский алфавит и числа от 0 до 9.
        //AB … Z
        //0123456789

        try (FileWriter file = new FileWriter("alphabet and numbers.txt")) {
            for (char i = 'A'; i <= 'Z'; i++) {
                file.write(i + " ");
            }

            file.write("\n");

            for (int i = 0; i <= 10; i++) {
                file.write(i + " ");
            }

            System.out.println("Файл успешно создан!");

        } catch (IOException e) {
            throw new RuntimeException("Ошибка при записи файла");
        }
    }

}
