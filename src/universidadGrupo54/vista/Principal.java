/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author xavie
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal1
     */
    public Principal() {
        initComponents();
       this.setLocationRelativeTo(null);
        this.setSize(600, 500);
        imagen_gif_guardar();
        imagen2_gif_guardar();
        imagen3_gif_guardar();

        imagen5_gif_guardar();
    }

    public void imagen_gif_guardar() {
        ImageIcon estudiante;
        estudiante = new ImageIcon(getClass().getResource("/imagenes/estudiante.gif"));
        Icon gif = new ImageIcon(estudiante.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jMalumno.setIcon(gif);

    }

    public void imagen2_gif_guardar() {
        ImageIcon libros2;
        libros2 = new ImageIcon(getClass().getResource("/imagenes/libros2.gif"));
        Icon gif = new ImageIcon(libros2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jMmateria.setIcon(gif);
    }

    public void imagen3_gif_guardar() {
        ImageIcon instalaciones;
        instalaciones = new ImageIcon(getClass().getResource("/imagenes/universidad.gif"));
        Icon gif = new ImageIcon(instalaciones.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jMadministracion.setIcon(gif);
    }

    public void imagen4_gif_guardar() {
        ImageIcon conocimiento;
        conocimiento = new ImageIcon(getClass().getResource("/imagenes/conocimiento.gif"));
        Icon gif = new ImageIcon(conocimiento.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jMconsulta.setIcon(gif);

    }

    public void imagen5_gif_guardar() {
        ImageIcon salida;
        salida = new ImageIcon(getClass().getResource("/imagenes/salida.gif"));
        Icon gif = new ImageIcon(salida.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        jMsalir.setIcon(gif);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMalumno = new javax.swing.JMenu();
        jMeFormularioAlumno = new javax.swing.JMenuItem();
        jMmateria = new javax.swing.JMenu();
        jMFormulariodeMateria = new javax.swing.JMenuItem();
        jMadministracion = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMconsulta = new javax.swing.JMenu();
        AlumnoporMateria = new javax.swing.JMenuItem();
        jMsalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Mongolian Baiti", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BIENVENIDOS");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 300, 100));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/6.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 580, 260));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM7.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        getContentPane().add(escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 320));

        jMalumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estudiante.gif"))); // NOI18N
        jMalumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMalumnoActionPerformed(evt);
            }
        });

        jMeFormularioAlumno.setText("Formulario de Alumno");
        jMeFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMeFormularioAlumnoActionPerformed(evt);
            }
        });
        jMalumno.add(jMeFormularioAlumno);

        jMenuBar1.add(jMalumno);

        jMmateria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/libros (2).gif"))); // NOI18N

        jMFormulariodeMateria.setText("Formulario de Materia");
        jMFormulariodeMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMFormulariodeMateriaActionPerformed(evt);
            }
        });
        jMmateria.add(jMFormulariodeMateria);

        jMenuBar1.add(jMmateria);

        jMadministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/instalaciones.gif"))); // NOI18N

        jMenuItem3.setText("Manejo de Inscripcion");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMadministracion.add(jMenuItem3);

        jMenuItem4.setText("Manipulacion de Notas");
        jMadministracion.add(jMenuItem4);

        jMenuBar1.add(jMadministracion);

        jMconsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/conocimiento.gif"))); // NOI18N

        AlumnoporMateria.setText("AlumnoporMateria");
        jMconsulta.add(AlumnoporMateria);

        jMenuBar1.add(jMconsulta);

        jMsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida (2).gif"))); // NOI18N
        jMsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMsalirActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMsalir);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMalumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMalumnoActionPerformed
        // TODO add your handling code here:
           escritorio.removeAll();
        escritorio.repaint();
        FormularioporAlumno alumno = new FormularioporAlumno ();
        alumno.setVisible(true);

        escritorio.add(alumno);
        escritorio.moveToFront(alumno);
    }//GEN-LAST:event_jMalumnoActionPerformed

    private void jMFormulariodeMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMFormulariodeMateriaActionPerformed
        // TODO add your handling code here:
            escritorio.removeAll();
        escritorio.repaint();
        FomularioporMatria  materia = new FomularioporMatria  ();
        materia.setVisible(true);

        escritorio.add(materia);
        escritorio.moveToFront(materia);
    }//GEN-LAST:event_jMFormulariodeMateriaActionPerformed

    private void jMsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMsalirActionPerformed
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_jMsalirActionPerformed

    private void jMeFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMeFormularioAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMeFormularioAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AlumnoporMateria;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMFormulariodeMateria;
    private javax.swing.JMenu jMadministracion;
    private javax.swing.JMenu jMalumno;
    private javax.swing.JMenu jMconsulta;
    private javax.swing.JMenuItem jMeFormularioAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu jMmateria;
    private javax.swing.JMenu jMsalir;
    // End of variables declaration//GEN-END:variables
}
