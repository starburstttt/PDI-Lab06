package challenge2_discounts;

public class SeasonalDiscount extends Discount {
    @Override
    public double apply(double amount) {
        double afterBase = super.apply(amount); // Calls parent 5% discount
        return afterBase * 0.90; // Additional 10% reduction
    }

    public double applyWithoutSuper(double amount) {
        return amount * 0.90; // Only 10% reduction
    }
}
