package U1_T1_02_FigurasClases.Model;

public class IsoscelesTriangle {

    private double base;
    private double height;
    private double side;

    public double getPerimeter() {

        return 2*side*base;

    }

    public double getBase() {

        return base;

    }

    public double getArea(){

        return (base*height)/2;

    }

    public void setSide(double side) {

        this.side = side;

    }

    public void setBase(double base) {

        this.base = base;

    }

    public void setHeight(double height) {

        this.height = height;

    }

}
