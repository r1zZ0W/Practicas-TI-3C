package U1_TI.U1_TI_02_FigurasClases.Model;
public class SquareClass {

    private double side;
    private String message = "Square Class";

    public double getPerimeter() {

        return side * 4;

    }

    public void setSide(double side) {

        this.side = side;

    }

    public double getArea(){

        if(!this.message.isEmpty()){

            getSecretMessage();

        }

        System.out.println(this.message);

        return side * side;

    }

    private void getSecretMessage(){

        System.out.println("Este método solo es accesible dentro de la clase, pero no desde afuera.");

    }

}
