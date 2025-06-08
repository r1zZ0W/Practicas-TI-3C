package U1_TI.U1_TI_06_ClaseUsuario_Con_Contrasenia;

import U1_TI.U1_TI_06_ClaseUsuario_Con_Contrasenia.Model.UsuarioSeguro;

import javax.swing.*;

public class Login {

    public static void main(String[] args) {

        UsuarioSeguro usuario = new UsuarioSeguro();

        String user =  JOptionPane.showInputDialog("Introduce un nombre:");
        usuario.setNombreUsuario(user);

        String pass =  JOptionPane.showInputDialog("Introduce una contraseña:");
        usuario.setPassword(pass);

        if(usuario.getPassword() != null && usuario.getNombreUsuario() != null){

            String passPrueba =  JOptionPane.showInputDialog("Introduce una contraseña de prueba:");

            usuario.autenticar(passPrueba);

        }

    }

}