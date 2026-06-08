package dz4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A > B) {
            int temp = A;
            A = B;
            B = temp;
        }

        if (A % 2 == 0) {
            A++;
        }

        while (A <= B) {
            System.out.print(A + " ");
            A += 2;
        }
    }
}
