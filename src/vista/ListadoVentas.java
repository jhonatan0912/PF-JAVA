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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LISTADO DE VENTAS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"HP", "15-ef1009la", "S/ 3299.00"},
                {"Lenovo", "A315-57G-53R9", "S/ 2,099.00"},
                {"Asus", "82KT009NLM ", "S/ 1,999.00"},
                {"Acer", " LPM-BW15", "S/ 2,099.00"},
                {"Dell", "XPS 15", "S/ 3,799.00"},
                {"HP", "Spectre ", "S/ 1,999.00"},
                {"Acer", "Gram 17", "S/ 2,499.00"},
                {"Asus", "Swift", null}
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