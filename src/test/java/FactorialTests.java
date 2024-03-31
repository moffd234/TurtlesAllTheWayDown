import org.junit.Assert;
import org.junit.Test;

public class FactorialTests {

    @Test
    public void testFactorialOf0() {

        Long num = 0L;
        Long expected = 1L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOf1() {

        Long num = 1L;
        Long expected = 1L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialOf5() {

        Long num = 5L;
        Long expected = 120L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOf10() {

        Long num = 10L;
        Long expected = 3628800L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOf15() {

        Long num = 15L;
        Long expected = 1307674368000L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void testFactorialOf20() {

        Long num = 20L;
        Long expected = 2432902008176640000L;

        Long actual = Factorial.factorial(num);

        Assert.assertEquals(expected, actual);

    }

}
