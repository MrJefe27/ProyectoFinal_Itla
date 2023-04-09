package Apps;
//Christopher Peguero / 2022-1024

import BDConection.Conexion;
import Login.Login;
import WindowsProducts.AddProduct;
import WindowsProducts.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;


public class MenuProducts extends javax.swing.JFrame {
    private ModProducts modproducts;
    DefaultTableModel model;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    Connection con = null;
    
    public MenuProducts() {
        initComponents();
        this.setLocationRelativeTo(this);
        setTitle("Almacen de productos");
        modproducts = new ModProducts();
        buscar();
        
        try {
        con = Conexion.getConnection();
        ps = con.prepareStatement("SELECT * FROM Productos WHERE idproducto = ?");
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        modproducts = new ModProducts();
        tabla.getSelectionModel().addListSelectionListener((ListSelectionEvent event) -> {
            // Verifica si es el último evento de la secuencia
            if (!event.getValueIsAdjusting()) {
                int fila = tabla.getSelectedRow(); // Obtener la fila seleccionada
                if (fila >= 0) {
                    try {
                        ps.setString(1, tabla.getValueAt(fila, 0).toString());
                        rs = ps.executeQuery();
                        
                        if (rs.next()) {
                            String id = rs.getString("idproducto");
                            String nombre = rs.getString("nombreproducto");
                            String marca = rs.getString("marcaproducto");
                            String categoria = rs.getString("categoriaproducto");
                            String precio = rs.getString("precioproducto");
                            String stock = rs.getString("stockproducto");
                            
                            modproducts.setProductos(id, nombre, marca, categoria, precio, stock);
                        }
                    } catch (SQLException e) {
                        System.out.println(e);
                    }
                    dispose();
                }
            }
        });

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        btnNuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ADMINISTRADOR DE PRODUCTOS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Segoe UI", 1, 24), new java.awt.Color(102, 102, 102))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator1.setAlignmentX(2.0F);
        jSeparator1.setAlignmentY(2.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 102, 102)));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Marca", "Categoria", "Precio", "Stock"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        btnNuevo.setBackground(new java.awt.Color(51, 51, 51));
        btnNuevo.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setText("Nuevo");
        btnNuevo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 204, 255), 2, true));
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps/imgs/volver.png"))); // NOI18N
        jLabel4.setText("Atras");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Apps/imgs/salir.png"))); // NOI18N
        jLabel10.setText("Salir");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 131, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(261, 261, 261)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 400));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        AddProduct ad = new AddProduct();
        ad.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Submenu menu = new Submenu();
        Submenu.main(null);
        dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        Login log = new Login();
        Login.main(null);
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        
    }//GEN-LAST:event_tablaMouseClicked


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new MenuProducts().setVisible(true);
        });
    }
    
    void buscar(){
        String sql = "select * from Productos";
        
        try {
            Connection con = Conexion.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            String [] usuario = new String[6];
            model = (DefaultTableModel) tabla.getModel();
            
            model.setRowCount(0);
            
            while(rs.next()){
                usuario [0] = rs.getString("idproducto");
                usuario [1] = rs.getString("nombreproducto");
                usuario [2] = rs.getString("marcaproducto");
                usuario [3] = rs.getString("categoriaproducto");
                usuario [4] = rs.getString("precioproducto");
                usuario [5] = rs.getString("stockproducto");
                                
                model.addRow(usuario);
            }
            tabla.setModel(model);
            
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
