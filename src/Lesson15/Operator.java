package Lesson15;

public class Operator {
    String name;

    double callPrice;
    double smsPrice;
    double internetPrice;

    public double calculate(int minutes, int sms, int gb) {
        return minutes * callPrice
                + sms * smsPrice
                + gb * internetPrice;
    }
}
