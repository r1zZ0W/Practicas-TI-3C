package U2_TI.U2_TI_04_SistemaEmpleados;

import U2_TI.U2_TI_04_SistemaEmpleados.Model.*;

public class SistemaEmpleados {

    public static void main(String[] args) {

        Empleado EmpleadoTiempoCompleto = new EmpleadoTiempoCompleto("001","Juan Carlos", 300,"Seguros Medicos");

        System.out.println("El id del empleado es: " + EmpleadoTiempoCompleto.getId());
        System.out.println("El nombre del empleado es: " + EmpleadoTiempoCompleto.getNombre());
        System.out.println("El salario total es de: $" + EmpleadoTiempoCompleto.calcularSalario());
        System.out.println("Los beneficios del empleado son: " + ((EmpleadoTiempoCompleto) EmpleadoTiempoCompleto).getBeneficios());

        Empleado EmpleadoPorHoras = new EmpleadoPorHoras("002","Anotnio Acevedo", 37.5,8);

        System.out.println("El id del empleado es: " + EmpleadoPorHoras.getId());
        System.out.println("El nombre del empleado es: " + EmpleadoPorHoras.getNombre());
        System.out.println("El salario base es de: " + EmpleadoPorHoras.getSalarioBase());
        System.out.println("Las horas trabajadas del empleado son: " + ((EmpleadoPorHoras) EmpleadoPorHoras).getHorasTrabajadas());
        System.out.println("El salario total es de: $" + EmpleadoPorHoras.calcularSalario());


    }

}