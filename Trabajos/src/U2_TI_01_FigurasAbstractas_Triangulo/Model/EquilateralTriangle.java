package U2_TI_01_FigurasAbstractas_Triangulo.Model;

public class EquilateralTriangle extends FigureAbs {

    private double base;
    private double height;
    private double side;

    public EquilateralTriangle(double base, double height, double side) {

        this.base = base;
        this.height = height;
        this.side = side;

    }

    public EquilateralTriangle(double base) {

        this.base = base;

    }

    public double getBase() {

        return base;

    }

    public void setBase(double base) {

        this.base = base;

    }

    public double getHeight() {

        return height;

    }

    public void setHeight(double height) {

        this.height = height;

    }

    public double getSide() {

        return side;

    }

    public void setSide(double side) {

        this.side = side;

    }

    @Override
    public double getArea() {

        return (Math.sqrt(3) / 4) * Math.pow(side, 2);

    }

    @Override
    public double getPerimeter() {

        return 3*side;

    }

}
