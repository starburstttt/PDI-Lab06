package challenge10_mixins;

public interface DiscountMixin {
    default double applyDiscount(double price, double percent) {
        return price * (1.0 - percent / 100.0);
    }
}
