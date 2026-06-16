package dz12;

public class Course {
    String name;
    String creationDate;
    int id;
    String teacherFullName;

    public Course() {
    }

    public Course(String name, String creationDate, int id, String teacherName) {
        this.name = name;
        this.creationDate = creationDate;
        this.id = id;
        this.teacherFullName = teacherName;
    }

    void setName(String name){
        this.name = name;
    }

    void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }
    void setId(int id){
        if(id >= 0) {
            this.id = id;
        } else {
            System.out.println("Негатив не распростроняем");
        }
    }

    void setTeacherFullName(String teacherFullName){
        this.teacherFullName = teacherFullName;
    }

    public String getName(){
        return name;
    }

    public String getCreationDate(){
        return creationDate;
    }

    public int getId(){
        return id;
    }

    public String getTeacherFullName(){
        return teacherFullName;
    }
}
