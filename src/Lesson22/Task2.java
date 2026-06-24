package Lesson22;

public class Task2 {
    public static void main(String[] args) {
        //В предыдущем примере – попытаться выйти за пределы массива
        //Обработать эту ошибку в новом блокe catch

        Cat [] cats = new Cat[4];

        cats[0] = new Cat("Барс");
        cats[1] = new Cat("Пума");
        cats[2] = null;
        cats[3] = new Cat("Сакен");

        for(int i = 0; i <= cats.length; i++) {
            try {
                System.out.println(cats[i].getName());
            } catch (NullPointerException e) {
                System.out.println("Элемент " + i + " пустой");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Выход за пределы массива");
            }
        }
    }
}
