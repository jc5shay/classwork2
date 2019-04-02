package calculator;

public class Circle {
   private double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius(double v) {
        return radius;
    }
    public double calculateArea(double diameter){
        double area = radius * diameter;
        return area;

    }
}
