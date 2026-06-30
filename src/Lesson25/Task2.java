package Lesson25;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        //Превратить модель компьютера, ноутбука в enum (до этого было String)
        //Модели могут быть следующих видов – Dell, Lenovo, HP, Sony, Mac

        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Computer> computers = new ArrayList<>();

        // Создание ноутбуков
        for (int i = 1; i <= 50; i++) {

            Model model;

            switch (i % 5) {
                case 0:
                    model = Model.DELL;
                    break;
                case 1:
                    model = Model.LENOVO;
                    break;
                case 2:
                    model = Model.HP;
                    break;
                case 3:
                    model = Model.SONY;
                    break;
                default:
                    model = Model.MAC;
            }

            laptops.add(new Laptop(100000 + i * 1000, model));
        }

        // Создание компьютеров
        for (int i = 1; i <= 50; i++) {

            Model model;

            switch (i % 5) {
                case 0:
                    model = Model.DELL;
                    break;
                case 1:
                    model = Model.LENOVO;
                    break;
                case 2:
                    model = Model.HP;
                    break;
                case 3:
                    model = Model.SONY;
                    break;
                default:
                    model = Model.MAC;
            }

            computers.add(new Computer(
                    150000 + i * 1000,
                    model,
                    24
            ));
        }

        // Сумма ноутбуков
        double laptopSum = 0;

        for (Laptop laptop : laptops) {
            laptopSum += laptop.getPrice();
        }

        // Сумма компьютеров
        double computerSum = 0;

        for (Computer computer : computers) {
            computerSum += computer.getPrice();
        }

        System.out.println("Сумма ноутбуков: " + laptopSum);
        System.out.println("Сумма компьютеров: " + computerSum);

        // Скидка 20%
        for (Laptop laptop : laptops) {
            laptop.makeDiscount(20);
        }

        double newLaptopSum = 0;

        for (Laptop laptop : laptops) {
            newLaptopSum += laptop.getPrice();
        }

        System.out.println("Сумма ноутбуков после скидки: " + newLaptopSum);

        // Поиск
        double searchPrice = 120000;
        Model searchModel = Model.HP;

        System.out.println();
        System.out.println("Поиск ноутбуков:");

        for (Laptop laptop : laptops) {

            if (laptop.getPrice() == searchPrice &&
                    laptop.getModel() == searchModel) {

                System.out.println(laptop);
            }
        }

        System.out.println();
        System.out.println("Поиск компьютеров:");

        for (Computer computer : computers) {

            if (computer.getPrice() == searchPrice &&
                    computer.getModel() == searchModel) {

                System.out.println(computer);
            }
        }
    }
}
