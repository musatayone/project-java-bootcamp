package Lesson24;

public class Cat {
    private String name;
    private Integer age;

    public Cat(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Cat(String name) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Cat) {
            return ((Cat) obj).name.equals(this.name)
                    && ((Cat) obj).age == this.age;
        }
        return false;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
