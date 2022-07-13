package PackageForUnitTestsPart1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOverloadedMethodsForCalculateGeometricFiguresArea {

    public int checkArea (int a, int h){
        return (a*h)/2;
    }

    public int checkArea (int a, int b, int h){
        return ((a+b)/2)*h;
    }

    public int checkArea (int r){
        return (int) (Math.PI*r*r);
    }

    @Test
    public void checkTriangleArea (){
        Assert.assertTrue(checkArea(5, 8) == 20);
    }

    @Test
    public void checkTrapeziumArea (){
        Assert.assertTrue(checkArea(6, 8, 6) == 42);
    }

    @Test
    public void checkCircleArea (){
        System.out.println(checkArea(7));
        Assert.assertTrue(checkArea(7) == 153);
    }
}
