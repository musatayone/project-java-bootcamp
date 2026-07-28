package Lesson34;

public class Task4 {
    public static void main(String[] args) {
        //Создать функциональный интерфейс принимающий
        //2 параметра double и возвращающий double.
        //Написать лямбды, которые
        //A + B
        //A pow B
        //A * B

        Calculator sum = (a, b) -> a + b;
        Calculator power = (a, b) -> Math.pow(a, b);
        Calculator multiply = (a, b) -> a * b;

        System.out.println(sum.calculate(5,4));
        System.out.println(power.calculate(5,4));
        System.out.println(multiply.calculate(5,4));
    }
}
