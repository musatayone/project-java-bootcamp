package dz12;

public class Course {
    String name;
    String creationDate;
    int id;
    String teacherFullName;

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
