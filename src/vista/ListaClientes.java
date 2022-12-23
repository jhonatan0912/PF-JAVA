package vista;

import javax.swing.table.DefaultTableModel;

public class ListaClientes extends javax.swing.JInternalFrame {
    DefaultTableModel dtm =  new DefaultTableModel();
    public ListaClientes() {
        initComponents();
        String[] titulo= new String[]{"NOMBRES","APELLIDOS","CORREO"};
        dtm.setColumnIdentifiers(titulo);
        tablaClientes.setModel(dtm);       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        btAgregar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);
        setTitle("Lista de clientes");
        setMinimumSize(new java.awt.Dimension(600, 380));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaClientes.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 12)); // NOI18N
        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Jorge", "Manuel Navarro", "jorge@gmail.com"},
                {"Elizabeth", "Sauceda", "elizabeth@gmail.com"},
                {"Emiliano", "Pineda Ferrer", "emiliano@gmail.com"},
                {"Luis", "Cuellas Tello", "luis@gmail.com"},
                {"Catalina", "Zamudio Mata", "catalina@gmail.com"},
                {"Maria", "Jimenez Benitez", "maria@outlook.com"},
                {"Jesus", "Vicente Velazco", "jesus@hootmail.com"},
                {"Sebastian", "Villareal Posada", "sebastian@gmail.com"},
                {"Esteban", "Fierro Chacon", "esteban@hotmail.com"},
                {"Sofia", "Echevarria Aguirre", "sofia@gmail.com"},
                {"Gabriel ", "Briseño Enriquez", "gariel@outlook.com"},
                {"Simon", "Venegas Resendez", "simon@gmail.com"},
                {"Catalina", "Salazar Galindo", "catalina@hotmail.com"},
                {"Franco", "Porras Benavides", "franco@outlook.com"},
                {"Esteban", "Amador Sevilla", "esteban@outlook.com"},
                {"Jesus", "Vicente Velazco", "jesus@hootmail.com"},
                {"Sofia", "Echevarria Aguirre", "sofia@gmail.com"},
                {"Luis", "Cuellas Tello", "luis@gmail.com"},
                {"Elizabeth", "Sauceda", "elizabeth@gmail.com"},
                {"Gabriel ", "Briseño Enriquez", "gariel@outlook.com"},
                {"Catalina", "Salazar Galindo", "catalina@hotmail.com"},
                {"Esteban", "Amador Sevilla", "esteban@outlook.com"},
                {"Sebastian", "Villareal Posada", "sebastian@gmail.com"},
                {"Maria", "Jimenez Benitez", "maria@outlook.com"},
                {"Catalina", "Zamudio Mata", "catalina@gmail.com"}
            },
            new String [] {
                "Nombres", "Apellidos", "Correo"
            }
        ));
        jScrollPane1.setViewportView(tablaClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 510, 250));

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 1, 24)); // NOI18N
        jLabel1.setText("TABLA DE CLIENTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jLabel2.setText("Correo:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel3.setText("Nombres:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel4.setText("Apellidos:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 170, -1));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 170, -1));
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 170, -1));

        btAgregar.setText("Agregar");
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 100, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        // TODO add your handling code here:
        String nombres;
        String apellidos;
        String correo;
        
        nombres = txtNombres.getText();
        apellidos = txtApellidos.getText();
        correo = txtCorreo.getText();
        
        dtm.addRow(new Object[]{
            nombres,apellidos,correo
        });
    }//GEN-LAST:event_btAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables
}
