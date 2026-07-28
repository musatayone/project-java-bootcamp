package Lesson34;

public class Student implements Testable {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void passTest() {
        System.out.println(name + " сдал тест");
    }
}
