package ex3_student;

public class Student extends Person {
    protected String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }
}
