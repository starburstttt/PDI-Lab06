package challenge9_academic;

public abstract class Teacher extends Employee {
    public Teacher(String name) {
        super(name);
    }

    public abstract String getRole();
}
