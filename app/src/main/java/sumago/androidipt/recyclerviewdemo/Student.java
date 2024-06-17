package sumago.androidipt.recyclerviewdemo;

public class Student {
    private int imageId;
    private String name, email, grade;

    public Student(int imageId, String name, String email, String grade) {
        this.imageId = imageId;
        this.name = name;
        this.email = email;
        this.grade = grade;
    }

    public int getImageId() {
        return imageId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade(){
        return grade;
    }
}
