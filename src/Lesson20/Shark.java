package Lesson20;

public class Shark implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Акула плавает");
    }

    @Override
    public void makeNoise() {
        System.out.println("Акула издает звуки: клац-клац");
    }

    public void hunt() {
        System.out.println("Акула охотится");
    }
}
