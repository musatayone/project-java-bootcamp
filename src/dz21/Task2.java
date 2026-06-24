package dz21;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        //Задача Б. Работа с файлами наоборот
        //
        //	Создать класс Песня, добавить следующие свойства: Название, Исполнитель, Текст песни, Жанр
        //	Создать и заполнить объект типа «Песня» (Заполнить в коде).
        //	Создать файл с названием песни, записать в этот файл «Название», «Исполнителя», «Жанр», и «Текст песни»
        //	Пример:
        //Nothing else matters
        //Metallica
        //«Power ballad»
        //So close, no matter how far
        //Couldn't be much more from the heart
        //Forever trusting who we are
        //And nothing else matters
        //Never opened myself this way
        //Life is ours, we live it our way
        //All these words I don't just say
        //And nothing else matters
        //…
        //
        //Так должен выглядеть файл «Nothing else matters.txt»

        Song song = new Song(
                "Nothing else matters",
                "Metallica",
                "Power ballad",
                "So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters"
        );

        String fileName = song.getTitle() + ".txt";
        try(FileWriter writer = new FileWriter(fileName)) {
            writer.write(song.getTitle());
            writer.write("\n");

            writer.write(song.getArtist());
            writer.write("\n");

            writer.write(song.getGenre());
            writer.write("\n");

            writer.write(song.getLyrics());

            System.out.println("Файл создан: " + fileName);
        }
        catch (IOException e) {
            System.out.println("Ошибка записи файла");
        }
    }
}
