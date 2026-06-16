package Lesson14;

public class Task1 {
    public static void main(String[] args) {
        // Испечь и упаковать один (хотя бы) обычный хлеб определенной массы и цены.
        //Создать второй хлеб – лепешку. нанести узоры, испечь, лакировать упаковать,
        // назначить цену. Без веса лепешка – считается подделкой
        //Создать Лаваш, который имеет действие «завернуть». Когда испечен
        // Лаваш – вывести «Я лаваш, меня испекли».
        // Создать Багет, имеются свойства длина и количество продольных рубцов.
        // Добавить метод – «рубцевать». При упаковке вывести сообщение «Только в экологичный пакет»
        //Лаваш, Багет имеют фирменное название (как сейчас принято
        // «Провансальский багет», «Элитный лаваш из Дилижана итд»)

        // Простенький хлеб
        Bread bread = new Bread();
        bread.weight = 500;
        bread.price = 120;
        bread.bake();
        bread.pack();

        System.out.println("----------------");

        //Лепешка
        Lepeshka lepeshka = new Lepeshka();
        lepeshka.weight = 400;
        lepeshka.price = 150;
        lepeshka.makeOrnament();
        lepeshka.bake();
        lepeshka.varnish();
        lepeshka.pack();

        System.out.println("----------------");

        //Лаваш
        Lavash lavash = new Lavash();
        lavash.weight = 200;
        lavash.price = 100;
        lavash.name = "Элитный лаваш из Дилижана";
        lavash.bake();
        lavash.wrap();
        lavash.pack();

        System.out.println("----------------");

        //Багет
        Baget baget = new Baget();
        baget.weight = 300;
        baget.price = 300;
        baget.name = "Провансальский багет";
        baget.length = 15;
        baget.bake();
        baget.ribbing();
        baget.pack();
    }
}
