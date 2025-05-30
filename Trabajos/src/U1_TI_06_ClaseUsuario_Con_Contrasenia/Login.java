package U1_TI_06_ClaseUsuario_Con_Contrasenia;

import javax.swing.JOptionPane;
import U1_TI_06_ClaseUsuario_Con_Contrasenia.Model.UsuarioSeguro;

public class Login {

    public static void main(String[] args) {

        UsuarioSeguro usuario = new UsuarioSeguro();

        String username = JOptionPane.showInputDialog("Introduce tu nombre de usuario:");
        usuario.setNombreUsuario(username);

        String password = JOptionPane.showInputDialog("Introduce tu contraseña:");
        usuario.setPassword(password);

        usuario.autenticar(password);

        usuario.autenticacionMensaje(password);

    }

}