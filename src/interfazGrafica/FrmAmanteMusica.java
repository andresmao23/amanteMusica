/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazGrafica;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author asus
 */
public class FrmAmanteMusica extends javax.swing.JFrame {

    /**
     * Creates new form FrmAmanteMusica
     */
    public FrmAmanteMusica() {
        initComponents();
        centraVentana();
    }

    private void centraVentana() {
        //Obtiene el tamaño de la pantalla
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Obtiene el tamaño de la ventana de la aplicación
        Dimension frameSize = getSize();
        // Se asegura que el tamaño de la ventana de la aplicación
        // no exceda el tamaño de la pantalla
        if (frameSize.height > screenSize.height) {
            frameSize.height = screenSize.height;
        }
        if (frameSize.width > screenSize.width) {
            frameSize.width = screenSize.width;
        }
        // Centra la ventana de la aplicación sobre la pantalla
        setLocation((screenSize.width - frameSize.width) / 2,
                (screenSize.height - frameSize.height) / 2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menuCatalogos = new javax.swing.JMenu();
        menuCatalogoCanciones = new javax.swing.JMenu();
        opcionMenuAgregarCancion = new javax.swing.JMenuItem();
        opcionMenuActualizarCancion = new javax.swing.JMenuItem();
        opcionMenuEliminarCancion = new javax.swing.JMenuItem();
        menuCatalogoPeliculas = new javax.swing.JMenu();
        opcionMenuAgregarPelicula = new javax.swing.JMenuItem();
        opcionMenuActualizarPelicula = new javax.swing.JMenuItem();
        opcionMenuEliminarPelicula = new javax.swing.JMenuItem();
        menuCatalogoGeneros = new javax.swing.JMenu();
        opcionMenuAgregarGenero = new javax.swing.JMenuItem();
        opcionMenuActualizarGenero = new javax.swing.JMenuItem();
        opcionMenuEliminarGenero = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        opcionMenuSalir = new javax.swing.JMenuItem();
        menuConsultas = new javax.swing.JMenu();
        opcionMenuConsultaCanciones = new javax.swing.JMenu();
        opcionMenuConsultaCancionesTodas = new javax.swing.JMenuItem();
        opcionMenuConsultaCancionesTitulo = new javax.swing.JMenuItem();
        opcionMenuConsultaCancionesInterprete = new javax.swing.JMenuItem();
        opcionMenuConsultaCancionesAutor = new javax.swing.JMenuItem();
        opcionMenuConsultaCancionesGenero = new javax.swing.JMenuItem();
        opcionMenuConsultaCancionesAlbum = new javax.swing.JMenuItem();
        opcionMenuConsultaPeliculas = new javax.swing.JMenu();
        opcionMenuConsultaPeliculasTodas = new javax.swing.JMenuItem();
        opcionMenuConsultaPeliculasTitulo = new javax.swing.JMenuItem();
        opcionMenuConsultaPeliculasActor = new javax.swing.JMenuItem();
        opcionMenuConsultaPeliculasDirector = new javax.swing.JMenuItem();
        opcionMenuConsultaPeliculasGenero = new javax.swing.JMenuItem();
        opcionMenuConsultaGeneros = new javax.swing.JMenu();
        opcionMenuConsultaGenerosTodos = new javax.swing.JMenuItem();
        opcionMenuConsultaGenerosCancion = new javax.swing.JMenuItem();
        opcionMenuConsultaGenerosPelicula = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        opcionMenuContenido = new javax.swing.JMenuItem();
        opcionMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Amante Música");

        menuCatalogos.setMnemonic('f');
        menuCatalogos.setText("Catalogos");

        menuCatalogoCanciones.setText("Catálogo de canciones");

        opcionMenuAgregarCancion.setText("Agregar canción");
        menuCatalogoCanciones.add(opcionMenuAgregarCancion);

        opcionMenuActualizarCancion.setText("Actualizar canción");
        menuCatalogoCanciones.add(opcionMenuActualizarCancion);

        opcionMenuEliminarCancion.setText("Eliminar canción");
        menuCatalogoCanciones.add(opcionMenuEliminarCancion);

        menuCatalogos.add(menuCatalogoCanciones);

        menuCatalogoPeliculas.setText("Catálogo de películas");

        opcionMenuAgregarPelicula.setText("Agregar película");
        menuCatalogoPeliculas.add(opcionMenuAgregarPelicula);

        opcionMenuActualizarPelicula.setText("Actualizar película");
        menuCatalogoPeliculas.add(opcionMenuActualizarPelicula);

        opcionMenuEliminarPelicula.setText("Eliminar película");
        menuCatalogoPeliculas.add(opcionMenuEliminarPelicula);

        menuCatalogos.add(menuCatalogoPeliculas);

        menuCatalogoGeneros.setText("Catálogo de generos");

        opcionMenuAgregarGenero.setText("Agregar género");
        menuCatalogoGeneros.add(opcionMenuAgregarGenero);

        opcionMenuActualizarGenero.setText("Actualizar género");
        menuCatalogoGeneros.add(opcionMenuActualizarGenero);

        opcionMenuEliminarGenero.setText("Eliminar género");
        menuCatalogoGeneros.add(opcionMenuEliminarGenero);

        menuCatalogos.add(menuCatalogoGeneros);
        menuCatalogos.add(jSeparator1);

        opcionMenuSalir.setMnemonic('x');
        opcionMenuSalir.setText("Salir");
        opcionMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuSalirActionPerformed(evt);
            }
        });
        menuCatalogos.add(opcionMenuSalir);

        menuBar.add(menuCatalogos);

        menuConsultas.setMnemonic('e');
        menuConsultas.setText("Consultas");

        opcionMenuConsultaCanciones.setText("Consultar canciones");

        opcionMenuConsultaCancionesTodas.setText("Todas");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesTodas);

        opcionMenuConsultaCancionesTitulo.setText("Por título");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesTitulo);

        opcionMenuConsultaCancionesInterprete.setText("Por interprete");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesInterprete);

        opcionMenuConsultaCancionesAutor.setText("Por autor");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesAutor);

        opcionMenuConsultaCancionesGenero.setText("Por género");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesGenero);

        opcionMenuConsultaCancionesAlbum.setText("Por álbum");
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesAlbum);

        menuConsultas.add(opcionMenuConsultaCanciones);

        opcionMenuConsultaPeliculas.setText("Consultar películas");

        opcionMenuConsultaPeliculasTodas.setText("Todas");
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasTodas);

        opcionMenuConsultaPeliculasTitulo.setText("Por título");
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasTitulo);

        opcionMenuConsultaPeliculasActor.setText("Por actor");
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasActor);

        opcionMenuConsultaPeliculasDirector.setText("Por director");
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasDirector);

        opcionMenuConsultaPeliculasGenero.setText("Por género");
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasGenero);

        menuConsultas.add(opcionMenuConsultaPeliculas);

        opcionMenuConsultaGeneros.setText("Consultar generos");

        opcionMenuConsultaGenerosTodos.setText("Todos");
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosTodos);

        opcionMenuConsultaGenerosCancion.setText("De canción");
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosCancion);

        opcionMenuConsultaGenerosPelicula.setText("De película");
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosPelicula);

        menuConsultas.add(opcionMenuConsultaGeneros);

        menuBar.add(menuConsultas);

        menuAyuda.setMnemonic('h');
        menuAyuda.setText("Ayuda");

        opcionMenuContenido.setMnemonic('c');
        opcionMenuContenido.setText("Contenido");
        menuAyuda.add(opcionMenuContenido);

        opcionMenuAcercaDe.setMnemonic('a');
        opcionMenuAcercaDe.setText("Acerca de");
        menuAyuda.add(opcionMenuAcercaDe);

        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcionMenuSalirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAmanteMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAmanteMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAmanteMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAmanteMusica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAmanteMusica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuCatalogoCanciones;
    private javax.swing.JMenu menuCatalogoGeneros;
    private javax.swing.JMenu menuCatalogoPeliculas;
    private javax.swing.JMenu menuCatalogos;
    private javax.swing.JMenu menuConsultas;
    private javax.swing.JMenuItem opcionMenuAcercaDe;
    private javax.swing.JMenuItem opcionMenuActualizarCancion;
    private javax.swing.JMenuItem opcionMenuActualizarGenero;
    private javax.swing.JMenuItem opcionMenuActualizarPelicula;
    private javax.swing.JMenuItem opcionMenuAgregarCancion;
    private javax.swing.JMenuItem opcionMenuAgregarGenero;
    private javax.swing.JMenuItem opcionMenuAgregarPelicula;
    private javax.swing.JMenu opcionMenuConsultaCanciones;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesAlbum;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesAutor;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesGenero;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesInterprete;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesTitulo;
    private javax.swing.JMenuItem opcionMenuConsultaCancionesTodas;
    private javax.swing.JMenu opcionMenuConsultaGeneros;
    private javax.swing.JMenuItem opcionMenuConsultaGenerosCancion;
    private javax.swing.JMenuItem opcionMenuConsultaGenerosPelicula;
    private javax.swing.JMenuItem opcionMenuConsultaGenerosTodos;
    private javax.swing.JMenu opcionMenuConsultaPeliculas;
    private javax.swing.JMenuItem opcionMenuConsultaPeliculasActor;
    private javax.swing.JMenuItem opcionMenuConsultaPeliculasDirector;
    private javax.swing.JMenuItem opcionMenuConsultaPeliculasGenero;
    private javax.swing.JMenuItem opcionMenuConsultaPeliculasTitulo;
    private javax.swing.JMenuItem opcionMenuConsultaPeliculasTodas;
    private javax.swing.JMenuItem opcionMenuContenido;
    private javax.swing.JMenuItem opcionMenuEliminarCancion;
    private javax.swing.JMenuItem opcionMenuEliminarGenero;
    private javax.swing.JMenuItem opcionMenuEliminarPelicula;
    private javax.swing.JMenuItem opcionMenuSalir;
    // End of variables declaration//GEN-END:variables

}
