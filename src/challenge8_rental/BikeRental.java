package challenge8_rental;

public class BikeRental extends RentalItem {
    public BikeRental(String itemName) { super(itemName); }
    @Override public double calculateCost(int days) { return 12.0 * days; }
}
