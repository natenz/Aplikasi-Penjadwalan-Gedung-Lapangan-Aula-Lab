/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import java.awt.Color;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author Nata
 */

public class menuOrder extends javax.swing.JFrame {
int dragxmouse;
int dragymouse;
    /**
     * Creates new form menuOrder
     */
    public menuOrder() {
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

        jTextFieldOrderID = new javax.swing.JTextField();
        jTextFieldOrderNama = new javax.swing.JTextField();
        jTextFieldOrderTanggal = new javax.swing.JTextField();
        jTextFieldOrderJamMU = new javax.swing.JTextField();
        jTextFieldJamSE = new javax.swing.JTextField();
        jTextFieldRuang = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        simpan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.SE_RESIZE_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 900));
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jTextFieldOrderID);
        jTextFieldOrderID.setBounds(180, 410, 300, 33);

        jTextFieldOrderNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldOrderNamaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldOrderNama);
        jTextFieldOrderNama.setBounds(180, 470, 300, 33);
        getContentPane().add(jTextFieldOrderTanggal);
        jTextFieldOrderTanggal.setBounds(180, 528, 300, 33);
        getContentPane().add(jTextFieldOrderJamMU);
        jTextFieldOrderJamMU.setBounds(180, 587, 300, 33);
        getContentPane().add(jTextFieldJamSE);
        jTextFieldJamSE.setBounds(180, 642, 300, 33);
        getContentPane().add(jTextFieldRuang);
        jTextFieldRuang.setBounds(180, 690, 300, 33);

        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(370, 770, 90, 40);

        simpan.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        simpan.setText("SIMPAN");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        getContentPane().add(simpan);
        simpan.setBounds(190, 770, 90, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RUANG");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 690, 150, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubespbo/images/Button-Remove-iconss_1.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(750, 0, 80, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubespbo/images/menuOrder.jpg"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 800, 900);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("RUANG");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 690, 130, 30);

        setSize(new java.awt.Dimension(799, 928));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldOrderNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldOrderNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldOrderNamaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
       try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tubess","root","");
            ResultSet rs;
            
            String query ="INSERT INTO peminjaman_ruang (username, nama,tgl_pinjam, jam_mulai,jam_selesai,kd_ruang) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, jTextFieldOrderID.getText());
            ps.setString(2, jTextFieldOrderNama.getText());
            ps.setString(3, jTextFieldOrderTanggal.getText());
            ps.setString(4, jTextFieldOrderJamMU.getText());
            ps.setString(5, jTextFieldJamSE.getText());
            ps.setString(6, jTextFieldRuang.getText());
            
            
       //     String tgl = rs.getString("tgl_pinjam");
            
           /* if(jTextFieldOrderTanggal.getText().equals(jTextFieldOrderTanggal.getString()) ||jTextFieldRuang.getText().equals(jTextFieldRuang.getString())){
                if(jTextFieldOrderJamMU.getText().equals("jam_mulai") || jTextFieldJamSE.getText().equals("jam_selesai")){
                    JOptionPane.showMessageDialog(null, "Silahkan Pinjam Ruang yang lain !!");
                 } else {
                 }
            } */
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "New Order Added ! !");
       
       } catch (Exception ex) {
            System.out.println(ex.getMessage());        
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        menuUtama mu = new menuUtama ();
                        mu.setVisible(true);
                        setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        // TODO add your handling code here:
         dragxmouse = evt.getX();
        dragymouse = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - dragxmouse, y - dragymouse);
        System.out.println(x+"," +y);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        // TODO add your handling code here:
      menuUtama mu = new menuUtama ();
                        mu.setVisible(true);
                        setVisible(false);
        
    }//GEN-LAST:event_backMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(menuOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldJamSE;
    private javax.swing.JTextField jTextFieldOrderID;
    private javax.swing.JTextField jTextFieldOrderJamMU;
    private javax.swing.JTextField jTextFieldOrderNama;
    private javax.swing.JTextField jTextFieldOrderTanggal;
    private javax.swing.JTextField jTextFieldRuang;
    private javax.swing.JButton simpan;
    // End of variables declaration//GEN-END:variables
}
