/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ogrenciotomasyonproje.dersler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ogrenciotomasyonproje.AnaSayfa;
import ogrenciotomasyonproje.ogrenciler.OgrenciListele;

/**
 *
 * @author fatih
 */
public class DersSil extends javax.swing.JFrame {

    /**
     * Creates new form DersSil
     */
    public DersSil() {
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

        sil_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Yenile_btn = new javax.swing.JButton();
        don_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        sil_btn.setText("Sil");
        sil_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sil_btnActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dersİD", "dersAd", "ogretmenİD"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Yenile_btn.setText("Yenile");
        Yenile_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Yenile_btnActionPerformed(evt);
            }
        });

        don_btn.setText("Anasayfaya Dön");
        don_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                don_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(Yenile_btn)
                        .addGap(91, 91, 91)
                        .addComponent(sil_btn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(don_btn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(don_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Yenile_btn)
                    .addComponent(sil_btn))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sil_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sil_btnActionPerformed
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // get selected row index
        try {
            int SelectedRowIndex = jTable1.getSelectedRow();
            model.removeRow(SelectedRowIndex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    
        
        try
        {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("dersler.txt"));
            PrintWriter fileWriter = new PrintWriter(bufferedWriter);

            for(int i=0; i<model.getRowCount(); ++i)
            {
                for(int j=0; j<model.getColumnCount(); ++j)
                {
                    String s = model.getValueAt(i,j).toString();
                    fileWriter.print(s);
                    fileWriter.print("/");
                }
                fileWriter.println("");
            }
            fileWriter.close();
            JOptionPane.showMessageDialog(null, "Güncellendi");
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Hata");
        }
    }//GEN-LAST:event_sil_btnActionPerformed

    private void Yenile_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Yenile_btnActionPerformed
             FileReader fileReader = null;
        try {
            fileReader = new FileReader("dersler.txt");
            BufferedReader br = new BufferedReader(fileReader);//dosyayı oluştur
            DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
            
                int rowCount = tableModel.getRowCount();

              for (int i = rowCount - 1; i >= 0; i--) {
                           tableModel.removeRow(i);
                                                   }
              
              
            Object[] tableLines = br.lines().toArray();
            for (int i = 0; i < tableLines.length; i++) {
                String line = tableLines[i].toString().trim();
                String[] dataRow = line.split("/");
                tableModel.addRow(dataRow);
            }
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(OgrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                fileReader.close();
            } catch (IOException ex) {
                java.util.logging.Logger.getLogger(OgrenciListele.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_Yenile_btnActionPerformed

    private void don_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_don_btnActionPerformed
           Dersler dersler = new Dersler();
       dersler.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_don_btnActionPerformed

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
            java.util.logging.Logger.getLogger(DersSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DersSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DersSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DersSil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DersSil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Yenile_btn;
    private javax.swing.JButton don_btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton sil_btn;
    // End of variables declaration//GEN-END:variables
}