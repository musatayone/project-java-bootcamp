package dz9;

public class Task2 {
    public static void main(String[] args) {
        // Задача D. Мешки картошки
        //
        //На базаре продается картошка в мешках по 15 кг, 17кг, 21 кг, 23кг и 25кг.
        //Как купить ровно 225 кг картошки, не вскрывая мешки? Сколькими
        //способами можно это сделать?
        //Формат входных данных
        //Нет входных данных
        //Формат выходных данных
        //Список всех возможных вариаций

        int box1 = 15;
        int box2 = 17;
        int box3 = 21;
        int box4 = 23;
        int box5 = 25;

        int sumPotato = 225;
        int count = 0;

        for (int i = 0; i <= sumPotato / box1; i++) {
            for (int j = 0; j <= sumPotato / box2; j++) {
                for (int k = 0; k <= sumPotato / box3; k++) {
                    for (int l = 0; l <= sumPotato / box4; l++) {
                        for (int m = 0; m <= sumPotato / box5; m++) {
                            int totalPotatos = (i * box1) + (j * box2) + (k * box3) + (l * box4) + (m * box5);
                            if (totalPotatos == sumPotato) {
                                count++;
                                System.out.println("Способ " + count + ": 15кг = " + i + ", 17кг = " + j +
                                        ", 21кг = " + k + ", 23кг = " + l + ", 25кг = " + m);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Количество способов: " + count);
    }
}