package ex9_transport;

public class MetroTransport extends Transport {
    public MetroTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 10.0 + (distance * 2.0);
    }
}
