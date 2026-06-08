package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Random rand = new Random();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите минимальное число: ");
        int min = sc.nextInt();

        System.out.println("Введите максимальное число: ");
        int max = sc.nextInt();

        System.out.println("size");
        int size = sc.nextInt();

        int[] arr1 = new int[size];

        for(int i = 0; i < size; i++) {
            arr1[i] = rand.nextInt((max-min)+1) + min;
            System.out.println(arr1[i]);
        }
    }
}
