package dz1;

import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите четырехзначное число:");
        String number = sc.next();


        char first = number.charAt(0);
        char second = number.charAt(1);
        char third = number.charAt(2);
        char four = number.charAt(3);

//        int first = number % 10;

        System.out.println("Разделенный итог: " + first + ", " + second + ", " + third + ", " + four);
    }
}

