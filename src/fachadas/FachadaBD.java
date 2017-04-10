/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fachadas;

import excepciones.FachadaException;
import excepciones.PersistenciaException;
import interfaces.IFachada;
import java.sql.Connection;
import java.util.Vector;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;
import persistencia.Canciones;
import persistencia.Conexion;
import persistencia.Generos;
import persistencia.Peliculas;

/**
 *
 * @author asus
 */
public class FachadaBD implements IFachada {

    // URL de la base de datos. Sintaxis:
    // "jdbc:mysql://dir IP del servidor/base de datos"
    // Si la base de datos está en la máquina local use localhost en lugar de
    // la dirección IP del servidor
    private static final String url = "jdbc:mysql://localhost/musica";
    // Nombre del usuario que tiene acceso a la base de datos
    private static final String usuario = "root";
    // Password del usuario
    private static final String password = "";
    private Canciones catalogoCanciones;
    private Peliculas catalogoPeliculas;
    private Generos catalogoGeneros;

    /**
     * Constructor predeterminado
     */
    public FachadaBD() {
        // Crea un objeto del tipo catalogoCanciones para accesar a la tabla
        // canciones
        catalogoCanciones = new Canciones("canciones");
        // Crea un objeto del tipo catalogoPeliculas para accesar a la tabla
        // peliculas
        catalogoPeliculas = new Peliculas("peliculas");
        // Crea un objeto del tipo catalogoGeneros para accesar a la tabla
        // generos
        catalogoGeneros = new Generos("generos");
    }

