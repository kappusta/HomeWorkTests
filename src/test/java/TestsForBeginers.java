import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsForBeginers {
    @Test
    public void text() {
        System.out.println("Go");
    }

    @Test
    public void checkFactorial() {
        Assert.assertTrue(factorial(4) == 24);
        Assert.assertTrue(factorial(6) == 720);
        Assert.assertTrue(factorial(1) == 1);
        Assert.assertTrue(factorial(0) == 1);
        Assert.assertFalse(factorial(0) == 2);
    }

    public int factorial(int n) {
        int one = 1;
        if (n == 1 || n == 0) {
            return one;
        }

        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }

        for (int arrElem : arr) {
            one = one * arrElem;
        }
        return one;
    }

    @Test
    public void checkFactorialByOtherWay() {
        Assert.assertTrue(factorialSecond(8) == 40320);
    }

    public int factorialSecond(int b) {
        int unit = 1;
        if (b == 0 || b == 1) {
            return unit;
        }

        int facto = b * factorialSecond(b - 1);
        return facto;
    }
}
