/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Alumnos extends javax.swing.JFrame {

    public Alumnos() {
        initComponents();
        txtId.setVisible(false);
        CargarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelalumno = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAlumnos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDocumento = new javax.swing.JTextField();
        txtTipoDoc = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtTipodesangre = new javax.swing.JTextField();
        txtEps = new javax.swing.JTextField();
        txtNombre_Acudiente = new javax.swing.JTextField();
        txtDireccionAcudiente = new javax.swing.JTextField();
        txtCurso = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        rbMasculinoA = new javax.swing.JRadioButton();
        rbFemeninoA = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        txtFechadenacimiento = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        rbMasculinoAcu = new javax.swing.JRadioButton();
        rbFemeninoAcu = new javax.swing.JRadioButton();
        btnguardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtApellidoAcu = new javax.swing.JTextField();
        ckMatriculado = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Alumnos");

        labelalumno.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelalumno.setText("Alumnos");

        tblAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Nombres", "Apellidos", "Documento", "Tipo de documento", "Direccion", "Tipo de sangre", "EPS", "Sexo", "Curso", "Fecha de nacimiento", "Nombre Acudiente", "Apellido Acudiente", "Direccion Acudientel", "sexo", "Telefono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblAlumnos);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N

        jLabel1.setText("Nombres:");

        jLabel2.setText("Apellidos:");

        jLabel3.setText("Documento:");

        jLabel4.setText("Tipo de identificacion:");

        jLabel5.setText("Direccion:");

        jLabel6.setText("Telefono:");

        jLabel7.setText("Tipo de sangre:");

        jLabel8.setText("E.P.S:");

        jLabel9.setText("Nombre Acudiente:");

        jLabel10.setText("Direccion Acudiente:");

        jLabel11.setText("Curso:");

        txtNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombresActionPerformed(evt);
            }
        });

        txtDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoActionPerformed(evt);
            }
        });

        txtTipodesangre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipodesangreActionPerformed(evt);
            }
        });

        txtDireccionAcudiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionAcudienteActionPerformed(evt);
            }
        });

        jLabel12.setText("Sexo:");

        rbMasculinoA.setText("Masculino");
        rbMasculinoA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoAActionPerformed(evt);
            }
        });

        rbFemeninoA.setText("Femenino");

        jLabel13.setText("Fecha de nacimiento:");

        jLabel14.setText("Sexo:");

        rbMasculinoAcu.setText("Masculino");
        rbMasculinoAcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoAcuActionPerformed(evt);
            }
        });

        rbFemeninoAcu.setText("Femenino");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel15.setText("Apellido Acudiente:");

        txtApellidoAcu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAcuActionPerformed(evt);
            }
        });

        ckMatriculado.setText("Matriculado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDocumento)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(txtNombres, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel14)
                            .addComponent(jLabel6)
                            .addComponent(btnguardar)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion)
                            .addComponent(txtTipodesangre)
                            .addComponent(txtEps)
                            .addComponent(txtNombre_Acudiente)
                            .addComponent(txtFechadenacimiento)
                            .addComponent(txtTipoDoc)
                            .addComponent(txtCurso)
                            .addComponent(txtDireccionAcudiente)
                            .addComponent(txtTelefono)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(29, 29, 29)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMasculinoA)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbFemeninoA)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbMasculinoAcu)
                                        .addGap(27, 27, 27)
                                        .addComponent(rbFemeninoAcu)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addComponent(ckMatriculado)))
                                .addContainerGap())
                            .addComponent(txtApellidoAcu)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTipodesangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEps, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(rbMasculinoA)
                    .addComponent(rbFemeninoA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtFechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtNombre_Acudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtApellidoAcu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDireccionAcudiente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(rbMasculinoAcu)
                    .addComponent(rbFemeninoAcu)
                    .addComponent(ckMatriculado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnLimpiar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(labelalumno)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 923, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelalumno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombresActionPerformed

    private void txtDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoActionPerformed

    private void rbMasculinoAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoAActionPerformed

    private void txtDireccionAcudienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionAcudienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionAcudienteActionPerformed

    private void rbMasculinoAcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoAcuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoAcuActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
      String Nombres= txtNombres.getText();
      String Apellidos= txtApellidos.getText();
      String Documento= txtDocumento.getText();
      String TipodeIdentificacion= txtTipoDoc.getText();
      String Direccion= txtDireccion.getText();
      String Tipodesangre= txtTipodesangre.getText();
      String Eps= txtEps.getText();
  
      String Sexo;
      if(rbMasculinoA.isSelected()==true){
          Sexo ="M";
      }else if(rbFemeninoA.isSelected()==true){
      Sexo="F";
      }else{
          Sexo="M";
      }
      String Curso= txtCurso.getText();
      String Fechadenacimiento= txtFechadenacimiento.getText();
      String NombreAcudiente= txtNombre_Acudiente.getText();
      String ApellidoAcudiente= txtApellidoAcu.getText();
       String SexoAcudiente = "M";
      if(rbMasculinoAcu.isSelected()==true){
          Sexo ="M";
      }else if(rbFemeninoAcu.isSelected()==true){
      Sexo="F";
      }else{
          Sexo="M";
      }
      String Telefono = txtTelefono.getText();
      Boolean Matriculado = ckMatriculado.isSelected();
      try{
      Connection con = Conexion.getConexion();
      PreparedStatement ps = con.prepareStatement("INSERT INTO Alumnos (Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Eps,Sexo,curso,Fecha_nacimiento,Nombre_acudiente,Apellido_acudiente,Sexo_acudiente,Telefono,Matriculado) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);");
      ps.setString(1, Nombres);
      ps.setString(2, Apellidos);
      ps.setString(3, Documento);
      ps.setString(4, TipodeIdentificacion);
      ps.setString(5, Direccion);
      ps.setString(6, Tipodesangre);
      ps.setString(7, Eps);
      ps.setString(8, Sexo);
      ps.setString(9, Curso);
      ps.setString(10, Fechadenacimiento);
      ps.setString(11, NombreAcudiente);
      ps.setString(12, ApellidoAcudiente);
      ps.setString(13, SexoAcudiente);
      ps.setString(14, Telefono);
      ps.setBoolean(15, Matriculado);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Alumno Guardado");
      CargarTabla();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.toString());
        }
      
    }//GEN-LAST:event_btnguardarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      int id = Integer.parseInt(txtId.getText());
        String Nombres= txtNombres.getText();
      String Apellidos= txtApellidos.getText();
      String Documento= txtDocumento.getText();
      String TipodeIdentificacion= txtTipoDoc.getText();
      String Direccion= txtDireccion.getText();
      String Tipodesangre= txtTipodesangre.getText();
      String Eps= txtEps.getText();
  
      String Sexo;
      if(rbMasculinoA.isSelected()==true){
          Sexo ="M";
      }else if(rbFemeninoA.isSelected()==true){
      Sexo="F";
      }else{
          Sexo="M";
      }
      String Curso= txtCurso.getText();
      String Fechadenacimiento= txtFechadenacimiento.getText();
      String NombreAcudiente= txtNombre_Acudiente.getText();
      String ApellidoAcudiente= txtApellidoAcu.getText();
       String SexoAcudiente = "M";
      if(rbMasculinoAcu.isSelected()==true){
          Sexo ="M";
      }else if(rbFemeninoAcu.isSelected()==true){
      Sexo="F";
      }else{
          Sexo="M";
      }
      String Telefono = txtTelefono.getText();
      Boolean Matriculado = ckMatriculado.isSelected();
      try{
      Connection con = Conexion.getConexion();
      PreparedStatement ps = con.prepareStatement("UPDATE Alumnos SET  Nombres=?,Apellidos=?,Documento=?,Tipo_identificacion=?,Direccion=?,Tipo_sangre=?,Eps=?,Sexo=?,curso=?,Fecha_nacimiento=?,Nombre_acudiente=?,Apellido_acudiente=?,Sexo_acudiente=?,Telefono=?,Matriculado=? WHERE Id=?");
      ps.setString(1, Nombres);
      ps.setString(2, Apellidos);
      ps.setString(3, Documento);
      ps.setString(4, TipodeIdentificacion);
      ps.setString(5, Direccion);
      ps.setString(6, Tipodesangre);
      ps.setString(7, Eps);
      ps.setString(8, Sexo);
      ps.setString(9, Curso);
      ps.setString(10, Fechadenacimiento);
      ps.setString(11, NombreAcudiente);
      ps.setString(12, ApellidoAcudiente);
      ps.setString(13, SexoAcudiente);
      ps.setString(14, Telefono);
      ps.setBoolean(15, Matriculado);
      ps.setInt(16,id);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Actualizacion exitosa");
      CargarTabla();
      Limpiar();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.toString());
        }
      
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtApellidoAcuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAcuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAcuActionPerformed

    private void txtTipodesangreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipodesangreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipodesangreActionPerformed

    private void tblAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnosMouseClicked
       try{
           int fila = tblAlumnos.getSelectedRow();
           int id = Integer.parseInt(tblAlumnos.getValueAt(fila,0).toString());
           PreparedStatement ps;
           ResultSet rs;
           Connection con = Conexion.getConexion();
             ps = con.prepareStatement("SELECT Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Eps,Sexo,curso,Fecha_nacimiento,Nombre_acudiente,Apellido_acudiente,Sexo_acudiente,Telefono,Matriculado FROM Alumnos WHERE Id=?");
            ps.setInt(1, id);
             rs= ps.executeQuery();
             while(rs.next()){
                 txtId.setText(String.valueOf(id));
                 txtNombres.setText(rs.getString("Nombres"));
                 txtApellidos.setText(rs.getString("Apellidos"));
                 txtDocumento.setText(rs.getString("Documento"));
                 txtTipoDoc.setText(rs.getString("Tipo_identificacion"));
                 txtDireccion.setText(rs.getString("Direccion"));
                 txtTipodesangre.setText(rs.getString("Tipo_sangre"));
                 txtEps.setText(rs.getString("Eps"));
                 if(rs.getString("sexo").equals("M")){
                     rbMasculinoA.setSelected(true);
                 }else if(rs.getString("sexo").equals("F")){
                     rbFemeninoA.setSelected(true);
                 }
                 txtCurso.setText(rs.getString("Curso"));
                 txtFechadenacimiento.setText(rs.getString("Fecha_nacimiento"));
                 txtNombre_Acudiente.setText(rs.getString("Nombre_acudiente"));
                 txtApellidoAcu.setText(rs.getString("Apellido_acudiente"));
                  if(rs.getString("sexo").equals("M")){
                     rbMasculinoAcu.setSelected(true);
                 }else if(rs.getString("sexo").equals("F")){
                     rbFemeninoAcu.setSelected(true);
                 }
                 txtTelefono.setText(rs.getString("Telefono")); 
   
             }
       }
       catch(SQLException e ){
           JOptionPane.showMessageDialog(null, e.toString());
       }
    }//GEN-LAST:event_tblAlumnosMouseClicked

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int id = Integer.parseInt(txtId.getText());
       
      try{
      Connection con = Conexion.getConexion();
      PreparedStatement ps = con.prepareStatement("DELETE FROM Alumnos WHERE Id=?");
      ps.setInt(1,id);
      ps.executeUpdate();
      JOptionPane.showMessageDialog(null,"Alumno Eliminado");
      CargarTabla();
      Limpiar();
      } catch (SQLException e) {
           JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed
   private void Limpiar(){
        txtId.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCurso.setText("");
        txtDireccion.setText("");
        txtDireccionAcudiente.setText("");
        txtNombre_Acudiente.setText("");
        txtDocumento.setText("");
        txtTelefono.setText("");
        txtEps.setText("");
        txtFechadenacimiento.setText("");
        txtTipodesangre.setText("");
        txtTipoDoc.setText("");
        txtApellidoAcu.setText("");
    }
   
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
      Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void CargarTabla(){
        DefaultTableModel mt = (DefaultTableModel) tblAlumnos.getModel();
        mt.setRowCount(0);
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        int [] anchos ={1,1,10,10,8,2,10,2,8,1,5,7,8,8,2,8};
        for ( int i =0; i <tblAlumnos.getColumnCount();i++){
        tblAlumnos.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        try{
            Connection con = Conexion.getConexion();
             ps = con.prepareStatement("SELECT Id,Nombres,Apellidos,Documento,Tipo_identificacion,Direccion,Tipo_sangre,Eps,Sexo,curso,Fecha_nacimiento,Nombre_acudiente,Apellido_acudiente,Sexo_acudiente,Telefono,Matriculado FROM Alumnos");
            rs= ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while (rs.next()){
                Object[] fila  = new Object [columnas];
                for (int indice=0;indice<columnas;indice++){
                    fila[indice]= rs.getObject(indice + 1);
                }
                mt.addRow(fila);
            }
        }
        catch(SQLException e ){
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
    }
    
    
    
    
 
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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JCheckBox ckMatriculado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelalumno;
    private javax.swing.JRadioButton rbFemeninoA;
    private javax.swing.JRadioButton rbFemeninoAcu;
    private javax.swing.JRadioButton rbMasculinoA;
    private javax.swing.JRadioButton rbMasculinoAcu;
    private javax.swing.JTable tblAlumnos;
    private javax.swing.JTextField txtApellidoAcu;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDireccionAcudiente;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtEps;
    private javax.swing.JTextField txtFechadenacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre_Acudiente;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTipoDoc;
    private javax.swing.JTextField txtTipodesangre;
    // End of variables declaration//GEN-END:variables
}
