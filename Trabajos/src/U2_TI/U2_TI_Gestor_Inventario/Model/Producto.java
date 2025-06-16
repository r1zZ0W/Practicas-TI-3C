package U2_TI.U2_TI_Gestor_Inventario.Model;

public class Producto{

    private String codigo;
    private String nombre;
    private int cantidad;

    public Producto(String codigo, String nombre, int cantidad){

        setCodigo(codigo);
        setNombre(nombre);
        setCantidad(cantidad);

    }

    public String getCodigo() {

        return codigo;

    }

    public String getNombre() {

        return nombre;

    }

    public int getCantidad() {

        return cantidad;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setCantidad(int cantidad) {

        if(cantidad >= 0){

            System.out.println("Se ha ingresado: " + cantidad + " "+ "productos");
            System.out.println("-------------------------------------------------");
            this.cantidad = cantidad;

        } else{

            System.out.println("No se ha ingresado ninguna cantidad");


        }

    }

    public void setCodigo(String codigo) {

        if(codigo == null || codigo.isEmpty()){

            System.out.println("No se ha ingresado nada valido");

        } else{

            System.out.println("El codigo que se ha ingresado es: " + codigo);

            this.codigo = codigo;

        }

    }

}
