/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODELO;

/**
 *
 * @author Sergio
 */
public class Cursada1 {
      private int id=-1;
    private Alumno alumno;
    private Materia materia;
    private int nota;
    
    public Cursada1(Alumno alumno, Materia materia, int nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }
        
    public Cursada1(int id, Alumno alumno, Materia materia, int nota) {
        this.id = id;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Cursada1(){}
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
}


