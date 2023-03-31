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
package ejercicio03;

import Entidad.Alumno;
import Servicio.ServicioAlumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList();
        ServicioAlumno sa = new ServicioAlumno();
        
        sa.crearAlumno(alumnos);
        
        System.out.println("Ingrese el nombre de un alumno para calcular"
                + " su nota final");
        String nombre = leer.next().toLowerCase();
        
        Iterator<Alumno> it = alumnos.iterator();
        int indice = 0;
        
        while (it.hasNext()){
            if (it.next().getNombre().equals(nombre)) {
                double notaFinal = sa.notaFinal(alumnos.get(indice).getNotas());
                System.out.println("Nota Final: " + notaFinal);
            } else {
                indice++;
            }
        }
        
    }
    
}
