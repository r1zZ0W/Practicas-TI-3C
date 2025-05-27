package U1_TI_05_CuentaBancaria.Model;

public class CuentaBancaria {

    private String titular;
    private double saldo = 0;

    public String getTitular() {

        return titular;

    }

    public double getSaldo() {

        System.out.println("El saldo actual es de: $" + saldo);

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

            System.out.println("El retiro fue de: $" + monto);

            System.out.println(true);

            return true;

        }
        else {

            System.out.println("El monto no puede ser menor o igual que 0");

            System.out.println(false);

            return false;

        }

    }

}
