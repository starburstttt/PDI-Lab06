package challenge3_logistics;

public class CourierService extends DeliveryService {
    @Override
    public void track() {
        System.out.println("Courier tracking: Package in local van.");
    }

    @Override
    public double calculateETA() {
        return 3.5;
    }
}
