/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/
package Servicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServicioPais {
    
    Scanner leer = new Scanner(System.in);
    
    public void ingresoPais(HashSet<String> paises){
        
        String rta;
        do {
            System.out.println("Ingrese un país");
            String pais = leer.next();
            paises.add(pais);
            System.out.println("¿Desea ingresar otro país? S/N");
            rta = leer.next().toUpperCase();
        } while (rta.equals("S"));
        
        System.out.println("");
        System.out.println("---Paises ingresados---");
        for (String paise : paises) {
            System.out.println(paise);
        }
          
    }
    
    public void paisesOrdenados(HashSet<String> paises){
        
        List<String> paisesLista = new ArrayList(paises);
        Collections.sort(paisesLista);
        System.out.println("");
        System.out.println("---Paises ordenados alfabeticamente---");
        for (String pais : paisesLista) {
            System.out.println(pais);
        }
              
    }
    
    public void eliminarPais(HashSet<String> paises){
        
        System.out.println("Ingrese el país que desea eliminar");
        String pais = leer.next();
        Iterator<String> it = paises.iterator();
        while(it.hasNext()){
            if (it.next().equals(pais)) {
                it.remove();
            }
        }
        System.out.println("");
        System.out.println("---Lista de paises---");
        for (String paiss : paises) {
            System.out.println(paiss);
        }
        
    }
    
}
