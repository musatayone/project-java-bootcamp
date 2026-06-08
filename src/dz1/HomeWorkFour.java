package dz1;

import java.util.Scanner;

public class HomeWorkFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = sc.nextInt();

        int sum = n * (n + 1) / 2;

        System.out.println("Итого: " + sum);
    }
}
