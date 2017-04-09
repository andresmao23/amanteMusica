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
public class Genero {
    
    private String cveGenero;
    private String nombre;
    private char tipoMedio;

    public Genero() {
    }

    public Genero(String cveGenero) {
        this(cveGenero, null, ' ');
    }

    public Genero(String cveGenero, String nombre, char tipoMedio) {
        this.cveGenero = cveGenero;
        this.nombre = nombre;
        this.tipoMedio = tipoMedio;
    }
    
    public String toString(){
        return cveGenero + ", " + nombre + ", " + tipoMedio;
    }
    
    
   //Métodos getter y setter

    public String getCveGenero() {
        return cveGenero;
    }

    public void setCveGenero(String cveGenero) {
        this.cveGenero = cveGenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getTipoMedio() {
        return tipoMedio;
    }

    public void setTipoMedio(char tipoMedio) {
        this.tipoMedio = tipoMedio;
    }

    //Métodos equals y hash para cveGenero

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.cveGenero);
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
        final Genero other = (Genero) obj;
        if (!Objects.equals(this.cveGenero, other.cveGenero)) {
            return false;
        }
        return true;
    }    
    
}
