package U1_TI_06_ClaseUsuario_Con_Contrasenia.Model;

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public String getNombreUsuario() {

        return nombreUsuario;

    }

    public String getPassword() {

        return password;

    }

    public void setNombreUsuario(String nombreUsuario) {

        if (nombreUsuario == null || nombreUsuario.isEmpty()) {

            System.out.println("El nombre de usuario no puede ser nulo o vacío.");

            return;

        }

        this.nombreUsuario = nombreUsuario;

    }

    public void setPassword(String password) {

        boolean flag = true;

        if (password.length() < 8) {

            System.out.println("La contraseña de be tener al menos 8 caracteres.");

            flag = false;

        }

        if (!password.matches(".*[A-Z].*")) {

            System.out.println("La contraseña debe contener al menos una letra mayúscula.");

            flag = false;

        }

        if (!password.matches(".*[a-z].*")) {

            System.out.println("La contraseña debe contener al menos una letra minúscula.");

            flag = false;

        }

        if (!password.matches(".*[0-9].*")) {

            System.out.println("La contraseña debe contener al menos un número.");

            flag = false;

        }

        if (flag) {

            this.password = password;

        }



    }

    public boolean autenticar(String intentPassword) {

        if(!intentPassword.equals(password)) {

            System.out.println("Contraseña incorrecta.");

            return false;

        } else {

            System.out.println("Autenticación exitosa. Bienvenido " + nombreUsuario + "!");

            return true;

        }

    }

}
