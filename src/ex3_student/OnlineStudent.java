package ex3_student;

public class OnlineStudent extends Student {
    private String zoomId;

    public OnlineStudent(String name, String studentId, String zoomId) {
        super(name, studentId);
        this.zoomId = zoomId;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + " | Student ID: " + studentId + " | Zoom ID: " + zoomId);
    }
}
