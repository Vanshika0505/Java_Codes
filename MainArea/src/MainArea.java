import java.util.*;
abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}
 
class Area extends Shape {
    @Override
    void rectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
 
    @Override
    void squareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }
 
    @Override
    void circleArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
public class MainArea {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        Area areaObj = new Area();
 
        System.out.println("Calculate Area of rectangle:");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        areaObj.rectangleArea(length, breadth);
 
        System.out.println("Calculate Area of square:");
        double side = sc.nextDouble();
        areaObj.squareArea(side);
 
        System.out.println("Calculate area of circle:");
        double radius = sc.nextDouble();
        areaObj.circleArea(radius);
    }
}
