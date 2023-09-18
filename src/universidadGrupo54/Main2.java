/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadGrupo54;

import universidadGrupo54.accesoADatos.AlumnoData;
import universidadGrupo54.accesoADatos.InscripcionData;
import universidadGrupo54.accesoADatos.MateriaData;
import universidadGrupo54.entidades.Alumno;

/**
 *
 * @author Otras
 */
public class Main2 {
     public static void main(String[] args) {
        // Connection con = Conexion.getConexion
////                AlumnoData aluData=new AlumnoData();
////                MateriaData matData=new MateriaData();
////                InscripcionData id=new InscripcionData();
////                
////                Alumno andres=aluData.buscarAlumno(2);
////                Materia mate=matData.buscarMateria(2);
////                Inscripcion inscripto= new Inscripcion(andres, mate, 9);
//// 
////                for(Inscripcion inscriptos: id.obtenerInscripciones()){
////                    System.out.println("id: "+inscriptos.getIdInscripto());
////                    System.out.println("Apellido: "+inscriptos.getAlumno().getApellido());
////                     System.out.println("Materia: "+inscriptos.getMateria().getNombre());
////                }
                
        
        
        
                AlumnoData aluData=new AlumnoData();
                MateriaData matData=new MateriaData();
                InscripcionData id=new InscripcionData();
                
                for(Alumno alumno:id.obtenerAlumnosXMateria(6)){
                    System.out.println(alumno);
                }
   
}
}