package Lesson7;

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(6);
            System.out.printf("A[%s]=%s\n", i, array[i]);
        }

        System.out.println("---------------");
        boolean found = false;

        for (int i = 0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                found = true;
                System.out.println("Нашли: " + array[i]);
                break;
            }
            }
        if (!found) {
            System.out.println("Нет");
        }
        }

    }
