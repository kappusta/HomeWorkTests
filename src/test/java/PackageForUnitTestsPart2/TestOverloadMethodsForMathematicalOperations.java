package PackageForUnitTestsPart2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOverloadMethodsForMathematicalOperations {

    public int returnResult(int a, int b){
        return a*b;
    }

    public int returnResult(int c, int d, int e){
        return (c/d)*e;
    }

    public double returnResult(double f){
        return Math.sqrt(f);
    }

    @Test
    public void checkMultResult () {
        System.out.println(returnResult(11, 12));
        Assert.assertTrue(returnResult(11,12) == 132);
    }

    @Test
    public void checkDivMultResult(){
        System.out.println(returnResult(18,6, 9));
        Assert.assertTrue(returnResult(18, 6, 9) == 27);
    }

    @Test
    public void checkSqrtResult(){
        System.out.println(returnResult(144));
        Assert.assertTrue(returnResult(144) == 12);
    }
}
