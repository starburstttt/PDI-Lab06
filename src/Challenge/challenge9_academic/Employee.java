package challenge9_academic;

public class Employee extends Person {
    public Employee(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name + " is performing employee duties.");
    }
}
