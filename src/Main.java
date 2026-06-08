import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");

        int a = sc.nextInt();

        System.out.println("Введите второе число:");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("Равно: " + sum);
    }


}