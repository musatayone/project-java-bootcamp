package Lesson34;

public class Task3 {
    public static void main(String[] args) {
        Printable printer = (text -> System.out.println(text));
        printer.print("Hello");
        printer.print("World");
    }
}
