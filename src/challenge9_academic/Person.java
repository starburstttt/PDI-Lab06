package challenge9_academic;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void work() {
        System.out.println(name + " is working.");
    }
}
