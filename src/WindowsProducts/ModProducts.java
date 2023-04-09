package WindowsProducts;
//Christopher Peguero / 2022-1024

import Apps.MenuProducts;
import BDConection.Conexion;
import java.awt.HeadlessException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ModProducts extends javax.swing.JFrame {
    PreparedStatement ps = null;
    ResultSet rs = null;
    Connection con = null;
   
    public ModProducts() {
        initComponents();
        txtID.setVisible(false);
        this.setLocationRelativeTo(this);
        con = Conexion.getConnection();
        setTitle("Formulario de registro"); 
    }
    
        public void limpiartabla(){
        txtNomprod.setText("");
        txtMarca.setText("");
        txtCategoria.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
       
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomprod = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        txtStock = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 565, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 153, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(153, 204, 255));
        jPanel4.setForeground(new java.awt.Color(0, 51, 255));
        jPanel4.setToolTipText("Interfaz de registro");
        jPanel4.setName("Intefaz de registro"); // NOI18N
        jPanel4.setPreferredSize(new java.awt.Dimension(740, 500));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 102, 102)));
        jPanel1.setForeground(new java.awt.Color(52, 64, 229));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Marca");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        txtNomprod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtNomprod, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 260, 30));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 50, 30));

        txtPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, 30));

        txtMarca.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 260, 30));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 25)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Acerca de este producto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 290, 50));

        btnGuardar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WindowsProducts/imgs/save.png"))); // NOI18N
        btnGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 50, 50));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("Categoria");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCategoriaActionPerformed(evt);
            }
        });
        jPanel1.add(txtCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 260, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator3.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 102, 102)));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Stock");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        txtStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 260, 30));

        btnVolver.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WindowsProducts/imgs/back.png"))); // NOI18N
        btnVolver.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 50, 50));

        btnBorrar.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        btnBorrar.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/WindowsProducts/imgs/delete.png"))); // NOI18N
        btnBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(102, 102, 102), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 460, 50, 50));

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 340, 530));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
 
        //Modificar producto
        String pdname = txtNomprod.getText();
        String marca = txtMarca.getText();
        String cate = txtCategoria.getText();
        String prec = txtPrecio.getText();
        String stoc = txtStock.getText();
        String id = txtID.getText();
        
        if(txtNomprod.getText().isEmpty() || txtMarca.getText().isEmpty() || txtCategoria.getText().isEmpty()
                || txtPrecio.getText().isEmpty() || txtStock.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(rootPane, "Debes rellenar todos los campos.");
        }
        else{
            try {
                Statement s = Conexion.getConnection().createStatement();
                s.executeUpdate("UPDATE Productos SET  nombreproducto='"+pdname+"', marcaproducto='"+marca+"', categoriaproducto='"+cate+"', precioproducto='"+prec+"', stockproducto='"+stoc+"' where idproducto = '"+id+"'");
                
                JOptionPane.showMessageDialog(rootPane, "Producto modificado exitosamente");
                limpiartabla();
                dispose();
                MenuProducts mn = new MenuProducts();
                MenuProducts.main(null);
                
            } catch (HeadlessException | SQLException e) {
                System.out.println(e);
            }
        }
     }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCategoriaActionPerformed
    }//GEN-LAST:event_txtCategoriaActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
    }//GEN-LAST:event_jPanel4MouseClicked

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuProducts mp = new MenuProducts();
        MenuProducts.main(null);
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        
        try {
            Connection con = Conexion.getConnection();
            ps = con.prepareStatement("Delete from productos where idproducto = ?");
            ps.setInt(1, Integer.parseInt(txtID.getText()));
            
            //Cuando se seleccione el id, entonces se ejecuta esta consulta. Si no tomamos el id de cada registro podriamos eliminarlos todos.
            int res = ps.executeUpdate();
            
            if(res > 0){
                JOptionPane.showMessageDialog(null, "Se ha eliminado este producto");
                limpiartabla();
                dispose();
                MenuProducts mn = new MenuProducts();
                MenuProducts.main(null);
                
            }else{
                JOptionPane.showMessageDialog(null, "Error al eliminar producto");
                limpiartabla();
            }
                        
        } catch (HeadlessException | NumberFormatException | SQLException e) {
              System.err.println(e);
        }        
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModProducts().setVisible(true);
            }
        });
    }
        
        //Este metodo es el que permite que los datos de la tabla que esta en el menu de usuarios se muestre en las cintas de texto.
        public void setProductos(String id, String nombre, String marca, String categoria, String precio, String stock) {
            txtID.setText(id);
            txtNomprod.setText(nombre);
            txtMarca.setText(marca);
            txtCategoria.setText(categoria);
            txtPrecio.setText(precio);
            txtStock.setText(stock);
            
            this.setVisible(true);
            
        }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtNomprod;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
