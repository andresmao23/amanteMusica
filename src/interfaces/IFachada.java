package interfaces;

import excepciones.FachadaException;
import java.util.Vector;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public interface IFachada {
    
    public Cancion obten(Cancion cancion) throws FachadaException;
    
    public void agrega(Cancion cancion) throws FachadaException;
    
    public void actualiza(Cancion cancion) throws FachadaException;
    
    public void elimina(Cancion cancion) throws FachadaException;
    
    public Pelicula obten(Pelicula pelicula) throws FachadaException;
    
    public void agrega(Pelicula pelicula) throws FachadaException;
    
    public void actualiza(Pelicula pelicula) throws FachadaException;
    
    public void elimina(Pelicula pelicula) throws FachadaException;
    
    public Genero obten(Genero genero) throws FachadaException;
    
    public void agrega(Genero genero) throws FachadaException;
    
    public void actualiza(Genero genero) throws FachadaException;
    
    public void elimina(Genero genero) throws FachadaException;
    
    public Vector consultaCanciones() throws FachadaException;
    
    public Vector consultaCancionesTitulo(String titulo) throws FachadaException;
    
    public Vector consultaCancionesInterprete(String interprete) throws FachadaException;
    
    public Vector consultaCancionesAutor(String autor) throws FachadaException;
    
    public Vector consultaCancionesGenero(String cveGenero) throws FachadaException;
    
    public Vector consultaCancionesAlbum(String album) throws FachadaException;
    
    public Vector consultaPeliculas() throws FachadaException;
    
    public Vector consultaPeliculasTitulo(String titulo) throws FachadaException;
    
    public Vector consultaPeliculasActor(String actor) throws FachadaException;
    
    public Vector consultaPeliculasDirector(String director) throws FachadaException;
    
    public Vector consultaPeliculasGenero(String cveGenero) throws FachadaException;
    
    public Vector consultaGeneros() throws FachadaException;
    
    public Vector consultaGenerosCanciones() throws FachadaException;
    
    public Vector consultaGenerosPeliculas() throws FachadaException;
    
}
