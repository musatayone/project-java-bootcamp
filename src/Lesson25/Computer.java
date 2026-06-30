package Lesson25;

public class Computer extends PC{
    private double monitorWidth;

    public Computer(double price, Model model, double monitorWidth) {
        super(price, model);
        this.monitorWidth = monitorWidth;
    }

    public double getMonitorWidth() {
        return monitorWidth;
    }

    public void setMonitorWidth(double monitorWidth) {
        this.monitorWidth = monitorWidth;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Монитор: "
                + monitorWidth;
    }
}
