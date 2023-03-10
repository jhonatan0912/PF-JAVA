package vista;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.ProductClass;

public class VentaProducto extends javax.swing.JInternalFrame {
      DefaultTableModel dtm = new DefaultTableModel();
    
    public VentaProducto() {
        initComponents();
        String[] titulo= new String[]{"MARCA","MODELO","PRECIO"};
        dtm.setColumnIdentifiers(titulo);
        tablaDatos.setModel(dtm);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnProcesar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(242, 146, 47));
        setBorder(null);
        setClosable(true);
        setResizable(true);
        setTitle("Venta laptops");
        setMinimumSize(new java.awt.Dimension(880, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 14)); // NOI18N
        jLabel1.setText("Marca:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, 30));

        jLabel2.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 14)); // NOI18N
        jLabel2.setText("Modelo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 30));

        jLabel3.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 14)); // NOI18N
        jLabel3.setText("Precio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, -1, 30));

        btnProcesar.setBackground(new java.awt.Color(0, 102, 51));
        btnProcesar.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 14)); // NOI18N
        btnProcesar.setForeground(new java.awt.Color(255, 255, 255));
        btnProcesar.setText("Generar compra");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 180, 50));

        jLabel4.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 24)); // NOI18N
        jLabel4.setText("Formulario de venta");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMarca.setToolTipText("");
        txtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMarcaActionPerformed(evt);
            }
        });
        getContentPane().add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 290, 30));

        txtModelo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtModelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 290, 30));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 290, 30));

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaDatos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 400, 290));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMarcaActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        String marca;
        String modelo;
        double precio;      
                
        marca=txtMarca.getText();
        modelo=txtModelo.getText();
        precio=Double.parseDouble(txtPrecio.getText());
        
        ProductClass laptop = new ProductClass();
        
        laptop.setMarca(marca);
        laptop.setModelo(modelo);
        laptop.setPrecio(precio);      
        dtm.addRow(new Object[]{
            marca,modelo,precio
        });
                
        JOptionPane.showMessageDialog(null, laptop.purchaseSuccess(marca, modelo, precio));
    }//GEN-LAST:event_btnProcesarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProcesar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDatos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
