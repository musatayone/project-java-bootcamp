package Lesson21;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        //Дополнить предыдущую задачу – записать числа в файл не в одной строке, а в столбец.
        //Считать записи с файла и записать в другой файл, в одну строку - каждый третий символ.
        //Также вывести в консоль, то что пишется в файл 2.
        try(FileWriter file2 = new FileWriter("file2.txt")) {
            for(char c = 'A'; c <= 'Z'; c++) {
                file2.write(c + " ");
            }

            for(int i = 0; i<=10; i++) {
                file2.write(i + "\n");
            }

            System.out.println("Файл 1 создан.");
        }
        catch(IOException e) {
            System.out.println("Ошибка записи в файл 1");
        }

        try(FileReader reader = new FileReader("file2.txt");
            FileWriter file3 = new FileWriter("file3.txt")) {
            int symbol;
            int count = 1;

            while ((symbol = reader.read()) != -1) {
                if(count % 3 == 0) {
                    file3.write(symbol);
                    System.out.print((char) symbol);
                }
                count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
