package studentmgtsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AddAdmin extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public AddAdmin() {
        super("Add Admin");
        initComponents();
        conn = DatabaseConnection.connection();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        submitBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        home_file_subMenu = new javax.swing.JMenuItem();
        logout_file_subMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        about_about_subMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null),
                "AddAdmin", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        submitBtn.setBackground(new java.awt.Color(0, 0, 0));
        submitBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        submitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/submit.png"))); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        resetBtn.setBackground(new java.awt.Color(0, 0, 0));
        resetBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        resetBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/reset.png"))); // NOI18N
        resetBtn.setText("Reset");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(60, 60, 60).addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addComponent(submitBtn).addGap(27, 27, 27)
                                .addComponent(resetBtn).addGap(27, 27, 27).addComponent(backBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 54,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 198,
                                                Short.MAX_VALUE)
                                        .addComponent(emailTxt).addComponent(passwordTxt))))
                        .addContainerGap(40, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(98, 98, 98)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nameTxt))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(emailTxt))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(passwordTxt))
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(submitBtn).addComponent(backBtn).addComponent(resetBtn))
                        .addContainerGap(47, Short.MAX_VALUE)));

        fileMenu.setText("File");

        home_file_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        home_file_subMenu
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/home.png"))); // NOI18N
        home_file_subMenu.setText("Home");
        home_file_subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_file_subMenuActionPerformed(evt);
            }
        });
        fileMenu.add(home_file_subMenu);

        logout_file_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout_file_subMenu
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/logout.png"))); // NOI18N
        logout_file_subMenu.setText("Logout");
        logout_file_subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_file_subMenuActionPerformed(evt);
            }
        });
        fileMenu.add(logout_file_subMenu);

        jMenuBar1.add(fileMenu);

        aboutMenu.setText("About");

        about_about_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A,
                java.awt.event.InputEvent.CTRL_DOWN_MASK));
        about_about_subMenu
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/about.png"))); // NOI18N
        about_about_subMenu.setText("About");
        about_about_subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_about_subMenuActionPerformed(evt);
            }
        });
        aboutMenu.add(about_about_subMenu);

        jMenuBar1.add(aboutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(
                jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        setSize(new java.awt.Dimension(511, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_file_subMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_home_file_subMenuActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_home_file_subMenuActionPerformed

    private void logout_file_subMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_logout_file_subMenuActionPerformed
        setVisible(false);
        new Login().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_logout_file_subMenuActionPerformed

    private void about_about_subMenuActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_about_about_subMenuActionPerformed
        setVisible(false);
        new About().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_about_about_subMenuActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_backBtnActionPerformed

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_submitBtnActionPerformed
        try {
            stmt = conn.createStatement();

            String adminName = nameTxt.getText();
            String adminMail = emailTxt.getText();
            String adminPass = passwordTxt.getText();

            if (adminName.equals("") || adminMail.equals("") || adminPass.equals("")) {
                JOptionPane.showMessageDialog(null, "Cannot Insert empty values.", "Validation Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                String sql = "INSERT INTO ADMIN (name, email, password) VALUES ('" + adminName + "', '" + adminMail
                        + "', '" + adminPass + "')";
                stmt.execute(sql);

                JOptionPane.showMessageDialog(null, "New admin account created Successfully.", "Query Success",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_submitBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetBtnActionPerformed
        nameTxt.setText("");
        emailTxt.setText("");
        passwordTxt.setText("");
        nameTxt.requestFocusInWindow();
    }// GEN-LAST:event_resetBtnActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem about_about_subMenu;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem home_file_subMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout_file_subMenu;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton submitBtn;
    // End of variables declaration//GEN-END:variables
}
