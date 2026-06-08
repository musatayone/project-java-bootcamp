package Lesson3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Возраст Антона: ");
        int antonAge = sc.nextInt();

        System.out.println("Возраст Бориса: ");
        int borisAge = sc.nextInt();

        System.out.println("Возраст Виктора: ");
        int victorAge = sc.nextInt();

        if (antonAge > borisAge && antonAge > victorAge) {
            System.out.println("Антон старше всех");
        } else if (borisAge > antonAge && borisAge > victorAge) {
            System.out.println("Борис старше всех");
        } else if (victorAge > borisAge && victorAge > antonAge) {
            System.out.println("Виктор старше всех");
        } else if (antonAge == borisAge && antonAge > victorAge) {
            System.out.println("Антон и Борис старше всех");
        } else if (borisAge == victorAge && borisAge > antonAge) {
            System.out.println("Борис и Виктор старше всех");
        } else if (antonAge == victorAge && victorAge == borisAge) {
            System.out.println("Они одинакового возраста");
        } else System.out.println("Антон и Виктор старше всех");
        }
    }
