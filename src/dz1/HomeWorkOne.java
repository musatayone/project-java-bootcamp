package dz1;

import java.util.Scanner;

public class HomeWorkOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = sc.nextInt();

        System.out.println("Введите второе число: ");
        int b = sc.nextInt();

        System.out.println("Введите третье число: ");
        int c = sc.nextInt();

        int sum = a + b + c;
        int product = a * b * c;
        double average = sum / 3.0f;

        System.out.println("Сумма чисел: " + a + "+" + b + "+" + c + "=" + sum);
        System.out.println("Сложение чисел: " + a + "*" + b + "*" + c + "=" + product);
        System.out.printf("(%d+%d+%d)/3=%.3f", a, b, c, average);
    }
}
