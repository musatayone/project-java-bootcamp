package dz22;

import java.io.*;

public class Task1 {
    public static void main(String[] args) {
        //Задача A.
        //	Создать текстовый файл.
        //	Записать туда код текущей программы.
        //	Если после сохранения файл весит больше 100 байт выбросить IllegalStateException и обработать его («Код слишком большой»)
        //	Если не удается считать файл – вывести, что файл не доступен (FileNotFoundException).
        //	В отдельный файл вывести код в котором удалены все пробелы и табы.

        String code =
                "public class Task1 {\n" +
                "public static void main(String[] args) {\n";

        try(FileWriter writer = new FileWriter("src/dz22/fileName.txt")) {
            writer.write(code);
            writer.close();

            File file = new File("src/dz22/fileName.txt");
            if(file.length() > 100){
                throw new IllegalStateException("Код слишком большой");
            }
        }

        catch (IllegalStateException i) {
            System.out.println("Код слишком большой");
        }

        catch(IOException e){
            System.out.println("Ошибка записи");
        }

        try(FileReader reader = new FileReader("src/dz22/fileName.txt")) {
            String text = "";
            int symbol;

            while((symbol = reader.read()) != -1) {
                text += (char)symbol;
            }
            reader.close();

            text = text.replace(" ","");
            text = text.replace("\t","");
            text = text.replace("\n","");

            FileWriter writer2 = new FileWriter("src/dz22/fileNameWithoutSpaces.txt");
            writer2.write(text);
            writer2.close();
        }

        catch (FileNotFoundException fbf) {
            System.out.println("Файл не доступен");
        }

        catch (IOException e) {
            System.out.println("Ошибка чтения");
        }
    }
}
