/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hotel;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


/**
 *
 * @author AXIOO
 */
public class homePage extends javax.swing.JFrame {
    int xx, xy;
    
    public Statement st;
    public ResultSet rs;
    public DefaultTableModel tabModel;
    Connection cn = koneksi.Koneksi.koneksiDb();
    
    public homePage() {
        initComponents();
        cetakStrukKeTxt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        nmPesan = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        noTelp = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        nmTamu = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        konfirmasi = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        checkOut = new javax.swing.JSpinner();
        checkIn = new javax.swing.JSpinner();
        tipeKamar = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 500));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/250x250_Logo.png"))); // NOI18N
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 130));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/close icon.png"))); // NOI18N
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 0, 50, 50));

        jTabbedPane1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel1.setText("Tentang kami");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background hotel ukuran 1080-190.jpg"))); // NOI18N
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1080, 190));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel4.setText("SELAMAT DATANG DI HOTEL HEBAT");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Lepaskan diri Anda ke hotel hebat, dikelilingi oleh keindahan Pegunungan yang indah danau, dan sawah menghijau. Nikmati sore yang hangat dan ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 1080, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("berenang di kolam renang dengan pemandangan matahari terbenam yang memukau; Kids's Club yang luas - menawarkan beragam fasilitas dan kegiatan");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 1080, -1));

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText(" anak-anak yang akan melengkapi kenyamanan keluarga. Convention Center kami, dilengkapi pelayanan lengkap dengan ruang Konvensi terbesar di ");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 1080, -1));

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Bandung, mampu mengakomodasi hingga 3.000 delegasi. Manfaatkan ruang penyelenggaraan Konvensi M.I.C.E  ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 1080, -1));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ataupun mewujudkan acara pernikahan adat ");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 1080, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 460));

        jTabbedPane1.addTab("Home", jPanel1);

        jPanel7.setBackground(new java.awt.Color(204, 204, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel40.setText("Tipe Deluxe");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, -1, -1));

        jLabel41.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel41.setText("- AC");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/Deluxe room.jpg"))); // NOI18N
        jLabel43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 310, 160));

        jLabel44.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel44.setText("Tipe Superior");
        jPanel7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel45.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel45.setText("Fasilitas");
        jPanel7.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        jLabel46.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel46.setText("- Kamar berukuran luas 32 m2");
        jPanel7.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jLabel47.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel47.setText("- Kamar mandi shower");
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        jLabel48.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel48.setText("- Coffee Maker");
        jPanel7.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel50.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel50.setText("- LED TV inch");
        jPanel7.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, -1));

        jLabel51.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel51.setText("Fasilitas");
        jPanel7.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jLabel52.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel52.setText("- Kamar berukuran luas 45 m2");
        jPanel7.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jLabel53.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel53.setText("- Kamar mandi shower dan Bath Tub");
        jPanel7.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel54.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel54.setText("- Coffee Maker");
        jPanel7.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel55.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel55.setText("- AC");
        jPanel7.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        jLabel56.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel56.setText("- Sofa");
        jPanel7.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 310, -1, -1));

        jLabel57.setFont(new java.awt.Font("Vani", 0, 14)); // NOI18N
        jLabel57.setText("- LED TV inch");
        jPanel7.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 340, -1, -1));

        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/Superior Room.jpg"))); // NOI18N
        jLabel49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 310, 160));

        jTabbedPane1.addTab("Kamar", jPanel7);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel6.setText("Fasiilitas yang ada di Hotel Hebat");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/xie-yujie-nick-U-luuUdWKI4-unsplash.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 320, 140, 120));

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/egor-myznik-rCZQCbUAQvg-unsplash.jpg"))); // NOI18N
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, 140, 120));

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/bathtub.jpg"))); // NOI18N
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 120));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/huum-K65M3GbRYq8-unsplash.jpg"))); // NOI18N
        jLabel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 140, 120));

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/huy-nguyen-YhP-E5YwOGE-unsplash.jpg"))); // NOI18N
        jLabel25.setText("jLabel7");
        jLabel25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 140, 120));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/jason-leung-poI7DelFiVA-unsplash.jpg"))); // NOI18N
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 140, 120));

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/jens-kreuter-ngMtsE5r9eI-unsplash.jpg"))); // NOI18N
        jLabel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 140, 120));

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/milada-vigerova-x7mqPOxuJNw-unsplash.jpg"))); // NOI18N
        jLabel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 320, 140, 120));

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/joe-ciciarelli-08AJKJf75kw-unsplash.jpg"))); // NOI18N
        jLabel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 150, 140, 120));

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZED IMAGE/risen-wang-20jX9b35r_M-unsplash.jpg"))); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 140, 120));

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel21.setText("A Parking Lot");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel31.setText("Mini Bar");
        jPanel6.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, -1, -1));

        jLabel32.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel32.setText("Bathup");
        jPanel6.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel33.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel33.setText("GYM");
        jPanel6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

        jLabel34.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel34.setText("SPA");
        jPanel6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        jLabel35.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel35.setText("Wardrobe");
        jPanel6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel36.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel36.setText("Restaurant");
        jPanel6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel37.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel37.setText("Television");
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, -1, -1));

        jLabel38.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel38.setText("Swimming Pool");
        jPanel6.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 120, -1, -1));

        jLabel39.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel39.setText("Coffee Maker");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, -1, -1));

        jTabbedPane1.addTab("Fasilitas", jPanel6);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel5.setText("Form Pemesanan");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));
        jPanel5.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 260, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Email");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 190, -1));
        jPanel5.add(nmPesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 260, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Tanggal Check-Out");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 150, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("No Handphone");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 190, -1));
        jPanel5.add(noTelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 260, -1));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Nama Tamu");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 190, -1));
        jPanel5.add(nmTamu, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 260, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel14.setText("Tipe Kamar");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 190, -1));

        konfirmasi.setBackground(new java.awt.Color(51, 153, 255));
        konfirmasi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        konfirmasi.setForeground(new java.awt.Color(255, 255, 255));
        konfirmasi.setText("Konfirmasi Pemesanan");
        konfirmasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                konfirmasiActionPerformed(evt);
            }
        });
        jPanel5.add(konfirmasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 260, 30));

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Nama Pemesanan");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 190, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Tanggal Check-In");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, 150, -1));

        checkOut.setModel(new javax.swing.SpinnerDateModel());
        jPanel5.add(checkOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, 130, -1));

        checkIn.setModel(new javax.swing.SpinnerDateModel());
        jPanel5.add(checkIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 130, -1));

        tipeKamar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipe Superior", "Tipe Deluxe" }));
        jPanel5.add(tipeKamar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 260, -1));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 460));

        jTabbedPane1.addTab("Pesan kamar", jPanel4);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 1140, 490));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 660));

        setSize(new java.awt.Dimension(1200, 660));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void konfirmasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_konfirmasiActionPerformed
        try {
    st = cn.createStatement();

    // Mengambil nilai dari komponen spinner Check-In
    Date checkInDate = (Date) checkIn.getValue();
    // Konversi nilai Date ke dalam format yang sesuai
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String checkInString = sdf.format(checkInDate);

    // Mengambil nilai dari komponen spinner Check-Out
    Date checkOutDate = (Date) checkOut.getValue();
    // Konversi nilai Date ke dalam format yang sesuai
    String checkOutString = sdf.format(checkOutDate);

    // Menyimpan data ke dalam database
    st.executeUpdate("INSERT INTO pesanan VALUES('" 
            + email.getText() + "','"
            + noTelp.getText() + "','"
            + nmTamu.getText() + "','"
            + tipeKamar.getSelectedItem() + "','"            
            + checkInString + "','"
            + checkOutString + "','"
            + nmPesan.getText() + "')");           

    JOptionPane.showMessageDialog(null, "Pesanan anda berhasil terkirim.");

    cetakStrukKeTxt();
    // Mereset nilai komponen-komponen
    email.setText("");
    noTelp.setText("");
    nmTamu.setText("");
    tipeKamar.setSelectedItem("");
    nmPesan.setText("");

    // Reset nilai spinner Check-In dan Check-Out
    checkIn.setValue(new Date());
    checkOut.setValue(new Date());

} catch (Exception e) {
    e.printStackTrace();
}


    }//GEN-LAST:event_konfirmasiActionPerformed

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner checkIn;
    private javax.swing.JSpinner checkOut;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton konfirmasi;
    private javax.swing.JTextField nmPesan;
    private javax.swing.JTextField nmTamu;
    private javax.swing.JTextField noTelp;
    private javax.swing.JComboBox<String> tipeKamar;
    // End of variables declaration//GEN-END:variables
    private void cetakStrukKeTxt() {
    try {
        
        // Mengambil nilai dari komponen spinner Check-In
    Date checkInDate = (Date) checkIn.getValue();
    // Konversi nilai Date ke dalam format yang sesuai
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String checkInString = sdf.format(checkInDate);

    // Mengambil nilai dari komponen spinner Check-Out
    Date checkOutDate = (Date) checkOut.getValue();
    // Konversi nilai Date ke dalam format yang sesuai
    String checkOutString = sdf.format(checkOutDate);
    
        // Buat teks untuk struk dengan format yang lebih baik
        String struk = "========== Struk Pemesanan Kamar ==========\n" +
                "Email: " + email.getText() + "\n" +
                "Nomor Telepon: " + noTelp.getText() + "\n" +
                "Nama Tamu: " + nmTamu.getText() + "\n" +
                "Tipe Kamar: " + tipeKamar.getSelectedItem() + "\n" +
                "Check-In: " + checkInString + "\n" +
                "Check-Out: " + checkOutString + "\n" +
                "=========================================";

        // Membuat JFileChooser untuk memilih lokasi penyimpanan
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Pilih Lokasi Penyimpanan");
        fileChooser.setFileFilter(new FileNameExtensionFilter("File Teks (.txt)", "txt"));

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            // Mendapatkan path file yang dipilih
            String filePath = fileChooser.getSelectedFile().getAbsolutePath();

            // Menambahkan ekstensi .txt jika belum ada
            if (!filePath.toLowerCase().endsWith(".txt")) {
                filePath += ".txt";
            }

            // Menulis struk ke file
            try (PrintWriter writer = new PrintWriter(filePath)) {
                // Menulis struk dengan format yang lebih baik
                writer.println("========== Struk Pemesanan Kamar ==========");
                writer.println("Email: " + email.getText());
                writer.println("Nomor Telepon: " + noTelp.getText());
                writer.println("Nama Tamu: " + nmTamu.getText());
                writer.println("Tipe Kamar: " + tipeKamar.getSelectedItem());
                writer.println("Check-In: " + checkInString);
                writer.println("Check-Out: " + checkOutString);
                writer.println("=========================================");

                JOptionPane.showMessageDialog(null, "Struk telah disimpan sebagai file teks: " + filePath);
            }
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}

}