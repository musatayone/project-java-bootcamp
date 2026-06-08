package Lesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();

        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        if(a>b) {
            System.out.println("Наименьшее число: " + b);
        } else
            System.out.println("Наименьшее число: " + a);
    }
}
