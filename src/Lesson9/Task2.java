package Lesson9;

public class Task2 {
    public static void main(String[] args) {
        // Задача
        //
        // В магазине продаются яблоки в ящиках по
        //15 кг, 17кг и 21 кг. Как купить ровно 185
        //кг яблок, не вскрывая ящики? Сколькими
        //способами можно это сделать?

        int box1 = 15;
        int box2 = 17;
        int box3 = 21;

        int sumApple = 185;

        int count = 0;

        for(int i = 0; i <= sumApple/box1; i++) {

            for(int j = 0; j <= sumApple/box2; j++) {
                for(int k = 0; k <= sumApple/box3; k++) {

                    int totalApples = (i * box1) + (j * box2) + (k * box3);
                    if (totalApples == sumApple) {
                        count++;

                        System.out.println("Способ " + count +
                                ": 15кг = " + i +
                                ", 17кг = " + j +
                                ", 21кг = " + k);
                    }
                }
            }
        }

        System.out.println("Количество способов: " + count);

    }
}