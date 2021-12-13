package form1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;
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

public class FormJamak extends javax.swing.JFrame {

  private DecimalFormat df = new DecimalFormat("#.####");
  private int[][] nilaiKesimpulan = null;

  public FormJamak() {
    initComponents();
    this.setSize(650, 615);
    this.setLocationRelativeTo(null);
    comboJumlahK.addItem(5);
    comboJumlahK.addItem(10);
    comboJumlahK.addItem(15);
    comboJumlahK.addItem(20);
    comboJumlahK.addItem(25);
    comboJumlahK.addItem(30);
    comboJumlahK.setSelectedIndex(-1);
  }

  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    textIsiFileTesting = new javax.swing.JTextField();
    tombolTampilkanTesting = new javax.swing.JButton();
    tombolCariFileTesting = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    textIsiFileTraining = new javax.swing.JTextField();
    tombolTampilkanTraining = new javax.swing.JButton();
    tombolCariFileTraining = new javax.swing.JButton();
    jScrollPane1 = new javax.swing.JScrollPane();
    tabelHasilPrediksi = new javax.swing.JTable();
    jScrollPane3 = new javax.swing.JScrollPane();
    tabelTesting = new javax.swing.JTable();
    jScrollPane4 = new javax.swing.JScrollPane();
    tabelTraining = new javax.swing.JTable();
    jPanel3 = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    comboJumlahK = new javax.swing.JComboBox();
    tombolProses = new javax.swing.JButton();
    tombolBersih = new javax.swing.JButton();
    jLabel4 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Form Jamak");
    setResizable(false);
    getContentPane().setLayout(null);

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
            .addComponent(textIsiFileTesting, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(
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
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(116, 116, 116)));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel1Layout
                    .createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(jLabel1)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(
                        textIsiFileTesting,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(
                        jPanel1Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tombolCariFileTesting)
                            .addComponent(tombolTampilkanTesting))));

    getContentPane().add(jPanel1);
    jPanel1.setBounds(330, 0, 310, 130);

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
            .addComponent(textIsiFileTraining)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addComponent(tombolCariFileTraining)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(tombolTampilkanTraining))
            .addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                jPanel2Layout
                    .createSequentialGroup()
                    .addContainerGap(134, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(120, 120, 120)));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel2Layout
                    .createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(jLabel2)
                    .addGap(6, 6, 6)
                    .addComponent(
                        textIsiFileTraining,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        37,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(6, 6, 6)
                    .addGroup(
                        jPanel2Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tombolCariFileTraining)
                            .addComponent(tombolTampilkanTraining))));

    getContentPane().add(jPanel2);
    jPanel2.setBounds(10, 0, 310, 130);

    tabelHasilPrediksi.setModel(
        new javax.swing.table.DefaultTableModel(
            new Object[][] {
              {null, null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null, null},
              {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String[] {
              "No",
              "NIM",
              "Nama",
              "JK",
              "IPS 1",
              "IPS 2",
              "IPS 3",
              "IPS 4",
              "IPS 5",
              "IPS 6",
              "SKS",
              "KET",
              "Prediksi"
            }) {
          boolean[] canEdit =
              new boolean[] {
                false, false, false, false, false, false, false, false, false, false, false, false,
                false
              };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane1.setViewportView(tabelHasilPrediksi);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(10, 410, 630, 100);

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
                false, false, false, false, false, false, false, false, false, false, true, false
              };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane3.setViewportView(tabelTesting);

    getContentPane().add(jScrollPane3);
    jScrollPane3.setBounds(10, 280, 630, 100);

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
                false, false, false, false, false, false, false, false, false, false, true, false
              };

          public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit[columnIndex];
          }
        });
    jScrollPane4.setViewportView(tabelTraining);

    getContentPane().add(jScrollPane4);
    jScrollPane4.setBounds(10, 150, 630, 100);

    jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kriteria"));

    jLabel3.setText("Jumlah K");

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

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel3Layout
                    .createSequentialGroup()
                    .addComponent(jLabel3)
                    .addPreferredGap(
                        javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addComponent(
                        comboJumlahK,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        132,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tombolProses)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tombolBersih)));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout
            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(
                jPanel3Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(
                        comboJumlahK,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        32,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
            .addGroup(
                jPanel3Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tombolProses)
                    .addComponent(tombolBersih)));

    getContentPane().add(jPanel3);
    jPanel3.setBounds(250, 520, 390, 55);

    jLabel4.setText("Tabel Data Training");
    getContentPane().add(jLabel4);
    jLabel4.setBounds(10, 130, 140, 14);

    jLabel5.setText("Tabel Data Testing");
    getContentPane().add(jLabel5);
    jLabel5.setBounds(10, 260, 160, 14);

    jLabel6.setText("Tabel Data Prediksi");
    getContentPane().add(jLabel6);
    jLabel6.setBounds(10, 390, 170, 14);

    pack();
    setLocationRelativeTo(null);
  } // </editor-fold>//GEN-END:initComponents

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

  private void tombolProsesActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolProsesActionPerformed
    if (comboJumlahK.getSelectedIndex() == -1) {
      JOptionPane.showMessageDialog(
          this,
          "Belum Memilih Jumlah K",
          "Informasi Kesalahan Proses Prediksi",
          JOptionPane.WARNING_MESSAGE);
      comboJumlahK.requestFocus(true);
    } else {
      long w1 = System.currentTimeMillis();

      int jTrainingBaris = tabelTraining.getRowCount(),
          jTestingBaris = tabelTesting.getRowCount(),
          kolom = 0;

      double[][] nilaiTraining = nilaiDefaultTraining(jTrainingBaris),
          nilaiTesting = nilaiDefaultTesting(jTestingBaris),
          nilaiKuadrat =
              nilaiPerhitunganKuadrat(jTrainingBaris, jTestingBaris, nilaiTraining, nilaiTesting),
          hasilTempS;

      double[][][] sortingNilaiTrainingS = new double[jTestingBaris][][];

      for (int i = 0; i < jTestingBaris; i++) {
        kolom = i;
        hasilTempS = sortingNilaiTraining(nilaiTraining, nilaiKuadrat, kolom)[0];
        sortingNilaiTrainingS[i] = hasilTempS;
      }

      int jumlahK = Integer.parseInt(comboJumlahK.getSelectedItem().toString());
      double[][][] nilaiTrainingK = nilaiTrainingSebanyakK(sortingNilaiTrainingS, jumlahK);

      int[][][] jumlahSetiapKelas = jumlahTerbanyakKemunculan(nilaiTrainingK);

      double[][] nilaiTestingKesimpulan = kirimKesimpulanKeTesting(jTestingBaris, nilaiTesting);

      String[][] nilaiTestingKumpul = new String[jTestingBaris][13];
      // copy dari nim hingga keterangan
      for (int i = 0; i < jTestingBaris; i++) {
        for (int j = 0; j <= 11; j++) {
          nilaiTestingKumpul[i][j] = tabelTesting.getValueAt(i, j).toString();
        }
      }

      for (int i = 0; i < jTestingBaris; i++) {
        nilaiTestingKumpul[i][12] = String.valueOf(nilaiTestingKesimpulan[i][7]);
      }

      tabelHasilPrediksi.setModel(
          new DefaultTableModel(
              nilaiTestingKumpul,
              new String[] {
                "No.",
                "NIM",
                "Nama",
                "JK",
                "IPS1",
                "IPS2",
                "IPS3",
                "IPS4",
                "IPS5",
                "IPS6",
                "SKS",
                "KET",
                "PREDIKSI"
              }));

      int jum = 1;
      for (int i = 0; i < jTestingBaris; i++) {
        double nStat = Double.parseDouble(tabelHasilPrediksi.getValueAt(i, 11).toString()),
            nKet = Double.parseDouble(tabelHasilPrediksi.getValueAt(i, 12).toString());
        if (nStat == nKet) {
          jum++;
        }
      }

      long w2 = System.currentTimeMillis(), w3 = (w2 - w1) / 1000;

      double rata1 =
          Double.parseDouble(df.format(jum / Double.parseDouble(String.valueOf(jTestingBaris))))
              * 100;
      String info = "-Proses Testing Telah Selesai-\n";
      info += "Data Testing = " + jTestingBaris + "\n";
      info += "Tepat Prediksi = " + jum + "\n";
      info += "Akurasi Prediksi = " + df.format(rata1) + "\n";
      info += "Waktu = " + w3 + " Detik";
      JOptionPane.showMessageDialog(
          this, info, "Informasi Hasil Prediksi", JOptionPane.INFORMATION_MESSAGE);
    }
  } // GEN-LAST:event_tombolProsesActionPerformed

  private void tombolBersihActionPerformed(
      java.awt.event.ActionEvent evt) { // GEN-FIRST:event_tombolBersihActionPerformed
    tabelTraining.setModel(new DefaultTableModel());
    tabelTesting.setModel(new DefaultTableModel());
    tabelHasilPrediksi.setModel(new DefaultTableModel());
    comboJumlahK.setSelectedIndex(-1);
    textIsiFileTesting.setText("");
    textIsiFileTraining.setText("");
  } // GEN-LAST:event_tombolBersihActionPerformed

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

  void cetak(String pInfo, double[][] pAR1) {
    System.out.println(pInfo);
    for (int i = 0; i < pAR1.length; i++) {
      for (int j = 0; j < pAR1[i].length; j++) {
        System.out.print(pAR1[i][j] + "\t");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  void cetak(String pInfo, String[][] pAR1) {
    System.out.println(pInfo);
    for (int i = 0; i < pAR1.length; i++) {
      for (int j = 0; j < pAR1[i].length; j++) {
        System.out.print(pAR1[i][j] + "\t");
      }
      System.out.println("");
    }
    System.out.println("");
  }

  void cetak(String pInfo, double[][][] pAR1) {
    System.out.println(pInfo);
    for (int i = 0; i < pAR1.length; i++) {
      for (int j = 0; j < pAR1[i].length; j++) {
        for (int k = 0; k < pAR1[i][j].length; k++) {
          System.out.print(pAR1[i][j][k] + "\t");
        }
        System.out.println("");
      }
      System.out.println("");
    }
    System.out.println("");
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

  double[][] nilaiDefaultTraining(int pBaris) {
    double[][] nilaiBalik = new double[pBaris][8];
    int kolom = 0;

    for (int i = 0; i < pBaris; i++) {
      for (int j = 4; j <= 11; j++) {
        nilaiBalik[i][kolom] = Double.parseDouble(tabelTraining.getValueAt(i, j).toString());
        kolom++;
      }
      kolom = 0;
    }

    return nilaiBalik;
  }

  double[][] nilaiDefaultTesting(int pBaris) {
    double[][] nilaiBalik = new double[pBaris][8];
    int kolom = 0;

    for (int i = 0; i < pBaris; i++) {
      for (int j = 4; j <= 11; j++) {
        nilaiBalik[i][kolom] = Double.parseDouble(tabelTesting.getValueAt(i, j).toString());
        kolom++;
      }
      kolom = 0;
    }

    return nilaiBalik;
  }

  double[][] nilaiPerhitunganKuadrat(
      int pJTraining, int pJTesting, double[][] pTraining, double[][] pTesting) {
    double[][] nilaiBalik = new double[pJTraining][pJTesting];

    for (int i = 0; i < pJTraining; i++) {
      for (int j = 0; j < pJTesting; j++) {
        double ips1 = Math.abs(pTraining[i][0] - pTesting[j][0]),
            ips2 = Math.abs(pTraining[i][1] - pTesting[j][1]),
            ips3 = Math.abs(pTraining[i][2] - pTesting[j][2]),
            ips4 = Math.abs(pTraining[i][3] - pTesting[j][3]),
            ips5 = Math.abs(pTraining[i][4] - pTesting[j][4]),
            ips6 = Math.abs(pTraining[i][5] - pTesting[j][5]),
            totalSKS = Math.abs(pTraining[i][6] - pTesting[j][6]),
            pangkat =
                Math.pow(ips1, 2)
                    + Math.pow(ips2, 2)
                    + Math.pow(ips3, 2)
                    + Math.pow(ips4, 2)
                    + Math.pow(ips5, 2)
                    + Math.pow(ips6, 2)
                    + Math.pow(totalSKS, 2),
            akar = Double.parseDouble(df.format(Math.sqrt(pangkat)));
        nilaiBalik[i][j] = akar;
      }
    }
    return nilaiBalik;
  }

  double[][][] sortingNilaiTraining(
      double nilaiTrain[][], double hasilKuadrat[][], int indexTesting) {
    double[][] input = new double[nilaiTrain.length][], input2 = new double[hasilKuadrat.length][];
    System.arraycopy(nilaiTrain, 0, input, 0, nilaiTrain.length);
    System.arraycopy(hasilKuadrat, 0, input2, 0, hasilKuadrat.length);
    double[][][] returnVal = new double[2][input.length][input[0].length];
    int counter, index;
    double temp, temp2[];

    for (counter = 0; counter < input.length - 1; counter++) {
      for (index = 0; index < input.length - 1 - counter; index++) {
        if (input2[index][indexTesting] > input2[index + 1][indexTesting]) {
          temp = input2[index][indexTesting];
          temp2 = input[index];

          input2[index][indexTesting] = input2[index + 1][indexTesting];
          input[index] = input[index + 1];

          input2[index + 1][indexTesting] = temp;
          input[index + 1] = temp2;
        }
      }
    }

    for (int i = 0; i < returnVal.length; i++) {
      for (int j = 0; j < input.length; j++) {
        for (int k = 0; k < input[0].length; k++) {
          if (i == 0) {
            returnVal[i][j][k] = input[j][k];
          } else {
            returnVal[i][j][k] = input2[j][k];
          }
        }
      }
    }

    return returnVal;
  }

  double[][][] nilaiTrainingSebanyakK(double[][][] pNilaiTraining, int pJumlahK) {
    double[][][] nilaiBalik = new double[pNilaiTraining.length][pJumlahK][8];

    for (int i = 0; i < pNilaiTraining.length; i++) {
      for (int j = 0; j < pJumlahK; j++) {
        for (int k = 0; k < 8; k++) {
          nilaiBalik[i][j][k] = pNilaiTraining[i][j][k];
        }
      }
    }

    return nilaiBalik;
  }

  int[][][] jumlahTerbanyakKemunculan(double[][][] pNilaiK) {
    int[][][] nilaiBalik = new int[pNilaiK.length][1][1];
    int j30 = 0, j20 = 0, j40 = 0, j50 = 0, j60 = 0, tMaks = 0, tNilai = 0;
    this.nilaiKesimpulan = new int[pNilaiK.length][1];
    int[][] tempMaks = new int[pNilaiK.length][6];

    for (int a = 0; a < pNilaiK.length; a++) {
      for (int b = 0; b < pNilaiK[a].length; b++) {
        for (int c = 0; c < pNilaiK[a][b].length; c++) {
          if (pNilaiK[a][b][c] == 20) {
            j20++;
          } else if (pNilaiK[a][b][c] == 30) {
            j30++;
          } else if (pNilaiK[a][b][c] == 40) {
            j40++;
          } else if (pNilaiK[a][b][c] == 50) {
            j50++;
          } else if (pNilaiK[a][b][c] == 60) {
            j60++;
          }
        }
      }
      tempMaks[a][0] = j20;
      tempMaks[a][1] = j30;
      tempMaks[a][2] = j40;
      tempMaks[a][3] = j50;
      tempMaks[a][4] = j60;
      j20 = 0;
      j40 = 0;
      j30 = 0;
      j50 = 0;
      j60 = 0;
    }

    int tunjuk = 0;
    for (int a = 0; a < tempMaks.length; a++) {
      for (int b = 0; b < 4; b++) {
        if (tempMaks[a][b] > tMaks) {
          tMaks = tempMaks[a][b];
          tunjuk = b;
          if (tunjuk == 0) {
            tNilai = 20;
          } else if (tunjuk == 1) {
            tNilai = 30;
          } else if (tunjuk == 2) {
            tNilai = 40;
          } else if (tunjuk == 3) {
            tNilai = 50;
          } else if (tunjuk == 4) {
            tNilai = 60;
          }
        }
      }
      nilaiKesimpulan[a][0] = tNilai;
      tMaks = 0;
      tunjuk = 0;
    }

    return nilaiBalik;
  }

  double[][] kirimKesimpulanKeTesting(int pJumlahTesting, double[][] pNilaiTesting) {
    double[][] nilaiBalik = new double[pJumlahTesting][8];

    for (int i = 0; i < pJumlahTesting; i++) {
      for (int j = 0; j < 8; j++) {
        if (j == 7) {
          nilaiBalik[i][j] = (double) nilaiKesimpulan[i][0];
        } else {
          nilaiBalik[i][j] = pNilaiTesting[i][j];
        }
      }
    }

    return nilaiBalik;
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JComboBox comboJumlahK;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JLabel jLabel4;
  private javax.swing.JLabel jLabel5;
  private javax.swing.JLabel jLabel6;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JPanel jPanel2;
  private javax.swing.JPanel jPanel3;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JTable tabelHasilPrediksi;
  private javax.swing.JTable tabelTesting;
  private javax.swing.JTable tabelTraining;
  private javax.swing.JTextField textIsiFileTesting;
  private javax.swing.JTextField textIsiFileTraining;
  private javax.swing.JButton tombolBersih;
  private javax.swing.JButton tombolCariFileTesting;
  private javax.swing.JButton tombolCariFileTraining;
  private javax.swing.JButton tombolProses;
  private javax.swing.JButton tombolTampilkanTesting;
  private javax.swing.JButton tombolTampilkanTraining;
  // End of variables declaration//GEN-END:variables
}
