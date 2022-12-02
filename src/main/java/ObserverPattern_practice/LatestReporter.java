package ObserverPattern_practice;

public class LatestReporter implements RainfallReporter {
    private int latest;
    public int getLatest() {
        return this.latest;
    }
    @Override
    public void addQuantity(int quantity) {
        this.latest = quantity;

    }
}