package ex9_transport;

public class TaxiTransport extends Transport {
    public TaxiTransport(double distance) {
        super(distance);
    }

    @Override
    public double calculateFare() {
        return 20.0 + (distance * 5.0);
    }
}
