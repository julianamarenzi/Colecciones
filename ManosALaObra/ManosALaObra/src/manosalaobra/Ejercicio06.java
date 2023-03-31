/*
Crea una lista de Libros y muestra el título de cada uno con un bucle.
*/
package manosalaobra;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio06 {
    
    public static void main(String[] args) {
        
        List<String> libros = new ArrayList();       
        libros.add("Harry Potter");
        libros.add("Las crónicas de Narnia");
        libros.add("El Principito");
        libros.add("Don quijote de la Mancha");
        for (String libro : libros) {
            System.out.println(libro);
        }
        
    }
    
}
