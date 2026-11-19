package ex2_employee;

public class Main {
    public static void main(String[] args) {
        Employee[] staff = {
            new Employee("Alice", 50000),
            new Manager("Bob", 80000),
            new Intern("Charlie", 20000)
        };

        for (Employee emp : staff) {
            System.out.println(emp.getName() + " (" + emp.getClass().getSimpleName() + ") Bonus: $" + emp.calculateBonus());
        }
    }
}
