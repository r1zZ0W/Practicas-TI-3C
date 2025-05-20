import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {

        String calificacionUno = JOptionPane.showInputDialog("Introduce la primera calificación:");
        String calificacionDos = JOptionPane.showInputDialog("Introduce la segunda calificación:");
        String calificacionTres = JOptionPane.showInputDialog("Introduce la tercera calificación:");

        int sumaCalificacion = Integer.parseInt(calificacionUno) + Integer.parseInt(calificacionDos) + Integer.parseInt(calificacionTres);
        int promedioCalificacion = sumaCalificacion / 3;

        System.out.println("El promedio de sus calificaciones es de: " + promedioCalificacion);

    }

}