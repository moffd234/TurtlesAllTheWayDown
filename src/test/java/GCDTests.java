
import org.junit.Assert;
import org.junit.Test;

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

        final long startTime1 = System.nanoTime();
        GCD.gcd(1000000000, 900000000);
        final long endTime1 = System.nanoTime();


        LOGGER.log(Level.INFO, "GCD Calculated in " + (endTime1 - startTime1) + " Nanoseconds");

        final long startTime2 = System.nanoTime();
        GCD.gcd2(1000000000, 900000000);
        final long endTime2= System.nanoTime();

        LOGGER.log(Level.INFO, "GCD2 Calculated in " + (endTime2 - startTime2) + " Nanoseconds");
    }
}
