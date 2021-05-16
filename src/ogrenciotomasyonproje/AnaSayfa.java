/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciotomasyonproje;

import ogrenciotomasyonproje.dersler.Dersler;
import ogrenciotomasyonproje.ogrenciler.Ogrenciler;
import ogrenciotomasyonproje.ogretmenler.Ogretmenler;
import ogrenciotomasyonproje.siniflar.Siniflar;

/**
 *
 * @author fatih
 */
public class AnaSayfa extends javax.swing.JFrame {

    /**
     * Creates new form AnaSayfa
     */
    
   public  String Ad;
    public AnaSayfa() {
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

        Dersler_btn = new javax.swing.JButton();
        Ogretmenler_Btn = new javax.swing.JButton();
        Ogrenciler_btn = new javax.swing.JButton();
        Siniflar_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        OBS_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Dersler_btn.setBackground(new java.awt.Color(255, 255, 255));
        Dersler_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\fatih\\OneDrive\\Belgeler\\NetBeansProjects\\OgrenciOtomasyonProje\\img\\Dersler.png")); // NOI18N
        Dersler_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dersler_btnActionPerformed(evt);
            }
        });

        Ogretmenler_Btn.setBackground(new java.awt.Color(255, 255, 255));
        Ogretmenler_Btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\fatih\\OneDrive\\Belgeler\\NetBeansProjects\\OgrenciOtomasyonProje\\img\\Ogretmenler.png")); // NOI18N
        Ogretmenler_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogretmenler_BtnActionPerformed(evt);
            }
        });

        Ogrenciler_btn.setBackground(new java.awt.Color(255, 255, 255));
        Ogrenciler_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\fatih\\OneDrive\\Belgeler\\NetBeansProjects\\OgrenciOtomasyonProje\\img\\Ogenciler.png")); // NOI18N
        Ogrenciler_btn.setPreferredSize(new java.awt.Dimension(117, 91));
        Ogrenciler_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ogrenciler_btnActionPerformed(evt);
            }
        });

        Siniflar_btn.setBackground(new java.awt.Color(255, 255, 255));
        Siniflar_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\fatih\\OneDrive\\Belgeler\\NetBeansProjects\\OgrenciOtomasyonProje\\img\\Siniflar.png")); // NOI18N
        Siniflar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Siniflar_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setText("Dersler");

        jLabel2.setText("Öğrenciler");

        jLabel3.setText("Sınıflar");

        jLabel4.setText("OBS");

        jLabel5.setText("Öğretmenler");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(115, 115, 115)
                .addComponent(jLabel2)
                .addGap(96, 96, 96)
                .addComponent(jLabel3)
                .addGap(105, 105, 105)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap())
        );

        OBS_btn.setBackground(new java.awt.Color(255, 255, 255));
        OBS_btn.setIcon(new javax.swing.ImageIcon("C:\\Users\\fatih\\OneDrive\\Belgeler\\NetBeansProjects\\OgrenciOtomasyonProje\\img\\OBS.png")); // NOI18N
        OBS_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OBS_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Dersler_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Ogrenciler_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Siniflar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(Ogretmenler_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OBS_btn)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Dersler_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Ogrenciler_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Siniflar_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(Ogretmenler_Btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(OBS_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(154, 154, 154))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Dersler_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dersler_btnActionPerformed
      
        Dersler dersler = new Dersler();
        dersler.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_Dersler_btnActionPerformed

    private void Ogretmenler_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogretmenler_BtnActionPerformed
        Ogretmenler ogretmenler = new Ogretmenler();
        ogretmenler.setVisible(true);
        this.setVisible(false);
                
    }//GEN-LAST:event_Ogretmenler_BtnActionPerformed

    private void Ogrenciler_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ogrenciler_btnActionPerformed
       Ogrenciler ogrenciler = new Ogrenciler();
       ogrenciler.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_Ogrenciler_btnActionPerformed

    private void Siniflar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Siniflar_btnActionPerformed
      Siniflar siniflar = new Siniflar ();
      siniflar.setVisible(true);
      this.setVisible(false);
              
    }//GEN-LAST:event_Siniflar_btnActionPerformed

    private void OBS_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OBS_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OBS_btnActionPerformed

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
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaSayfa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaSayfa().setVisible(true);
                
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dersler_btn;
    private javax.swing.JButton OBS_btn;
    private javax.swing.JButton Ogrenciler_btn;
    private javax.swing.JButton Ogretmenler_Btn;
    private javax.swing.JButton Siniflar_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
