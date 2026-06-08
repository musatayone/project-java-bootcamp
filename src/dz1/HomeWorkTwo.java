package dz1;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите температуру в Цельсии: ");
        double tC = sc.nextDouble();

        double tF = (tC * 9.0 / 5.0) + 32.0;

        System.out.println("Градус в Фаренгейте: " + tF);
    }
}