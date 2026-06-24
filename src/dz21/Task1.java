package dz21;

import java.io.FileReader;

public class Task1 {
    public static void main(String[] args) {
        //Задача A.Работа с файлами
        //	Создать класс Песня, добавить следующие свойства: Название, Исполнитель, Текст песни, Жанр
        //	Создать файл (вручную), содержащий название, жанр, исполнителя и текст песни (Заполнить вручную).
        //	Открыть этот файл в коде, сохранить данные из файла в Объект типа «Песня»
        //	Вывести Песню в консоль, пример:
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

        Song song = new Song();

        try(FileReader reader = new FileReader("src/dz21/lyrics.txt")) {
            String text = "";
            int symbol;

            while((symbol = reader.read()) != -1) {
                text += (char) symbol;
            }

            String[] lines = text.split("\n",4);
            song.setTitle(lines[0]);
            song.setArtist(lines[1]);
            song.setGenre(lines[2]);
            song.setLyrics(lines[3]);
        }
        catch(Exception e) {
            System.out.println("Ошибка чтения файла");
        }
        System.out.println(song);
    }
}
