package challenge3_logistics;

public class Main {
    public static void main(String[] args) {
        DeliveryService[] services = {
            new CourierService(),
            new DroneDelivery(),
            new CargoTruck()
        };

        for (DeliveryService ds : services) {
            ds.track();
            System.out.println("ETA: " + ds.calculateETA() + " hours\n");
        }
    }
}
