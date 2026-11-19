package challenge3_logistics;

public class CargoTruck extends DeliveryService {
    @Override
    public void track() {
        System.out.println("CargoTruck tracking: Highway checkpoint passed.");
    }

    @Override
    public double calculateETA() {
        return 18.0;
    }
}
