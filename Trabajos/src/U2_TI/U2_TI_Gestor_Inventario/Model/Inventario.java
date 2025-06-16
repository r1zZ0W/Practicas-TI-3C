package U2_TI.U2_TI_Gestor_Inventario.Model;

public class Inventario {

    private Producto[] stock;

    public Inventario(int tamanio){

        stock = new Producto[tamanio];


    }

    public boolean agregarProducto(Producto p){

        System.out.println(" ");

        boolean flag = false;

        for(int i = 0; i < stock.length; i++){

            if(stock[i] == null) {

                stock[i] = p;

                flag = true;

                break;

            }

        }



        return flag;

    }

    public boolean eliminarProducto(String codigo){

        boolean flag = false;

        for(int i = 0; i < stock.length; i++){

            if(stock[i] != null && stock[i].getCodigo().equals(codigo)){

                stock[i] = null;

                System.out.println("El producto eliminado fue eliminado con exito y fue: " + codigo);

                flag = true;

            }

        }

        return flag;

    }

    public Producto buscarProducto(String codigo){

        System.out.println(" ");

        for (Producto producto : stock) {

            if (producto != null && producto.getCodigo().equals(codigo)) {

                System.out.println("El producto encontrado es: " + producto.getCodigo().equals(codigo));

                return producto;

            }

        }

        System.out.println("No se ha encontrado ningun producto así que es null");

        return null;

    }

    public int totalItems(){

        int sum = 0;

        for (Producto producto : stock) {

            if (producto != null) {

                sum += producto.getCantidad();

            }

        }

        System.out.print("El total de articulos/items es de: ");

        return sum;

    }

}
