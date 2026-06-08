package Lesson4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = sc.nextInt();
        int count = 0;

        while (a != 0) {
            a = a/10;
            System.out.println("Привет");
            count ++;
        }

        System.out.println(count);
    }
}
