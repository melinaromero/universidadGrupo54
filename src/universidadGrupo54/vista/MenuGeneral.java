/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;




/**
 *
 * @author Otras
 */
public class MenuGeneral extends javax.swing.JFrame {

    

    /**
     * Creates new form MenuGeneral
     */
    public MenuGeneral() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(600, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono=new ImageIcon(getClass().getResource("/universidadulpgrupo54/recursos/LogoULP.png"));
        Image miImagen=icono.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar3 = new javax.swing.JMenuBar();
        alumno = new javax.swing.JMenu();
        FormularioAlumnoView = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        FormularioMateriaView = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMmanipulacionDeDatos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setPreferredSize(new java.awt.Dimension(700, 600));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );

        alumno.setForeground(new java.awt.Color(0, 51, 102));
        alumno.setText("Alumno");
        alumno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        FormularioAlumnoView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FormularioAlumnoView.setForeground(new java.awt.Color(0, 51, 102));
        FormularioAlumnoView.setText("Formulario de Alumnos");
        FormularioAlumnoView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioAlumnoViewActionPerformed(evt);
            }
        });
        alumno.add(FormularioAlumnoView);

        jMenuBar3.add(alumno);

        jMenu8.setForeground(new java.awt.Color(0, 51, 102));
        jMenu8.setText("Materia");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        FormularioMateriaView.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        FormularioMateriaView.setForeground(new java.awt.Color(0, 51, 102));
        FormularioMateriaView.setText("Formulario de Materias");
        FormularioMateriaView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormularioMateriaViewActionPerformed(evt);
            }
        });
        jMenu8.add(FormularioMateriaView);

        jMenuBar3.add(jMenu8);

        jMenu1.setForeground(new java.awt.Color(0, 51, 102));
        jMenu1.setText("Administracion ");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 51, 102));
        jMenuItem3.setText("Manejo de Inscripciones");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMmanipulacionDeDatos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jMmanipulacionDeDatos.setForeground(new java.awt.Color(0, 51, 102));
        jMmanipulacionDeDatos.setText("Manipulacion de Datos");
        jMmanipulacionDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMmanipulacionDeDatosActionPerformed(evt);
            }
        });
        jMenu1.add(jMmanipulacionDeDatos);

        jMenuBar3.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 51, 102));
        jMenu2.setText("Consultas");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jMenuItem5.setText("Alumnos por Materia");
        jMenu2.add(jMenuItem5);

        jMenuBar3.add(jMenu2);

        MenuSalir.setForeground(new java.awt.Color(0, 51, 102));
        MenuSalir.setText("Salir");
        MenuSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSalirMouseClicked(evt);
            }
        });
        jMenuBar3.add(MenuSalir);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSalirMouseClicked
        // TODO add your handling code here:
         System.exit(0);
    }//GEN-LAST:event_MenuSalirMouseClicked

    private void FormularioAlumnoViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioAlumnoViewActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioAlumnoView  alumno = new FormularioAlumnoView ();
        alumno.setVisible(true);
        alumno.getContentPane().setBackground(new Color(255, 153, 255));
        escritorio.add(alumno);
        escritorio.moveToFront(alumno);
    }//GEN-LAST:event_FormularioAlumnoViewActionPerformed

    private void FormularioMateriaViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormularioMateriaViewActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        FormularioMateria fm = new FormularioMateria();
        fm.setVisible(true);
        fm.getContentPane().setBackground(new Color(255, 193, 255));
        escritorio.add(fm);
        escritorio.moveToFront(fm);
    }//GEN-LAST:event_FormularioMateriaViewActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMmanipulacionDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMmanipulacionDeDatosActionPerformed
      
    }//GEN-LAST:event_jMmanipulacionDeDatosActionPerformed

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
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGeneral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem FormularioAlumnoView;
    private javax.swing.JMenuItem FormularioMateriaView;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenu alumno;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMmanipulacionDeDatos;
    // End of variables declaration//GEN-END:variables
}
