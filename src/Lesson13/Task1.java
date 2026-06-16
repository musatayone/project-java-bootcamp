package Lesson13;

public class Task1 {
    public static void main(String[] args) {
        // Создать класс ноутбук. У ноутбука должны быть следующие свойства:
        //Жесткий диск (размер, скорость)
        //Оперативная память (размер, модель)
        //Операционная система (наименование, версия)
        //Процессор (модель, кол-во ядер, частота)
        //Инициализировать свой ноутбук в качестве объекта.
        //Название классов: Notebook, Hdd, Ram, Os, Cpu

        Hdd hdd = new Hdd(1000, 7200);

        Ram ram = new Ram(16, "Kingston");

        Os os =
                new Os("Windows", "11");

        Cpu processor =
                new Cpu("Intel Core i7", 8, 3.6);

        Notebook notebook =
                new Notebook(hdd, ram, os, processor);

        System.out.println(notebook);

        System.out.println("Мой ноутбук:");

        System.out.println("Жесткий диск: "
                + notebook.getHdd().getSize()
                + " GB, "
                + notebook.getHdd().getSpeed()
                + " RPM");

        System.out.println("Оперативная память: "
                + notebook.getRam().getSize()
                + " GB, "
                + notebook.getRam().getModel());

        System.out.println("ОС: "
                + notebook.getOs().getName()
                + " "
                + notebook.getOs().getVersion());

        System.out.println("Процессор: "
                + notebook.getCpu().getModel()
                + ", "
                + notebook.getCpu().getCoreCount()
                + " ядер, "
                + notebook.getCpu().getFrequency()
                + " GHz");

    }
}
