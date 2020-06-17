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
import java.util.ArrayList;
import javaapplication59.Conexion;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class VistasInscripciones extends javax.swing.JInternalFrame {

    public DefaultTableModel modelo;
    public ArrayList<Cursada1> listaCursada;
    public ArrayList<Materia> listaMaterias;
    public CursadaData cursadaData;
    public MateriaData materiaData;
    public AlumnoData alumnoData;
    public ArrayList<Alumno> listaAlumnos;
    public Conexion conexion;

    public VistasInscripciones() {
        initComponents();
        try {
            conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            System.out.println("error en conexion");
        }
        modelo = new DefaultTableModel();

        cursadaData = new CursadaData(conexion);
        listaCursada = (ArrayList) cursadaData.obtenerCursadas();

        materiaData = new MateriaData(conexion);
        listaMaterias = (ArrayList) materiaData.obtenerMaterias();

        alumnoData = new AlumnoData(conexion);
        listaAlumnos = (ArrayList) alumnoData.obtenerAlumnos();
        cargarAlumnos();
        armaCabeceraTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        rbInscriptas = new javax.swing.JRadioButton();
        rbNoInscriptas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tMaterias = new javax.swing.JTable();
        btInscribir = new javax.swing.JButton();
        btAnular = new javax.swing.JButton();
        btSalir = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setText("-FORMULARIO DE INSCRIPCION-");

        jLabel2.setText("ALUMNO");

        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("LISTADO DE MATERIAS");

        rbInscriptas.setText("Inscriptas");

        rbNoInscriptas.setText("No Inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        tMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tMaterias);

        btInscribir.setText("Inscribir");
        btInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInscribirActionPerformed(evt);
            }
        });

        btAnular.setText("Anular Inscripcion");
        btAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAnularActionPerformed(evt);
            }
        });

        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel3))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(rbInscriptas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbNoInscriptas))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(jLabel2)
                            .addGap(27, 27, 27)
                            .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btInscribir)
                        .addGap(48, 48, 48)
                        .addComponent(btAnular)
                        .addGap(49, 49, 49)
                        .addComponent(btSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbAlumnos))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInscriptas)
                    .addComponent(rbNoInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInscribir)
                    .addComponent(btAnular)
                    .addComponent(btSalir))
                .addGap(223, 223, 223))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void armaCabeceraTabla() {
        //asignamos titulos a las columnas
        ArrayList<Object> columnas = new ArrayList<Object>();
        columnas.add("ID");
        columnas.add("Nombre");
        //agregamos a modelo
        for (Object it : columnas) {
            modelo.addColumn(it);
        }
        tMaterias.setModel(modelo);
    }

    public void cargarAlumnos() {//cargar el combox 
        for (Alumno item : listaAlumnos) {
            cbAlumnos.addItem(item);
        }
    }

    public void cargaDatosInscriptas() {
        borraFilasTabla();
        //llenar filas
        CursadaData cd = new CursadaData(conexion);
        Alumno seleccionado = (Alumno) cbAlumnos.getSelectedItem();
        listaMaterias = (ArrayList) cd.obtenerMateriasCursadas(seleccionado.getId());
        for (Materia m : listaMaterias) {
            modelo.addRow(new Object[]{m.getId(), m.getNombre()});
        }
    }

    public void cargaDatosNoInscriptas() {
        borraFilasTabla();
        //llenar filas
        CursadaData cd = new CursadaData(conexion);
        Alumno seleccionado = (Alumno) cbAlumnos.getSelectedItem();
        listaMaterias = (ArrayList) cd.obtenerMateriasNOCursadas(seleccionado.getId());
        for (Materia m : listaMaterias) {
            modelo.addRow(new Object[]{m.getId(), m.getNombre()});
        }
    }

    public void borraFilasTabla() {
        int a = modelo.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }


    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        cargaDatosInscriptas();
        btAnular.setEnabled(true);
        btInscribir.setEnabled(false);
        //borraFilasTabla();
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        cargaDatosNoInscriptas();
        btAnular.setEnabled(false);
        btInscribir.setEnabled(true);
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void btAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAnularActionPerformed
        int filaSeleccionada = tMaterias.getSelectedRow();
        if (filaSeleccionada != -1) {
            Alumno a = (Alumno) cbAlumnos.getSelectedItem();
            int idMateria = (Integer) modelo.getValueAt(filaSeleccionada, 0);
            CursadaData cd = new CursadaData(conexion);
            cd.borrarCursadaDeUnaMateriaDeunAlumno(a.getId(), idMateria);
            borraFilasTabla();
        }


    }//GEN-LAST:event_btAnularActionPerformed

    private void btInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInscribirActionPerformed
      int filaSeleccionada=tMaterias.getSelectedRow();
        System.out.println("Fila seleccionada "+filaSeleccionada);
        if(filaSeleccionada !=-1){
            Alumno a=(Alumno)cbAlumnos.getSelectedItem();
            int idMateria=(Integer)modelo.getValueAt(filaSeleccionada, 0);
            String nombreMateria=(String)modelo.getValueAt(filaSeleccionada, 1);
            Materia m=new Materia(idMateria, nombreMateria);
            Cursada1 c=new Cursada1(a,m,0);
            CursadaData cd=new CursadaData(conexion);
            cd.guardarCursada(c);
            borraFilasTabla();
            
        }
        
    }//GEN-LAST:event_btInscribirActionPerformed

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        dispose();
        
    }//GEN-LAST:event_btSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnular;
    private javax.swing.JButton btInscribir;
    private javax.swing.JButton btSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    private javax.swing.JTable tMaterias;
    // End of variables declaration//GEN-END:variables
}
