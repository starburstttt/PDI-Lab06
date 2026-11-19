package challenge8_rental;

public abstract class RentalItem {
    protected String itemName;

    public RentalItem(String itemName) {
        this.itemName = itemName;
    }

    public abstract double calculateCost(int days);

    public String getItemName() {
        return itemName;
    }
}
