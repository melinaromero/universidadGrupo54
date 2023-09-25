/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import universidadGrupo54.accesoADatos.AlumnoData;
import universidadGrupo54.entidades.Alumno;

/**
 *
 * @author xavie
 */
public class FormularioporAlumno extends javax.swing.JInternalFrame {

    private AlumnoData aluData = new AlumnoData();
    private Alumno alumnoActual = null;

    /**
     * /**
     * Creates new form FormularioporAlumno
     */
    public FormularioporAlumno() {
        initComponents();
        imagen6_gif_guardar();
        limpiarCampos();
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

        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLbuscar2 = new javax.swing.JLabel();
        jDfechaNac = new com.toedter.calendar.JDateChooser();
        jTapellido = new javax.swing.JTextField();
        jBbuscar = new javax.swing.JButton();
        jTdoc = new javax.swing.JTextField();
        jTnombre = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
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
        getContentPane().add(jDfechaNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 160, -1));

        jTapellido.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 175, 20));

        jBbuscar.setBackground(new java.awt.Color(102, 102, 102));
        jBbuscar.setText("Buscar");
        jBbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jBbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, -1, 30));

        jTdoc.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTdoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 109, 175, 20));

        jTnombre.setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().add(jTnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 175, 20));
        getContentPane().add(jRestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

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
        jLabel5.setText("Fecha de Nacimiento:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jBnuevo.setBackground(new java.awt.Color(102, 102, 102));
        jBnuevo.setText("Nuevo");
        jBnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBnuevoActionPerformed(evt);
            }
        });
        getContentPane().add(jBnuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 380, -1, -1));

        jBeliminar.setBackground(new java.awt.Color(102, 102, 102));
        jBeliminar.setText("Eliminar");
        jBeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBeliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(124, 380, -1, -1));

        jBguardar.setBackground(new java.awt.Color(102, 102, 102));
        jBguardar.setText("Guardar");
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 380, -1, -1));

        jBsalir.setBackground(new java.awt.Color(102, 102, 102));
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM7.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 91));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/55.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 450));

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        try {
            Integer dni = Integer.parseInt(jTdoc.getText());
            alumnoActual = aluData.buscarAlumnoPorDni(dni);
            if (alumnoActual != null) {
                jTapellido.setText(alumnoActual.getApellido().toLowerCase());
                jTnombre.setText(alumnoActual.getNombre().toLowerCase());
                jRestado.setSelected(alumnoActual.isEstado());
                LocalDate lc = alumnoActual.getFechaNacimiento();
                java.util.Date date = java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());//genera un instant
                jDfechaNac.setDate(date);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI válido. ");
        }

    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jBnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBnuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        alumnoActual = null;
    }//GEN-LAST:event_jBnuevoActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
        if (alumnoActual != null) {
            aluData.eliminarAlumno(alumnoActual.getIdAlumno());
            alumnoActual = null;
            limpiarCampos();

        } else {
            JOptionPane.showMessageDialog(this, "No hay un alumno seleccionado. ");
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        try {
            Integer dni = Integer.parseInt(jTdoc.getText());
            String apellido = jTapellido.getText().toLowerCase();
            String nombre = jTnombre.getText().toLowerCase();
            if (nombre.isEmpty() || apellido.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No pueden existir campos vacios. ");
                return;
            }
            java.util.Date sfecha = jDfechaNac.getDate();
            LocalDate fechaNac = sfecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado = jRestado.isSelected();
            if (alumnoActual == null) {

                alumnoActual = new Alumno(dni, apellido, nombre, fechaNac, estado);
                aluData.guardarAlumno(alumnoActual);

            } else {
                alumnoActual.setDni(dni);
                alumnoActual.setApellido(apellido);
                alumnoActual.setNombre(nombre);
                alumnoActual.setFechaNacimiento(fechaNac);
                aluData.modificarAlumno(alumnoActual);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un numero de DNI válido. ");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        dispose();

    }//GEN-LAST:event_jBsalirActionPerformed
    private void limpiarCampos() {
        jTdoc.setText("");
        jTapellido.setText("");
        jTnombre.setText("");
        jRestado.setSelected(true);
        jDfechaNac.setDate(new Date());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBnuevo;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDfechaNac;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLbuscar2;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JTextField jTapellido;
    private javax.swing.JTextField jTdoc;
    private javax.swing.JTextField jTnombre;
    // End of variables declaration//GEN-END:variables
}
