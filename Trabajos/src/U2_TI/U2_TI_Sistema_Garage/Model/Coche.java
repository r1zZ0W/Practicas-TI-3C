package U2_TI.U2_TI_Sistema_Garage.Model;

public class Coche extends Vehiculo {

    private int numPuertas;

    public Coche(String placa, String marca, int numPuertas){

        super(placa, marca);
        this.numPuertas = numPuertas;

    }

    public int getNumPuertas() {

        return numPuertas;

    }

    public void setNumPuertas(int numPuertas) {

        this.numPuertas = numPuertas;

    }

}
