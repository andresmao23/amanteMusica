package persistencia;

import excepciones.PersistenciaException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Canciones extends Tabla {

    public Canciones(String nomTabla) {
        super(nomTabla);
    }

    /**
     * Este método obtiene una canción cuya clave es igual a la clave de la
     * canción dada por el parámetro.
     *
     * @param cancion Objeto de tipo Cancion con la clave de la canción a buscar
     * @return La Cancion si la encuentra. null en caso contrario.
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Cancion obten(Cancion cancion) throws PersistenciaException {
        ResultSet renglon;
        // Crea la sentencia SQL para buscar la cancion en la tabla canciones.
        String sql = "SELECT * FROM " + nomTabla
                + " WHERE clave = '" + cancion.getClave() + "';";
        // Ejecuta la consulta
        consulta(sql);
        // Si hay un renglón en la tabla con la cancion buscada
        if ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Cancion con los campos del renglon de la
                // tabla.
                Cancion cancionHayada = new Cancion(renglon.getString("interprete"),
                        renglon.getString("autor"),
                        renglon.getString("album"),
                        renglon.getString("clave"),
                        renglon.getString("titulo"),
                        new Genero(renglon.getString("cveGenero")),
                        renglon.getInt("duracion"));
                return cancionHayada;
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos", sqle);
            }
        }
        // Si no, regresa null
        return null;
    }

    /**
     * Este método permite insertar un renglón de la tabla con los atributos de
     * los objetos de la clase Cancion.
     *
     * @param cancion Cancion a insertar en la tabla cancioness
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void agrega(Cancion cancion) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para insertar.
        // La sentencia debe terminar en un ;
        
        sql += "INSERT " + nomTabla;
        sql += " SET clave = '" + cancion.getClave() + "'";
        sql += ", titulo = '" + cancion.getTitulo() + "'";
        sql += ", cveGenero = '" + cancion.getGenero().getCveGenero() + "'";
        sql += ", interprete = '" + cancion.getInterprete() + "'";
        sql += ", autorLetra = '" + cancion.getAutor() + "'";
        sql += ", album = '" + cancion.getAlbum() + "'";
        sql += ", duracion = '" + cancion.getDuracion() + "';";
        //sql += ", fecha = \"" + cancion.getFecha().toDateString() + "\";";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite modificar un renglón de la tabla con los atributos de
     * los objetos de la clase Cancion.
     *
     * @param cancion El usuario a modificar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void actualiza(Cancion cancion) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia con la actualización.
        // La sentencia debe terminar en un ;
        sql += "UPDATE " + nomTabla;
        sql += " SET clave = '" + cancion.getClave() + "'";
        sql += ", titulo = '" + cancion.getTitulo() + "'";
        sql += ", cveGenero = '" + cancion.getGenero().getCveGenero() + "'";
        sql += ", interprete = '" + cancion.getInterprete() + "'";
        sql += ", autorLetra = '" + cancion.getAutor() + "'";
        sql += ", album = '" + cancion.getAlbum() + "'";
        sql += ", duracion = '" + cancion.getDuracion() + "'";
        //sql += ", fecha = \"" + cancion.getFecha().toDateString() + "\"";
        sql += " WHERE clave = '" + cancion.getClave() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite borrar un renglón de la tabla con los atributos de
     * los objetos de la clase Cancion.
     *
     * @param cancion Cancion a borrar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void elimina(Cancion cancion) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para borrar.
        // La sentencia debe terminar en un ;
        sql += "DELETE FROM " + nomTabla;
        sql += " WHERE clave = '" + cancion.getClave() + "';";

        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Cancion usando el comando de consulta dado por el parámetro.
     *
     * @param sql Comando de consulta dado por el parámetro.
     * @return Un vector con la lista de los objetos del tipo Cancion de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista(String sql) throws PersistenciaException {
        ResultSet renglon;
        Vector lista = new Vector();
        // Ejecuta la consulta
        consulta(sql);
        // Mientras haya canciones en la tabla
        while ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Cancion con los campos del renglon de la
                // tabla.    
                Cancion cancion = new Cancion(renglon.getString("interprete"),
                        renglon.getString("autor"),
                        renglon.getString("album"),
                        renglon.getString("clave"),
                        renglon.getString("titulo"),
                        new Genero(renglon.getString("cveGenero")),
                        renglon.getInt("duracion"));
                // Agrega la película al vector de película
                lista.add(cancion);
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos",
                        sqle);
            }
        }
        return lista;
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Cancion.
     *
     * @return Un vector con la lista de los objetos del tipo Cancion de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista() throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + ";";
        return lista(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Cancion y que tienen el mismo título.
     *
     * @param titulo Título de la canción a buscar
     * @return Un vector con la lista de los objetos del tipo Cancion de la
     * tabla.
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector listaTitulo(String titulo) throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + " WHERE titulo = '" + titulo + "'";
        return lista(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Cancion y que tienen el mismo genero.
     *
     * @param cveGenero Clave del género de la canción a buscar
     * @return Un vector con la lista de los objetos del tipo Cancion de la
     * tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector listaGenero(String cveGenero) throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + " WHERE cveGenero = '" + cveGenero + "'";
        return lista(sql);
    }

}
