package challenge8_rental;

public class CameraRental extends RentalItem {
    public CameraRental(String itemName) { super(itemName); }
    @Override public double calculateCost(int days) { return 35.0 * days; }
}
