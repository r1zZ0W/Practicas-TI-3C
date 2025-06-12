package U2_TI.U2_TI_04_SistemaEmpleados.Model;

public abstract class Empleado {

    private String id;
    private String nombre;
    private double salarioBase;

    public Empleado(String id, String nombre, double salarioBase) {

        this.id = id;
        this.nombre = nombre;
        this.salarioBase = salarioBase;

    }

    public String getId() {

        return id;

    }

    public String getNombre() {

        return nombre;

    }

    public double getSalarioBase() {

        return salarioBase;

    }

    public void setId(String id) {

        this.id = id;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setSalarioBase(double salarioBase) {

        this.salarioBase = salarioBase;

    }

    public abstract double calcularSalario();

}
