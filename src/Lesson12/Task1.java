package Lesson12;

public class Task1 {
    public static void main(String[] args) {
        Animal animalOne = new Animal();
        animalOne.name = "Tiger";
        animalOne.color = "red";
        animalOne.weight = 50;
        animalOne.height = 160;

        System.out.println(animalOne.name + " " + animalOne.color + " " + animalOne.weight + " " + animalOne.height);
    }
}

