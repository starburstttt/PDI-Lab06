package challenge10_mixins;

public interface TrackViewsMixin {
    default void trackView(String productName) {
        System.out.println("Analytics: Recorded a view for '" + productName + "'.");
    }
}
