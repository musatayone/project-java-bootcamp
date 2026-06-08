package dz3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите три угла для треугольника: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a + b + c == 180 && a > 0 && b > 0 && c > 0) {
            System.out.println("Ты крутой! Да, это треугольник");
        } else {
            System.out.println("Это не треугольник");
        }
    }
}
