package U1_TI.U1_TI_05_CuentaBancaria;

import U1_TI.U1_TI_05_CuentaBancaria.Model.CuentaBancaria;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria  cuentaBancaria = new CuentaBancaria();

        cuentaBancaria.setTitular("Jorge Monjaraz");

        System.out.println("El titular es: " + cuentaBancaria.getTitular());

        System.out.println("Saldo actual: $" + cuentaBancaria.getSaldo());

        cuentaBancaria.depositar(1000);

        boolean retiroExitoso_1 = cuentaBancaria.retirar(200);

        cuentaBancaria.mensajeRetiro(retiroExitoso_1, 200);

        boolean retiroExitoso_2 = cuentaBancaria.retirar(10000);

        cuentaBancaria.mensajeRetiro(retiroExitoso_2, 10000);

    }

}