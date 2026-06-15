package ClassworkOOP;


/**
 * Main.
 *
 * @author shabdanbek.m
 * Date: 15.06.2026
 */
public class Main {

    public static void main(String[] args) {
        Animal an = new Animal(); // создали ссылку an и вызвали дефолтный констр
        Animal2 an2 = new Animal2("Olen", null);
        an2.name = "123123";
        an2.age = 123123;

        Animal3 an3 = new Animal3(0);
        System.out.println(an3.age);


        Person p = new Person("Shabdan");
//        p.age = 12;
    }

}

class Animal {
    String name;
    Integer age;

}

class Animal2 {
    String name; // default access modifier
    Integer age;

    public Animal2(String name, Integer age) { // parameterized constructor
        this.name = name;
        this.age = age;
    }

}

class Animal3 {
    String name;
    double age;

    public Animal3(String name) { // parameterized constructor
        this.name = name;
    }

    public Animal3(Integer age) { // parameterized constructor
        this.age = age;
    }
}

class Person {

    private String name; // updatable false
    private Integer age;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        throw new UnsupportedOperationException("access denied!");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

}