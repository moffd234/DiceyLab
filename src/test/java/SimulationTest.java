import org.junit.Assert;
import org.junit.Test;

public class SimulationTest {
    @Test
    public void testGetNumOccurrences() {
        Simulation sim = new Simulation(2, 1000000);
        sim.bins.incrementBin(2);
        int expected = 1;

        int actual = sim.getNumOccurrences(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumOccurrences1() {
        Simulation sim = new Simulation(5, 1000000);
        sim.bins.incrementBin(30);
        int expected = 1;

        int actual = sim.getNumOccurrences(30);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getOccurrenceRate() {
        Simulation sim = new Simulation(2, 2);
        sim.bins.incrementBin(2);
        sim.bins.incrementBin(3);
        String expected = "0.5";

        Double actual = sim.getOccurrenceRate(2);
        String actualString = String.format("%.1f", actual); // Cast to a string, so we can
        // format it to have 1 decimal place

        Assert.assertEquals(expected, actualString);
    }

    @Test
    public void getOccurrenceRate1() {
        Simulation sim = new Simulation(5, 2);
        sim.bins.incrementBin(5);
        sim.bins.incrementBin(8);
        String expected = "0.5";

        Double actual = sim.getOccurrenceRate(5);
        String actualString = String.format("%.1f", actual); // Cast to a string, so we can
        // format it to have 1 decimal place

        Assert.assertEquals(expected, actualString);
    }

    @Test
    public void testConstructor() {
        Simulation sim = new Simulation(2, 10000);
        int expectedMinRoll = 2;
        int expectedMaxRoll = 12;

        int actualMinRoll = sim.minRoll;
        int actualMaxRoll = sim.maxRoll;

        Assert.assertEquals(expectedMinRoll, actualMinRoll); // Test minRoll calculation
        Assert.assertEquals(expectedMaxRoll, actualMaxRoll); // Test maxRoll calculation
    }

    @Test
    public void testConstructor1() {
        Simulation sim = new Simulation(5, 10000);
        int expectedMinRoll = 5;
        int expectedMaxRoll = 30;

        int actualMinRoll = sim.minRoll;
        int actualMaxRoll = sim.maxRoll;

        Assert.assertEquals(expectedMinRoll, actualMinRoll); // Test minRoll calculation
        Assert.assertEquals(expectedMaxRoll, actualMaxRoll); // Test maxRoll calculation
    }
}