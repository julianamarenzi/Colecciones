/*
Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
package ejercicio02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<String> razas = new ArrayList();
        String rta;
        do {
            System.out.print("Ingrese una raza de perro: ");
            String raza = leer.next();
            razas.add(raza);
            System.out.println("¿Desea seguir agregando razas? S/N");
            rta = leer.next().toUpperCase();
        } while (rta.equals("S"));
        for (String raza : razas) {
            System.out.println(raza);
        }
        Iterator<String> it = razas.iterator();
        System.out.print("Ingrese una raza: ");
        String razaEliminar = leer.next();
        while(it.hasNext()){
            if (it.next().equals(razaEliminar)) {
                it.remove();
            }
        }
        
        for (String raza : razas) {
            System.out.println(raza);
        }
        
    }
    
}
