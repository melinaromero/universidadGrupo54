/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author xavie
 */
public class FormularioporAlumno extends javax.swing.JInternalFrame {

    /**
     * Creates new form FormularioporAlumno
     */
    public FormularioporAlumno() {
        initComponents();
          imagen6_gif_guardar();
    }

    public void imagen6_gif_guardar() {
        ImageIcon buscando;
        buscando = new ImageIcon(getClass().getResource("/imagenes/buscando.gif"));
        Icon gif = new ImageIcon(buscando.getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        jLbuscar2.setIcon(gif);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLbuscar2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jTextField1 = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jBnuevo = new javax.swing.JButton();
        jBeliminar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscando.png"))); // NOI18N
        jLbuscar2.setPreferredSize(new java.awt.Dimension(40, 40));
        getContentPane().add(jLbuscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 30, 40));

        jDateChooser1.setBackground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 313, 120, 20));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 175, 20));

        jBbuscar.setBackground(new java.awt.Color(102, 102, 102));
        jBbuscar.setText("Buscar");
        getContentPane().add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 30));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 109, 175, 20));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 175, 20));
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Documento:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 109, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 159, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 203, -1, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setText("Estado:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setText("Fecha de Nacimineto:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jBnuevo.setBackground(new java.awt.Color(102, 102, 102));
        jBnuevo.setText("Nuevo");
        getContentPane().add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 380, -1, -1));

        jBeliminar.setBackground(new java.awt.Color(102, 102, 102));
        jBeliminar.setText("Eliminar");
        getContentPane().add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 380, -1, -1));

        jBguardar.setBackground(new java.awt.Color(102, 102, 102));
        jBguardar.setText("Guardar");
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 380, -1, -1));

        jBsalir.setBackground(new java.awt.Color(102, 102, 102));
        jBsalir.setText("Salir");
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM7.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 91));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/55.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 450));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbuscar2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
