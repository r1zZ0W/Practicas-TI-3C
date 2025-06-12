package U2_TI.U2_TI_04_SistemaEmpleados.Model;

public class EmpleadoTiempoCompleto extends Empleado {

    private String beneficios;

    public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, String beneficios){

        super(id, nombre, salarioBase);
        this.beneficios = beneficios;

    }

    public String getBeneficios() {

        return beneficios;

    }

    public void setBeneficios(String beneficios) {

        this.beneficios = beneficios;

    }

    @Override
    public double calcularSalario() {

        return getSalarioBase();

    }

}
