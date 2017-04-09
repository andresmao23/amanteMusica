/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import fachadas.FachadaBD;
import interfaces.IFachada;
import interfazGrafica.ConstantesGUI;
import interfazGrafica.DlgCancion;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Control {
    // Acceso a los objetos del negocio

    IFachada fachada;
    Conversiones conversiones;

    /**
     * Constructor.
     */
    public Control() {
        // Crea un objeto del tipo fachada
        fachada = new FachadaBD();
        conversiones = new Conversiones();
    }

    /**
     * Agrega una cancion al catalogo de canciones
     *
     * @param frame Ventana sobre la que se despliega el cuadro de dialogo para
     * capturar los datos de la cancion
     */
    public void agregaCancion(JFrame frame) {
        Cancion cancion, bCancion;
        StringBuffer respuesta = new StringBuffer("");
        DlgCancion dlgCancion;
        Vector listaGenerosCanciones;
        DefaultComboBoxModel<Genero> generosCancionesComboBoxModel;
        // Captura la clave de la cancion
        String clave = JOptionPane.showInputDialog(frame, "Clave de la cancion:",
                "Agregar cancion",
                JOptionPane.QUESTION_MESSAGE);
        // Si el usuario presiono el boton Cancelar
        if (clave == null) {
            return;
        }
        // Crea un objeto Cancion con solo la clave
        cancion = new Cancion(clave);
        try {
            // Obten la cancion del catalogo de canciones
            bCancion = fachada.obten(cancion);
            // Obtiene la listade generos de canciones
            listaGenerosCanciones = fachada.consultaGenerosCanciones();
        } catch (Exception e) {
            // Si ocurrio un error al leer del catalogo de canciones,
            // despliega mensaje de error
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error!!.",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        generosCancionesComboBoxModel = conversiones.
                generosComboBoxModel(listaGenerosCanciones);
        // Si la cancion existe, despliega sus datos
        if (bCancion != null) {
            dlgCancion = new DlgCancion(frame,
                    "La cancion ya esta en el catalogo",
                    true, bCancion,
                    generosCancionesComboBoxModel,
                    ConstantesGUI.DESPLEGAR, respuesta);
            return;
        }
        // Si la cancion no existe captura los datos de la nueva cancion
        dlgCancion = new DlgCancion(frame, "Captura Datos Cancion", true,
                cancion, generosCancionesComboBoxModel,
                ConstantesGUI.AGREGAR, respuesta);
        // Si el usuario presiono el boton Cancelar
        if (respuesta.substring(0).equals(ConstantesGUI.CANCELAR)) {
            return;
        }
        // Agrega la nueva cancion al catalogo de canciones
        try {
            fachada.agrega(cancion);
        } catch (Exception e) {
            // Si ocurrio un error al escribir al catalogo de canciones,
            // despliega mensaje de error
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error!!.", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Regresa un objeto Tabla con todas las canciones
     *
     * @param frame Ventana sobre la que se despliega el mensaje de error
     * @return Objeto Tabla con todas las canciones, null si hay un error
     */
    public Tabla getTablaCanciones(JFrame frame) {
        Vector listaCanciones;
        try {
            // Obtiene la lista de canciones
            listaCanciones = fachada.consultaCanciones();
        } catch (Exception e) {
            // Si ocurrio un error al obtener la lista de la base de datos,
            // despliega mensaje de error
            JOptionPane.showMessageDialog(frame, e.getMessage(), "Error!!.", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        // Regresa el objeto Tabla con todas las canciones
        return new Tabla("Lista de Canciones", conversiones.cancionesTableModel(listaCanciones));
    }

}
