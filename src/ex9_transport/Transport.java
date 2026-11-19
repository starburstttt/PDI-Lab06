package ex9_transport;

public abstract class Transport {
    protected double distance;

    public Transport(double distance) {
        this.distance = distance;
    }

    public abstract double calculateFare();

    public void displayFare() {
        System.out.printf("%s (%.1f km) -> Fare: $%.2f%n",
                getClass().getSimpleName(), distance, calculateFare());
    }
}
