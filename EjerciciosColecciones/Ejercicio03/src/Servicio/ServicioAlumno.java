/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
*/
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServicioAlumno {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearAlumno(List<Alumno> lista){

        String rta;
        
        do {
            
            System.out.println("Ingrese el nombre del alumno");
            String alumno = leer.next();
            
            System.out.println("Ingrese las 3 notas del alumno " + alumno);
            List<Integer> notas = new ArrayList();
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            notas.add(leer.nextInt());
            
            System.out.println("¿Desea seguir agregando alumnos? S/N");
            rta = leer.next().toUpperCase();
            
            Alumno a = new Alumno(alumno, notas);
            lista.add(a);
            
        } while (!rta.equals("N"));
        
    }
    
    public double notaFinal(List<Integer> notas){
        
        double notaFinal = 0;     
        
        for (Integer nota : notas) {
            notaFinal += nota;
        }     
        
        notaFinal /= 3;       
        return notaFinal;
                
    }
    
}
