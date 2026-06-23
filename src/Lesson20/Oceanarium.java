package Lesson20;

public class Oceanarium {
    private Swimmable[] animals;

    public Oceanarium() {
        animals = new Swimmable[15];

        for (int i = 0; i < 5; i++) {
            animals[i] = new Turtle();
        }

        for (int i = 5; i < 10; i++) {
            animals[i] = new Shark();
        }

        for (int i = 10; i < 15; i++) {
            animals[i] = new Duck();
        }
    }

    public void showAnimals() {
        for (int i = 0; i < animals.length; i++) {
            Swimmable animal = animals[i];
            animal.swim();
            animal.makeNoise();
            if (animal instanceof Turtle) {
                Turtle turtle = (Turtle) animal;
                turtle.layEggs(5);
            }

            if (animal instanceof Shark) {
                Shark shark = (Shark) animal;
                shark.hunt();
            }
            System.out.println();
        }
    }
}
