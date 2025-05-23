package U1_T1_02_FigurasClases;

import Model.SquareClass;
import Model.CircleClass;
import Model.IsoscelesTriangle;

public class CuadradoPractica {

    public static void main(String[] args) {

        SquareClass square = new SquareClass();

        square.setSide(10);

        double SquarePerimeter = square.getPerimeter();
        double SquareArea = square.getArea();

        System.out.println(SquarePerimeter);
        System.out.println(SquareArea);

        CircleClass circle = new CircleClass();

        circle.setRadius(2);

        double CirclePerimeter = circle.getPerimeter();
        double CircleArea = circle.getArea();

        System.out.println(CirclePerimeter);
        System.out.println(CircleArea);

        IsoscelesTriangle triangle = new IsoscelesTriangle();

        triangle.setSide(1);
        triangle.setBase(2);
        triangle.setHeight(3);

        double IsoscelesTrianglePerimeter = triangle.getPerimeter();
        double IsoscelesTriangleArea = triangle.getArea();
        double IsoscelesTriangleBase = triangle.getBase();

        System.out.println(IsoscelesTrianglePerimeter);
        System.out.println(IsoscelesTriangleArea);
        System.out.println(IsoscelesTriangleBase);

    }

}