package Lesson16;

public class Counter {
    private static int numOfCalls = 0;

    public static void increment() {
        numOfCalls++;
    }

    public void factorial() {
        int result = 1;
        for (int i = 1; i <= numOfCalls; i++) {
            result *= i;
        }
        System.out.println("Факториал " + numOfCalls + " = " + result);
    }
}
