package Lesson10;

public class Task2 {
        public static void printArray(String[] arr) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void main(String[] args) {
            String[] codes = {"dsad", "fjdgjd", "dkjhfkjds"};

            printArray(codes);
        }
    }