package dz3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int N = sc.nextInt();
        int A = sc.nextInt();

        if (N % A == 0) {
            System.out.println("Делится");
        } else {
            System.out.println("Не делится");
        }
    }
}
