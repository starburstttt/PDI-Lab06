package challenge8_rental;

public class ToolRental extends RentalItem {
    public ToolRental(String itemName) { super(itemName); }
    @Override public double calculateCost(int days) { return 20.0 * days; }
}
