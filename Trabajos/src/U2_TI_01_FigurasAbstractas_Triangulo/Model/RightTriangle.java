package U2_TI_01_FigurasAbstractas_Triangulo.Model;

public class RightTriangle extends FigureAbs{

    private double base;
    private double height;
    private double hypothenuse;

    public RightTriangle(double base, double height, double hypothenuse) {

        this.base = base;
        this.height = height;
        this.hypothenuse = hypothenuse;

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

    public double getHypothenuse() {

        return hypothenuse;

    }

    public void setHypothenuse(double hypothenuse) {

        this.hypothenuse = hypothenuse;

    }


    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {

        return base + height + hypothenuse;

    }

}
