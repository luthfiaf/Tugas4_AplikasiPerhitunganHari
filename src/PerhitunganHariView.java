
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class PerhitunganHariView extends javax.swing.JFrame {
    
    // Array tanggal penting
private final String[] tanggalPenting = {
    "2023-12-25: Natal",
    "2023-10-31: Halloween",
    // Tambahkan tanggal penting lainnya sesuai kebutuhan
};

    /**
     * Creates new form PerhitunganHariView
     */
    public PerhitunganHariView() {
        initComponents();
        //fokus krusornya di input tahun
        spinnerTahun.requestFocusInWindow();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtArea = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jCalendar = new com.toedter.calendar.JCalendar();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        comboBulan = new javax.swing.JComboBox<>();
        spinnerTahun = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        labelHasil = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.gray));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("APLIKASI PERHITUNGAN HARI");

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Downloads\\kalender.png")); // NOI18N
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jLabel5)
                .addGap(45, 45, 45))
        );

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.white, java.awt.Color.gray, java.awt.Color.darkGray));
        jPanel2.setForeground(new java.awt.Color(0, 51, 102));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtArea.setViewportView(jTextArea1);

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        comboBulan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        comboBulan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBulanActionPerformed(evt);
            }
        });

        spinnerTahun.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerTahunStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("OptimusPrinceps", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tahun");

        jLabel3.setFont(new java.awt.Font("OptimusPrinceps", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bulan");

        labelHasil.setFont(new java.awt.Font("OptimusPrinceps", 1, 18)); // NOI18N
        labelHasil.setForeground(new java.awt.Color(255, 255, 255));
        labelHasil.setText("Hasil");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addGap(23, 23, 23)
                        .addComponent(btnHapus)
                        .addGap(18, 18, 18)
                        .addComponent(btnKeluar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBulan, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spinnerTahun, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(164, 164, 164))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(labelHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(spinnerTahun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(comboBulan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHitung)
                            .addComponent(btnHapus)
                            .addComponent(btnKeluar))
                        .addGap(18, 18, 18)
                        .addComponent(jCalendar, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1335, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBulanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBulanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBulanActionPerformed

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        // TODO add your handling code here:
       int bulan = comboBulan.getSelectedIndex() + 1; // Januari = 0, maka +1
    
    // Ambil nilai tahun dari JSpinner
    int tahun = (Integer) spinnerTahun.getValue();
    
    // Menghitung jumlah hari dalam bulan yang dipilih
    YearMonth yearMonth = YearMonth.of(tahun, bulan);
    int jumlahHari = yearMonth.lengthOfMonth();
    
    // Menampilkan hasil di JTextArea (txtArea)
    jTextArea1.setText("Jumlah hari: " + jumlahHari + "\n");
    
    // Memeriksa tahun kabisat
    boolean isLeapYear = yearMonth.isLeapYear();
    String kabisatMessage = isLeapYear ? "Tahun kabisat" : "Bukan tahun kabisat\n";
    
    // Menambahkan hasil tahun kabisat ke JTextArea
    jTextArea1.append("Tahun ini adalah " + kabisatMessage + "\n");
    
    // Bagian berikut ini yang terkait dengan labelHasil sudah dikomentari
    /*
    // Menampilkan hasil di label hasil
    labelHasil.setText("Jumlah hari: " + jumlahHari + "\n");
    
    // Memeriksa tahun kabisat
    boolean isLeapYear = yearMonth.isLeapYear();
    String kabisatMessage = isLeapYear ? "Tahun kabisat" : "Bukan tahun kabisat";
    
    // Menambahkan hasil tahun kabisat ke label hasil
    labelHasil.setText(labelHasil.getText() + "Tahun ini adalah " + kabisatMessage);
    */
    // Mendapatkan hari pertama dan hari terakhir
    LocalDate hariPertama = yearMonth.atDay(1);  // Hari pertama bulan tersebut
    LocalDate hariTerakhir = yearMonth.atEndOfMonth(); // Hari terakhir bulan tersebut
    
    // Menambahkan informasi hari pertama dan hari terakhir ke JTextArea
    jTextArea1.append("Hari pertama: " + hariPertama.getDayOfWeek() + ", " + hariPertama + "\n");
    jTextArea1.append("Hari terakhir: " + hariTerakhir.getDayOfWeek() + ", " + hariTerakhir + "\n");
    
    // Menghitung selisih hari antara hari pertama dan hari terakhir
    long selisihHari = ChronoUnit.DAYS.between(hariPertama, hariTerakhir);
    
    // Menampilkan selisih hari di JTextArea
    jTextArea1.append("Selisih hari antara hari pertama dan hari terakhir: " + selisihHari + " hari\n");
    
    // Menampilkan tanggal penting jika ada
    String tanggalPentingMessage = "Tanggal penting bulan ini:\n";
    for (String tanggal : tanggalPenting) {
        String[] split = tanggal.split(":");
        String tanggalStr = split[0];
        String namaHari = split[1];

        if (tanggalStr.startsWith(String.format("%04d-%02d", tahun, bulan))) {
            tanggalPentingMessage += tanggal + "\n";
        }
    }
    jTextArea1.append(tanggalPentingMessage);
    
        
    }//GEN-LAST:event_btnHitungActionPerformed

    private void spinnerTahunStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerTahunStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_spinnerTahunStateChanged

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda yakin ingin keluar?", "Konfirmasi Keluar", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        System.exit(0);
    }
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        comboBulan.setSelectedIndex(0); // Reset pilihan bulan
    spinnerTahun.setValue(0); // Reset tahun ke 0
    labelHasil.setText("Hasil");
     jTextArea1.setText(""); // Reset label hasil
    }//GEN-LAST:event_btnHapusActionPerformed

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
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerhitunganHariView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerhitunganHariView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JComboBox<String> comboBulan;
    private com.toedter.calendar.JCalendar jCalendar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelHasil;
    private javax.swing.JSpinner spinnerTahun;
    private javax.swing.JScrollPane txtArea;
    // End of variables declaration//GEN-END:variables
}
