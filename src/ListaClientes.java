/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author JHONATAN
 */
public class ListaClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListaClientes
     */
    public ListaClientes() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setResizable(true);
        setTitle("Lista de clientes");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Sebastián", "Rivas Barreto", "juanpablo.sedillo@yahoo.com"},
                {"Emiliano", "Simon Solorzano", "tijerina.rebeca@quintero.com"},
                {"Francisco", "Montes", "montano.joshua@cabrera.com"},
                {"Luis", "Cuellas Tello", "luis@gmail.com"},
                {"Catalina", "Zamudio Mata", "catalina@gmail.com"},
                {"Maria", "Jimenez Benitez", "maria@outlook.com"},
                {"Jesus", "Vicente Velazco", "jesus@hootmail.com"}
            },
            new String [] {
                "Nombres", "Apellidos", "Correo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 510, 190));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LISTA DE CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
