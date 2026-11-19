package challenge9_academic;

public class ScienceTeacher extends Teacher {
    public ScienceTeacher(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is supervising a Chemistry lab.");
    }

    @Override
    public String getRole() {
        return "Science Teacher";
    }
}
