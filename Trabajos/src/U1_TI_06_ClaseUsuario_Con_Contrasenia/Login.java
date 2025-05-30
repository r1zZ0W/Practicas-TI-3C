package U1_TI_06_ClaseUsuario_Con_Contrasenia;

import javax.swing.JOptionPane;
import U1_TI_06_ClaseUsuario_Con_Contrasenia.Model.UsuarioSeguro;

public class Login {

    public static void main(String[] args) {

        UsuarioSeguro usuario = new UsuarioSeguro();

        do {

            String username = JOptionPane.showInputDialog("Introduce tu nombre de usuario:");

            usuario.setNombreUsuario(username);

        }while (usuario.getNombreUsuario() == null || usuario.getNombreUsuario().isEmpty());

        String password;

        do {

            password = JOptionPane.showInputDialog("Introduce tu contraseña:");

            usuario.setPassword(password);

        } while (usuario.getPassword() == null || usuario.getPassword().isEmpty());

        usuario.autenticacionMensaje(password);

        UsuarioSeguro usuario_test1 = new UsuarioSeguro();

        usuario_test1.setNombreUsuario("testUser_1");
        usuario_test1.setPassword("H1");
        usuario_test1.autenticar("H1");
        usuario_test1.autenticacionMensaje("H1");

        UsuarioSeguro usuario_test2 = new UsuarioSeguro();

        usuario_test2.setNombreUsuario("testUser_2");
        usuario_test2.setPassword("HOLATONOTOS2");
        usuario_test2.autenticar("HOLATONOTOS2");
        usuario_test2.autenticacionMensaje("HOLATONOTOS2");

        UsuarioSeguro usuario_test3 = new UsuarioSeguro();

        usuario_test3.setNombreUsuario("testUser_3");
        usuario_test3.setPassword("pooesalgodificil3");
        usuario_test3.autenticar("pooesalgodificil3");
        usuario_test3.autenticacionMensaje("pooesalgodificil3");


    }

}