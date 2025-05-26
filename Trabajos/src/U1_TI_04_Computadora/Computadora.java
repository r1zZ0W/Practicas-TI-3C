package U1_TI_04_Computadora;

import U1_TI_04_Computadora.Model.ComputerClass;

public class Computadora {

    public static void main(String[] args) {

        ComputerClass computer = new ComputerClass();

        computer.setModel("Acer Nitro V5");

        computer.powerOn();
        computer.powerOn();

        computer.powerOff();

    }

}