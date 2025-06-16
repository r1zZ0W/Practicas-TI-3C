package U2_TI.U2_TI_Sistema_Garage;

import U2_TI.U2_TI_Sistema_Garage.Model.*;

public class Main{

    public static void main(String[] args) {

        Garage grg = new Garage(4);

        Vehiculo GT = new Coche("RBK001-G","Nissan", 4);
        Vehiculo Civic = new Coche("GTK002-H","Honda", 4);
        Vehiculo MS20 = new Coche("PSV003-R","Maserati", 2);

        Vehiculo R6 = new Motocicleta("ZPL004-F","Yamaha",false);
        Vehiculo V4 = new Motocicleta("JMS005-P","Ducati",false);

        //Vehículos estacionados, teóricamente la moto Ducati no se debe estacionar xd
        System.out.println("------------------------------------------");
        System.out.println("¿Se ha estacionado el vehiculo coon placas " +GT.getPlaca() + "? "  + grg.estacionar(GT));
        System.out.println("¿Se ha estacionado el vehiculo coon placas " +Civic.getPlaca() + "? "  + grg.estacionar(Civic));
        System.out.println("¿Se ha estacionado el vehiculo coon placas " +MS20.getPlaca() + "? "  + grg.estacionar(MS20));
        System.out.println("¿Se ha estacionado el vehiculo coon placas " +R6.getPlaca() + "? "  + grg.estacionar(R6));
        System.out.println("¿Se ha estacionado el vehiculo coon placas " +V4.getPlaca() + "? "  + grg.estacionar(V4));

        //Conteo de prueba
        System.out.println("------------------------------------------");
        System.out.println("Hay actualmente " + grg.contarVehiculos() + " vehículos en el garage");

        //Vamo a retirar un vehículo, la MS20
        System.out.println("------------------------------------------");
        System.out.println("Se va a retirar el vehiculo con placas " + MS20.getPlaca() + " " + grg.retirar("PSV003-R"));

        //Se realiza otro conteo ya con la MS20 retirada
        System.out.println("------------------------------------------");
        System.out.println("Hay actualmente " + grg.contarVehiculos() + " vehículos en el garage");

    }

}