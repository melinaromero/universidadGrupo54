/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54.vista;

import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadGrupo54.accesoADatos.AlumnoData;
import universidadGrupo54.accesoADatos.InscripcionData;
import universidadGrupo54.accesoADatos.MateriaData;
import universidadGrupo54.entidades.Alumno;
import universidadGrupo54.entidades.Inscripcion;
import universidadGrupo54.entidades.Materia;

/**
 *
 * @author Otras
 */
public class FormulariodeInscripciones extends javax.swing.JInternalFrame {

    private List<Materia> listaM;
    private List<Alumno> listaA;

    private InscripcionData inscData;
    private MateriaData matData;
    private AlumnoData aluData;

    private DefaultTableModel modelo;

    /**
     * Creates new form FormularioDeInscripcion
     */
    public FormulariodeInscripciones() {
        initComponents();

        aluData = new AlumnoData();
        listaA = aluData.listarAlumnos();
        modelo = new DefaultTableModel();
        inscData = new InscripcionData();
        matData = new MateriaData();

        cargaAlumnos();
        armarCabeceraTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRBmatInscriptas = new javax.swing.JRadioButton();
        jRBNoIncriptas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMateria = new javax.swing.JTable();
        jBinscribir = new javax.swing.JButton();
        jBanularInscripcion = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        CBoxAlumno = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(610, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 118, 645, 10));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 255, 255));
        jLabel1.setText("Formulario de Inscripcion");
        jLabel1.setFocusCycleRoot(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione un Alumno:");
        jLabel2.setFocusCycleRoot(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Listado de Materias");
        jLabel3.setFocusCycleRoot(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, -1, -1));

        jRBmatInscriptas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRBmatInscriptas.setForeground(new java.awt.Color(255, 255, 255));
        jRBmatInscriptas.setText("Materias Inscriptas");
        jRBmatInscriptas.setFocusCycleRoot(true);
        jRBmatInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBmatInscriptasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBmatInscriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jRBNoIncriptas.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jRBNoIncriptas.setForeground(new java.awt.Color(255, 255, 255));
        jRBNoIncriptas.setText("Materias NO Inscriptas");
        jRBNoIncriptas.setFocusCycleRoot(true);
        jRBNoIncriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBNoIncriptasActionPerformed(evt);
            }
        });
        getContentPane().add(jRBNoIncriptas, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, 20));

        jTMateria.setBackground(new java.awt.Color(102, 102, 102));
        jTMateria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTMateria);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, 100));

        jBinscribir.setBackground(new java.awt.Color(102, 102, 102));
        jBinscribir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jBinscribir.setText("Inscribirse");
        jBinscribir.setEnabled(false);
        jBinscribir.setFocusCycleRoot(true);
        jBinscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBinscribirActionPerformed(evt);
            }
        });
        getContentPane().add(jBinscribir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jBanularInscripcion.setBackground(new java.awt.Color(102, 102, 102));
        jBanularInscripcion.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jBanularInscripcion.setText("Anular Inscripcion");
        jBanularInscripcion.setEnabled(false);
        jBanularInscripcion.setFocusCycleRoot(true);
        jBanularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBanularInscripcionActionPerformed(evt);
            }
        });
        getContentPane().add(jBanularInscripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        jBSalir.setBackground(new java.awt.Color(102, 102, 102));
        jBSalir.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jBSalir.setText("Salir");
        jBSalir.setFocusCycleRoot(true);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 430, -1, -1));

        CBoxAlumno.setBackground(new java.awt.Color(153, 255, 255));
        CBoxAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBoxAlumnoActionPerformed(evt);
            }
        });
        getContentPane().add(CBoxAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 322, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/55.jpg"))); // NOI18N
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 80, 590, 400));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FooterUlpVirtualM7.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBmatInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBmatInscriptasActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
        jRBNoIncriptas.setSelected(false);
        cargarDatosMateriasInscriptas();
        jBanularInscripcion.setEnabled(true);
        jBinscribir.setEnabled(false);
        
    }//GEN-LAST:event_jRBmatInscriptasActionPerformed

    private void CBoxAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBoxAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBoxAlumnoActionPerformed

    private void jRBNoIncriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBNoIncriptasActionPerformed
        // TODO add your handling code here:
        borrarFilasTabla();
        jRBmatInscriptas.setSelected(false);
        cargarDatosNoInscriptas();
        jBanularInscripcion.setEnabled(false);
        jBinscribir.setEnabled(true);
    }//GEN-LAST:event_jRBNoIncriptasActionPerformed

    private void jBinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBinscribirActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=jTMateria.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a= (Alumno) CBoxAlumno.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombre=(String)modelo.getValueAt(filaSeleccionada, 1);
            int anioMateria=(Integer)modelo.getValueAt(filaSeleccionada, 2);
            Materia m=new Materia(idMateria, nombre, anioMateria, true);
            
            Inscripcion i=new Inscripcion(a,m,0);
            inscData.guardarInscripcion(i);
            borrarFilasTabla();
    }
    }//GEN-LAST:event_jBinscribirActionPerformed

    private void jBanularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBanularInscripcionActionPerformed
        // TODO add your handling code here:
        int filaSeleccionada=jTMateria.getSelectedRow();
        if(filaSeleccionada!=-1){
            Alumno a=(Alumno)CBoxAlumno.getSelectedItem();
             int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
             
             inscData.borrarInscripcionMateriaAlumno(a.getIdAlumno(), idMateria);
             borrarFilasTabla();   
        }else{
        JOptionPane.showMessageDialog(this, "Debe seleccionar una fila de la tabla. ");
        }
    }//GEN-LAST:event_jBanularInscripcionActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void cargaAlumnos() {//carga alumnos al combo box
        for (Alumno item : listaA) {
            CBoxAlumno.addItem(item);
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Año");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jTMateria.setModel(modelo);

    }

    private void borrarFilasTabla() {
        int indice = modelo.getRowCount() - 1;

        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarDatosNoInscriptas() {
//borrarFilasTabla();
        Alumno selec = (Alumno) CBoxAlumno.getSelectedItem();
        listaM= inscData.obtenerMateriasNOCursadas(selec.getIdAlumno());
        for(Materia matData: listaM){
                modelo.addRow(new Object[] { matData.getIdMateria(), matData.getNombre(), matData.getAnioMateria()});

        }
    }
    
    private void cargarDatosMateriasInscriptas(){
    //borrarFilasTabla();
    Alumno selec = (Alumno) CBoxAlumno.getSelectedItem();
    List <Materia> lista = (ArrayList) inscData.obtenerMateriasCursadas(selec.getIdAlumno());
    for(Materia matData: lista){
            modelo.addRow(new Object[] { matData.getIdMateria(), matData.getNombre(), matData.getAnioMateria()});
    }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Alumno> CBoxAlumno;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jBanularInscripcion;
    private javax.swing.JButton jBinscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRBNoIncriptas;
    private javax.swing.JRadioButton jRBmatInscriptas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTMateria;
    // End of variables declaration//GEN-END:variables
}
