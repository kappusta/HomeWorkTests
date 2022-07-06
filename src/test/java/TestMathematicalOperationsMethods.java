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
        Assert.assertTrue(calcTriangleArea(6, 8) == 24);
    }

    public int calcTriangleArea(int triangleBase, int triangleHeight) {
        return (triangleBase * triangleHeight) / 2;
    }

    @Test
    public void checkParallelepipedArea() {
        //expected 292;
        Assert.assertTrue(calcParallelepipedArea(6, 7, 8) == 292);
    }

    public int calcParallelepipedArea(int height, int weight, int length) {
        return ((height * weight) + (height * length) + (weight * length)) * 2;
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

    @Test
    public void checkAdditionAndSubtraction() {
        Assert.assertTrue(addOperation(6, 8) == 14);
        Assert.assertTrue(subtractOperation(8,2) == 6);
    }
    public int addOperation(int a, int b){
        return a + b;
    }

    public int subtractOperation(int a, int b){
        return a - b;
    }

    @Test
    public void checkMultiplicationAndDivision(){
        Assert.assertTrue(multOperation(12, 12) == 144);
        Assert.assertTrue(divOperation(12, 12) == 1);
    }

    public int multOperation(int a, int b){
        return a * b;
    }

    public int divOperation(int a, int b){
        return a / b;
    }

    @Test
    public void checkPythagoreanTheorem(){
        Assert.assertTrue(Math.sqrt(pythagoreanTheorem(7, 3)) == 7.615773105863909);
    }
    public double pythagoreanTheorem(double a, double b){
        return ((a * a) + (b * b));
    }

    @Test
    public void checkCylinderSideSurfaceArea(){
        System.out.println(cylinderSideSurfaceArea(4, 8));
        Assert.assertTrue(cylinderSideSurfaceArea(4, 8) == 201.06192982974676);
    }

    public double cylinderSideSurfaceArea(double radius, double height){
        return (double) (Math.PI*radius*height)*2;
    }

    @Test
    public void checkCylinderVolume(){
        System.out.println(cylindeVolume(3, 5));
        Assert.assertTrue(cylindeVolume(3, 5) == 141.3716694115407);
    }
    public double cylindeVolume(double rad, double he){
        return (double) (Math.PI*rad*rad*he);
    }

    @Test
    public void checkTrapezoidVolume(){
        System.out.println(trapezoidVolume(4, 4,6));
        Assert.assertTrue(trapezoidVolume(4, 4,6) == 24);
    }
    public int trapezoidVolume(int base1, int base2, int height){
        return ((base1 + base2)/2)*height;
    }

}
