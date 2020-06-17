/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.AlumnoData;
import CONTROLADOR.CursadaData;
import CONTROLADOR.MateriaData;
import MODELO.Alumno;
import MODELO.Cursada1;
import MODELO.Materia;
import java.time.LocalDate;
import javaapplication59.Conexion;
import java.util.*;
/**
 *
 * @author Sergio
 */
public class NewClass {
    
     public static void main(String[] args) {
        // TODO code application logic here
       
        
         try {
             
             //CREAR ALUMNOS DE CLASE ALUMNO
             
             Alumno lucas= new Alumno("lucas miranda",LocalDate.of(1983,4,12),true);
             Alumno daniel= new Alumno("daniel lescano",LocalDate.of(1983,1,21),false);
             Alumno romina= new Alumno("romina aguero",LocalDate.of(2000,8,2),true);
             
             //CREAR CONECCION A LA BD, CON LA CLASE CONEXION
             Conexion coneccion= new Conexion ();
             
             // CREAR EL CONTROLADOR ALUMNODATA PARA GUARDAR LOS ALUMNOS CREADOS EN LA BD
             AlumnoData ad=new AlumnoData(coneccion);
             
            //GUARDAR LOS ALUMNOS EN LA BD            
            ad.guardarAlumno(lucas);
            ad.guardarAlumno(daniel);
            ad.guardarAlumno(romina);
            
            //BORRAR ALUMNO
            ad.borrarAlumno(16);
          
            //PUNTO 5) MODIFICAR ALUMNO
            lucas.setNombre("Mario");
            ad.actualizarAlumno(lucas);
            
            
            //PUNTO 2) LISTAR LISTA DE ALUMNOS
                     
            for(Alumno al : ad.obtenerAlumnos()){
                System.out.println(al);
           
            } 

           //CREAR MATERIAS
           Materia lab1 =new Materia("Lab1");  
           Materia mat =new Materia("mat");
           
           //CREAR EL CONTROLADOR DE MATERIAS
           MateriaData md=new MateriaData(coneccion);
           
           //GUARDAR LAS MATERIAS CREADAS EN LA BD
           md.guardarMateria(mat);
           md.guardarMateria(lab1);
           
           //PUNTO 5) MODIFICAR MATERIA
           
           lab1.setNombre("laboratorio1Cambiado");
           md.actualizarMateria(lab1);
        
           //CREAR CURSADA
           
           Cursada1 cs=new Cursada1(romina,mat,9);
           Cursada1 cs1=new Cursada1(romina,lab1,8);
           
                    
           
           //CREAR CONTROLADOR DE CURSADA
           CursadaData cd=new CursadaData(coneccion);
           
           //PUNTO 3) INSCRIBIR / DESINSCRIBIR MATERIA
           cd.guardarCursada(cs);
           cd.borrarCursadaDeUnaMateriaDeunAlumno(1, 1);
           
           
           // PUNTO 4) ACTUALIZAR NOTA CURSADA
          
           cd.actualizarNotaCursada(1, 1, 10);
           
           //PASAR CURSADA AL ALUMNO
           
           cd.guardarCursada(cs);
           cd.guardarCursada(cs1);
           
        // PUNTO 1) MOSTRAR LA LISTA DE MATERIAS CURSADAS
        List<Materia> materias=(List<Materia>) cd.obtenerMateriasCursadas(2);
                    
       Iterator it=materias.iterator(); //recorre el objeto 
        while  (it.hasNext()){ //mientras que el iterador hasta el fin de las materias agregadas
                  
        System.out.println("Materia: "+it.next()); //imprime la materia
        }
        
           
           //EXCEPCION POR SI HAY ERRORES DE CONECCION
           
         } catch (ClassNotFoundException ex) {
             System.out.println("Error en la conexion");
         }
        
    }
    

}
