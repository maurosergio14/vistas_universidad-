/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROLADOR.CursadaData;
import CONTROLADOR.MateriaData;
import MODELO.Materia;
import java.util.logging.Level;
import java.util.logging.Logger;
import javaapplication59.Conexion;

/**
 *
 * @author Sergio
 */
public class MateriasV extends javax.swing.JInternalFrame {

    private Conexion conexion;
    private MateriaData materiaData;

    public MateriasV() {
        initComponents();

        try {
            conexion = new Conexion();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MateriasV.class.getName()).log(Level.SEVERE, null, ex);
        }
        materiaData = new MateriaData(conexion);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbActualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        bjLimpiar = new javax.swing.JButton();
        jtID = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jbBorrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        bjLimpiar.setText("Limpiar");
        bjLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjLimpiarActionPerformed(evt);
            }
        });

        jtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtIDActionPerformed(evt);
            }
        });

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 255));
        jLabel2.setText("-MATERIA-");

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jLabel4.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbBorrar)
                        .addGap(18, 18, 18)
                        .addComponent(jbActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bjLimpiar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(93, 93, 93)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBuscar))
                                .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel2)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(bjLimpiar))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed

        if (jtID.getText() != null) {
            String nombre = jtNombre.getText();
            Materia materia = new Materia(nombre);
            materiaData.actualizarMateria(materia);
        }

    }//GEN-LAST:event_jbActualizarActionPerformed

    private void bjLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjLimpiarActionPerformed
        jtID.setText(null);
        jtNombre.setText(null);

    }//GEN-LAST:event_bjLimpiarActionPerformed

    private void jtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtIDActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        int id = Integer.parseInt(jtID.getText());
        Materia materia = materiaData.buscarMateria(id);
        if (materia != null) {
            jtID.setText(materia.getId() + "");
            jtNombre.setText(materia.getNombre());
        }

    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed

        String nombre;

        Materia materia;

        nombre = jtNombre.getText();
        materia = new Materia(nombre);

        materiaData.guardarMateria(materia);
        jtID.setText(materia.getId() + "");
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed

        int id = Integer.parseInt(jtID.getText());
        materiaData.borrarMateria(id);

    }//GEN-LAST:event_jbBorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bjLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}
