package dz16;

public class Task1 {
    public static void main(String[] args) {
        //Создать класс Кредит со следующими свойствами
        //Id
        //Сумма
        //Период
        //процентная ставка
        //
        //Выдать 5 кредитов.
        //Посчитать
        //количество выданных кредитов,
        //общую сумму выданных кредитов,
        //среднюю сумму кредитов
        //Бонус: Возможно ли подсчитать средневзвешенную ставку* по выданным кредитам?
        // Если возможно, то почему? Если нет, то почему?
        //* Найти в интернете формулу.


        Credit c1 = new Credit(1, 1000, 12, 0.20);
        Credit c2 = new Credit(2, 2000, 6, 0.18);
        Credit c3 = new Credit(3, 1500, 9, 0.22);
        Credit c4 = new Credit(4, 3000, 12, 0.25);
        Credit c5 = new Credit(5, 2500, 3, 0.19);

        System.out.println("Количество кредитов: " + Credit.getCount());

        double total =
                c1.getAmount() +
                        c2.getAmount() +
                        c3.getAmount() +
                        c4.getAmount() +
                        c5.getAmount();
        System.out.println("Тотал сумма кредитов: " + total);

        double average = total / Credit.getCount();
        System.out.println("Средняя сумма: " + average);

        double weightedRate =
                (c1.getAmount() * c1.getRate() +
                        c2.getAmount() * c2.getRate() +
                        c3.getAmount() * c3.getRate() +
                        c4.getAmount() * c4.getRate() +
                        c5.getAmount() * c5.getRate())
                        / total;

        System.out.println("Средневзвешенная ставка: " + weightedRate);


    }
}
