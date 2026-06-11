package Lesson9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите границы диапазона: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        for(int i = A; i <= B; i++) {
            int count = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) {
                    count++;
                }
            } if (count == 2) {
                System.out.print(i + " ");
            }
        }

    }
}
