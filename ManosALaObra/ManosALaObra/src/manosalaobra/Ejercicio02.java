/*
Toma la Lista, el Conjunto y el Mapa del ejemplo y agrega 5 objetos a cada uno.
*/
package manosalaobra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Ejercicio02 {

    public static void main(String[] args) {

        ArrayList<Integer> edades = new ArrayList();
        TreeSet<String> nombres = new TreeSet();
        HashMap<String, Integer> personas = new HashMap();
        
        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        edades.add(num1);
        edades.add(num2);
        edades.add(num3);
        edades.add(num4);
        edades.add(num5);
        
        String nom1 = "Pedro", nom2 = "Clara", nom3 = "Ruperta", nom4 = "Jorge", nom5 = "Chenque";
        nombres.add(nom1);
        nombres.add(nom2);
        nombres.add(nom3);
        nombres.add(nom4);
        nombres.add(nom5);
        
        personas.put(nom1, num1);
        personas.put(nom2, num2);
        personas.put(nom3, num3);
        personas.put(nom4, num4);
        personas.put(nom5, num5);
        
    }
    
}
