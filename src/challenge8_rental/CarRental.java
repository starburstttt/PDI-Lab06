package challenge8_rental;

public class CarRental extends RentalItem {
    public CarRental(String itemName) { super(itemName); }
    @Override public double calculateCost(int days) { return 55.0 * days; }
}
