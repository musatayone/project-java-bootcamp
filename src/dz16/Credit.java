package dz16;

public class Credit {
    private int id;
    private double amount;
    private int period;
    private double rate;

    private static int count = 0;

    public Credit() {
        count++;
    }

    public Credit(int id, double amount, int period, double rate) {
        this.id = id;
        this.amount = amount;
        this.period = period;
        this.rate = rate;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public int getPeriod() {
        return period;
    }

    public double getRate() {
        return rate;
    }

    public void setAmount(double amount) {
        if (amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("Сумма не может быть отрицательной");
        }
    }

    public void setPeriod(int period) {
        if (period > 0) {
            this.period = period;
        } else {
            System.out.println("Период должен быть больше 0");
        }
    }

    public void setRate(double rate) {
        if (rate > 0) {
            this.rate = rate;
        } else {
            System.out.println("Ставка должна быть положительной");
        }
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Credit.count = count;
    }

    public void getClass(int i, int i1, int i2, double v) {
    }
}