package challenge10_mixins;

public class DigitalProduct extends Product implements TrackViewsMixin, DiscountMixin {
    public DigitalProduct(String name, double price) {
        super(name, price);
    }

    public void displayOffer() {
        trackView(name);
        double salePrice = applyDiscount(price, 20.0);
        System.out.printf("Digital Product: %s | Original: $%.2f | Discounted: $%.2f%n", name, price, salePrice);
    }
}
