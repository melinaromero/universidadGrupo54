/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import universidadGrupo54b.AccesoADatos.AlumnoData;
import universidadGrupo54b.AccesoADatos.InscripcionData;
import universidadGrupo54b.AccesoADatos.MateriaData;
import universidadGrupo54b.entidades.Alumno;
import universidadGrupo54b.entidades.Inscripcion;
import universidadGrupo54b.entidades.Materia;

/**
 *
 * @author Otras
 */
public class CargaDeNotas extends javax.swing.JInternalFrame {
    private List<Alumno>listaA;
    private List<Inscripcion> list;

    private InscripcionData inscData;
    private MateriaData matData;
    private AlumnoData aluData;
    
    private DefaultTableModel modelo;

   

    /**
     * Creates new form FormularioDeInscripcionView
     */
    public CargaDeNotas() {
        initComponents();

        aluData = new AlumnoData();
        listaA = aluData.listarAlumnos();

        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        matData = new MateriaData();

        cargaAlumnos();
        armarCabecera();
        //cargarNotas();
        cargarDatosMateriasInscriptas();
//        cargarNotas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jCBoxAlumno = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTable = new javax.swing.JTable();
        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextNota = new javax.swing.JTextField();
        jRestado = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Carga de Notas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 102));
        jLabel2.setText("Seleccionar un Alumno:");

        jCBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBoxAlumnoActionPerformed(evt);
            }
        });
        jCBoxAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jCBoxAlumnoKeyReleased(evt);
            }
        });

        jTTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTTable);

        jBGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBGuardar.setForeground(new java.awt.Color(0, 51, 102));
        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBSalir.setForeground(new java.awt.Color(0, 51, 102));
        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jButton1.setText("ActualizarNota");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Ingrese la nota que desea Modificar:");

        jRestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRestadoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("MOSTRAR DATOS DEL ALUMNO INSCRIPTO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextNota, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBGuardar)
                        .addGap(72, 72, 72)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(102, 102, 102))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(44, 44, 44)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRestado)
                                    .addComponent(jCBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jCBoxAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRestado)
                    .addComponent(jLabel4))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBGuardar)
                            .addComponent(jBSalir))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        // TODO add your handling code here:
//        double notaNueva;
//        int filaSeleccionada = jTTable.getSelectedRow();
//        if (filaSeleccionada != -1) {
//            Alumno a = (Alumno) jCBoxAlumno.getSelectedItem();
//            int idMateria = (Integer) jTTable.getValueAt(filaSeleccionada, 0);
//
//            try {
//                notaNueva = Double.parseDouble(jTextNota.getText());
//                inscData.actualizarNota((int) notaNueva, a.getIdAlumno(), idMateria);
//
//                // Borrar las filas de la tabla (si es necesario)
//                borrarFilasTabla();
//            } catch (NumberFormatException ex) {
//                JOptionPane.showMessageDialog(this, "Por favor, ingrese una nota válida.");
//            }
//        }


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jCBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBoxAlumnoActionPerformed
        cargaAlumnos();

    }//GEN-LAST:event_jCBoxAlumnoActionPerformed

    private void jCBoxAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jCBoxAlumnoKeyReleased
        // TODO add your handling code here:
        List<Inscripcion> list=inscData.obtenerInscripciones();
        
        
        
        
    }//GEN-LAST:event_jCBoxAlumnoKeyReleased

    private void jRestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRestadoActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
        jRestado.setSelected(true);
        cargarDatosMateriasInscriptas();
//        jBanularInscripcion.setEnabled(true);
//        jBinscribir.setEnabled(false);
//        
        
    }//GEN-LAST:event_jRestadoActionPerformed

    private void jTTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTTableMouseClicked
//        // TODO add your handling code here:
//        double nota;
//        int filaSeleccionada=jTTable.getSelectedRow();
//        if(filaSeleccionada!=-1){
//        nota = Double.parseDouble(jTTable.getValueAt(filaSeleccionada,  2));
//        }
    }//GEN-LAST:event_jTTableMouseClicked

    private void cargaAlumnos() {//carga alumnos al combo box
        List<Alumno> alumnos = aluData.listarAlumnos();
        for (Alumno alu : alumnos) {
            jCBoxAlumno.addItem(alu);

        }
    }

    private void armarCabecera() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Codigo");
        filaCabecera.add("Nombre");
        filaCabecera.add("Nota");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTTable.setModel(modelo);

    }
    private void cargarDatosMateriasInscriptas(){
    //borrarFilasTabla();
    Alumno selec = (Alumno) jCBoxAlumno.getSelectedItem();
    List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
    for(Materia matData: lista){
            modelo.addRow(new Object[] { matData.getIdMateria(), matData.getNombre()});
            for(Inscripcion insc: list){
    modelo.addRow(new Object[]{insc.getNota()});
    }
    
    }
    }

        private void cargarNotas() {
        borrarFilasTabla();
        Alumno selec = (Alumno) jCBoxAlumno.getSelectedItem();

        List<Materia> listaM = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
        for (Inscripcion in : list) {
            modelo.addRow(new Object[]{in.getMateria().getIdMateria(), in.getMateria().getNombre(), in.getNota()});
        }
    }
//  private void cargarDatosMateriasInscriptas(){
//    //borrarFilasTabla();
//    Alumno selec = (Alumno) jCBoxAlumno.getSelectedItem();
//     List<Inscripcion> lista= (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
//        for (Inscripcion inscData : lista) {
//            modelo.addRow(new Object[]{inscData.getMateria().getIdMateria(), inscData.getMateria().getNombre(), inscData.getNota()});
//        }
//    }
//  
  
  
  
    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
//
//    private void cargarDatosInscripciones() {
//        //borrarFilasTabla();
//        Alumno selec = (Alumno) jCBoxAlumno.getSelectedItem();
//        List<Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
//        for (Inscripcion in : listaI) {
//            modelo.addRow(new Object[]{in.getMateria().getIdMateria(), in.getMateria().getNombre(), in.getNota()});
//        }
//    }
//



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Alumno> jCBoxAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRestado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTTable;
    private javax.swing.JTextField jTextNota;
    // End of variables declaration//GEN-END:variables
}
