package Lesson32;

public class Racer extends Thread {
    private int time;

    public Racer(String name, int time) {
        super(name);
        this.time = time;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(time);
            System.out.println(getName() + " финишировал");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
