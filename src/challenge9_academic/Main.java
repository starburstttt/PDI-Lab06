package challenge9_academic;

public class Main {
    public static void main(String[] args) {
        Teacher[] teachers = {
            new MathTeacher("Mr. Dara"),
            new ScienceTeacher("Ms. Bopha")
        };

        for (Teacher t : teachers) {
            System.out.print("[" + t.getRole() + "] ");
            t.work();
        }
    }
}
