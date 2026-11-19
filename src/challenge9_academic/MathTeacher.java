package challenge9_academic;

public class MathTeacher extends Teacher {
    public MathTeacher(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is teaching Calculus and Algebra.");
    }

    @Override
    public String getRole() {
        return "Math Teacher";
    }
}
