package vista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author JHONATAN
 */
public class ListadoVentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListadoVentas
     */
    public ListadoVentas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setResizable(true);
        setTitle("Listado ventas");
        setMinimumSize(new java.awt.Dimension(540, 360));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 24)); // NOI18N
        jLabel1.setText("TABLA DE VENTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jTable1.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"ADIDAS", "Al Rihla Pro ball", "S/ 99.00"},
                {"ADIDAS", "Mexico 22 Away Jersey", "S/ 20.00"},
                {"ADIDAS", "Argentina 22 Home Jersey", "S/ 19.00"},
                {"ADIDAS", "Mexico 22 Home Jersey", "S/ 299.00"},
                {"ADIDAS", "Mexico Away Fan Shirt", "S/ 79.00"},
                {"ADIDAS", "Germany 22 Home Authentic Jersey", "S/ 199.00"},
                {"ADIDAS", "Spain 22 Home Jersey", "S/ 24.00"},
                {"ADIDAS", "PARLEY RUN FOR THE OCEANS SWEATSHIRT", "S/ 39.99"},
                {"ADIDAS", "PARLEY RUN FOR THE OCEANS SWEATSHIRT", "S/ 49.99"},
                {"ADIDAS", "WORKOUT CORDURA® FULL-ZIP HOODIE", "S/ 19.00"},
                {"ADIDAS", "BEST OF ADIDAS TRAINING HOODIE", "S/ 19.00"},
                {"ADIDAS", "X-CITY FULL-ZIP HOODIE", "S/ 79.00"},
                {"ADIDAS", "Mexico Away Fan Shirt", "S/ 79.00"},
                {"ADIDAS", "Spain 22 Home Jersey", "S/ 99.00"},
                {"ADIDAS", "Nitro WORKOUT CORDURA® FULL-ZIP HOODIE5 CI5 11400H", "S/ 79.00"},
                {"ADIDAS", "Mexico Away Fan Shirt", "S/ 39.99"},
                {"ADIDAS", "Hombre futbol", "S/ 79.00"},
                {"ADIDAS", "DONOVAN MITCHELL SHORT SLEEVE HOODIE", "S/ 49.99"},
                {"ADIDAS", "Germany 22 Home Authentic Jersey", "S/ 79.00"},
                {"ADIDAS", "Spain 22 Home Jersey", "S/ 39.99"},
                {"ADIDAS", "Nitro 5 CI5 11400H", "S/ 49.99"},
                {"ADIDAS", "Spain 22 Home Jersey", "S/ 19.00"},
                {"ADIDAS", "X-CITY FULL-ZIP HOODIE", "S/ 39.99"},
                {"ADIDAS", "WORKOUT CORDURA® FULL-ZIP HOODIE", "S/ 49.99"},
                {"ADIDAS", "PARLEY RUN FOR THE OCEANS SWEATSHIRT", "S/ 39.99"}
            },
            new String [] {
                "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 450, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
