
import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GCDTests {
    @Test
    public void testGCDOf100And10() {
        int expected = 10;

        int actual = GCD.gcd(100, 10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCDOf100And20() {
        int expected = 20;

        int actual = GCD.gcd(100, 20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCDOf100And45() {
        int expected = 5;

        int actual = GCD.gcd(100, 45);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGCDOf1000000And900000() {
        int expected = 100000000;

        int actual = GCD.gcd(1000000000, 900000000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2Of100And10() {
        int expected = 10;

        int actual = GCD.gcd2(100, 10);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2Of100And20() {
        int expected = 20;

        int actual = GCD.gcd2(100, 20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2Of100And45() {
        int expected = 5;

        int actual = GCD.gcd2(100, 45);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD21000000And900000() {
        int expected = 100000000;

        int actual = GCD.gcd2(1000000000, 900000000);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTiming1000000And900000(){
        Logger LOGGER = Logger.getLogger(GCDTests.class.getName());
        LOGGER.setLevel(Level.INFO);


        Instant start = Instant.now();
        GCD.gcd(1000000000, 900000000);
        Instant end = Instant.now();


        LOGGER.log(Level.INFO, "GCD Calculated in " + Duration.between(start, end).toNanos() + " Nanoseconds");

        start = Instant.now();
        GCD.gcd2(1000000000, 900000000);
        end = Instant.now();

        LOGGER.log(Level.INFO, "GCD2 Calculated in " + Duration.between(start, end).toNanos() + " Nanoseconds");
    }
}
