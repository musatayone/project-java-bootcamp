package Lesson25;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        // Создать Классы ноутбук и компьютер.
        //Свойства: цена, модель(DELL, ASUS).
        //У компьютера есть доп-свойство ширина монитора.
        //На ноут и комп можно делать скидки.
        //Создать по 50 ноутбуков и компов. Цены и модели могут дублироваться (повторяться).
        //Посчитать итоговую сумму по Н и К
        //На все ноутбуки есть скидка (20%). Пересчитать сумму с учётом скидки.
        //Нужно сделать поиск по Н и К. Задаём цену и модель.
        //Вернуть описание найденного товара + цена с учётом скидки, если она имеется.

        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Computer> computers = new ArrayList<>();

        // создаем ноутбуки
        for (int i = 0; i <= 50; i++) {
            String model;
            if (i % 2 == 0) {
                model = "DELL";
            } else {
                model = "ASUS";
            }
//            laptops.add(new Laptop(100 + i * 100, model));
        }

        for (int i = 0; i <= 50; i++) {
            String model;
            if (i % 2 == 0) {
                model = "ASUS";
            } else {
                model = "DELL";
            }
//            computers.add(new Computer(100 + i * 100, model, 24));
        }

        // sum

        double laptopSum = 0;
        for (Laptop laptop : laptops) {
            laptopSum += laptop.getPrice();
        }

        double computerSum = 0;
        for (Computer computer : computers) {
            computerSum += computer.getPrice();
        }

        System.out.println("Сумма ноутбуков = " + laptopSum);
        System.out.println("Сумма компьютеров = " + computerSum);

        // sale 20%

        for (Laptop laptop : laptops) {
            laptop.makeDiscount(20);
        }

        double newLaptopSum = 0;
        for (Laptop laptop : laptops) {
            newLaptopSum += laptop.getPrice();
        }
        System.out.println("После скидки = " + newLaptopSum);

        // Поиск
        double searchPrice = 10100;
        String searchModel = "DELL";

        System.out.println();
        System.out.println("Поиск ноутбуков:");

        for (Laptop laptop : laptops) {
            if(laptop.getPrice() == searchPrice && laptop.getModel().equals(searchModel)) {
                System.out.println(laptop);
            }
        }

        System.out.println();
        System.out.println("Поиск компьютеров:");

        for (Computer computer : computers) {
            if(computer.getPrice() == searchPrice && computer.getModel().equals(searchModel)) {
                System.out.println(computer);
            }
        }
    }
}
