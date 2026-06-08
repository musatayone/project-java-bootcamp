package Lesson5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int lastDigit = -1;
        boolean sameDigitExists = false;

        while (n > 0) {
            int currentDigit = n % 10;
            if (currentDigit == lastDigit) {
                sameDigitExists = true;
                break;
            }
            lastDigit = currentDigit;
            n /= 10;
        }

        if (sameDigitExists) {
            System.out.println("YES");
        } else {System.out.println("NO");}
    }
}
