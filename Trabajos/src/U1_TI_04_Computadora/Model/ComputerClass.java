package U1_TI_04_Computadora.Model;

public class ComputerClass {

    private String brand;
    private String model;
    private boolean powered = false;

    public String getBrand() {

        return brand;

    }

    public String getModel() {

        return model;

    }

    public boolean isPowered() {

        return powered;

    }

    public void setModel(String model) {

        this.brand = model;

    }

    public void powerOn(){

        if(!isPowered()){

            powered = true;

            System.out.println("Encendiendo :D");

        }

    }

    public void powerOff(){

        if(isPowered()){

            powered = false;

        }

        System.out.println("Apagando :D");

    }

}
