package persistencia;

import excepciones.PersistenciaException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public class Peliculas extends Tabla {

    public Peliculas(String nomTabla) {
        super(nomTabla);
    }

    /**
     * Este método obtiene una película cuya clave es igual a la clave de la
     * película dada por el parámetro.
     *
     * @param pelicula Objeto de tipo Pelicula con la clave de la película a
     * buscar
     * @return La Película si la encuentra, null en caso contrario
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Pelicula obten(Pelicula pelicula) throws PersistenciaException {
        ResultSet renglon;
        // Crea la sentencia SQL para buscar una pelicula en la tabla peliculas.
        String sql = "SELECT * FROM " + nomTabla + " WHERE clave = '" + pelicula.getClave() + "';";
        // Ejecuta la consulta
        consulta(sql);
        // Si hay un renglón en la tabla con el titulo deseado
        if ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Pelicula con los campos del renglón de la
                // tabla.
                Pelicula peliculaHallada = new Pelicula(renglon.getString("actor1"),
                        renglon.getString("actor2"),
                        renglon.getString("director"),
                        renglon.getString("clave"),
                        renglon.getString("titulo"),
                        new Genero(renglon.getString("cveGenero")),
                        renglon.getInt("duracion"));

                return peliculaHallada;
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos", sqle);
            }
        }
        // Si no, regresa null
        return null;
    }

    /**
     * Este método permite insertar un renglón de la tabla con los atributos de
     * los objetos de la clase Pelicula.
     *
     * @param pelicula Pelicula a insertar en la tabla peliculas
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void agrega(Pelicula pelicula) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para insertar.
        // La sentencia debe terminar en un ;
        sql += "INSERT " + nomTabla;
        sql += " SET clave = '" + pelicula.getClave() + "'";
        sql += ", titulo = '" + pelicula.getTitulo() + "'";
        sql += ", cveGenero = '" + pelicula.getGenero().getCveGenero() + "'";
        sql += ", actor1 = '" + pelicula.getActor1() + "'";
        sql += ", actor2 = '" + pelicula.getActor2() + "'";
        sql += ", director = '" + pelicula.getDirector() + "'";
        sql += ", duracion = '" + pelicula.getDuracion() + "'";
        //sql += ", fecha = \"" + pelicula.getFecha().toDateString() + "\";";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite modificar un renglón de la tabla con los atributos de
     * los objetos de la clase Pelicula.
     *
     * @param pelicula El usuario a modificar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void actualiza(Pelicula pelicula) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia con la actualización.
        // La sentencia debe terminar en un ;
        sql += "UPDATE " + nomTabla;
        sql += " SET clave = '" + pelicula.getClave() + "'";
        sql += ", titulo = '" + pelicula.getTitulo() + "'";
        sql += ", cveGenero = '" + pelicula.getGenero().getCveGenero() + "'";
        sql += ", actor1 = '" + pelicula.getActor1() + "'";
        sql += ", actor2 = '" + pelicula.getActor2() + "'";
        sql += ", director = '" + pelicula.getDirector() + "'";
        sql += ", duracion = '" + pelicula.getDuracion() + "'";
        //sql += ", fecha = \"" + pelicula.getFecha().toDateString() + "\"";
        sql += " WHERE clave = '" + pelicula.getClave() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite borrar un renglón de la tabla con los atributos de
     * los objetos de la clase Pelicula.
     *
     * @param pelicula Película a borrar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void elimina(Pelicula pelicula) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para borrar.
        // La sentencia debe terminar en un ;
        sql += "DELETE FROM " + nomTabla;
        sql += " WHERE clave = '" + pelicula.getClave() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Pelicula usando el comando de consulta dado por el parámetro.
     *
     * @param sql Comando de consulta dado por el parámetro.
     * @return Un vector con la lista de los objetos del tipo Pelicula de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista(String sql) throws PersistenciaException {
        ResultSet renglon;
        Vector lista = new Vector();
        // Ejecuta la consulta
        consulta(sql);
        // Mientras haya películas en la tabla
        while ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Pelicula con los campos del renglón de
                // la tabla.
                Pelicula pelicula = new Pelicula(renglon.getString("actor1"),
                        renglon.getString("actor2"),
                        renglon.getString("director"),
                        renglon.getString("clave"),
                        renglon.getString("titulo"),
                        new Genero(renglon.getString("cveGenero")),
                        renglon.getInt("duracion"));
                // Agrega la película al vector de peliculas
                lista.add(pelicula);
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos", sqle);
            }
        }
        return lista;
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Pelicula.
     *
     * @return Un vector con la lista de los objetos del tipo Pelicula de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista() throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + ";";
        return lista(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Pelicula y que tienen el mismo actor.
     *
     * @param actor Actor a buscar
     * @return Un vector con la lista de los objetos del tipo Pelicula de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector listaActor(String actor) throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + " WHERE actor1 = '" + actor + "' OR actor2 = '" + actor + "';";
        return lista(sql);
    }

}
