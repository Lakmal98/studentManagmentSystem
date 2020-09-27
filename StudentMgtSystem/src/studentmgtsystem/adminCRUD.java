package studentmgtsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class AdminCRUD extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public AdminCRUD() {
        super("Admin CRUD");
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
        mailTxt = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JTextField();
        resetBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        home_file_subMenu = new javax.swing.JMenuItem();
        logout_file_subMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        about_about_subMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null),
                "ManageAdmins", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Email");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Password");

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/update.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteBtn
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/delete icon.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("ID");

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
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98,
                                                Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel4,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))))
                                        .addGap(45, 45, 45)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 198,
                                                        Short.MAX_VALUE)
                                                .addComponent(mailTxt).addComponent(idTxt).addComponent(passwordTxt)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addComponent(resetBtn).addGap(31, 31,
                                                31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(searchBtn)
                                .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(38, 38, 38)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(57, 57, 57).addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(mailTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(41, 41, 41).addComponent(searchBtn)
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(updateBtn)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(56, 56, 56).addComponent(deleteBtn)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resetBtn).addComponent(backBtn))
                        .addContainerGap(36, Short.MAX_VALUE)));

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
                jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));

        setSize(new java.awt.Dimension(653, 436));
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

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
        try {
            stmt = conn.createStatement();
            int adminId = Integer.parseInt(idTxt.getText());

            String sql = "SELECT * FROM admin WHERE id = '" + adminId + "'";

            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                nameTxt.setText(rs.getString("name"));
                mailTxt.setText(rs.getString("email"));
                passwordTxt.setText(rs.getString("password"));
            } else {
                JOptionPane.showMessageDialog(null, "No admin with associated with ID : " + adminId, "Not Found Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Illegal characters included.Admin Id is only cantains Intigers.",
                    "Invalid Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_searchBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateBtnActionPerformed
        try {
            stmt = conn.createStatement();

            int adminId = Integer.parseInt(idTxt.getText());
            String adminName = nameTxt.getText();
            String adminMail = mailTxt.getText();
            String adminPass = passwordTxt.getText();

            String sql = "UPDATE ADMIN SET name ='" + adminName + "' , email ='" + adminMail + "' , password = '"
                    + adminPass + "' WHERE id = '" + adminId + "'";
            stmt.executeUpdate(sql);

            JOptionPane.showMessageDialog(null, "Admin data is successfully UPDATED!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_updateBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteBtnActionPerformed
        try {
            stmt = conn.createStatement();

            int adminId = Integer.parseInt(idTxt.getText());
            String sql = "DELETE FROM admin WHERE id = '" + adminId + "'";
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete admin with ID : " + adminId,
                    "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                stmt.executeUpdate(sql);
                setVisible(false);
                new ShowAdmin().setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Admin Deleted!!!", "DELETED", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Illegal characters included.Admin Id is only cantains Intigers.",
                    "Invalid Input Error", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_deleteBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetBtnActionPerformed
        idTxt.setText("");
        nameTxt.setText("");
        mailTxt.setText("");
        passwordTxt.setText("");
    }// GEN-LAST:event_resetBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem about_about_subMenu;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem home_file_subMenu;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout_file_subMenu;
    private javax.swing.JTextField mailTxt;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField passwordTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
