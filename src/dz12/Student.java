package dz12;

public class Student {
    String name;
    String lastName;
    int age;
    String gender;
    String birthDate;

    int course;

    void setName(String name) {
        this.name = name;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ты еще не родился тогда");
        }
    }

    void setGender(String gender) {
        this.gender = gender;
    }

    void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    void setCourse(int course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getCourse() {
        return course;
    }
}
