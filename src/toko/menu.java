/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toko;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class menu extends javax.swing.JFrame {
String userakses, userkelas;
    /**
     * Creates new form menu
     */
    public menu(String akses, String kelas) {
        initComponents();
        userakses = akses;
        userkelas = kelas;
        switch (userakses) {
            case "admin":
                loginAdmin();
                break;
            case "umum":
                loginUmum();
                break;
        }
    }
public void loginAdmin() {
    btnbarang.setEnabled(true);
    btnkar.setEnabled(true);
}
public void loginUmum() {
    btnbarang.setEnabled(true);
    btnkar.setEnabled(false);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnbarang = new javax.swing.JButton();
        btnkar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnbarang.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnbarang.setText("INPUT DATA BARANG");
        btnbarang.setActionCommand("jbutton");
        btnbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbarangActionPerformed(evt);
            }
        });

        btnkar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnkar.setText("INPUT DATA KARYAWAN");
        btnkar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkarActionPerformed(evt);
            }
        });

        jTextField1.setBackground(new java.awt.Color(102, 102, 255));
        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("DATA INVENTARIS TOKO SUBAGYO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnkar, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addComponent(jTextField1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnbarang, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnkar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 127, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbarangActionPerformed
barang bar = new barang(userakses, userkelas);
this.dispose();
bar.show();
// TODO add your handling code here:
    }//GEN-LAST:event_btnbarangActionPerformed

    private void btnkarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkarActionPerformed
  user kar = new user(userakses, userkelas);
this.dispose();
kar.show();      // TODO add your handling code here:
    }//GEN-LAST:event_btnkarActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbarang;
    private javax.swing.JButton btnkar;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
