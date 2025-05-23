package Model;

public class CircleClass {

    private double radius;

    public double getPerimeter() {

        return 2 * 3.1416 * radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getArea(){

        return 3.1416 * radius * radius;

    }

}
