package Lesson15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Operator beeline = new Operator();
        beeline.name = "Beeline";
        beeline.callPrice = 1;
        beeline.smsPrice = 1.2;
        beeline.internetPrice = 30;

        Operator o = new Operator();
        o.name = "O!";
        o.callPrice = 0.95;
        o.smsPrice = 2;
        o.internetPrice = 30;

        Operator megacom = new Operator();
        megacom.name = "Megacom";
        megacom.callPrice = 1.05;
        megacom.smsPrice = 1.7;
        megacom.internetPrice = 40;

        System.out.println("Введите сколько минут хотели бы: ");
        int minutes = sc.nextInt();

        System.out.println("Введите сколько sms хотели бы: ");
        int sms = sc.nextInt();

        System.out.println("Введите сколько gb хотели бы: ");
        int gb = sc.nextInt();

        double costBeeline = beeline.calculate(minutes, sms, gb);
        double costO = o.calculate(minutes, sms, gb);
        double costMegacom = megacom.calculate(minutes, sms, gb);

        if(costBeeline <= costO && costBeeline <= costMegacom) {
            System.out.println("Лучший тариф: " + beeline.name + " = " + costBeeline);
        } else if(costO <= costMegacom && costO <= costBeeline) {
            System.out.println("Лучший тариф: " + o.name + " = " + costO);
        } else {
            System.out.println("Лучший тариф: " + megacom.name + " = " + costMegacom);
        }
    }
}
