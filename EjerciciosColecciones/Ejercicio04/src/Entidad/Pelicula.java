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
package Entidad;

import java.util.Comparator;

public class Pelicula {
    
    public String titulo;
    public String director;
    public Integer duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public static Comparator<Pelicula> getDuracionMayorMenor() {
        return duracionMayorMenor;
    }

    public static void setDuracionMayorMenor(Comparator<Pelicula> duracionMayorMenor) {
        Pelicula.duracionMayorMenor = duracionMayorMenor;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracion=" + duracion + '}';
    }  
    
    public static Comparator<Pelicula> duracionMayorMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> duracionMenorMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDuracion().compareTo(p2.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public static Comparator<Pelicula> ordenPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2){
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
}