    /**
     * Obtiene una canción de la tabla canciones
     *
     * @param cancion Cancion a obtener
     * @return La canción si existe, null en caso contrario
     * @throws FachadaException Si no se puede obtener la canción.
     */
    public Cancion obten(Cancion cancion) throws FachadaException {
        Conexion conexion = null;
        Cancion cancionHallada;
        Genero generoHallado;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            catalogoGeneros.setConexion(conn);
            // Obten la canción
            cancionHallada = catalogoCanciones.obten(cancion);
            if (cancionHallada != null) {
                // Obten el género de la canción
                generoHallado = catalogoGeneros.obten(cancionHallada.getGenero());
                // Se agrega el género a la canción
                cancionHallada.setGenero(generoHallado);
            }
            // Regresa la canción
            return cancionHallada;
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la canción", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la canción", pe);
            }
        }
    }

    /**
     * Agrega una canción a la tabla canciones. No se permiten canciones con
     * claves repetidas
     *
     * @param cancion Cancion a agregar
     * @throws FachadaException Si la canción está repetida o no se puede
     * agregar la canción a la tabla canciones.
     */
    public void agrega(Cancion cancion) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            // Busca la canción en la tabla canciones
            Cancion cancionBuscada = catalogoCanciones.obten(cancion);
            // Si la hay, no se agrega a la tabla
            if (cancionBuscada != null) {
                throw new FachadaException("Canción repetida");
            }
            // Agrega la nueva canción a la tabla
            catalogoCanciones.agrega(cancion);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede agregar la canciónMao", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede agregar la canciónMao", pe);
            }
        }
    }

    /**
     * Actualiza una canción de la tabla canciones
     *
     * @param cancion Cancion a actualizar
     * @throws FachadaException Si no se puede actualizar la canción de la tabla
     * canciones.
     */
    public void actualiza(Cancion cancion) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            // Actualiza la canción de la tabla canciones
            catalogoCanciones.actualiza(cancion);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede actualizar la canción", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede actualizar la canción", pe);
            }
        }
    }

    /**
     * Elimina una canción de la tabla canciones
     *
     * @param cancion Cancion a eliminar
     * @throws FachadaException Si no se puede eliminar la canción de la tabla
     * canciones.
     */
    public void elimina(Cancion cancion) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            // Elimina la canción de la tabla canciones
            catalogoCanciones.elimina(cancion);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede eliminar la canción", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede eliminar la canción", pe);
            }
        }
    }

    /**
     * Obtiene una película de la tabla peliculas
     *
     * @param pelicula Pelicula a obtener
     * @return La película si existe, null en caso contrario
     * @throws FachadaException Si no se puede obtener la película de la tabla
     * peliculas.
     */
    public Pelicula obten(Pelicula pelicula) throws FachadaException {
        Conexion conexion = null;
        Pelicula peliculaHallada;
        Genero generoHallado;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoPeliculas.setConexion(conn);
            catalogoGeneros.setConexion(conn);
            // Obten la película
            peliculaHallada = catalogoPeliculas.obten(pelicula);
            if (peliculaHallada != null) {
                // Obten el género de la canción
                generoHallado = catalogoGeneros.obten(peliculaHallada.getGenero());
                // Se agrega el género a la película
                peliculaHallada.setGenero(generoHallado);
            }
            // Regresa la película
            return peliculaHallada;
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la película", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la película", pe);
            }
        }
    }

    /**
     * Agrega una película a la tabla peliculas. No se permiten peliculas con
     * claves repetidas
     *
     * @param pelicula Película a agregar
     * @throws FachadaException Si la película está repetida o no se puede
     * agregar la película a la tabla peliculas.
     */
    public void agrega(Pelicula pelicula) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoPeliculas.setConexion(conn);
            // Busca la película en la tabla peliculas
            Pelicula peliculaBuscada = catalogoPeliculas.obten(pelicula);
            // Si lo hay, no se agrega a la tabla
            if (peliculaBuscada != null) {
                throw new FachadaException("Película repetida");
            }
            // Agrega la nueva película a la tabla
            catalogoPeliculas.agrega(pelicula);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede agregar la película", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede agregar la película", pe);
            }
        }
    }

    /**
     * Actualiza una película de la tabla peliculas
     *
     * @param pelicula Pelicula a actualizar
     * @throws FachadaException Si no se puede actualizar la película de la
     * tabla películas.
     */
    public void actualiza(Pelicula pelicula) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoPeliculas.setConexion(conn);
            // Actualiza la película de la tabla
            catalogoPeliculas.actualiza(pelicula);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede actualizar la película", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede actualizar la película", pe);
            }
        }
    }

    /**
     * Elimina una película de la Tabla peliculas
     *
     * @param pelicula Pelicula a eliminar
     * @throws FachadaException Si no se puede eliminar la película de la tabla
     * películas.
     */
    public void elimina(Pelicula pelicula) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoPeliculas.setConexion(conn);
            // Elimina la película del catálogo
            catalogoPeliculas.elimina(pelicula);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede eliminar la película", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede eliminar la película", pe);
            }
        }
    }

    /**
     * Obtiene un género de la tabla generos
     *
     * @param genero Género a obtener
     * @return El género si existe, null en caso contrario
     * @throws FachadaException Si no se puede obtener el género.
     */
    public Genero obten(Genero genero) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Obten el género
            return catalogoGeneros.obten(genero);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener el género", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener el género", pe);
            }
        }
    }

    /**
     * Agrega un género a la tabla géneros. No se permiten géneros con claves
     * repetidas
     *
     * @param genero Género a agregar
     * @throws FachadaException Si el género está repetido o no se puede agregar
     * el género a la tabla generos.
     */
    public void agrega(Genero genero) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Busca el género en la tabla generos
            Genero generoBuscado = catalogoGeneros.obten(genero);
            // Si lo hay, no se agrega a la tabla
            if (generoBuscado != null) {
                throw new FachadaException("Género repetido");
            }
            // Agrega el nuevo género a la tabla
            catalogoGeneros.agrega(genero);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede agregar el género", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede agregar el género", pe);
            }
        }
    }

    /**
     * Actualiza un género de la tabla géneros
     *
     * @param genero Género a actualizar
     * @throws FachadaException Si no se puede actualizar el género de la tabla
     * generos.
     */
    public void actualiza(Genero genero) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Actualiza el género de la tabla generos
            catalogoGeneros.actualiza(genero);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede actualizar el género", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede actualizar el género", pe);
            }
        }
    }

    /**
     * Elimina un género de la tabla generos
     *
     * @param genero Género a eliminar
     * @throws FachadaException Si no se puede eliminar el género de la tabla
     * generos.
     */
    public void elimina(Genero genero) throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);

            // Elimina el género de la tabla generos
            catalogoGeneros.elimina(genero);
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede eliminar el género", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede eliminar el género", pe);
            }
        }
    }

    /**
     * Obtiene una lista todas las canciones
     *
     * @return Vector con la lista de todas las canciones
     * @throws FachadaException Si no se puede obtener la lista de canciones
     */
    public Vector consultaCanciones() throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            // Regresa el vector con la lista de canciones
            return agregaGeneroCanciones(catalogoCanciones.lista());
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la lista de canciones", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la lista de canciones", pe);
            }
        }
    }

    /**
     * Le agrega los atributos del género a cada canción de la lista
     *
     * @param listaCanciones Lista de las canciones a las que se les agregará
     * los atributos del género
     * @return Vector con la lista de canciones
     * @throws FachadaException Si hay un problema al conectarse a la base de
     * datos
     */
    private Vector agregaGeneroCanciones(Vector listaCanciones) throws FachadaException {
        Genero genero;
        Cancion cancion;
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Para cada canción de la lista
            for (int i = 0; i < listaCanciones.size(); i++) {
                // Obtén la canción de la lista
                cancion = (Cancion) listaCanciones.elementAt(i);
                // Obten el género de la canción del catálogo de géneros
                genero = catalogoGeneros.obten(cancion.getGenero());
                // Agrega el género a la canción
                cancion.setGenero(genero);
                listaCanciones.setElementAt(cancion, i);
            }
            // Regresa el vector con la lista canciones
            return listaCanciones;
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la lista de canciones", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la lista de canciones", pe);
            }
        }
    }

    /**
     * Obtiene una lista de todas las canciones con el mismo título.
     *
     * @param titulo Titulo de las canciones de la lista
     * @return Vector con la lista de todas las canciones con el mismo título.
     * @throws FachadaException Si no se puede obtener la lista de canciones
     */
    public Vector consultaCancionesTitulo(String titulo)
            throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoCanciones.setConexion(conn);
            // Regresa el vector con la lista de canciones
            return agregaGeneroCanciones(catalogoCanciones.listaTitulo(titulo));
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la lista de canciones", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la lista de canciones", pe);
            }
        }
    }

    /**
     * Obtiene una lista de los géneros de canciones
     *
     * @return Vector con la lista de los géneros canciones
     * @throws FachadaException Si no se puede obtener la lista de géneros
     */
    public Vector consultaGenerosCanciones() throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Regresa el vector con la lista de géneros de canciones
            return catalogoGeneros.listaMedio('C');
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la lista de géneros", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la lista de géneros", pe);
            }
        }
    }

    /**
     * Obtiene una lista de los géneros de películas
     *
     * @return Vector con la lista de los géneros películas
     * @throws FachadaException Si no se puede acceder al catálogo de géneros.
     */
    public Vector consultaGenerosPeliculas() throws FachadaException {
        Conexion conexion = null;
        try {
            // Establece la conexion con la base de datos
            conexion = new Conexion(url, usuario, password);
            Connection conn = conexion.getConexion();
            catalogoGeneros.setConexion(conn);
            // Regresa el vector con la lista de géneros de canciones
            return catalogoGeneros.listaMedio('P');
        } catch (PersistenciaException pe) {
            throw new FachadaException("No se puede obtener la lista de géneros", pe);
        } finally {
            // Cierra la conexión
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (PersistenciaException pe) {
                throw new FachadaException("No se puede obtener la lista de géneros", pe);
            }
        }
    }

    @Override
    public Vector consultaCancionesInterprete(String interprete) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaCancionesAutor(String autor) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaCancionesGenero(String cveGenero) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaCancionesAlbum(String album) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaPeliculas() throws FachadaException {
        return catalogoPeliculas.lista();
    }

    @Override
    public Vector consultaPeliculasTitulo(String titulo) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaPeliculasActor(String actor) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaPeliculasDirector(String director) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaPeliculasGenero(String cveGenero) throws FachadaException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Vector consultaGeneros() throws FachadaException {
        return catalogoGeneros.lista();
    }

}
