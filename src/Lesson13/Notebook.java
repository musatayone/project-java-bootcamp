package Lesson13;

public class Notebook {
    static Hdd hdd;
    static Ram ram;
    static Os os;
    static Cpu cpu;

    @Override
    public String toString() {
        String message = "Мой ноутбук " + "Жесткий диск: "
                + Notebook.getHdd().getSize()
                + " GB, "
                + Notebook.getHdd().getSpeed()
                + " RPM" + " Оперативная память: "
                + Notebook.getRam().getSize()
                + " GB, "
                + Notebook.getRam().getModel() + "ОС: "
                + Notebook.getOs().getName()
                + " "
                + Notebook.getOs().getVersion() + " Процессор: "
                + Notebook.getCpu().getModel()
                + ", "
                + Notebook.getCpu().getCoreCount()
                + " ядер, "
                + Notebook.getCpu().getFrequency()
                + " GHz";
        return message;
    }

    public Notebook(Hdd hdd, Ram ram, Os os, Cpu processor) {
        this.hdd = hdd;
        this.ram = ram;
        this.os = os;
        this.cpu = processor;
    }

    public static Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
    }

    public static Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public static Os getOs() {
        return os;
    }

    public void setOs(Os os) {
        this.os = os;
    }

    public static Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }
}
