/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import java.awt.Dimension;
import java.awt.Point;
import javax.swing.DefaultComboBoxModel;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class DlgCancion extends javax.swing.JDialog {

    /**
     * Constructor que establece las características del cuadro de diálogo y la
     * operación a realizar con él
     *
     * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
     * @param title Título del cuadro de diálogo
     * @param modal true si permite acceder fuera de los límites del cuadro de
     * diálogo, false en caso contrario
     * @param cancion Canción a capturar, editar o desplegar
     * @param listaGenerosCanciones Lista de los generos de una canción
     * @param operacion Operación a realizar en el cuadro de diálogo: AGREGAR =
     * 0, ACTUALIZAR = 1, ELIMINAR = 2, DESPLEGAR = 3;
     * @param respuesta Boton presionado al salir de los cuadros de diálogos:
     * ACEPTAR = "Aceptar", CANCELAR = "Cancelar".
     */
    public DlgCancion(java.awt.Frame parent, String title, boolean modal, Cancion cancion, DefaultComboBoxModel listaGenerosCanciones, int operacion, StringBuffer respuesta) {
        super(parent, title, modal);
        this.cancion = cancion;
        this.listaGenerosCanciones = listaGenerosCanciones;
        this.operacion = operacion;
        this.respuesta = respuesta;
        initComponents();

        // Modifica el título del botón botonAceptar y establece si los
        // botones botonRestaurar y botonCancelar estarán habilitados.
        // Si la operación es agregar
        if (operacion == ConstantesGUI.AGREGAR) {
            botonAceptar.setText("Guardar");
        } // Si la operación es actualizar
        else if (operacion == ConstantesGUI.ACTUALIZAR) {
            botonAceptar.setText("Actualizar");
        } // Si la operación es eliminar
        else if (operacion == ConstantesGUI.ELIMINAR) {
            botonAceptar.setText("Eliminar");
            botonRestaurar.setEnabled(false);
        } // Si la operación es desplegar
        else if (operacion == ConstantesGUI.DESPLEGAR) {
            botonAceptar.setText("Continuar");
            botonRestaurar.setEnabled(false);
            botonCancelar.setEnabled(false);
        }
        // Despliega la clave de la canción
        campoTextoClave.setText(cancion.getClave());
        // Si la operación es de actualizar, eliminar o desplegar,
        if ((operacion == ConstantesGUI.ELIMINAR) || (operacion == ConstantesGUI.ACTUALIZAR) || (operacion == ConstantesGUI.DESPLEGAR)) {
            // despliega el resto de los datos de la canción
            campoTextoTitulo.setText(cancion.getTitulo());
            campoTextoInterprete.setText(cancion.getInterprete());
            campoTextoAutor.setText(cancion.getAutor());
            cajaCombinadaGenerosCanciones.setSelectedItem(cancion.getGenero());
            campoTextoAlbum.setText(cancion.getAlbum());
            campoTextoDuracion.setText(new Integer(cancion.getDuracion()).toString());
        }
        // Si la operación es de eliminar o desplegar
        if ((operacion == ConstantesGUI.ELIMINAR) || (operacion == ConstantesGUI.DESPLEGAR)) {
            // hace los campos de texto de sólo lectura
            campoTextoTitulo.setEditable(false);
            campoTextoInterprete.setEditable(false);
            campoTextoAutor.setEditable(false);
            cajaCombinadaGenerosCanciones.setEnabled(false);
            campoTextoAlbum.setEditable(false);
            campoTextoDuracion.setEditable(false);
        }
        // Establece el valor por omisión para respuesta, por si se cierra el
        // cuadro de diálogo presionando el botón cerrar o el botón cancelar
        respuesta.append(ConstantesGUI.CANCELAR);
        // centra el cuadro de dialogo sobre la ventana de la aplicación
        centraCuadroDialogo(parent);
        // Muestra el cuadro de diálogo
        setVisible(true);

    }

    /**
     * Este método centra el cuadro de dialogo sobre la ventana de la
     * aplicación.
     *
     * @param parent Ventana sobre la que aparecerá el cuadro de diálogo
     */
    private void centraCuadroDialogo(java.awt.Frame parent) {
        // Obtiene el tamaño y posición de la ventana de la aplicación
        Dimension frameSize = parent.getSize();
        Point loc = parent.getLocation();
        // Obtiene el tamaño del cuadro de diálogo
        Dimension dlgSize = getPreferredSize();
        // Centra el cuadro de diálogo sobre la ventana padre
        setLocation((frameSize.width - dlgSize.width) / 2 + loc.x, (frameSize.height - dlgSize.height) / 2 + loc.y);
    }

    /*public DlgCancion(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }*/
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        campoTextoClave = new javax.swing.JTextField();
        campoTextoTitulo = new javax.swing.JTextField();
        campoTextoInterprete = new javax.swing.JTextField();
        campoTextoAutor = new javax.swing.JTextField();
        campoTextoAlbum = new javax.swing.JTextField();
        campoTextoDuracion = new javax.swing.JTextField();
        cajaCombinadaGenerosCanciones = new javax.swing.JComboBox<>();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonRestaurar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Clave");

        jLabel2.setText("Titulo");

        jLabel3.setText("Interprete");

        jLabel4.setText("Autor");

        jLabel5.setText("Género");

        jLabel6.setText("Albúm");

        jLabel7.setText("Duración");

        campoTextoClave.setEditable(false);
        campoTextoClave.setColumns(10);

        campoTextoTitulo.setColumns(35);

        campoTextoInterprete.setColumns(35);

        campoTextoAutor.setColumns(35);

        campoTextoAlbum.setColumns(35);

        campoTextoDuracion.setColumns(10);

        cajaCombinadaGenerosCanciones.setModel(listaGenerosCanciones);

        botonAceptar.setText("Aceptar");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setText("Cancelar");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonRestaurar.setText("Restaurar");
        botonRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaurarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoTextoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cajaCombinadaGenerosCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonRestaurar)
                .addGap(68, 68, 68)
                .addComponent(botonCancelar)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoTextoClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoTextoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(campoTextoInterprete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campoTextoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaCombinadaGenerosCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(campoTextoAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(campoTextoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar)
                    .addComponent(botonRestaurar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed

        // Si la operación es Agregar o Actualizar
        if ((operacion == ConstantesGUI.AGREGAR) || (operacion == ConstantesGUI.ACTUALIZAR)) {
            // Toma los valores capturados en los campos de texto y en la caja
            // combinada y almacénalos en el parámetro cancion.
            cancion.setTitulo(campoTextoTitulo.getText());
            cancion.setInterprete(campoTextoInterprete.getText());
            cancion.setAutor(campoTextoAutor.getText());
            cancion.setGenero((Genero) cajaCombinadaGenerosCanciones.getSelectedItem());
            cancion.setAlbum(campoTextoAlbum.getText());
            cancion.setDuracion(Integer.parseInt(campoTextoDuracion.getText()));
        }
        // Borra el contenido de respuesta
        respuesta.delete(0, respuesta.length());
        // Establece que se presionó el botón botonAceptar
        respuesta.append(ConstantesGUI.ACEPTAR);
        // Destruye el cuadro de díalogo
        dispose();

    }//GEN-LAST:event_botonAceptarActionPerformed

    private void botonRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaurarActionPerformed
        // TODO add your handling code here:
        // Restaura el contenido de los campos de texto a su valor original
        // Si la operación es Agregar
        if (operacion == ConstantesGUI.AGREGAR) {
            campoTextoTitulo.setText("");
            campoTextoInterprete.setText("");
            campoTextoAutor.setText("");
            cajaCombinadaGenerosCanciones.setSelectedIndex(0);
            campoTextoAlbum.setText("");
            campoTextoDuracion.setText("");
        }
        // Si la operación es Actualizar
        if (operacion == ConstantesGUI.ACTUALIZAR) {
            campoTextoTitulo.setText(cancion.getTitulo());
            campoTextoInterprete.setText(cancion.getInterprete());
            campoTextoAutor.setText(cancion.getAutor());
            cajaCombinadaGenerosCanciones.setSelectedItem(cancion.getGenero());
            campoTextoAlbum.setText(cancion.getAlbum());
            campoTextoDuracion.setText(new Integer(cancion.getDuracion()).toString());
        }
    }//GEN-LAST:event_botonRestaurarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        // Destruye el cuadro de díalogo
        dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonRestaurar;
    private javax.swing.JComboBox<String> cajaCombinadaGenerosCanciones;
    private javax.swing.JTextField campoTextoAlbum;
    private javax.swing.JTextField campoTextoAutor;
    private javax.swing.JTextField campoTextoClave;
    private javax.swing.JTextField campoTextoDuracion;
    private javax.swing.JTextField campoTextoInterprete;
    private javax.swing.JTextField campoTextoTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
    private Cancion cancion;
    private DefaultComboBoxModel listaGenerosCanciones;
    private int operacion;
    private StringBuffer respuesta;

}
