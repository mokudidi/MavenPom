import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void testBasicFibonacciSeq() {
        Assert.assertEquals(fibonacci.getFibonacciSequence(0), 0L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(1), 1L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(2), 1L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(3), 2L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(4), 3L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(5), 5L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(6), 8L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(7), 13L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(8), 21L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(9), 34L);
        Assert.assertEquals(fibonacci.getFibonacciSequence(10), 55L);
    }

    @Test
    public void testEdgeCaseFibonacciSeq() {
        Assert.assertEquals(fibonacci.getFibonacciSequence(-2), 0L);
    }

    @Test
    public void testQuizFibonacciSeq() {
        Assert.assertEquals(fibonacci.getFibonacciSequence(8181), 3877337276612781506L);
    }
}
