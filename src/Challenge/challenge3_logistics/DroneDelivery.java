package challenge3_logistics;

public class DroneDelivery extends DeliveryService {
    @Override
    public void track() {
        System.out.println("Drone tracking: Airborne at 120m altitude.");
    }

    @Override
    public double calculateETA() {
        return 0.5;
    }
}
