/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_progra;

import Code.Codigo_Archivos;
import Vehiculo.Deportivo;
import Vehiculo.Furgoneta;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Extreme pc
 */
public class Main_Tarea_Progra extends javax.swing.JFrame {

    /**
     * Creates new form Main_Tarea_Progra
     */
    public static String[] marcas = new String[5];
    public static String[] colores = new String[5];
    Furgoneta furgoneta;
    Deportivo deportivo;
    public static final String marcas_auto = "src/txt/marcas.txt";
    public static final String colores_auto = "src/txt/colores.txt";

    public Main_Tarea_Progra() {
        Agregar_Info_Arreglos(marcas, marcas_auto);
        Agregar_Info_Arreglos(colores, colores_auto);
        initComponents();
        Seleccionar_Componentes();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtPrecio_Vehiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPlaca_Vehiculo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblpotencia = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        lblvelocidad = new javax.swing.JLabel();
        opt100 = new javax.swing.JRadioButton();
        opt150 = new javax.swing.JRadioButton();
        opt200 = new javax.swing.JRadioButton();
        lblcapacidad = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        lbldisponible = new javax.swing.JLabel();
        optsi = new javax.swing.JRadioButton();
        optno = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        optDeportivo = new javax.swing.JRadioButton();
        optFurgoneta = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnModificar))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(btnModificar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Agregar Vehiculo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(marcas));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(colores));

        jLabel2.setText("Precio del vehiculo:");

        txtPrecio_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecio_VehiculoActionPerformed(evt);
            }
        });
        txtPrecio_Vehiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecio_VehiculoKeyTyped(evt);
            }
        });

        jLabel3.setText("Numero de placa:");

        lblpotencia.setText("Potencia:");

        txtPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPotenciaActionPerformed(evt);
            }
        });
        txtPotencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPotenciaKeyTyped(evt);
            }
        });

        lblvelocidad.setText("Velocidad Max:");

        buttonGroup2.add(opt100);
        opt100.setText("100");

        buttonGroup2.add(opt150);
        opt150.setText("150");

        buttonGroup2.add(opt200);
        opt200.setText("200");
        opt200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt200ActionPerformed(evt);
            }
        });

        lblcapacidad.setText("Capacidad:");

        lbldisponible.setText("Disponible:");

        buttonGroup3.add(optsi);
        optsi.setText("Si");
        optsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optsiActionPerformed(evt);
            }
        });

        buttonGroup3.add(optno);
        optno.setText("No");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCapacidad)
                    .addComponent(txtPotencia)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblpotencia)
                            .addComponent(lblvelocidad)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(opt100)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(opt150))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(opt200))
                            .addComponent(lblcapacidad)
                            .addComponent(lbldisponible)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(optsi)
                                .addGap(18, 18, 18)
                                .addComponent(optno)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblpotencia)
                .addGap(18, 18, 18)
                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblvelocidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opt100)
                    .addComponent(opt150))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt200)
                .addGap(18, 18, 18)
                .addComponent(lblcapacidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldisponible)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optsi)
                    .addComponent(optno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(btnGuardar))
        );

        buttonGroup1.add(optDeportivo);
        optDeportivo.setText("Deportivo");
        optDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDeportivoActionPerformed(evt);
            }
        });

        buttonGroup1.add(optFurgoneta);
        optFurgoneta.setText("Furgoneta");
        optFurgoneta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optFurgonetaActionPerformed(evt);
            }
        });

        jLabel8.setText("Marca:");

        jLabel9.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(77, 77, 77))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel8)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPrecio_Vehiculo)
                                .addComponent(jLabel3)
                                .addComponent(txtPlaca_Vehiculo))
                            .addComponent(optFurgoneta, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(optDeportivo)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addGap(2, 2, 2)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecio_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPlaca_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optDeportivo)
                        .addGap(18, 18, 18)
                        .addComponent(optFurgoneta)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        Modificar_Vehiculo ag = new Modificar_Vehiculo(this, true);
        ag.setLocationRelativeTo(null);
        ag.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void optDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDeportivoActionPerformed
        txtPotencia.setEditable(true);
        opt100.setEnabled(true);
        opt150.setEnabled(true);
        opt200.setEnabled(true);
        txtCapacidad.setEditable(false);
        optno.setEnabled(false);
        optsi.setEnabled(false);
    }//GEN-LAST:event_optDeportivoActionPerformed

    private void txtPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPotenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPotenciaActionPerformed

    private void opt200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt200ActionPerformed

    private void optsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optsiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optsiActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void txtPrecio_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecio_VehiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecio_VehiculoActionPerformed

    private void optFurgonetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optFurgonetaActionPerformed
        txtPotencia.setEditable(false);
        opt100.setEnabled(false);
        opt150.setEnabled(false);
        opt200.setEnabled(false);
        txtCapacidad.setEditable(true);
        optno.setEnabled(true);
        optsi.setEnabled(true);
    }//GEN-LAST:event_optFurgonetaActionPerformed

    private void txtPrecio_VehiculoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecio_VehiculoKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' && c != '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecio_VehiculoKeyTyped

    private void txtPotenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPotenciaKeyTyped
        char c = evt.getKeyChar();
        if (c < '0' || c > '9' && c != '\b') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPotenciaKeyTyped

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Codigo_Archivos ca = new Codigo_Archivos();
        boolean repetido_deportivos = ca.Buscar(txtPlaca_Vehiculo.getText(), "src/txt/deportivos.txt");
        boolean repetido_furgoneta = ca.Buscar(txtPlaca_Vehiculo.getText(), "src/txt/furgonetas.txt");
        if (repetido_deportivos == true || repetido_furgoneta == true) {
            JOptionPane.showConfirmDialog(null, "La placa ya esta registrada");
        } else {
            if (optDeportivo.isSelected()) {
                if (opt100.isSelected()) {
                    deportivo = new Deportivo(jComboBox1.getSelectedItem().toString(),
                            jComboBox2.getSelectedItem().toString(), txtPlaca_Vehiculo.getText(),
                            Integer.parseInt(txtPrecio_Vehiculo.getText()), txtPotencia.getText(), "100");
                } else if (opt150.isSelected()) {
                    deportivo = new Deportivo(jComboBox1.getSelectedItem().toString(),
                            jComboBox2.getSelectedItem().toString(), txtPlaca_Vehiculo.getText(),
                            Integer.parseInt(txtPrecio_Vehiculo.getText()), txtPotencia.getText(), "150");
                } else if (opt200.isSelected()) {
                    deportivo = new Deportivo(jComboBox1.getSelectedItem().toString(),
                            jComboBox2.getSelectedItem().toString(), txtPlaca_Vehiculo.getText(),
                            Integer.parseInt(txtPrecio_Vehiculo.getText()), txtPotencia.getText(), "200");
                }
                ca.Guardar(deportivo);
            } else if(optFurgoneta.isSelected()){
                if(optsi.isSelected()){
                    furgoneta = new Furgoneta(jComboBox1.getSelectedItem().toString(),
                            jComboBox2.getSelectedItem().toString(), txtPlaca_Vehiculo.getText(),
                            Integer.parseInt(txtPrecio_Vehiculo.getText()), txtCapacidad.getText(), "si");
                }else{
                    furgoneta = new Furgoneta(jComboBox1.getSelectedItem().toString(),
                            jComboBox2.getSelectedItem().toString(), txtPlaca_Vehiculo.getText(),
                            Integer.parseInt(txtPrecio_Vehiculo.getText()), txtCapacidad.getText(), "si");
                }
                ca.Guardar(furgoneta);
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Main_Tarea_Progra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Tarea_Progra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Tarea_Progra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Tarea_Progra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Tarea_Progra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblcapacidad;
    private javax.swing.JLabel lbldisponible;
    private javax.swing.JLabel lblpotencia;
    private javax.swing.JLabel lblvelocidad;
    private javax.swing.JRadioButton opt100;
    private javax.swing.JRadioButton opt150;
    private javax.swing.JRadioButton opt200;
    private javax.swing.JRadioButton optDeportivo;
    private javax.swing.JRadioButton optFurgoneta;
    private javax.swing.JRadioButton optno;
    private javax.swing.JRadioButton optsi;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtPlaca_Vehiculo;
    private javax.swing.JTextField txtPotencia;
    private javax.swing.JTextField txtPrecio_Vehiculo;
    // End of variables declaration//GEN-END:variables

    private void Agregar_Info_Arreglos(String[] arreglo, String nombre_archivo) {
        String line;
        int num = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))) {
            while ((line = br.readLine()) != null) {
                arreglo[num] = line;
                num += 1;
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private void Seleccionar_Componentes() {
        opt100.setSelected(true);
        optsi.setSelected(true);
        optDeportivo.setSelected(true);
        txtPotencia.setEditable(true);
        opt100.setEnabled(true);
        opt150.setEnabled(true);
        opt200.setEnabled(true);
        txtCapacidad.setEditable(false);
        optno.setEnabled(false);
        optsi.setEnabled(false);
    }
}
