package ObserverPattern_practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainfallTest {

    private Rainfall rainfall;

    @Test
    public void record_quantity() {
        LatestReporter latestReporter = new LatestReporter();
        ThreeDaysAverageReporter threeDaysAverageReporter = new ThreeDaysAverageReporter();

        rainfall = new Rainfall(latestReporter, threeDaysAverageReporter);
        addQuantities(0, 0, 0, 30);

        assertEquals(30, latestReporter.getLatest());

        assertEquals(10D, threeDaysAverageReporter.getThreeDaysAverage());
    }

    private void addQuantities(int... quantities) {
        for (int quantity : quantities) {
            rainfall.addQuantity(quantity);
        }
    }
}