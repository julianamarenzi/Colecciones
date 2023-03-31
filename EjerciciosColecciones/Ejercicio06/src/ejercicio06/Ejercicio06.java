/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
package ejercicio06;

import Servicio.ServicioProducto;
import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        
        ServicioProducto sp = new ServicioProducto();
        int rta;
        
        System.out.println("Bienvenido");
        do {
            System.out.println("¿Qué desea realizar? \n" + "1. Agreagar un producto \n" + "2. Modificar un precio \n" 
                    + "3. Eliminar un producto \n" + "4. Mostrar todos los productos \n" + "5. Salir");
            rta = leer.nextInt();
            switch(rta){
                case 1:
                    sp.ingresarProducto();
                    break;
            }
        } while (rta != 5);
        
        System.out.println("Adios");
              
    }
    
}
