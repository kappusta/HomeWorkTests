import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;

public class TestMathematicalOperationsMethods {
    @Test
    public void checkCircleArea() {
        int r = 2;
        int ca = (int) (Math.PI * r * r);
        System.out.println(ca);
        Assert.assertTrue(ca == 12);
    }

    @Test
    public void checkCircleLenth() {
        int r = 3;
        int cl = (int) (Math.PI * 2 * r);
        System.out.println(cl);
        Assert.assertTrue(cl == 18);
    }

    @Test
    public void checkTriangleArea() {
        //expected 24;
        Assert.assertTrue(calcTriangleArea(6,8)==24);
    }

    public int calcTriangleArea(int triangleBase, int triangleHeight) {
        return (triangleBase * triangleHeight) / 2;
    }

    @Test
    public void checkParallelepipedArea(){
        //expected 292;
        Assert.assertTrue(calcParallelepipedArea(6,7,8)==292);
    }

    public int calcParallelepipedArea(int height, int weight, int length){
        return ((height*weight)+(height*length)+(weight*length))*2;
    }

    // TODO: 29.06.2022
    @Test
    public void triangleAreaWithIncomingData() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину основи трикутника");
        double triangleBase = scan.nextDouble();
        System.out.println("Введіть висоту трикутника");
        double triangleHeight = scan.nextDouble();
        double areaOfTriangle = (triangleBase * triangleHeight) / 2;
        System.out.println("Площа трикутника дорівнює" + areaOfTriangle);
    }
}
