import U2_TI_01_FigurasAbstractas_Triangulo.Model.*;

public class App {
    public static void main(String[] args) throws Exception {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs equilateralTriangle = new EquilateralTriangle(10, 10, 10);
        FigureAbs rightTriangle = new RightTriangle(10, 10, 10);

        FigureAbs[] figures = { sq, cir, triangle, equilateralTriangle, rightTriangle };

        for (FigureAbs figureAbs : figures) {

            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");

        }

    }
}
