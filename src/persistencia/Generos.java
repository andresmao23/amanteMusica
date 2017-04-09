package persistencia;

import excepciones.PersistenciaException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Generos extends Tabla {

    /**
     * Constructor del método. Establece el nombre de la tabla en la que se
     * almacenan los datos
     *
     * @param nomTabla Nombre de la tabla en la que se almacenan los datos
     */
    public Generos(String nomTabla) {
        super(nomTabla);
    }

    /**
     * Este método obtiene un género cuya clave es igual a la clave del género
     * dada por el parámetro.
     *
     * @param genero Objeto de tipo Genero con la clave de la género a buscar
     * @return El género si lo encuentra. null en caso contrario.
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Genero obten(Genero genero) throws PersistenciaException {
        ResultSet renglon;
        // Crea la sentencia SQL para buscar el género en la tabla géneros.
        String sql = "SELECT * FROM " + nomTabla + " WHERE cveGenero = '" + genero.getCveGenero() + "';";
        // Ejecuta la consulta
        consulta(sql);
        // Si hay un renglón en la tabla con el género buscado
        if ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Genero con los campos del renglon de la
                // tabla.
                Genero generoHallado = new Genero(renglon.getString("cveGenero"),
                        renglon.getString("nombre"),
                        renglon.getString("tipoMedio")
                                .charAt(0));
                return generoHallado;
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos", sqle);
            }
        }
        // Si no, regresa null
        return null;
    }

    /**
     * Este método permite insertar un renglón de la tabla con los atributos de
     * los objetos de la clase Genero.
     *
     * @param genero Genero a insertar en la tabla generoess
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void agrega(Genero genero) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para insertar.
        // La sentencia debe terminar en un ;
        sql += "INSERT " + nomTabla;
        sql += " SET cveGenero = '" + genero.getCveGenero() + "'";
        sql += ", nombre = '" + genero.getNombre() + "'";
        sql += ", tipoMedio = '" + genero.getTipoMedio() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite modificar un renglón de la tabla con los atributos de
     * los objetos de la clase Genero.
     *
     * @param genero El usuario a modificar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void actualiza(Genero genero) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia con la actualización.
        // La sentencia debe terminar en un ;
        sql += "UPDATE " + nomTabla;
        sql += " SET cveGenero = '" + genero.getCveGenero() + "'";
        sql += ", nombre = '" + genero.getNombre() + "'";
        sql += ", tipoMedio = '" + genero.getTipoMedio() + "'";
        sql += " WHERE cveGenero = '" + genero.getCveGenero() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite borrar un renglón de la tabla con los atributos de
     * los objetos de la clase Genero.
     *
     * @param genero Genero a borrar
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public void elimina(Genero genero) throws PersistenciaException {
        String sql = "";
        // Crea la sentencia para borrar.
        // La sentencia debe terminar en un ;
        sql += "DELETE FROM " + nomTabla;
        sql += " WHERE cveGenero = '" + genero.getCveGenero() + "';";
        // Ejecuta la sentencia
        actualiza(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Genero usando el comando de consulta dado por el parámetro.
     *
     * @param sql Comando de consulta dado por el parámetro.
     * @return Un vector con la lista de los objetos del tipo Genero de la tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista(String sql) throws PersistenciaException {
        ResultSet renglon;
        Vector lista = new Vector();
        // Ejecuta la consulta
        consulta(sql);
        // Mientras haya generoes en la tabla
        while ((renglon = obtenRenglon()) != null) {
            try {
                // Crea un objeto del tipo Genero con los campos del renglón de la
                // tabla.
                Genero genero = new Genero(renglon.getString("cveGenero"),
                        renglon.getString("nombre"),
                        renglon.getString("tipoMedio").charAt(0));

                // Agrega la película al vector de película
                lista.add(genero);
            } catch (SQLException sqle) {
                throw new PersistenciaException("Error al acceder a la base de datos", sqle);
            }
        }
        return lista;
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Genero.
     *
     * @return Un vector con la lista de los objetos del tipo Genero de la tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector lista() throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + ";";
        return lista(sql);
    }

    /**
     * Este método permite consultar la tabla con los atributos de los objetos
     * de la clase Genero y que tienen el mismo tipo de medio.
     *
     * @param titulo Título de la género a buscar
     * @return Un vector con la lista de los objetos del tipo Genero de la tabla
     * @throws PersistenciaException Si no puede acceder a la base de datos
     */
    public Vector listaMedio(char tipoMedio) throws PersistenciaException {
        String sql = "SELECT * FROM " + nomTabla + " WHERE tipoMedio = '" + tipoMedio + "'";
        return lista(sql);
    }

}
