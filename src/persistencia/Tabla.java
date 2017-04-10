/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import excepciones.PersistenciaException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.TableModel;

/**
 *
 * @author asus
 */
public class Tabla {

    // Nombre de la tabla en la que se almacenan los datos
    protected String nomTabla;
    // Conexión con la base de datos */
    private Connection conexion;
    // Sentencia SQL que se le envia al manejador de la base de datos para
    // consultar, insertar, actualizar, borrar.
    private Statement sentencia;
    // Respuesta del manejador de la base de datos a la sentencia SQL.
    private ResultSet respuesta;

    /**
     * Constructor del método. Establece el nombre de la tabla en la que se
     * almacenan los datos
     *
     * @param nomTabla Nombre de la tabla en la que se almacenan los datos
     */
    public Tabla(String nomTabla) {
// Establece el nombre de la tabla
        this.nomTabla = nomTabla;
    }

    /**
     * Establece la conexion con la base de datos
     *
     * @param conexion Conexion con la base de datos
     */
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    /**
     * Este método permite consultar una tabla de una base de datos mySQL.
     *
     * @param sql Cadena con la sentencia con la consulta.
     * @throws SQLException Si no puede crear el Statement o ejecutar la
     * consulta
     */
    public void consulta(String sql) throws PersistenciaException {
        try {
            // Crea una sentencia para hacer la consulta
            sentencia = conexion.createStatement();
            // Ejecuta la consulta. El método executeQuery() regresa una tabla
            // que genera como resultado de la consulta
            respuesta = sentencia.executeQuery(sql);
        } catch (SQLException se) {
            throw new PersistenciaException("No se puede consultar a la base de datos", se);
        }
    }

    /**
     * Este método obtiene el siguiente renglón de la tabla generada por la
     * consulta hecha por el método executeSelect().
     *
     * @return Si hay renglones, el siguiente renglón, null en caso contrario.
     * @throws PersistenciaException Si no puede obtener el siguiente renglon de
     * la tabla.
     */
    public ResultSet obtenRenglon() throws PersistenciaException {
        try {
            // Si hay otro renglon en la tabla, regrésalo.
            if (respuesta.next()) {
                return respuesta;
            } // Si no, cierra la sentencia, la tabla y regresa null.
            else {
                // Cierra la sentencia y la tabla y regresa null.
                respuesta.close();
                sentencia.close();
                return null;
            }
        } catch (SQLException se) {
            throw new PersistenciaException("No se puede consultar a la base de datos", se);
        }
    }

    /**
     * Este método permite modificar, insertar y borrar renglones de una tabla
     * de una base de datos mySQL.
     *
     * @param sql Cadena con la sentencia para modificar, insertar o borrar.
     * @throws PersistenciaException Si no puede crear el Statement o ejecutar
     * la actualización
     */
    public void actualiza(String sql) throws PersistenciaException {
        try {
            // Crea una sentencia para hacer la modificación.
            sentencia = conexion.createStatement();
            // Ejecuta la modificación.
            int i = sentencia.executeUpdate(sql);
            // Cierra la sentencia y la tabla.
            sentencia.close();
        }catch(SQLException se) {
            throw new PersistenciaException("No se puede actualizar a la base de datos", se);
        }
    }

}
