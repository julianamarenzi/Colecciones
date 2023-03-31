/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
*/
package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio01 {

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
        
    }
    
}
