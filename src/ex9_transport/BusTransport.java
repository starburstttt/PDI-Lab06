package ex9_transport;

public class BusTransport extends Transport {
    public BusTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return distance * 1.5;
    }
}
