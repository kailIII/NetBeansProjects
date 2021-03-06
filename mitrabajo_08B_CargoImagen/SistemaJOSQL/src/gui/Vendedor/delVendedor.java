/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * delVendedor.java
 *
 * Created on 09-may-2010, 22:54:41
 */
package gui.Vendedor;

import java.util.List;
import javax.swing.JOptionPane;
import joyeria.Vendedor;
import modelo.Controlador;

/**
 *
 * @author familia
 */
public class delVendedor extends javax.swing.JInternalFrame {

    /** Creates new form delVendedor */
    public delVendedor() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        cboCodigo = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Eliminar Vendedor");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12));
        jLabel14.setText("Codigo del Vendedor:");

        cboCodigo.setFont(new java.awt.Font("Arial", 0, 12));

        btnEliminar.setFont(new java.awt.Font("Arial", 0, 12));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(cboCodigo, 0, 160, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(btnEliminar)
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        try {
            Controlador c = new Controlador();
            List<Vendedor> vendedores = c.relacion_vendedor();
            for (Vendedor vendedor : vendedores) {
                this.cboCodigo.addItem(vendedor.getIdVendedor());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }
    }//GEN-LAST:event_formInternalFrameOpened

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        try {
            Controlador c = new Controlador();
            c.eliminar_vendedor(Integer.parseInt(cboCodigo.getSelectedItem().toString()));
            JOptionPane.showMessageDialog(null, "Exito");
            cboCodigo.removeAllItems();
            Controlador v = new Controlador();
            List<Vendedor> vendedores = v.relacion_vendedor();
            for (Vendedor vendedor : vendedores) {
                this.cboCodigo.addItem(vendedor.getIdVendedor());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion con la base de datos");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox cboCodigo;
    private javax.swing.JLabel jLabel14;
    // End of variables declaration//GEN-END:variables
}
