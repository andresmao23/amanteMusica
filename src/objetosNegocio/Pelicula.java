/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

/**
 *
 * @author asus
 */
public class Pelicula extends Medio{
    
    private String actor1;
    private String actor2;
    private String director;

    public Pelicula() {
        super();
    }

    public Pelicula(String actor1, String actor2, String director, String clave, String titulo, Genero genero, int duracion) {
        super(clave, titulo, genero, duracion);
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.director = director;
    }
    
    public Pelicula(String clave){
        this(null, null, null, clave, null, null, 0);
    }
    
    //Métodos getter y setter

    public String getActor1() {
        return actor1;
    }

    public void setActor1(String actor1) {
        this.actor1 = actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public void setActor2(String actor2) {
        this.actor2 = actor2;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    

    @Override
    public String toString() {
        return super.toString() + ", " + actor1 + ", " + actor2 + ", " + director; 
    }
    
    
}
