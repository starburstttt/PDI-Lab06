package ex1_vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle("Generic Transport", 2020);
        v.start();

        Car c = new Car("Toyota", 2024, 4);
        c.start();
        c.honk();
    }
}
