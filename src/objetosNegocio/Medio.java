/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.Objects;

/**
 *
 * @author asus
 */
public class Medio {
    
    protected String clave;
    protected String titulo;
    protected Genero genero;
    protected int duracion;

    public Medio() {
    }

    public Medio(String clave, String titulo, Genero genero, int duracion) {
        this.clave = clave;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    
    //Métodos getter y setter

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    //Métodos equals y hash
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.clave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Medio other = (Medio) obj;
        if (!Objects.equals(this.clave, other.clave)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return clave + ", " + titulo + ", " + genero.getNombre() + ", " + duracion;
    }
    
    
    
}
