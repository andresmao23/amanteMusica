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
    
    
    
    /*public void despliegaTabla(Tabla tabla) {
        // Crea la tabla a partir del modelo de la tabla con los valores
        // de los titulos de las columnas y los valores de las celdas
        jtabla = new javax.swing.JTable(tabla.getModeloTabla());
        // Establece el título de la tabla
        tituloTabla.setText(tabla.getTitulo());
        // Hace que el control del tamaño de la tabla y la porción visible
        // lo tenga la barra de deslizamiento y no la tabla
        jtabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jtabla.setAutoscrolls(false);
        // Hace visible la tabla dentro del panel con barras de
        // deslizamiento
        jScrollPane1.setViewportView(jtabla);
    }*/
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tituloTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        tituloTabla.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloTabla.setText("jLabel1");

        jScrollPane1.setBorder(null);

        menuCatalogos.setMnemonic('f');
        menuCatalogos.setText("Catalogos");

        menuCatalogoCanciones.setText("Catálogo de canciones");

        opcionMenuAgregarCancion.setText("Agregar canción");
        opcionMenuAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarCancionActionPerformed(evt);
            }
        });
        menuCatalogoCanciones.add(opcionMenuAgregarCancion);

        opcionMenuActualizarCancion.setText("Actualizar canción");
        opcionMenuActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuActualizarCancionActionPerformed(evt);
            }
        });
        menuCatalogoCanciones.add(opcionMenuActualizarCancion);

        opcionMenuEliminarCancion.setText("Eliminar canción");
        opcionMenuEliminarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuEliminarCancionActionPerformed(evt);
            }
        });
        menuCatalogoCanciones.add(opcionMenuEliminarCancion);

        menuCatalogos.add(menuCatalogoCanciones);

        menuCatalogoPeliculas.setText("Catálogo de películas");

        opcionMenuAgregarPelicula.setText("Agregar película");
        opcionMenuAgregarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarPeliculaActionPerformed(evt);
            }
        });
        menuCatalogoPeliculas.add(opcionMenuAgregarPelicula);

        opcionMenuActualizarPelicula.setText("Actualizar película");
        opcionMenuActualizarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuActualizarPeliculaActionPerformed(evt);
            }
        });
        menuCatalogoPeliculas.add(opcionMenuActualizarPelicula);

        opcionMenuEliminarPelicula.setText("Eliminar película");
        opcionMenuEliminarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuEliminarPeliculaActionPerformed(evt);
            }
        });
        menuCatalogoPeliculas.add(opcionMenuEliminarPelicula);

        menuCatalogos.add(menuCatalogoPeliculas);

        menuCatalogoGeneros.setText("Catálogo de generos");

        opcionMenuAgregarGenero.setText("Agregar género");
        opcionMenuAgregarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAgregarGeneroActionPerformed(evt);
            }
        });
        menuCatalogoGeneros.add(opcionMenuAgregarGenero);

        opcionMenuActualizarGenero.setText("Actualizar género");
        opcionMenuActualizarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuActualizarGeneroActionPerformed(evt);
            }
        });
        menuCatalogoGeneros.add(opcionMenuActualizarGenero);

        opcionMenuEliminarGenero.setText("Eliminar género");
        opcionMenuEliminarGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuEliminarGeneroActionPerformed(evt);
            }
        });
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
        opcionMenuConsultaCancionesTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesTodasActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesTodas);

        opcionMenuConsultaCancionesTitulo.setText("Por título");
        opcionMenuConsultaCancionesTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesTituloActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesTitulo);

        opcionMenuConsultaCancionesInterprete.setText("Por interprete");
        opcionMenuConsultaCancionesInterprete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesInterpreteActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesInterprete);

        opcionMenuConsultaCancionesAutor.setText("Por autor");
        opcionMenuConsultaCancionesAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesAutorActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesAutor);

        opcionMenuConsultaCancionesGenero.setText("Por género");
        opcionMenuConsultaCancionesGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesGeneroActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesGenero);

        opcionMenuConsultaCancionesAlbum.setText("Por álbum");
        opcionMenuConsultaCancionesAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaCancionesAlbumActionPerformed(evt);
            }
        });
        opcionMenuConsultaCanciones.add(opcionMenuConsultaCancionesAlbum);

        menuConsultas.add(opcionMenuConsultaCanciones);

        opcionMenuConsultaPeliculas.setText("Consultar películas");

        opcionMenuConsultaPeliculasTodas.setText("Todas");
        opcionMenuConsultaPeliculasTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaPeliculasTodasActionPerformed(evt);
            }
        });
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasTodas);

        opcionMenuConsultaPeliculasTitulo.setText("Por título");
        opcionMenuConsultaPeliculasTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaPeliculasTituloActionPerformed(evt);
            }
        });
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasTitulo);

        opcionMenuConsultaPeliculasActor.setText("Por actor");
        opcionMenuConsultaPeliculasActor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaPeliculasActorActionPerformed(evt);
            }
        });
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasActor);

        opcionMenuConsultaPeliculasDirector.setText("Por director");
        opcionMenuConsultaPeliculasDirector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaPeliculasDirectorActionPerformed(evt);
            }
        });
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasDirector);

        opcionMenuConsultaPeliculasGenero.setText("Por género");
        opcionMenuConsultaPeliculasGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaPeliculasGeneroActionPerformed(evt);
            }
        });
        opcionMenuConsultaPeliculas.add(opcionMenuConsultaPeliculasGenero);

        menuConsultas.add(opcionMenuConsultaPeliculas);

        opcionMenuConsultaGeneros.setText("Consultar generos");

        opcionMenuConsultaGenerosTodos.setText("Todos");
        opcionMenuConsultaGenerosTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaGenerosTodosActionPerformed(evt);
            }
        });
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosTodos);

        opcionMenuConsultaGenerosCancion.setText("De canción");
        opcionMenuConsultaGenerosCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaGenerosCancionActionPerformed(evt);
            }
        });
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosCancion);

        opcionMenuConsultaGenerosPelicula.setText("De película");
        opcionMenuConsultaGenerosPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuConsultaGenerosPeliculaActionPerformed(evt);
            }
        });
        opcionMenuConsultaGeneros.add(opcionMenuConsultaGenerosPelicula);

        menuConsultas.add(opcionMenuConsultaGeneros);

        menuBar.add(menuConsultas);

        menuAyuda.setMnemonic('h');
        menuAyuda.setText("Ayuda");

        opcionMenuContenido.setMnemonic('c');
        opcionMenuContenido.setText("Contenido");
        opcionMenuContenido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuContenidoActionPerformed(evt);
            }
        });
        menuAyuda.add(opcionMenuContenido);

        opcionMenuAcercaDe.setMnemonic('a');
        opcionMenuAcercaDe.setText("Acerca de");
        opcionMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionMenuAcercaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(opcionMenuAcercaDe);

        menuBar.add(menuAyuda);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                    .addComponent(tituloTabla))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloTabla)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcionMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcionMenuSalirActionPerformed

    private void opcionMenuAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuAgregarCancionActionPerformed

    private void opcionMenuActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuActualizarCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuActualizarCancionActionPerformed

    private void opcionMenuEliminarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuEliminarCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuEliminarCancionActionPerformed

    private void opcionMenuAgregarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuAgregarPeliculaActionPerformed

    private void opcionMenuActualizarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuActualizarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuActualizarPeliculaActionPerformed

    private void opcionMenuEliminarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuEliminarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuEliminarPeliculaActionPerformed

    private void opcionMenuAgregarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAgregarGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuAgregarGeneroActionPerformed

    private void opcionMenuActualizarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuActualizarGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuActualizarGeneroActionPerformed

    private void opcionMenuEliminarGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuEliminarGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuEliminarGeneroActionPerformed

    private void opcionMenuConsultaCancionesTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesTodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesTodasActionPerformed

    private void opcionMenuConsultaCancionesTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesTituloActionPerformed

    private void opcionMenuConsultaCancionesInterpreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesInterpreteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesInterpreteActionPerformed

    private void opcionMenuConsultaCancionesAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesAutorActionPerformed

    private void opcionMenuConsultaCancionesGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesGeneroActionPerformed

    private void opcionMenuConsultaCancionesAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaCancionesAlbumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaCancionesAlbumActionPerformed

    private void opcionMenuConsultaPeliculasTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaPeliculasTodasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaPeliculasTodasActionPerformed

    private void opcionMenuConsultaPeliculasTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaPeliculasTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaPeliculasTituloActionPerformed

    private void opcionMenuConsultaPeliculasActorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaPeliculasActorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaPeliculasActorActionPerformed

    private void opcionMenuConsultaPeliculasDirectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaPeliculasDirectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaPeliculasDirectorActionPerformed

    private void opcionMenuConsultaPeliculasGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaPeliculasGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaPeliculasGeneroActionPerformed

    private void opcionMenuConsultaGenerosTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaGenerosTodosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaGenerosTodosActionPerformed

    private void opcionMenuConsultaGenerosCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaGenerosCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaGenerosCancionActionPerformed

    private void opcionMenuConsultaGenerosPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuConsultaGenerosPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuConsultaGenerosPeliculaActionPerformed

    private void opcionMenuContenidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuContenidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuContenidoActionPerformed

    private void opcionMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionMenuAcercaDeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opcionMenuAcercaDeActionPerformed

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
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JLabel tituloTabla;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JTable jtabla;

}
