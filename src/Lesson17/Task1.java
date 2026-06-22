package Lesson17;

public class Task1 {
    public static void main(String[] args) {
        // Создать массив из 10 int. Объявить его final.
        //Заполнить массив
        //Присвоить новые значения.
        //Создать новый массив, используя текущую ссылку

        final int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;

        int[] newArr = arr;
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
