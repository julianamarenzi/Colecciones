/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
*/
package Servicio;

import Entidad.Pelicula;
import java.util.List;
import java.util.Scanner;

public class ServicioPelicula {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearPelicula(List<Pelicula> peliculas){
        
        String rta;
        
        do {
            Pelicula p = new Pelicula();
            //Permite ingresar solo una palabra
            System.out.print("Nombre de la Película: ");
            p.setTitulo(leer.next());
            System.out.print("Director: ");
            p.setDirector(leer.next());
            System.out.print("Duración (horas): ");
            p.setDuracion(leer.nextInt());
            System.out.println("¿Desea ingresar otra película?");
            rta = leer.next();
            peliculas.add(p);
        } while (rta.equals("S"));
        
    }
    
    public void mostrarPeliculas(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Lista de Películas---");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
    public void masUnaHora(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Películas con una duración mayor a 1 hora---");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
        
    }
    
    public void duracionMayorMenor(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Películas ordenadas de mayor a menor---");
        peliculas.sort(Pelicula.duracionMayorMenor);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
    public void duracionMenorMayor(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Películas ordenadas de menor a mayor---");
        peliculas.sort(Pelicula.duracionMenorMayor);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
    public void ordenPorTitulo(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Películas ordenadas alfabéticamente por título---");
        peliculas.sort(Pelicula.ordenPorTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
    public void ordenPorDirector(List<Pelicula> peliculas){
        
        System.out.println("");
        System.out.println("---Películas ordenadas alfabéticamente por director---");
        peliculas.sort(Pelicula.ordenPorDirector);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula);
        }
        
    }
    
}
