package ex9_transport;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Transport> rides = new ArrayList<>();
        rides.add(new BusTransport(12.0));
        rides.add(new MetroTransport(8.5));
        rides.add(new TaxiTransport(5.0));

        for (Transport t : rides) {
            t.displayFare();
        }
    }
}
