package U1_TI_05_CuentaBancaria;

import U1_TI_05_CuentaBancaria.Model.CuentaBancaria;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria  cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.setTitular("Jorge Monjaraz");
        System.out.println("El titular es: " + cuentaBancaria.getTitular());

        cuentaBancaria.depositar(1000);
        cuentaBancaria.getSaldo();

        cuentaBancaria.retirar(200);
        cuentaBancaria.getSaldo();

        cuentaBancaria.retirar(10000);
        cuentaBancaria.getSaldo();

    }

}