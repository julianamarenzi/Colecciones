/*
HashMap<Integer> personas = new HashMap<>;
String n1 = “Albus”;
String n2 = “Severus”;
personas.add(n1);
personas.add(n2);
*/
package manosalaobra;

import java.util.HashMap;

public class Ejercicio04 {
    
    public static void main(String[] args) {
        
        HashMap<Integer, String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        personas.put(1, n1);
        personas.put(2, n2);
        
    }
    
}
