/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao.ui;


import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import com.edusys.dao.tienich.DateHelper;
import com.edusys.dao.tienich.DialogHelper;
import com.edusys.dao.tienich.ShareHelper;
import java.util.Date;

/**
 *
 * @author DELL-PC
 */
public class quanly extends javax.swing.JFrame {

    /**
     * Creates new form quanly
     */
    public quanly() {

        initComponents();
        init();

    }

    void init() {

        setIconImage(ShareHelper.APP_ICON);
        setLocationRelativeTo(null);

        new Timer(1000, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            public void actionPerformed(ActionEvent e) {
                lbldongho.setText(format.format(new Date()));
            }
        }).start();

    }

    void openLogin() {
        new DangNhapJFrame().setVisible(true);
    }

    void openWelcome() {
        new ChaoJDialog().setVisible(true);
    }

    void logoff() {
       
        if (ShareHelper.authenticated()) {
           ShareHelper.logoff();
            DialogHelper.alert(this, "Đã đăng xuất!");
      
         
        } else {
            DialogHelper.alert(this, "Bạn chưa đăng nhập!");
        }
       
    }

    void exit() {

        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }
    
    void openThongKe(int index){
        if(ShareHelper.authenticated()){
            new ThongKe().setVisible(true); 
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập để sử dụng dịch vụ !");
        }
    }
    
    void openNhanVien(){
        if(ShareHelper.authenticated()){
            new QuanLyNhanVien().setVisible(true); 
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập để sử dụng dịch vụ !");
        }
    }
    
    void openKhoaHoc(){
        if(ShareHelper.authenticated()){
            new QuanLyKhoaHoc().setVisible(true); 
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập để sử dụng dịch vụ");
        }
    }
    
    void openChuyenDe(){
        if(ShareHelper.authenticated()){
            new QuanLyChuyenDe().setVisible(true); 
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập để sử dụng dịch vụ");
        }
    }
    
    void openNguoiHoc(){
        if(ShareHelper.authenticated()){
            new QuanLyNguoiHoc().setVisible(true); 
        }else{
            DialogHelper.alert(this, "Vui lòng đăng nhập để sử dụng dịch vụ");
        }
    }
    
    void About(){
        new GioiThieuJDialog().setVisible(true);
    }
    
    void openWebsite(){
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } catch (Exception e) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
//    Integer ind0=0;
//    Integer ind1=0;
//    Integer ind2=0;
//    Integer ind3=0;
//    tonghopthongke thtk0 =new tonghopthongke(0);
//    tonghopthongke thtk1 =new tonghopthongke(1);
//    tonghopthongke thtk2 =new tonghopthongke(2);
//    tonghopthongke thtk3 =new tonghopthongke(3);
//    void openThongKe(int index) {
//      
//        
//        if (ShareHelper.authenticated()) {
//            if (index == 0) {
//                if (ind0 == 0) {
//                    thtk0.setVisible(true);
//                    ind0 = 1;
//                }
//                if (ind0 == 1) {
//                    thtk0.dispose();
//                    thtk0.setVisible(true);
//                }
//            }
//             if (index == 1) {
//                if (ind1 == 0) {
//                    thtk1.setVisible(true);
//                    ind1 = 1;
//                }
//                if (ind1 == 1) {
//                    thtk1.dispose();
//                    thtk1.setVisible(true);
//                }
//            } if (index == 2) {
//                if (ind2 == 0) {
//                    thtk2.setVisible(true);
//                    ind2 = 1;
//                }
//                if (ind2 == 1) {
//                    thtk2.dispose();
//                    thtk2.setVisible(true);
//                }
//            } if (index == 3) {
//                if (ind3 == 0) {
//                    thtk3.setVisible(true);
//                    ind3 = 1;
//                }
//                if (ind3 == 1) {
//                    thtk3.dispose();
//                    thtk3.setVisible(true);
//                }
//            }
//           
//            
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
//QuanLyNhanVien qlnv=new QuanLyNhanVien();
//    void openNhanVien() {
//        if (ShareHelper.authenticated()) {
//          if(qlnv==null){
//              qlnv.setVisible(true);
//          }else{
//               qlnv.dispose();
//               qlnv.setVisible(true);
//          }
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
//QuanLyKhoaHoc qlkh=new QuanLyKhoaHoc();
//    void openKhoaHoc() {
//        if (ShareHelper.authenticated()) {
//             if(qlkh==null){
//              qlkh.setVisible(true);
//          }else{
//               qlkh.dispose();
//               qlkh.setVisible(true);
//          }
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
//    QuanLyChuyenDe qlcd=new QuanLyChuyenDe();
//    void openChuyenDe() {
//        if (ShareHelper.authenticated()) {
//           if(qlcd==null){
//              qlcd.setVisible(true);
//          }else{
//               qlcd.dispose();
//               qlcd.setVisible(true);
//          }
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
//
//    void openNguoiHoc() {
//        if (ShareHelper.authenticated()) {
//
//            new QuanLyNguoiHoc().setVisible(true);
//        } else {
//            DialogHelper.alert(this, "Vui lòng đăng nhập!");
//        }
//    }
//
//    void openAbout() {
//        new ChaoJDialog().setVisible(true);
//    }
//
//    void openWebsite() {
//        try {
//            Desktop.getDesktop().browse(new File("help/Ap.html").toURI());
//        } catch (IOException ex) {
//            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
//            System.out.println(ex);
//        }
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbldongho = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        btnlogout = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        btnchuyende = new javax.swing.JButton();
        btnnguoihoc = new javax.swing.JButton();
        btnkhoahoc = new javax.swing.JButton();
        btnhuongdan = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnhethong = new javax.swing.JMenu();
        mnidangnhap = new javax.swing.JMenuItem();
        mnidangxuat = new javax.swing.JMenuItem();
        mnidoimk = new javax.swing.JMenuItem();
        mniketthuc = new javax.swing.JMenuItem();
        mnquanly = new javax.swing.JMenu();
        mninguoihoc = new javax.swing.JMenuItem();
        mnichuyende = new javax.swing.JMenuItem();
        mnikhoahoc = new javax.swing.JMenuItem();
        mninhanvien = new javax.swing.JMenuItem();
        mnthongke = new javax.swing.JMenu();
        mninguoihoctungnam = new javax.swing.JMenuItem();
        mnibangdiemtungkhoa = new javax.swing.JMenuItem();
        mnidiemtungkhoa = new javax.swing.JMenuItem();
        mnidoanhthu = new javax.swing.JMenuItem();
        mntrogiup = new javax.swing.JMenu();
        mnihuongdan = new javax.swing.JMenuItem();
        mnigioithieu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1000, 660));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setName(""); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo.png"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000000000, 1000000000));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(244, 244, 244)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lbldongho.setForeground(new java.awt.Color(255, 204, 0));
        lbldongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Alarm.png"))); // NOI18N

        jToolBar1.setBorder(null);
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setAlignmentY(0.2F);
        jToolBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jToolBar1.setMaximumSize(new java.awt.Dimension(1000, 25));
        jToolBar1.setMinimumSize(new java.awt.Dimension(1000, 25));

        btnlogout.setForeground(new java.awt.Color(0, 204, 0));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnlogout.setText("Đăng xuất");
        btnlogout.setFocusable(false);
        btnlogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnlogout);

        btnstop.setForeground(new java.awt.Color(0, 204, 51));
        btnstop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Stop.png"))); // NOI18N
        btnstop.setText("Kết thúc");
        btnstop.setFocusable(false);
        btnstop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnstop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });
        jToolBar1.add(btnstop);

        btnchuyende.setForeground(new java.awt.Color(0, 204, 51));
        btnchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/List.png"))); // NOI18N
        btnchuyende.setText("Chuyên đề");
        btnchuyende.setFocusable(false);
        btnchuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnchuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyendeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnchuyende);

        btnnguoihoc.setForeground(new java.awt.Color(0, 204, 51));
        btnnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Conference.png"))); // NOI18N
        btnnguoihoc.setText("Người học");
        btnnguoihoc.setFocusable(false);
        btnnguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnguoihocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnguoihoc);

        btnkhoahoc.setForeground(new java.awt.Color(0, 204, 51));
        btnkhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Certificate.png"))); // NOI18N
        btnkhoahoc.setText("Khóa học");
        btnkhoahoc.setFocusable(false);
        btnkhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnkhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoahocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnkhoahoc);

        btnhuongdan.setForeground(new java.awt.Color(0, 204, 51));
        btnhuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Globe.png"))); // NOI18N
        btnhuongdan.setText("Hướng dẫn");
        btnhuongdan.setFocusable(false);
        btnhuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhuongdan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhuongdanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnhuongdan);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 932, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbldongho, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));

        mnhethong.setText("Hệ thống");

        mnidangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        mnidangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Key.png"))); // NOI18N
        mnidangnhap.setText("Đăng nhập");
        mnidangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangnhapActionPerformed(evt);
            }
        });
        mnhethong.add(mnidangnhap);

        mnidangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        mnidangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Log out.png"))); // NOI18N
        mnidangxuat.setText("Đăng xuất");
        mnidangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangxuatActionPerformed(evt);
            }
        });
        mnhethong.add(mnidangxuat);

        mnidoimk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Refresh.png"))); // NOI18N
        mnidoimk.setText("Đổi mật khẩu");
        mnhethong.add(mnidoimk);

        mniketthuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        mniketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Stop.png"))); // NOI18N
        mniketthuc.setText("Kết thúc");
        mniketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniketthucActionPerformed(evt);
            }
        });
        mnhethong.add(mniketthuc);

        jMenuBar1.add(mnhethong);

        mnquanly.setText("Quản lý");

        mninguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Conference.png"))); // NOI18N
        mninguoihoc.setText("Người học");
        mninguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninguoihocActionPerformed(evt);
            }
        });
        mnquanly.add(mninguoihoc);

        mnichuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Lists.png"))); // NOI18N
        mnichuyende.setText("Chuyên đề");
        mnichuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnichuyendeActionPerformed(evt);
            }
        });
        mnquanly.add(mnichuyende);

        mnikhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Certificate.png"))); // NOI18N
        mnikhoahoc.setText("Khóa học");
        mnikhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnikhoahocActionPerformed(evt);
            }
        });
        mnquanly.add(mnikhoahoc);

        mninhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/User group.png"))); // NOI18N
        mninhanvien.setText("Nhân viên");
        mninhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninhanvienActionPerformed(evt);
            }
        });
        mnquanly.add(mninhanvien);

        jMenuBar1.add(mnquanly);

        mnthongke.setText("Thống kê");

        mninguoihoctungnam.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Clien list.png"))); // NOI18N
        mninguoihoctungnam.setText("Người học từng năm");
        mninguoihoctungnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninguoihoctungnamActionPerformed(evt);
            }
        });
        mnthongke.add(mninguoihoctungnam);

        mnibangdiemtungkhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Card file.png"))); // NOI18N
        mnibangdiemtungkhoa.setText("Bảng điểm từng khóa");
        mnibangdiemtungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnibangdiemtungkhoaActionPerformed(evt);
            }
        });
        mnthongke.add(mnibangdiemtungkhoa);

        mnidiemtungkhoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Bar chart.png"))); // NOI18N
        mnidiemtungkhoa.setText("Điểm từng khóa học");
        mnidiemtungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidiemtungkhoaActionPerformed(evt);
            }
        });
        mnthongke.add(mnidiemtungkhoa);

        mnidoanhthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Dollar.png"))); // NOI18N
        mnidoanhthu.setText("Doanh thu từng chuyên đề");
        mnidoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoanhthuActionPerformed(evt);
            }
        });
        mnthongke.add(mnidoanhthu);

        jMenuBar1.add(mnthongke);

        mntrogiup.setText("Trợ giúp");

        mnihuongdan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnihuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Globe.png"))); // NOI18N
        mnihuongdan.setText("Hướng dẫn sử dụng");
        mntrogiup.add(mnihuongdan);

        mnigioithieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/duanmau_lab1/icon/Home.png"))); // NOI18N
        mnigioithieu.setText("Giới thiệu sản phẩm");
        mntrogiup.add(mnigioithieu);

        jMenuBar1.add(mntrogiup);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniketthucActionPerformed
        exit();        
    }//GEN-LAST:event_mniketthucActionPerformed

    private void btnkhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoahocActionPerformed
        openKhoaHoc();       
    }//GEN-LAST:event_btnkhoahocActionPerformed

    private void btnnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnguoihocActionPerformed
        
        openNguoiHoc();
    }//GEN-LAST:event_btnnguoihocActionPerformed

    private void mnidiemtungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidiemtungkhoaActionPerformed
        openThongKe(2);
    }//GEN-LAST:event_mnidiemtungkhoaActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        logoff();        // TODO add your handling code here:

    }//GEN-LAST:event_btnlogoutActionPerformed

    private void mninhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninhanvienActionPerformed
        
        
        openNhanVien();
    }//GEN-LAST:event_mninhanvienActionPerformed

    private void btnchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyendeActionPerformed
        openChuyenDe();        // TODO add your handling code here:
    }//GEN-LAST:event_btnchuyendeActionPerformed

    private void mnichuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnichuyendeActionPerformed
        openChuyenDe();        // TODO add your handling code here:
    }//GEN-LAST:event_mnichuyendeActionPerformed

    private void mnidangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangnhapActionPerformed
        if (ShareHelper.USER != null) {
            DialogHelper.alert(this, "User: " + ShareHelper.USER.getHoTen() + "\n bạn đang trong trạng thái đăng nhập");
            return;
        } else {

            openLogin();
            this.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_mnidangnhapActionPerformed

    private void mnidangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangxuatActionPerformed
        logoff();        // TODO add your handling code here:
    }//GEN-LAST:event_mnidangxuatActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        exit();        // TODO add your handling code here:
    }//GEN-LAST:event_btnstopActionPerformed

    private void mninguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninguoihocActionPerformed
        openNguoiHoc();        // TODO add your handling code here:
    }//GEN-LAST:event_mninguoihocActionPerformed

    private void mnikhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnikhoahocActionPerformed
        openKhoaHoc();        // TODO add your handling code here:
    }//GEN-LAST:event_mnikhoahocActionPerformed

    private void btnhuongdanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhuongdanActionPerformed
        //openWebsite();        // TODO add your handling code here:
    }//GEN-LAST:event_btnhuongdanActionPerformed

    private void mninguoihoctungnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninguoihoctungnamActionPerformed
        //openThongKe(0);        // TODO add your handling code here:
    }//GEN-LAST:event_mninguoihoctungnamActionPerformed

    private void mnibangdiemtungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnibangdiemtungkhoaActionPerformed
       //openThongKe(1);        // TODO add your handling code here:
    }//GEN-LAST:event_mnibangdiemtungkhoaActionPerformed

    private void mnidoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoanhthuActionPerformed
        //openThongKe(3);        // TODO add your handling code here:
    }//GEN-LAST:event_mnidoanhthuActionPerformed

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
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quanly.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new quanly().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchuyende;
    private javax.swing.JButton btnhuongdan;
    private javax.swing.JButton btnkhoahoc;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnguoihoc;
    private javax.swing.JButton btnstop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lbldongho;
    private javax.swing.JMenu mnhethong;
    private javax.swing.JMenuItem mnibangdiemtungkhoa;
    private javax.swing.JMenuItem mnichuyende;
    private javax.swing.JMenuItem mnidangnhap;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenuItem mnidiemtungkhoa;
    private javax.swing.JMenuItem mnidoanhthu;
    private javax.swing.JMenuItem mnidoimk;
    private javax.swing.JMenuItem mnigioithieu;
    private javax.swing.JMenuItem mnihuongdan;
    private javax.swing.JMenuItem mniketthuc;
    private javax.swing.JMenuItem mnikhoahoc;
    private javax.swing.JMenuItem mninguoihoc;
    private javax.swing.JMenuItem mninguoihoctungnam;
    private javax.swing.JMenuItem mninhanvien;
    private javax.swing.JMenu mnquanly;
    private javax.swing.JMenu mnthongke;
    private javax.swing.JMenu mntrogiup;
    // End of variables declaration//GEN-END:variables
}
