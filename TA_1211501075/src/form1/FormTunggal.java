package form1;

import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Random;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FormTunggal extends javax.swing.JFrame {

  private DecimalFormat df = new DecimalFormat("#.####");
  private Random RA = new Random();

  public FormTunggal() {
    initComponents();
    this.setSize(620, 615);
    this.setLocationRelativeTo(null);
    comboboxKriteria.addItem("Random");
    comboboxKriteria.addItem("Input");
    comboboxKriteria.setSelectedIndex(0);
    comboboxK.addItem(5);
    comboboxK.addItem(10);
    comboboxK.addItem(15);
    comboboxK.addItem(20);
    comboboxK.addItem(25);
    comboboxK.addItem(30);
    comboboxK.setSelectedIndex(-1);
    comboboxStatus.addItem("Lulus Cepat");
    comboboxStatus.addItem("Lulus Tepat");
    comboboxStatus.addItem("Lulus Terlambat");
    comboboxStatus.addItem("Tidak Lulus/DO");
    comboboxStatus.addItem("Tidak Ada Hasil");
    comboboxStatus.setSelectedIndex(-1);
    labelKeputusan.setText("Prediksi :");
  }

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    textIsiFileTraining = new javax.swing.JTextField();
    tombolTampilkanTraining = new javax.swing.JButton();
    tombolCariFileTraining = new javax.swing.JButton();
    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    textIsiFileTesting = new javax.swing.JTextField();
    tombolTampilkanTesting = new javax.swing.JButton();
    tombolCariFileTesting = new javax.swing.JButton();
    jScrollPane4 = new javax.swing.JScrollPane();
    tabelTraining = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    comboboxKriteria = new javax.swing.JComboBox();
    textSKS = new javax.swing.JTextField();
    textIPS1 = new javax.swing.JTextField();
    textIPS2 = new javax.swing.JTextField();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    textIPS3 = new javax.swing.JTextField();
    textIPS4 = new javax.swing.JTextField();
    textIPS5 = new javax.swing.JTextField();
    textIPS6 = new javax.swing.JTextField();
    textNIM = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    comboboxK = new javax.swing.JComboBox();
    jLabel12 = new javax.swing.JLabel();
    comboboxStatus = new javax.swing.JComboBox();
    tombolProses = new javax.swing.JButton();
    tombolBersih = new javax.swing.JButton();
    labelKeputusan = new javax.swing.JLabel();
    jLabel15 = new javax.swing.JLabel();
    jScrollPane3 = new javax.swing.JScrollPane();
    tabelTesting = new javax.swing.JTable();
    jLabel13 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Form Tunggal");
    setResizable(false);
    getContentPane().setLayout(null);

    jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Piih File Training"));
    jPanel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    jLabel2.setText("Ambil File");

    tombolTampilkanTraining.setText("Tampilkan");
    tombolTampilkanTraining.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolTampilkanTrainingActionPerformed(evt);
          }
        });

    tombolCariFileTraining.setText("Cari File");
    tombolCariFileTraining.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolCariFileTrainingActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(tombolCariFileTraining)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(tombolTampilkanTraining))
            .addComponent(textIsiFileTraining, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap(127, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(107, 107, 107)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        textIsiFileTraining,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombolTampilkanTraining)
                            .addComponent(tombolCariFileTraining))
                    .addContainerGap()));

    getContentPane().add(jPanel2);
    jPanel2.setBounds(10, 10, 290, 131);

    jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Piih File Testing"));
    jPanel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

    jLabel1.setText("Ambil File");

    tombolTampilkanTesting.setText("Tampilkan");
    tombolTampilkanTesting.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolTampilkanTestingActionPerformed(evt);
          }
        });

    tombolCariFileTesting.setText("Cari File");
    tombolCariFileTesting.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolCariFileTestingActionPerformed(evt);
          }
        });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textIsiFileTesting)
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout
                    .createSequentialGroup()
                    .addComponent(tombolCariFileTesting)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(tombolTampilkanTesting))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap(120, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(114, 114, 114)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        textIsiFileTesting,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolTampilkanTesting)
                            .addComponent(tombolCariFileTesting))
                    .addContainerGap()));

    getContentPane().add(jPanel1);
    jPanel1.setBounds(300, 10, 290, 131);

    tabelTraining.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String[] {
              "No", "NIM", "Nama", "JK", "IPS 1", "IPS 2", "IPS 3", "IPS 4", "IPS 5", "IPS 6",
              "SKS", "KET"
            }) {
          boolean[] canEdit =
              new boolean[] {
                false, false, false, false, false, false, false, false, false, false, false, false
              };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane4.setViewportView(tabelTraining);

    getContentPane().add(jScrollPane4);
    jScrollPane4.setBounds(10, 160, 580, 93);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kriteria"));

    jLabel3.setText("Tipe Kriteria");

    jLabel4.setText("Total SKS");

    jLabel5.setText("IPS 1");

    jLabel6.setText("IPS 2");

    jLabel7.setText("IPS 3");

    comboboxKriteria.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            comboboxKriteriaActionPerformed(evt);
          }
        });

    jLabel8.setText("IPS 4");

    jLabel9.setText("IPS 5");

    jLabel10.setText("IPS 6");

    jLabel11.setText("Jumlah K");

    jLabel12.setText("Status");

    tombolProses.setText("Proses");
    tombolProses.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolProsesActionPerformed(evt);
          }
        });

    tombolBersih.setText("Bersih");
    tombolBersih.addActionListener(
        new java.awt.event.ActionListener() {
          public void actionPerformed(java.awt.event.ActionEvent evt) {
            tombolBersihActionPerformed(evt);
          }
        });

    jLabel15.setText("NIM");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel3Layout
                    .createSequentialGroup()
                    .addGroup(
                        jPanel3Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(
                                jPanel3Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addComponent(
                                        textNIM,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        82,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel3Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(53, 53, 53)
                                    .addComponent(
                                        comboboxKriteria,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel3Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel3Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        Short.MAX_VALUE)
                                    .addGroup(
                                        jPanel3Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(
                                                textSKS,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                46,
                                                Short.MAX_VALUE)
                                            .addComponent(textIPS1)
                                            .addComponent(textIPS2))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(
                        jPanel3Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel3Layout
                                    .createParallelGroup(
                                        javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(
                                        jPanel3Layout
                                            .createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(18, 18, 18)
                                            .addComponent(textIPS5))
                                    .addGroup(
                                        jPanel3Layout
                                            .createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(
                                                textIPS3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(
                                        jPanel3Layout
                                            .createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(18, 18, 18)
                                            .addComponent(
                                                textIPS4,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                55,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(
                                        jPanel3Layout
                                            .createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(textIPS6)))
                            .addComponent(
                                tombolProses,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                83,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(
                        jPanel3Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(
                                comboboxK,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(
                                comboboxStatus,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                tombolBersih,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                82,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(
                                labelKeputusan,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                178,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(130, Short.MAX_VALUE)));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel3Layout
                    .createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addGroup(
                        jPanel3Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(
                                jPanel3Layout
                                    .createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(
                                        comboboxK,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(
                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(
                                        comboboxStatus,
                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(
                                jPanel3Layout
                                    .createSequentialGroup()
                                    .addGroup(
                                        jPanel3Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel7)
                                            .addComponent(
                                                comboboxKriteria,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(
                                                textIPS3,
                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(10, 10, 10)
                                    .addGroup(
                                        jPanel3Layout
                                            .createParallelGroup(
                                                javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(
                                                jPanel3Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(jLabel8)
                                                            .addComponent(
                                                                textIPS4,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addGap(15, 15, 15)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(jLabel9)
                                                            .addComponent(
                                                                textIPS5,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .LEADING)
                                                            .addComponent(
                                                                labelKeputusan,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                19,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addGroup(
                                                                jPanel3Layout
                                                                    .createParallelGroup(
                                                                        javax.swing.GroupLayout
                                                                            .Alignment.BASELINE)
                                                                    .addComponent(jLabel10)
                                                                    .addComponent(
                                                                        textIPS6,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout
                                                                            .PREFERRED_SIZE)))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(tombolProses)
                                                            .addComponent(tombolBersih)))
                                            .addGroup(
                                                jPanel3Layout
                                                    .createSequentialGroup()
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                textSKS,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel4))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                textIPS1,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel5))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                textIPS2,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel6))
                                                    .addPreferredGap(
                                                        javax.swing.LayoutStyle.ComponentPlacement
                                                            .UNRELATED)
                                                    .addGroup(
                                                        jPanel3Layout
                                                            .createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment
                                                                    .BASELINE)
                                                            .addComponent(
                                                                textNIM,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .DEFAULT_SIZE,
                                                                javax.swing.GroupLayout
                                                                    .PREFERRED_SIZE)
                                                            .addComponent(jLabel15))))))
                    .addContainerGap(13, Short.MAX_VALUE)));

    getContentPane().add(jPanel3);
    jPanel3.setBounds(10, 380, 580, 200);

    tabelTesting.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String[] {
              "No", "NIM", "Nama", "JK", "IPS 1", "IPS 2", "IPS 3", "IPS 4", "IPS 5", "IPS 6",
              "SKS", "KET"
            }) {
          boolean[] canEdit =
              new boolean[] {
                false, false, false, false, false, false, false, false, false, false, false, false
              };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane3.setViewportView(tabelTesting);

    getContentPane().add(jScrollPane3);
    jScrollPane3.setBounds(10, 280, 580, 94);

    jLabel13.setText("Tabel Data Training");
    getContentPane().add(jLabel13);
    jLabel13.setBounds(10, 140, 140, 14);

    jLabel14.setText("Tabel Data Testing");
    getContentPane().add(jLabel14);
    jLabel14.setBounds(10, 260, 160, 14);

    pack();
  } // </editor-fold>//GEN-END:initComponents

  private void tombolTampilkanTrainingActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolTampilkanTrainingActionPerformed
    try {
      if (textIsiFileTraining.getText().equals("")) {
        JOptionPane.showMessageDialog(
            this,
            "Belum Memilih File Excel",
            "Informasi Kesalahan Upload File",
            JOptionPane.ERROR_MESSAGE);
      } else {
        if (textIsiFileTraining.getText().endsWith(".xls")) {
          ekstensiXLSTraining();
        } else if (textIsiFileTraining.getText().endsWith(".xlsx")) {
          ekstensiXLSXTraining();
        } else {
          JOptionPane.showMessageDialog(
              this,
              "Ekstensi Tidak Diketahui",
              "Informasi Kesalahan Upload File",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    } catch (Exception er1) {

    }
  } // GEN-LAST:event_tombolTampilkanTrainingActionPerformed

  private void tombolCariFileTrainingActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolCariFileTrainingActionPerformed
    try {
      JFileChooser JFC = new JFileChooser();
      FileNameExtensionFilter fFilter = new FileNameExtensionFilter("Excel", "xls", "xlsx");
      JFC.setFileFilter(fFilter);

      if (JFC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        textIsiFileTraining.setText(JFC.getSelectedFile().getAbsolutePath());
      }
    } catch (Exception er1) {
      JOptionPane.showMessageDialog(
          this,
          "Kesalahan Upload Excel",
          "Informasi Kesalahan Upload",
          JOptionPane.WARNING_MESSAGE);
    }
  } // GEN-LAST:event_tombolCariFileTrainingActionPerformed

  private void tombolTampilkanTestingActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolTampilkanTestingActionPerformed
    try {
      if (textIsiFileTesting.getText().equals("")) {
        JOptionPane.showMessageDialog(
            this,
            "Belum Memilih File Excel",
            "Informasi Kesalahan Upload File",
            JOptionPane.ERROR_MESSAGE);
      } else {
        if (textIsiFileTesting.getText().endsWith(".xls")) {
          ekstensiXLSTesting();
        } else if (textIsiFileTesting.getText().endsWith(".xlsx")) {
          ekstensiXLSXTesting();
        } else {
          JOptionPane.showMessageDialog(
              this,
              "Ekstensi Tidak Diketahui",
              "Informasi Kesalahan Upload File",
              JOptionPane.ERROR_MESSAGE);
        }
      }
    } catch (Exception er1) {

    }
  } // GEN-LAST:event_tombolTampilkanTestingActionPerformed

  private void tombolCariFileTestingActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolCariFileTestingActionPerformed
    try {
      JFileChooser JFC = new JFileChooser();
      FileNameExtensionFilter fFilter = new FileNameExtensionFilter("Excel", "xls", "xlsx");
      JFC.setFileFilter(fFilter);

      if (JFC.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
        textIsiFileTesting.setText(JFC.getSelectedFile().getAbsolutePath());
      }
    } catch (Exception er1) {
      JOptionPane.showMessageDialog(
          this,
          "Kesalahan Upload Excel",
          "Informasi Kesalahan Upload",
          JOptionPane.WARNING_MESSAGE);
    }
  } // GEN-LAST:event_tombolCariFileTestingActionPerformed

  private void tombolProsesActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolProsesActionPerformed
    if (comboboxK.getSelectedIndex() == -1
        || (Double.parseDouble(textSKS.getText()) < 0
            || Double.parseDouble(textSKS.getText()) > 175)
        || textIPS1.getText().equals("")
        || textIPS2.getText().equals("")
        || textIPS3.getText().equals("")
        || textIPS4.getText().equals("")
        || textIPS5.getText().equals("")
        || textIPS6.getText().equals("")
        || textNIM.getText().equals("")) {
      JOptionPane.showMessageDialog(
          this,
          "Form Masih Kosong Atau Tidak Valid",
          "Informasi Kesalahan Input",
          JOptionPane.WARNING_MESSAGE);
      bersih();
    } else {
      if ((Double.parseDouble(textIPS1.getText()) >= 0
              && Double.parseDouble(textIPS1.getText()) <= 4)
          && (Double.parseDouble(textIPS2.getText()) >= 0
              && Double.parseDouble(textIPS2.getText()) <= 4)
          && (Double.parseDouble(textIPS3.getText()) >= 0
              && Double.parseDouble(textIPS3.getText()) <= 4)
          && (Double.parseDouble(textIPS4.getText()) >= 0
              && Double.parseDouble(textIPS4.getText()) <= 4)
          && (Double.parseDouble(textIPS5.getText()) >= 0
              && Double.parseDouble(textIPS5.getText()) <= 4)
          && (Double.parseDouble(textIPS6.getText()) >= 0
              && Double.parseDouble(textIPS6.getText()) <= 4)) {

        long w1 = System.currentTimeMillis();

        prosesKNN_Euclidean(
            new double[][] {
              {
                Double.parseDouble(textIPS1.getText()),
                Double.parseDouble(textIPS2.getText()),
                Double.parseDouble(textIPS3.getText()),
                Double.parseDouble(textIPS4.getText()),
                Double.parseDouble(textIPS5.getText()),
                Double.parseDouble(textIPS6.getText()),
                Double.parseDouble(textSKS.getText()),
                90
              }
            });

        long w2 = System.currentTimeMillis(), w3 = (w2 - w1);

        JOptionPane.showMessageDialog(
            this,
            "-Proses Testing Telah Selesai-\n" + "Waktu = " + w3 + " Milidetik",
            "Informasi Hasil Testing",
            JOptionPane.INFORMATION_MESSAGE);
      } else {
        JOptionPane.showMessageDialog(
            this,
            "Nilai IPS 1 hingga 6, Tidak Valid!",
            "Informasi Kesalahan Input",
            JOptionPane.WARNING_MESSAGE);
        bersih();
      }
    }
  } // GEN-LAST:event_tombolProsesActionPerformed

  private void tombolBersihActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolBersihActionPerformed
    bersih();
  } // GEN-LAST:event_tombolBersihActionPerformed

  private void comboboxKriteriaActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_comboboxKriteriaActionPerformed
    if (tabelTesting.getRowCount() != 4 && comboboxKriteria.getSelectedIndex() != -1) {
      String JC = ((JComboBox) evt.getSource()).getSelectedItem().toString();
      if (JC.equals("Random")) {
        disabledEnabledKriteria(
            false, false, false, false, false, false, false, false, false, true, false);
        int TR = RA.nextInt(tabelTesting.getRowCount());

        double ips1 = Double.parseDouble(tabelTesting.getValueAt(TR, 4).toString()),
            ips2 = Double.parseDouble(tabelTesting.getValueAt(TR, 5).toString()),
            ips3 = Double.parseDouble(tabelTesting.getValueAt(TR, 6).toString()),
            ips4 = Double.parseDouble(tabelTesting.getValueAt(TR, 7).toString()),
            ips5 = Double.parseDouble(tabelTesting.getValueAt(TR, 8).toString()),
            ips6 = Double.parseDouble(tabelTesting.getValueAt(TR, 9).toString()),
            sks = Double.parseDouble(tabelTesting.getValueAt(TR, 10).toString()),
            ket = Double.parseDouble(tabelTesting.getValueAt(TR, 11).toString());
        ;

        textSKS.setText("" + sks);
        textIPS1.setText("" + ips1);
        textIPS2.setText("" + ips2);
        textIPS3.setText("" + ips3);
        textIPS4.setText("" + ips4);
        textIPS5.setText("" + ips5);
        textIPS6.setText("" + ips6);
        textNIM.setText(tabelTesting.getValueAt(TR, 1).toString());

        if (ket == 20) {
          comboboxStatus.setSelectedIndex(0);
        } else if (ket == 30) {
          comboboxStatus.setSelectedIndex(1);
        } else if (ket == 40) {
          comboboxStatus.setSelectedIndex(2);
        } else if (ket == 50) {
          comboboxStatus.setSelectedIndex(3);
        } else if (ket == 60) {
          comboboxStatus.setSelectedIndex(4);
        }
      } else {
        disabledEnabledKriteria(false, true, true, true, true, true, true, true, true, true, true);
      }
    }
  } // GEN-LAST:event_comboboxKriteriaActionPerformed

  void bersih() {
    disabledEnabledKriteria(true, true, true, true, true, true, true, true, true, true, true);
    textSKS.setText("");
    textIPS1.setText("");
    textIPS2.setText("");
    textNIM.setText("");
    textIPS3.setText("");
    textIPS4.setText("");
    textIPS5.setText("");
    textIPS6.setText("");
    labelKeputusan.setText("");
    comboboxK.setSelectedIndex(-1);
    comboboxStatus.setSelectedIndex(-1);
    comboboxKriteria.setSelectedIndex(-1);
  }

  void prosesKNN_Euclidean(double[][] pNilaiTesting) {
    double[][] nilaiTraining = nilaiDefaultTraining();
    double[] nilaiKuadrat = nilaiKuadratikEuclidean(pNilaiTesting, nilaiTraining);
    double[][] nilaiTrainingSorting = nilaiTrainingSortingEuclidian(nilaiKuadrat, nilaiTraining);
    int jumlahK = Integer.parseInt(comboboxK.getSelectedItem().toString());

    double[][] nilaiTrainingK = nilaiTrainingSebanyakJumlahK(nilaiTrainingSorting, jumlahK);
    int j20 = kemunculanKelas(nilaiTrainingK, 20),
        j30 = kemunculanKelas(nilaiTrainingK, 30),
        j40 = kemunculanKelas(nilaiTrainingK, 40),
        j50 = kemunculanKelas(nilaiTrainingK, 50),
        j60 = kemunculanKelas(nilaiTrainingK, 60),
        kelasMayoritas = nilaiMayoritasKelas(new int[] {j20, j30, j40, j50, j60});

    String cetak = "---Jumlah K = " + jumlahK + "---\n";
    cetak += "Jumlah 20 = " + j20 + "\n";
    cetak += "Jumlah 30 = " + j30 + "\n";
    cetak += "Jumlah 40 = " + j40 + "\n";
    cetak += "Jumlah 50 = " + j50 + "\n";
    cetak += "Jumah 60 = " + j60 + "\n";
    System.out.print(cetak);

    if (kelasMayoritas == 0) {
      labelKeputusan.setText("Prediksi : Lulus Cepat");
      labelKeputusan.setForeground(Color.BLUE);
    } else if (kelasMayoritas == 1) {
      labelKeputusan.setText("Prediksi : Lulus Tepat");
      labelKeputusan.setForeground(Color.BLUE);
    } else if (kelasMayoritas == 2) {
      labelKeputusan.setText("Prediksi : Lulus Terlambat");
      labelKeputusan.setForeground(Color.RED);
    } else if (kelasMayoritas == 3) {
      labelKeputusan.setText("Prediksi : Tidak Lulus/DO");
      labelKeputusan.setForeground(Color.RED);
    } else if (kelasMayoritas == 4) {
      labelKeputusan.setText("Prediksi : Tidak Ada Hasil");
      labelKeputusan.setForeground(Color.RED);
    }
  }

  void disabledEnabledTraining(boolean pText, boolean pCari, boolean pTampil) {
    textIsiFileTraining.enable(pText);
    tombolCariFileTraining.enable(pCari);
    tombolTampilkanTraining.enable(pTampil);
  }

  void disabledEnabledTesting(boolean pText, boolean pCari, boolean pTampil) {
    textIsiFileTesting.enable(pText);
    tombolCariFileTesting.enable(pCari);
    tombolTampilkanTesting.enable(pTampil);
  }

  void disabledEnabledKriteria(
      boolean pKriteria,
      boolean pSKS,
      boolean pIPS1,
      boolean pIPS2,
      boolean pIPS3,
      boolean pIPS4,
      boolean pIPS5,
      boolean pIPS6,
      boolean pNIM,
      boolean pJumlahK,
      boolean pStatus) {
    comboboxKriteria.enable(pKriteria);
    textSKS.setEditable(pSKS);
    textIPS1.setEditable(pIPS1);
    textIPS2.setEditable(pIPS2);
    textIPS3.setEditable(pIPS3);
    textIPS4.setEditable(pIPS4);
    textIPS5.setEditable(pIPS5);
    textIPS6.setEditable(pIPS6);
    textNIM.setEditable(pNIM);
    comboboxK.enable(pJumlahK);
    comboboxStatus.enable(pStatus);
  }

  void ekstensiXLSTraining() {
    try {
      FileInputStream FIS = new FileInputStream(new File(textIsiFileTraining.getText()));
      HSSFWorkbook wb = new HSSFWorkbook(FIS);
      HSSFSheet ws = wb.getSheetAt(0);

      int baris = ws.getLastRowNum() + 1;
      int kolom = ws.getRow(0).getLastCellNum();
      String[][] data = new String[baris][kolom];
      String[] nKolom = new String[kolom];

      // ambil semua informasi yang berada pada sheet baik itu nama kolom maupun nilai pada baris
      // nya
      for (int i = 0; i < baris; i++) {
        HSSFRow row = ws.getRow(i);
        for (int j = 0; j < kolom; j++) {
          HSSFCell cell = row.getCell(j);
          String value = nilaiCell(cell);
          data[i][j] = value;
        }
      }

      // ambil nama kolom pada index data baris ke 0
      for (int a = 0; a < kolom; a++) {
        nKolom[a] = data[0][a];
      }

      DefaultTableModel DTM = new DefaultTableModel(data, nKolom);
      tabelTraining.setModel(DTM);
      DTM.removeRow(0);
    } catch (IOException er1) {
      System.out.print("Error : \n" + er1.toString());
    }
  }

  void ekstensiXLSXTraining() {
    try {
      FileInputStream FIS = new FileInputStream(new File(textIsiFileTraining.getText()));
      XSSFWorkbook wb = new XSSFWorkbook(FIS);
      XSSFSheet ws = wb.getSheetAt(0);

      int baris = ws.getLastRowNum() + 1;
      int kolom = ws.getRow(0).getLastCellNum();
      String[][] data = new String[baris][kolom];
      String[] nKolom = new String[kolom];

      for (int i = 0; i < baris; i++) {
        XSSFRow row = ws.getRow(i);
        for (int j = 0; j < kolom; j++) {
          XSSFCell cell = row.getCell(j);
          String value = nilaiCell(cell);
          data[i][j] = value;
        }
      }

      // ambil nama kolom pada index data baris ke 0
      for (int a = 0; a < kolom; a++) {
        nKolom[a] = data[0][a];
      }

      DefaultTableModel DTM = new DefaultTableModel(data, nKolom);
      tabelTraining.setModel(DTM);
      DTM.removeRow(0);
    } catch (Exception er1) {
      System.out.print("Error : \n" + er1.toString());
    }
  }

  void ekstensiXLSTesting() {
    try {
      FileInputStream FIS = new FileInputStream(new File(textIsiFileTesting.getText()));
      HSSFWorkbook wb = new HSSFWorkbook(FIS);
      HSSFSheet ws = wb.getSheetAt(0);

      int baris = ws.getLastRowNum() + 1;
      int kolom = ws.getRow(0).getLastCellNum();
      String[][] data = new String[baris][kolom];
      String[] nKolom = new String[kolom];

      // ambil semua informasi yang berada pada sheet baik itu nama kolom maupun nilai pada baris
      // nya
      for (int i = 0; i < baris; i++) {
        HSSFRow row = ws.getRow(i);
        for (int j = 0; j < kolom; j++) {
          HSSFCell cell = row.getCell(j);
          String value = nilaiCell(cell);
          data[i][j] = value;
        }
      }

      // ambil nama kolom pada index data baris ke 0
      for (int a = 0; a < kolom; a++) {
        nKolom[a] = data[0][a];
      }

      DefaultTableModel DTM = new DefaultTableModel(data, nKolom);
      tabelTesting.setModel(DTM);
      DTM.removeRow(0);
    } catch (IOException er1) {
      System.out.print("Error : \n" + er1.toString());
    }
  }

  void ekstensiXLSXTesting() {
    try {
      FileInputStream FIS = new FileInputStream(new File(textIsiFileTesting.getText()));
      XSSFWorkbook wb = new XSSFWorkbook(FIS);
      XSSFSheet ws = wb.getSheetAt(0);

      int baris = ws.getLastRowNum() + 1;
      int kolom = ws.getRow(0).getLastCellNum();
      String[][] data = new String[baris][kolom];
      String[] nKolom = new String[kolom];

      for (int i = 0; i < baris; i++) {
        XSSFRow row = ws.getRow(i);
        for (int j = 0; j < kolom; j++) {
          XSSFCell cell = row.getCell(j);
          String value = nilaiCell(cell);
          data[i][j] = value;
        }
      }

      // ambil nama kolom pada index data baris ke 0
      for (int a = 0; a < kolom; a++) {
        nKolom[a] = data[0][a];
      }

      DefaultTableModel DTM = new DefaultTableModel(data, nKolom);
      tabelTesting.setModel(DTM);
      DTM.removeRow(0);
    } catch (Exception er1) {
      System.out.print("Error : \n" + er1.toString());
    }
  }

  String nilaiCell(HSSFCell pCell) {
    int tipe = pCell.getCellType();
    Object nilaiBalik = null;

    if (tipe == 0) {
      nilaiBalik = pCell.getNumericCellValue();
    } else if (tipe == 1) {
      nilaiBalik = pCell.getStringCellValue();
    }

    return nilaiBalik.toString();
  }

  String nilaiCell(XSSFCell pCell) {
    int tipe = pCell.getCellType();
    Object nilaiBalik = null;

    if (tipe == 0) {
      nilaiBalik = pCell.getNumericCellValue();
    } else if (tipe == 1) {
      nilaiBalik = pCell.getStringCellValue();
    }

    return nilaiBalik.toString();
  }

  int nilaiMayoritasKelas(int[] pJumlahNilaiKelas) {
    int nilaiBalik = 0, nMax = pJumlahNilaiKelas[0];

    for (int i = 1; i < pJumlahNilaiKelas.length; i++) {
      if (nMax < pJumlahNilaiKelas[i]) {
        nMax = pJumlahNilaiKelas[i];
        nilaiBalik = i;
      }
    }

    return nilaiBalik;
  }

  int kemunculanKelas(double[][] pNilaiTraing, int pNilai) {
    int nilaiBalik = 0;
    for (int i = 0; i < pNilaiTraing.length; i++) {
      if (pNilaiTraing[i][7] == pNilai) {
        nilaiBalik++;
      }
    }
    return nilaiBalik;
  }

  double[][] nilaiDefaultTraining() {
    double[][] nilaiBalik = new double[tabelTraining.getRowCount()][8];

    int kolom = 0;
    for (int i = 0; i < tabelTraining.getRowCount(); i++) {
      for (int j = 4; j <= 11; j++) {
        nilaiBalik[i][kolom] = Double.parseDouble(tabelTraining.getValueAt(i, j).toString());
        kolom++;
      }
      kolom = 0;
    }
    return nilaiBalik;
  }

  double[][] nilaiTrainingSebanyakJumlahK(double[][] pNilaiTraining, int pJumlahK) {
    double[][] nilaiBalik = new double[pJumlahK][8];

    for (int i = 0; i < pJumlahK; i++) {
      for (int j = 0; j < 8; j++) {
        nilaiBalik[i][j] = pNilaiTraining[i][j];
      }
    }

    return nilaiBalik;
  }

  double[][] nilaiTrainingSortingEuclidian(double[] pNilaiKuadrat, double[][] pNilaiTraining) {
    double[][] tempTrain = new double[pNilaiTraining.length][8];
    double temp = 0;

    for (int i = 0; i < pNilaiTraining.length; i++) {
      for (int j = i + 1; j < pNilaiKuadrat.length; j++) {
        if (pNilaiKuadrat[j] < pNilaiKuadrat[i]) {
          temp = pNilaiKuadrat[i];
          pNilaiKuadrat[i] = pNilaiKuadrat[j];
          pNilaiKuadrat[j] = temp;
          for (int k = 0; k < 8; k++) {
            tempTrain[i][k] = pNilaiTraining[i][k];
            pNilaiTraining[i][k] = pNilaiTraining[j][k];
            pNilaiTraining[j][k] = tempTrain[i][k];
          }
        }
      }
    }
    return pNilaiTraining;
  }

  double[] nilaiKuadratikEuclidean(double[][] pTesting, double[][] pTraining) {
    double[] nilaiBalik = new double[pTraining.length];

    for (int i = 0; i < pTraining.length; i++) {
      double ips1 = Math.abs(pTraining[i][0] - pTesting[0][0]),
          ips2 = Math.abs(pTraining[i][1] - pTesting[0][1]),
          ips3 = Math.abs(pTraining[i][2] - pTesting[0][2]),
          ips4 = Math.abs(pTraining[i][3] - pTesting[0][3]),
          ips5 = Math.abs(pTraining[i][4] - pTesting[0][4]),
          ips6 = Math.abs(pTraining[i][5] - pTesting[0][5]),
          sks = Math.abs(pTraining[i][6] - pTesting[0][6]),
          pangkat =
              Math.pow(ips1, 2)
                  + Math.pow(ips2, 2)
                  + Math.pow(ips3, 2)
                  + Math.pow(ips4, 2)
                  + Math.pow(ips5, 2)
                  + Math.pow(ips6, 2)
                  + Math.pow(sks, 2),
          akar = Double.parseDouble(df.format(Math.sqrt(pangkat)));
      nilaiBalik[i] = akar;
    }

    return nilaiBalik;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox comboboxK;
  private javax.swing.JComboBox comboboxKriteria;
  private javax.swing.JComboBox comboboxStatus;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel10;
  private javax.swing.JLabel jLabel11;
  private javax.swing.JLabel jLabel12;
  private javax.swing.JLabel jLabel13;
  private javax.swing.JLabel jLabel14;
  private javax.swing.JLabel jLabel15;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JLabel jLabel7;
  private javax.swing.JLabel jLabel8;
  private javax.swing.JLabel jLabel9;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JLabel labelKeputusan;
  private javax.swing.JTable tabelTesting;
  private javax.swing.JTable tabelTraining;
  private javax.swing.JTextField textIPS1;
  private javax.swing.JTextField textIPS2;
  private javax.swing.JTextField textIPS3;
  private javax.swing.JTextField textIPS4;
  private javax.swing.JTextField textIPS5;
  private javax.swing.JTextField textIPS6;
  private javax.swing.JTextField textIsiFileTesting;
  private javax.swing.JTextField textIsiFileTraining;
  private javax.swing.JTextField textNIM;
  private javax.swing.JTextField textSKS;
  private javax.swing.JButton tombolBersih;
  private javax.swing.JButton tombolCariFileTesting;
  private javax.swing.JButton tombolCariFileTraining;
  private javax.swing.JButton tombolProses;
  private javax.swing.JButton tombolTampilkanTesting;
  private javax.swing.JButton tombolTampilkanTraining;
  // End of variables declaration//GEN-END:variables
}
