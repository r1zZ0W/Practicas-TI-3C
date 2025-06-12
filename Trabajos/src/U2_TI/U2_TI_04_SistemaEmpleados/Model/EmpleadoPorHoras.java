package U2_TI.U2_TI_04_SistemaEmpleados.Model;

public class EmpleadoPorHoras extends Empleado{

    private int horasTrabajadas;

    public EmpleadoPorHoras(String id, String nombre, double salarioBase, int horasTrabajadas) {

        super(id, nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;

    }

    public int getHorasTrabajadas() {

        return horasTrabajadas;

    }

    public void setHorasTrabajadas(int horasTrabajadas) {

        this.horasTrabajadas = horasTrabajadas;

    }

    @Override
    public double calcularSalario() {

        return getSalarioBase() * horasTrabajadas;

    }

}
