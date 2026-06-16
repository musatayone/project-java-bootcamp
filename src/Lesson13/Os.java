package Lesson13;

public class Os {
    String name;
    double version;

    public Os(String name, String number) {
        this.name = name;
        this.version = Double.parseDouble(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
