package Lesson35;

public class Student {
    private int id;
    private String FIO;
    private int grade;

    public Student(int id, String FIO) {
        this.id = id;
        this.FIO = FIO;
    }

    public Student(String FIO, int grade) {
        this.FIO = FIO;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return FIO + " - " + grade;
    }
}
