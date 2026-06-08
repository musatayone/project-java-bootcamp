package dz1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MathTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите координаты А: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Введите координаты B: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        double sumX = x2 - x1;
        double sumY = y2 - y1;
        double result = (Math.sqrt(Math.pow(sumX, 2) + Math.pow(sumY, 2)));
        System.out.println("Длина отрезка: " + result);
    }
}
