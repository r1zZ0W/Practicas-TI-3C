package U2_TI.U2_TI_Sistema_Garage.Model;

public class Garage {

    private Vehiculo[] espacios;

    public Garage(int numEspacios){

        espacios = new Vehiculo[numEspacios];

    }

    public Vehiculo[] getEspacios() {

        return espacios;

    }

    public void setEspacios(Vehiculo[] espacios) {

        this.espacios = espacios;

    }

    public boolean estacionar(Vehiculo v){

        boolean flag = false;

        for(int i = 0; i < espacios.length; i++){

            if(espacios[i] == null){

                espacios[i] = v;

                return flag = true;

            }

        }

        return flag;

    }

    public boolean retirar(String placa){

        boolean flag = false;

        for(int i = 0; i < espacios.length; i++){

            if(espacios[i].getPlaca().equals(placa)){

                espacios[i] = null;

                flag = true;

            }

        }

        return flag;

    }

    public int contarVehiculos(){

        int contador = 0;

        for(int i = 0; i < espacios.length; i++){

            if(espacios[i] != null){

                contador ++;

            }

        }

        return contador;

    }

}
