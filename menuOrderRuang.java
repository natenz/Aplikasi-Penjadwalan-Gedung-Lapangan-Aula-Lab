/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubesbasdat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Nata
 */
public class menuOrderRuang extends javax.swing.JFrame {
int dragxmouse;
int dragymouse;
    /**
     * Creates new form menuOrderRuang
     */
    public menuOrderRuang() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(900, 700));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(900, 700));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/basdat/images/Button-Remove-iconss.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(860, 10, 30, 30);

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setText("Tanggal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 370, 130, 40);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("ID User");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 220, 120, 40);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel5.setText("Jam");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(530, 310, 130, 40);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel6.setText("ID Pinjam");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 270, 150, 40);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel7.setText("Ruang");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(530, 240, 130, 40);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(170, 370, 230, 40);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(170, 220, 230, 40);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(170, 270, 230, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "KEL00", "KEL01", "KEL02", "KEL03", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(710, 240, 110, 40);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "07.00 - 09.00", "09.15 - 11.15", "13.00 - 15.00", "16.30 - 18.00" }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(710, 300, 110, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/basdat/images/Button-Previous-icon.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel8);
        jLabel8.setBounds(440, 650, 40, 40);

        jButton1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton1.setText("PESAN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(410, 600, 100, 40);

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel9.setText("Nama");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 320, 130, 40);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(170, 320, 230, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/tubes/basdat/images/menuOrderRuang.jpg"))); // NOI18N
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
        jLabel1.setBounds(0, 0, 900, 700);

        setSize(new java.awt.Dimension(900, 700));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - dragxmouse, y - dragymouse);
        System.out.println(x+"," +y);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
       dragxmouse = evt.getX();
        dragymouse = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
    this.dispose();
    // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        new menuUserOrder().setVisible(true);
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        String iduser=jTextField2.getText();
        String  idpinjam = jTextField3.getText();
        String name = jTextField4.getText();
        String tgl = jTextField5.getText();
        String ruang = jComboBox1.getSelectedItem().toString();
        String jamm = jComboBox2.getSelectedItem().toString(); 
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/basisdata","root","");
            String query ="INSERT INTO peminjaman (id_user,id_pinjam, nama,tgl_pinjam,kd_ruang, jam_pinjam) values (?,?,?,?,?,?)";
            
            PreparedStatement ps= con.prepareStatement(query);
            ps.setString(1, iduser);
            ps.setString(2, idpinjam);
            ps.setString(3, name);
            ps.setString(4,tgl);
            ps.setString(5, ruang);
            ps.setString(6, jamm);
            
             ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Peminjaman Berhasil ");
        }catch(Exception ex){
             System.out.println(ex.getMessage());    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(menuOrderRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuOrderRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuOrderRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuOrderRuang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuOrderRuang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
