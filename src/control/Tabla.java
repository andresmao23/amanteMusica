/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class Tabla {

    private String titulo;
    private DefaultTableModel modeloTabla;

    /**
     * Constructor sin parametros
     */
    public Tabla() {
    }

    /**
     * Constructor que inicializa los atributos de la clase
     *
     * @param titulo Titulo de la tabla
     * @param modeloTabla Objeto TableModel con los datos de la tabla.
     */
    public Tabla(String titulo, DefaultTableModel modeloTabla) {
        this.titulo = titulo;
        this.modeloTabla = modeloTabla;
    }
    
    
    
    
//
//    /**
//     * Regresa el titulo de la tabla
//     *
//     * @return El titulo de la tabla
//     */
//    public String getTitulo() {
//        return titulo;
//    }
//
//    /**
//     * Establece el titulo de la tabla
//     *
//     * @param titulo Titulo de la tabla
//     */
//    public void setTitulo(String titulo) {
//        this.titulo = titulo;
//    }
//
//    /**
//     * Regresa los datos de la tabla
//     *
//     * @return Objeto TableModel con los datos de la tabla
//*
//     */
//    public DefaultTableModel getModeloTabla() {
//        return modeloTabla;
//    }
//
//    /**
//     * Establece los datos de la tabla
//     *
//     * @param modeloTabla Objeto TableModel con los datos de la tabla
//     */
//    public void setModeloTabla(DefaultTableModel modeloTabla) {
//        this.modeloTabla = modeloTabla;
//    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public DefaultTableModel getModeloTabla() {
        return modeloTabla;
    }

    public void setModeloTabla(DefaultTableModel modeloTabla) {
        this.modeloTabla = modeloTabla;
    }

}
