package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(6);
            System.out.printf("A[%s]=%s\n", i, array[i]);
        }

        System.out.println("Введите число: ");
        int x = sc.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                System.out.printf("A[%s]=%s\n", i, array[i]);
            }
        }

//        System.out.println("Введите число: ");
//        int x = sc.nextInt();
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = rand.nextInt(6);
//            System.out.println(array[i]);
//
//            if (array[i] == x)
//                count++;
//        }
//        System.out.println("Каунтер: " + count);

    }
}
