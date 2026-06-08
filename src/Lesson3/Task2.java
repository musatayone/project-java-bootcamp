package Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();

        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("Введите третье число: ");
        int c = sc.nextInt();

        System.out.println("Введите четвертое число: ");
        int d = sc.nextInt();

        if(a>b && a>c && a>d){
            System.out.println("Максимальное число: " + a);
        } else if (b>a && b>c && b>d) {
            System.out.println("Максимальное число: " + b);
        } else if (d>a && d>c && d>b) {
            System.out.println("Максимальное число: " + d);
        } else System.out.println("Максимальное число: " + c);
    }
}
