package Lesson31;

public class Task1 {
    public static void main(String[] args) {
        //Написать код. Который печатает N копий какого-то документа.
        int copies = 5;

        for (int i = 1; i <= copies; i++) {

            int copyNumber = i;

            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Печатается копия №" + copyNumber);
                }
            });

            thread.start();
        }
    }
}
