package Lesson13;

public class Cpu {
    String model;
    int coreCount;
    double frequency;

    public Cpu(String model, int coreCount, double frequency) {
        this.model = model;
        this.coreCount = coreCount;
        this.frequency = frequency;

    }

    public int getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(int coreCount) {
        this.coreCount = coreCount;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
