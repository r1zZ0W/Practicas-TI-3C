package U1_TI.U1_TI_05_CuentaBancaria.Model;

public class CuentaBancaria {

    private String titular;
    private double saldo = 0;

    public String getTitular() {

        return titular;

    }

    public double getSaldo() {

        return saldo;

    }

    public void setTitular(String titular) {

        this.titular = titular;

    }

    public void depositar(double monto){

        if(monto > 0){

            saldo += monto;

            System.out.println("El deposito fue de: $" + monto);

        }
        else {

            System.out.println("El monto no puede ser menor o igual que 0");

        }

    }

    public boolean retirar(double monto){

        if(monto > 0 && saldo >= monto){

            saldo -= monto;

            return true;

        }
        else {

            return false;

        }

    }

    public void mensajeRetiro(boolean retiroExitoso, double montoIntentado) {

        if (retiroExitoso) {

            System.out.println("Retiro exitoso, monto retirado: $" + montoIntentado);
            System.out.println("El saldo actual es de: $" + saldo);

        }
        else {

            System.out.println("Retiro fallido, saldo insuficiente o monto no válido");
            System.out.println("El saldo actual es de: $" + saldo);

        }

    }

}
