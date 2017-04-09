/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public class Conversiones {

    // Arreglos con los nombres de las columnas de las tablas
    String nombresColumnasTablasCanciones[] = {"Clave", "Titulo", "Interprete", "Autor", "Genero", "Album", "Duracion"};
    String nombresColumnasTablasPeliculas[] = {"Clave", "Titulo", "Actor1", "Actor2", "Director", "Genero", "Duracion"};
    String nombresColumnasTablasGeneros[] = {"Clave", "Nombre", "Tipo"};

    /**
     * Genera un objeto de tipo DefaultTableModel a partir de una lista de
     * canciones.
     *
     * * @param listaCanciones Lista de canciones a convertir
     * @return Objeto de tipo DefaultTableModel con los atributos de las
     * canciones.
     */
    public DefaultTableModel cancionesTableModel(Vector listaCanciones) {
        Object tabla[][];
        if (listaCanciones != null) {
            tabla = new Object[listaCanciones.size()][8];
            for (int i = 0; i < listaCanciones.size(); i++) {
                // Obten una canción de la lista de canciones
                Cancion cancion = (Cancion) listaCanciones.get(i);
                // Almacena sus atributos en la fila del arreglo
                tabla[i][0] = cancion.getClave();
                tabla[i][1] = cancion.getTitulo();
                tabla[i][2] = cancion.getInterprete();
                tabla[i][3] = cancion.getAutor();
                tabla[i][4] = cancion.getGenero().getNombre();
                tabla[i][5] = cancion.getAlbum();
                tabla[i][6] = new Integer(cancion.getDuracion());
            }
            return new DefaultTableModel(tabla, nombresColumnasTablasCanciones);
        }
        return null;
    }

    /**
     * Genera un objeto de tipo DefaultTableModel a partir de una lista de
     * peliculas.
     *
     * @param listaPeliculas Lista de peliculas a convertir
     * @return Objeto de tipo DefaultTableModel con los atributos de las
     * peliculas.
     */
    public DefaultTableModel peliculasTableModel(Vector listaPeliculas) {
        Object tabla[][];
        if (listaPeliculas != null) {
            tabla = new Object[listaPeliculas.size()][8];
            for (int i = 0; i < listaPeliculas.size(); i++) {
                // Obten una canción de la lista de canciones
                Pelicula pelicula = (Pelicula) listaPeliculas.get(i);
                // Almacena sus atributos en la fila del arreglo
                tabla[i][0] = pelicula.getClave();
                tabla[i][1] = pelicula.getTitulo();
                tabla[i][2] = pelicula.getActor1();
                tabla[i][3] = pelicula.getActor2();
                tabla[i][4] = pelicula.getDirector();
                tabla[i][5] = pelicula.getGenero().getNombre();
                tabla[i][6] = new Integer(pelicula.getDuracion());
            }
            return new DefaultTableModel(tabla, nombresColumnasTablasPeliculas);
        }
        return null;
    }

    /**
     * Genera un objeto de tipo DefaultTableModel a partir de una lista de
     * generos.
     *
     * @param listaGeneros Lista de generos a convertir
     * @return Objeto de tipo DefaultTableModel con los atributos de los
     * generos.
     */
    public DefaultTableModel generosTableModel(Vector listaGeneros) {
        Object tabla[][];
        if (listaGeneros != null) {
            tabla = new Object[listaGeneros.size()][3];
            for (int i = 0; i < listaGeneros.size(); i++) {
                // Obten un género de la lista de géneros
                Genero genero = (Genero) listaGeneros.get(i);
                // Almacena sus atributos en la fila del arreglo
                tabla[i][0] = genero.getCveGenero();
                tabla[i][1] = genero.getNombre();
                tabla[i][2] = genero.getTipoMedio();
            }
            return new DefaultTableModel(tabla, nombresColumnasTablasGeneros);
        }
        return null;
    }

    /**
     * Genera un objeto de tipo DefaultComboBoxModel a partir de una lista de
     * géneros.
     */
    public DefaultComboBoxModel<Genero> generosComboBoxModel(Vector listaGeneros) {
        DefaultComboBoxModel<Genero> defaultComboBoxModel = new DefaultComboBoxModel<>();
        if (listaGeneros != null) {
            // Para cada elemento de la Lista
            for (int i = 0; i < listaGeneros.size(); i++) {
                // Agregalo a la instancia de la clase DefaultComboBoxModel
                defaultComboBoxModel.addElement((Genero) listaGeneros.get(i));
            }
            return defaultComboBoxModel;
        }
        return null;
    }

}
