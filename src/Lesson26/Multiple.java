package Lesson26;

public class Multiple {
    private Integer a;
    private Integer b;

    public Multiple(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    public Integer getResult() {
        return a * b;
    }

    @Override
    public String toString() {
        return a + " * " + b + " = " + getResult();
    }
}
