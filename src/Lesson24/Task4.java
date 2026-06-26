package Lesson24;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        //Работаем с LinkedList из предыдущего задания
        //Нужно распределить элементы в новый LinkedList так,
        //чтобы в посередине были собаки, вначале кошки,
        //а в хвосте мыши (чтобы не было конфликта мышей и кошек)

        LinkedList<Animal> animals = new LinkedList<>();

        // Кошки
        for (int i = 1; i <= 50; i++) {
            animals.add(new Mysyk(i));
        }

        // Собаки
        for (int i = 1; i <= 50; i++) {
            animals.add(new Dog(i));
        }

        System.out.println("Размер после создания: " + animals.size());

        // Удаляем каждую 5-ю кошку
        int catCounter = 0;

        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i) instanceof Mysyk) {

                catCounter++;

                if (catCounter % 5 == 0) {
                    animals.remove(i);
                    i--; // после удаления элементы сдвинулись
                }
            }
        }

        System.out.println("Размер после удаления кошек: " + animals.size());

        // После каждой 3-й собаки добавляем мышку
        int dogCounter = 0;

        for (int i = 0; i < animals.size(); i++) {

            if (animals.get(i) instanceof Dog) {

                dogCounter++;

                if (dogCounter % 3 == 0) {
                    animals.add(i + 1, new Mouse(1));
                    i++; // пропускаем только что добавленную мышь
                }
            }
        }

        System.out.println("Размер после добавления мышек: " + animals.size());

        // Ищем кошек и мышек рядом
        LinkedList<Animal> catMouseList = new LinkedList<>();

        for (int i = 0; i < animals.size() - 1; i++) {

            Animal current = animals.get(i);
            Animal next = animals.get(i + 1);

            if (current instanceof Mysyk && next instanceof Mouse) {
                catMouseList.add(current);
                catMouseList.add(next);
            }

            if (current instanceof Mouse && next instanceof Mysyk) {
                catMouseList.add(current);
                catMouseList.add(next);
            }
        }

        // Копируем в ArrayList
        ArrayList<Animal> arrayAnimals = new ArrayList<>(animals);

        // Сумма возрастов
        int catAge = 0;
        int dogAge = 0;
        int mouseAge = 0;

        for (Animal animal : arrayAnimals) {

            if (animal instanceof Mysyk) {
                catAge += animal.getAge();
            }

            if (animal instanceof Dog) {
                dogAge += animal.getAge();
            }

            if (animal instanceof Mouse) {
                mouseAge += animal.getAge();
            }
        }

//        System.out.println();
//        System.out.println("Возраст кошек: " + catAge);
//        System.out.println("Возраст собак: " + dogAge);
//        System.out.println("Возраст мышек: " + mouseAge);
//
//        System.out.println();
//        System.out.println("Кошки и мышки рядом:");
//        System.out.println(catMouseList);

        LinkedList<Animal> sortedNewList = new LinkedList<>();
        for (Animal animal : animals) {
            if (animal instanceof Mysyk) {
                sortedNewList.add(animal);
            }
        }

        for(Animal animal : animals) {
            if (animal instanceof Dog) {
                sortedNewList.add(animal);
            }
        }

        for(Animal animal : animals) {
            if (animal instanceof Mouse) {
                sortedNewList.add(animal);
            }
        }

        System.out.println("Новый список:");

        for (Animal animal : sortedNewList) {
            System.out.println(animal);
        }

    }

}
