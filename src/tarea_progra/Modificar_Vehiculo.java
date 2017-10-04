/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_progra;

import Code.Codigo_Archivos;
import Vehiculo.Deportivo;
import Vehiculo.Furgoneta;

/**
 *
 * @author Extreme pc
 */
public class Modificar_Vehiculo extends javax.swing.JDialog {

    /**
     * Creates new form Agregar_Vehiculo
     *
     * @param parent
     * @param modal
     */
    Furgoneta furgoneta, buscar_furgoneta;
    Deportivo deportivo, buscar_deportivo;

    public Modificar_Vehiculo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        btnGuardar.setEnabled(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbuscar = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        optDeportivo = new javax.swing.JRadioButton();
        optFurgoneta = new javax.swing.JRadioButton();
        lblPlaca = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtPotencia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        opt100 = new javax.swing.JRadioButton();
        opt150 = new javax.swing.JRadioButton();
        opt200 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        optsi = new javax.swing.JRadioButton();
        optno = new javax.swing.JRadioButton();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblbuscar.setText("Buscar:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(Main_Tarea_Progra.colores));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(Main_Tarea_Progra.marcas));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Marca:");

        jLabel2.setText("Color:");

        optDeportivo.setText("Deportivo");
        optDeportivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optDeportivoActionPerformed(evt);
            }
        });

        optFurgoneta.setText("Furgoneta");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(optFurgoneta)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPlaca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox4, javax.swing.GroupLayout.Alignment.LEADING, 0, 86, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(optDeportivo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optDeportivo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optFurgoneta)
                .addContainerGap())
        );

        jLabel3.setText("Potencia:");

        jLabel4.setText("Velocidad Max:");

        opt100.setText("100");

        opt150.setText("150");

        opt200.setText("200");
        opt200.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opt200ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPotencia)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(opt100, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt150, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(opt200, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPotencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt100)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt150)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opt200)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Disponible:");

        optsi.setText("Si");

        optno.setText("No");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCapacidad)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(optsi)
                            .addComponent(optno))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optsi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGuardar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblbuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblbuscar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void opt200ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opt200ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_opt200ActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Codigo_Archivos ca = new Codigo_Archivos();

        if (optDeportivo.isSelected()) {
            if (opt100.isSelected()) {
                deportivo = new Deportivo(jComboBox3.getSelectedItem().toString(),
                        jComboBox4.getSelectedItem().toString(), lblPlaca.getText(),
                        Integer.parseInt(lblPrecio.getText()), txtPotencia.getText(), "100");
            } else if (opt150.isSelected()) {
                deportivo = new Deportivo(jComboBox3.getSelectedItem().toString(),
                        jComboBox4.getSelectedItem().toString(), lblPlaca.getText(),
                        Integer.parseInt(lblPrecio.getText()), txtPotencia.getText(), "150");
            } else if (opt200.isSelected()) {
                deportivo = new Deportivo(jComboBox3.getSelectedItem().toString(),
                        jComboBox4.getSelectedItem().toString(), lblPlaca.getText(),
                        Integer.parseInt(lblPrecio.getText()), txtPotencia.getText(), "200");
            }
            ca.Guardar(deportivo);
        } else if (optFurgoneta.isSelected()) {
            if (optsi.isSelected()) {
                furgoneta = new Furgoneta(jComboBox3.getSelectedItem().toString(),
                        jComboBox4.getSelectedItem().toString(), lblPlaca.getText(),
                        Integer.parseInt(lblPrecio.getText()), txtCapacidad.getText(), "si");
            } else {
                furgoneta = new Furgoneta(jComboBox3.getSelectedItem().toString(),
                        jComboBox4.getSelectedItem().toString(), lblPlaca.getText(),
                        Integer.parseInt(lblPrecio.getText()), txtCapacidad.getText(), "no");
            }
            ca.Guardar(furgoneta);
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Codigo_Archivos ca = new Codigo_Archivos();
        boolean encontrado_deportivos = ca.Buscar(txtBuscar.getText(), "src/txt/deportivos.txt");
        boolean encontrado_furgoneta = ca.Buscar(txtBuscar.getText(), "src/txt/furgonetas.txt");
        if (encontrado_deportivos == false && encontrado_furgoneta == false) {
            btnGuardar.setEnabled(false);
        } else if (encontrado_deportivos) {
            buscar_deportivo = ca.Obtener_Vehiculo_Deport(txtBuscar.getText(), "src/txt/deportivos.txt");
            //ca.Eliminar_deport(txtBuscar.getText());
            Acomodar_deport(buscar_deportivo);
        } else if (encontrado_furgoneta) {
            buscar_furgoneta = ca.Obtener_Vehiculo_Furgo(txtBuscar.getText(), "src/txt/furgonetas.txt");
            //ca.Eliminar_furgo(txtBuscar.getText());
            Acomodar_furgo(buscar_furgoneta);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void optDeportivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optDeportivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optDeportivoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblPlaca;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblbuscar;
    private javax.swing.JRadioButton opt100;
    private javax.swing.JRadioButton opt150;
    private javax.swing.JRadioButton opt200;
    private javax.swing.JRadioButton optDeportivo;
    private javax.swing.JRadioButton optFurgoneta;
    private javax.swing.JRadioButton optno;
    private javax.swing.JRadioButton optsi;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtPotencia;
    // End of variables declaration//GEN-END:variables

    private void Acomodar_deport(Deportivo buscar_deportivo) {
        jComboBox3.setSelectedItem(buscar_deportivo.getMarca());
        jComboBox4.setSelectedItem(buscar_deportivo.getColor());
        lblPlaca.setText(buscar_deportivo.getPlaca());
        lblPrecio.setText(String.valueOf(buscar_deportivo.getPrecio()));
        optDeportivo.setSelected(true);
        txtCapacidad.setEnabled(false);
        optsi.setEnabled(false);
        optno.setEnabled(false);
        txtPotencia.setText(buscar_deportivo.getPotencia());
        if (buscar_deportivo.getVelocidad().equals("100")) {
            opt100.setSelected(true);
        }
        if (buscar_deportivo.getVelocidad().equals("150")) {
            opt150.setSelected(true);
        }
        if (buscar_deportivo.getVelocidad().equals("200")) {
            opt200.setSelected(true);
        }
    }

    private void Acomodar_furgo(Furgoneta buscar_furgoneta) {
        jComboBox3.setSelectedItem(buscar_furgoneta.getMarca());
        jComboBox4.setSelectedItem(buscar_furgoneta.getColor());
        lblPlaca.setText(buscar_furgoneta.getPlaca());
        lblPrecio.setText(String.valueOf(buscar_furgoneta.getPrecio()));
        optFurgoneta.setSelected(true);
        txtPotencia.setEnabled(false);
        opt100.setEnabled(false);
        opt150.setEnabled(false);
        opt200.setEnabled(false);
        txtCapacidad.setText(buscar_furgoneta.getCan_Pasajeros());
        if (buscar_furgoneta.getDisponible().equals("si")) {
            optsi.setSelected(true);
        }
        if (buscar_furgoneta.getDisponible().equals("no")) {
            optno.setSelected(true);
        }
    }
}