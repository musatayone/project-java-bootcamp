package Lesson32;

public class Task1 {
    public static void main(String[] args) {
        //На собеседованиях часто просят просимулировать ситуацию с гонкой.
        //У нас есть 5 гонщиков Формулы 1.
        //Сделать метод который вычисляет какое место они заняли.
        //Гонщики стартуют через .start()
        //Имя гонщика = имя потока

        Racer racer1 = new Racer("Хэмилтон", 5000);
        Racer racer2 = new Racer("Ферстаппен", 3000);
        Racer racer3 = new Racer("Леклер", 4000);
        Racer racer4 = new Racer("Норрис", 2000);
        Racer racer5 = new Racer("Рассел", 6000);

        racer1.start();
        racer2.start();
        racer3.start();
        racer4.start();
        racer5.start();
    }
}
