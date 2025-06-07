package Gestor_Inventario;

import Gestor_Inventario.Model.*;

public class GestorInventarioBasico {

        public static void main(String[] args) {

                Inventario inventario = new Inventario(3);

                Producto product_1 = new Producto("001","Jabon",2);
                Producto product_2 = new Producto("002","Balon",3);
                Producto product_3 = new Producto("003","Sushi",4);
                Producto product_4 = new Producto("004","",1);

                System.out.println("Se agrego el producto 1: " + inventario.agregarProducto(product_1));
                System.out.println(inventario.totalItems());

                System.out.println("Se agrego el producto 2: " + inventario.agregarProducto(product_2));
                System.out.println(inventario.totalItems());

                System.out.println("Se agrego el producto 3: " + inventario.agregarProducto(product_3));
                System.out.println(inventario.totalItems());

                System.out.println("Se agrego el producto 4: " + inventario.agregarProducto(product_4));
                System.out.println(inventario.totalItems());

                Producto encontrado = inventario.buscarProducto("001");
                System.out.println("El producto: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));

                encontrado = inventario.buscarProducto("004");
                System.out.println("El producto: " + (encontrado != null ? encontrado.getNombre() : "No encontrado"));

                boolean eliminar = inventario.eliminarProducto("001");

                Producto waos = new Producto("001","Waos",1);

                boolean agregar = inventario.agregarProducto(waos);

                System.out.println(inventario.totalItems());

        }

}