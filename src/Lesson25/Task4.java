package Lesson25;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Удалить  из списка все повторяющиеся компьютеры и ноутбуки.
        //Сохранить в новый ArrayList компьютеры и ноутбуки в порядке убывания цены
        ArrayList<Laptop> laptops = new ArrayList<>();
        ArrayList<Computer> computers = new ArrayList<>();

        // создаем ноутбуки
        for (int i = 0; i <= 50; i++) {
            Model model;
            if (i % 2 == 0) {
                model = Model.valueOf("DELL");
            } else {
                model = Model.valueOf("ASUS");
            }
            laptops.add(new Laptop(100 + i * 100, model));
        }

        for (int i = 0; i <= 50; i++) {
            Model model;
            if (i % 2 == 0) {
                model = Model.valueOf("ASUS");
            } else {
                model = Model.valueOf("DELL");
            }
            computers.add(new Computer(100 + i * 100, model, 24));
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

        // Удаляем дубликаты ноутбуков
        ArrayList<Laptop> uniqueLaptops = new ArrayList<>();

        for (Laptop laptop : laptops) {
            if (!uniqueLaptops.contains(laptop)) {
                uniqueLaptops.add(laptop);
            }
        }

        laptops = uniqueLaptops;

// Удаляем дубликаты компьютеров
        ArrayList<Computer> uniqueComputers = new ArrayList<>();

        for (Computer computer : computers) {
            if (!uniqueComputers.contains(computer)) {
                uniqueComputers.add(computer);
            }
        }

        computers = uniqueComputers;

// Общий список
        ArrayList<PC> products = new ArrayList<>();

        products.addAll(laptops);
        products.addAll(computers);

// Сортировка по убыванию цены
        products.sort((a, b) ->
                Double.compare(b.getPrice(), a.getPrice()));

        System.out.println("Все товары по убыванию цены:");

        for (PC device : products) {
            System.out.println(device);
        }
    }
}
