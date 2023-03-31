/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package Servicio;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

public class ServicioProducto {
    
    Scanner leer = new Scanner(System.in);
    
    public void ingresarProducto(){
        
        Producto p = new Producto();
        HashMap<String, Integer> productos = new HashMap();

        System.out.print("Producto: ");
        String producto = leer.next();
        System.out.print("Precio: $");
        int precio = leer.nextInt();
        productos.put(producto, precio);
        
    }
    
    public void modificarPrecio(Producto p){
        
         
        
    }
    
}
