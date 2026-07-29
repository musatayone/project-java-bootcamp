package Lesson34;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        //Создать лямбду, которая перебирает все элементы списка (String) и
        //Возвращает слипшийся текст всех элементов Elem1Elem2Elem3 итд
        //Возвращает текст разделенный запятыми.
        //
        //В какой момент запускается лямбда?
        //В момент написания или в момент использования

        ArrayList<String> list = new ArrayList<>();
        list.add("Elem1");
        list.add("Elem2");
        list.add("Elem3");

        Printable2 text = (strings) -> {
            String result = "";
            for (String str : strings) {
                result += str;
            }
            return result;
        };

        Printable2 text2 = (strings) -> {
            String result = "";
            for(int i = 0; i < strings.size(); i++) {
                result += strings.get(i);

                if(i != strings.size() - 1) {
                    result += ", ";
                }
            } return result;
        };

        System.out.println(text.print(list));
        System.out.println(text2.print(list));
    }
}
