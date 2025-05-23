package U1_TI_01_CuadroDialogoSwing;

import javax.swing.JOptionPane;
public class CuadroDialogo {

    public static void main(String[] args) {

        String calificacionUno = JOptionPane.showInputDialog("Introduce la primera calificación:");
        String calificacionDos = JOptionPane.showInputDialog("Introduce la segunda calificación:");
        String calificacionTres = JOptionPane.showInputDialog("Introduce la tercera calificación:");

        int sumaCalificacion = Integer.parseInt(calificacionUno) + Integer.parseInt(calificacionDos) + Integer.parseInt(calificacionTres);
        float promedioCalificacion = sumaCalificacion / 3f;

        System.out.println("El promedio de sus calificaciones es de: " + promedioCalificacion);

    }

}