package centro_comercial;
import base_datos.conexion;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import otros.validar;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class JFpago_proveedor extends javax.swing.JFrame {

    public static String forma;
    public static ResultSet rs;
    public static Connection con = null;
    public static PreparedStatement ps;
    public static String rucprove;
    public static String nombre_propio;

    public JFpago_proveedor() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    public static void limpiar(){
//        jt_nombre.setText("");
//        jta_descripcion.setText("");
    }

    public void llenar(String PK) {
//        con =  (Connection) conexion.conectar();
//        if (con != null) {
//            try {
//                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CATEGORIA WHERE ID=" + PK);
//                rs = ps.executeQuery();
//                rs.next();
//                id.setText(String.valueOf(""+rs.getInt(1)));
//                jt_nombre.setText(rs.getString(2).toUpperCase());
//                nombre_propio = rs.getString(2).toUpperCase();
//                jta_descripcion.setText(rs.getString(3));
//                this.setVisible(true);
//            } catch (SQLException e) {
//                getToolkit().beep();
//                JOptionPane.showMessageDialog(rootPane, "¡La categoría '" + PK + "' no existe!");
//            }
//        }
    }
    
    public void registrar() {
//        con = (Connection) conexion.conectar();
//        if (con != null) {
//            try {
//                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CATEGORIA WHERE NOMBRE='" + jt_nombre.getText().toUpperCase() + "'");
//                if (ps.executeQuery().next()) {
//                    JOptionPane.showMessageDialog(null, "¡La categoría '" + jt_nombre.getText().toUpperCase() + "' ya está en uso!");
//                } else {
//                    ps = (PreparedStatement) con.prepareStatement("INSERT INTO CATEGORIA (NOMBRE, DESCRIPCION) VALUES (?,?)");
//                    ps.setString(1, jt_nombre.getText().toUpperCase());
//                    ps.setString(2, jta_descripcion.getText().toUpperCase());
//                    ps.executeUpdate(); //Ejecuta la consulta
//                    JOptionPane.showMessageDialog(null, "¡Registrado correctamente!");
//                    PRINCIPAL.actualizado = false;
//                    this.dispose();
//                }
//            } catch (SQLException ex) {
//                getToolkit().beep();
//                JOptionPane.showMessageDialog(null, "¡Error al registrar!");
//            }
//        }
    }
    public void modificar(){
//        con = (Connection) conexion.conectar();
//        if (con != null) {
//            try {
//                ps = (PreparedStatement) con.prepareStatement("SELECT * FROM CATEGORIA WHERE NOMBRE='" + jt_nombre.getText().toUpperCase()+"'");
//                if (ps.executeQuery().next() && !jt_nombre.getText().toUpperCase().equals(nombre_propio)) {
//                    JOptionPane.showMessageDialog(null, "¡La categoría '" + jt_nombre.getText().toUpperCase() + "' ya está en uso!");
//                } else {
//                    ps = (PreparedStatement) con.prepareStatement("UPDATE CATEGORIA SET NOMBRE=?,DESCRIPCION=? WHERE ID=?");
//                    ps.setString(1, jt_nombre.getText().toUpperCase());
//                    ps.setString(2, jta_descripcion.getText().toUpperCase());
//                    ps.setInt(3, Integer.parseInt(id.getText()));
//                    ps.executeUpdate(); //Ejecuta la consulta
//                    JOptionPane.showMessageDialog(null, "¡Modificado correctamente!");
//                    PRINCIPAL.actualizado = false;
//                    this.dispose();
//                }
//            } catch (SQLException ex) {
//                getToolkit().beep();
//                JOptionPane.showMessageDialog(null, "¡Error al modificar!");
//            }
//        }
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jp_1 = new javax.swing.JPanel();
        jl_cerrar = new javax.swing.JLabel();
        jl_titulo = new javax.swing.JLabel();
        jp_2 = new javax.swing.JPanel();
        jb_Ejecutar = new javax.swing.JButton();
        jt_nombre = new javax.swing.JTextField();
        jl_titulo23 = new javax.swing.JLabel();
        Bcat = new javax.swing.JTextField();
        Lcat = new javax.swing.JLabel();
        jsTabla_ciu10 = new javax.swing.JScrollPane();
        JTcat = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jp_1.setBackground(new java.awt.Color(0, 204, 102));
        jp_1.setPreferredSize(new java.awt.Dimension(560, 40));

        jl_cerrar.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jl_cerrar.setForeground(new java.awt.Color(255, 255, 255));
        jl_cerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl_cerrar.setText("×");
        jl_cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_cerrarMouseClicked(evt);
            }
        });

        jl_titulo.setFont(new java.awt.Font("Yu Gothic UI", 1, 16)); // NOI18N
        jl_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jl_titulo.setText("Registrar pago a proveedor");

        javax.swing.GroupLayout jp_1Layout = new javax.swing.GroupLayout(jp_1);
        jp_1.setLayout(jp_1Layout);
        jp_1Layout.setHorizontalGroup(
            jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jp_1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jl_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 484, Short.MAX_VALUE)
                .addComponent(jl_cerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jp_1Layout.setVerticalGroup(
            jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jp_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jl_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jl_cerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)))
        );

        jp_2.setBackground(new java.awt.Color(255, 255, 255));
        jp_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_Ejecutar.setBackground(new java.awt.Color(0, 204, 102));
        jb_Ejecutar.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jb_Ejecutar.setForeground(new java.awt.Color(255, 255, 255));
        jb_Ejecutar.setText("¡Registrar!");
        jb_Ejecutar.setBorder(null);
        jb_Ejecutar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jb_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_EjecutarActionPerformed(evt);
            }
        });
        jp_2.add(jb_Ejecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 327, 144, 42));

        jt_nombre.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        jt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Proveedor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Yu Gothic UI Light", 0, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jt_nombreActionPerformed(evt);
            }
        });
        jt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jt_nombreKeyPressed(evt);
            }
        });
        jp_2.add(jt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 300, 70));

        jl_titulo23.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jl_titulo23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/table_icon_128243.png"))); // NOI18N
        jl_titulo23.setText("Proveedores disponibles");
        jl_titulo23.setIconTextGap(10);
        jl_titulo23.setVerifyInputWhenFocusTarget(false);
        jp_2.add(jl_titulo23, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 20, -1, -1));

        Bcat.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        Bcat.setText("Buscar");
        Bcat.setMinimumSize(new java.awt.Dimension(317, 31));
        Bcat.setPreferredSize(new java.awt.Dimension(317, 35));
        Bcat.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        Bcat.setSelectionColor(new java.awt.Color(153, 204, 255));
        Bcat.setSelectionEnd(0);
        Bcat.setSelectionStart(0);
        Bcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BcatMouseClicked(evt);
            }
        });
        Bcat.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                BcatKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BcatKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BcatKeyTyped(evt);
            }
        });
        jp_2.add(Bcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 70, 390, -1));

        Lcat.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 18)); // NOI18N
        Lcat.setForeground(new java.awt.Color(0, 102, 102));
        Lcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lcat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/close.png"))); // NOI18N
        Lcat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Lcat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LcatMouseClicked(evt);
            }
        });
        jp_2.add(Lcat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, 36));

        jsTabla_ciu10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JTcat = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        JTcat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        JTcat.setFont(new java.awt.Font("Calibri Light", 1, 16)); // NOI18N
        JTcat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        JTcat.setFocusable(false);
        JTcat.setGridColor(new java.awt.Color(255, 255, 255));
        JTcat.setOpaque(false);
        JTcat.setRowHeight(30);
        JTcat.setSelectionBackground(new java.awt.Color(0, 204, 204));
        JTcat.getTableHeader().setResizingAllowed(false);
        JTcat.getTableHeader().setReorderingAllowed(false);
        jsTabla_ciu10.setViewportView(JTcat);

        jp_2.add(jsTabla_ciu10, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 111, 400, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jp_1, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addComponent(jp_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jp_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jp_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_cerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_jl_cerrarMouseClicked

    private void jb_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_EjecutarActionPerformed
//        String desc = jta_descripcion.getText().replaceAll("\\s+", "");
//        if (jt_nombre.getText().equals("") || desc.equals("")) {
//            getToolkit().beep();
//            JOptionPane.showMessageDialog(rootPane, "¡Aún hay campos por completar!");
//        } else {
//            if (forma.equals("registrar")) {
//                registrar();
//            } else if(forma.equals("modificar")){
//                modificar();
//            }
//        }

    }//GEN-LAST:event_jb_EjecutarActionPerformed

    private void jt_nombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jt_nombreKeyPressed
        validar.V_letras(jt_nombre,30);
    }//GEN-LAST:event_jt_nombreKeyPressed

    private void jt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jt_nombreActionPerformed

    private void BcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_BcatMouseClicked

    private void BcatKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcatKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BcatKeyPressed

    private void BcatKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcatKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_BcatKeyReleased

    private void BcatKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BcatKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BcatKeyTyped

    private void LcatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LcatMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LcatMouseClicked

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
            java.util.logging.Logger.getLogger(JFpago_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFpago_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFpago_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFpago_proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
    
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
      
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFpago_proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField Bcat;
    public javax.swing.JTable JTcat;
    private javax.swing.JLabel Lcat;
    public static javax.swing.JButton jb_Ejecutar;
    private javax.swing.JLabel jl_cerrar;
    public static javax.swing.JLabel jl_titulo;
    private javax.swing.JLabel jl_titulo23;
    public static javax.swing.JPanel jp_1;
    private javax.swing.JPanel jp_2;
    private javax.swing.JScrollPane jsTabla_ciu10;
    public static javax.swing.JTextField jt_nombre;
    // End of variables declaration//GEN-END:variables
}
