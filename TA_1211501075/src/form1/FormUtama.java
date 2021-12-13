package form1;

import java.awt.Dimension;
import java.awt.Toolkit;

public class FormUtama extends javax.swing.JFrame {

  public FormUtama() {
    initComponents();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    setLocation(dim.width / 2 - getWidth() / 2, dim.height / 2 - getHeight() / 2);
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    tombolFormJamak = new javax.swing.JButton();
    tombolFormTunggal = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Form Utama");
    setResizable(false);

    tombolFormJamak.setText("Form Jamak");
    tombolFormJamak.setName(""); // NOI18N
    tombolFormJamak.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolFormJamakActionPerformed(evt);
          }
        });

    tombolFormTunggal.setText("Form Tunggal");
    tombolFormTunggal.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolFormTunggalActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(
                        tombolFormJamak,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        207,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(
                        tombolFormTunggal,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        207,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()));
    layout.setVerticalGroup(
        layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addGroup(
                        layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(
                                tombolFormJamak,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                122,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                tombolFormTunggal,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                122,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void tombolFormJamakActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolFormJamakActionPerformed
    FormJamak FJ = new FormJamak();
    FJ.show(true);
  } // GEN-LAST:event_tombolFormJamakActionPerformed

  private void tombolFormTunggalActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolFormTunggalActionPerformed
    FormTunggal FT = new FormTunggal();
    FT.show(true);
  } // GEN-LAST:event_tombolFormTunggalActionPerformed

  public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(
        new Runnable() {
          public void run() {
            new FormUtama().setVisible(true);
          }
        });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton tombolFormJamak;
  private javax.swing.JButton tombolFormTunggal;
  // End of variables declaration//GEN-END:variables
}
