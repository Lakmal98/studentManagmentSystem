package studentmgtsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class StudentCRUD extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public StudentCRUD() {
        super("StudentCRUD");
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        sGenderTxt = new javax.swing.JTextField();
        fNameTxt = new javax.swing.JTextField();
        sClassTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        sCityTxt = new javax.swing.JTextField();
        sConNumberTxt = new javax.swing.JTextField();
        updateBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        sBloodTxt = new javax.swing.JTextField();
        idTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
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
                "ManageStudentDetails", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Gender");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Guardian's Name");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Class");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("City");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("ContactNumber");

        nameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTxtActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Blood");

        sCityTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sCityTxtActionPerformed(evt);
            }
        });

        updateBtn.setBackground(new java.awt.Color(0, 0, 0));
        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setForeground(new java.awt.Color(51, 51, 51));
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/update.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(51, 51, 51));
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 0, 0));
        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(51, 51, 51));
        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/search.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(0, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(51, 51, 51));
        deleteBtn
                .setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/delete icon.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        idTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTxtActionPerformed(evt);
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup().addGap(32, 32, 32)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4).addComponent(jLabel1).addComponent(jLabel2)
                                                .addComponent(jLabel5).addComponent(jLabel8).addComponent(jLabel6)
                                                .addComponent(jLabel7))
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel1Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(nameTxt).addComponent(sGenderTxt).addComponent(fNameTxt)
                                                .addComponent(sClassTxt).addComponent(sCityTxt)
                                                .addComponent(sConNumberTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 252,
                                                        Short.MAX_VALUE)
                                                .addComponent(sBloodTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(idTxt))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16,
                                                Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                        jPanel1Layout.createSequentialGroup().addContainerGap(264, Short.MAX_VALUE)
                                                .addComponent(resetBtn).addGap(106, 106, 106)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(updateBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(72, 72, 72).addComponent(updateBtn))
                        .addGroup(jPanel1Layout.createSequentialGroup().addGap(10, 10, 10).addGroup(jPanel1Layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchBtn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(sGenderTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteBtn))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sClassTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sBloodTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sCityTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sConNumberTxt, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(resetBtn).addComponent(backBtn))
                        .addContainerGap(43, Short.MAX_VALUE)));

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

        setSize(new java.awt.Dimension(638, 533));
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

    private void nameTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_nameTxtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_nameTxtActionPerformed

    private void sCityTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_sCityTxtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_sCityTxtActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_updateBtnActionPerformed
        try {
            stmt = conn.createStatement();

            int stdId = Integer.parseInt(idTxt.getText());
            String stuName = nameTxt.getText();
            String gender = sGenderTxt.getText();
            String stuFatherName = fNameTxt.getText();
            String stuClass = sClassTxt.getText();
            String blood = sBloodTxt.getText();
            String city = sCityTxt.getText();
            String contactNumber = sConNumberTxt.getText();

            String sql = "UPDATE STUDENT SET stuName ='" + stuName + "', gender = '" + gender + "', stuFatherName = '"
                    + stuFatherName + "', stuClass = '" + stuClass + "', blood = '" + blood + "', city = '" + city
                    + "', contactNumber = '" + contactNumber + "' WHERE id = '" + stdId + "'";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Student data is successfully UPDATED!");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_updateBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_backBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_deleteBtnActionPerformed
        try {
            stmt = conn.createStatement();

            int stdId = Integer.parseInt(idTxt.getText());
            String sql = "DELETE FROM student WHERE id = '" + stdId + "'";
            int confirm = JOptionPane.showConfirmDialog(null, "Do you want to delete student with ID : " + stdId,
                    "Confirm", JOptionPane.OK_CANCEL_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                stmt.executeUpdate(sql);
                setVisible(false);
                new ShowStudent().setVisible(true);
                this.dispose();
                JOptionPane.showMessageDialog(null, "Student Deleted!!!", "DELETED", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Illegal characters included.Student Id is only cantains Intigers.",
                    "Invalid Input Error", JOptionPane.ERROR_MESSAGE);

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_deleteBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchBtnActionPerformed
        try {
            stmt = conn.createStatement();

            String stdName = idTxt.getText();

            try {
                int stdId = Integer.parseInt(stdName);
                String sql = "SELECT * FROM STUDENT WHERE id = '" + stdId + "'";
                rs = stmt.executeQuery(sql);
            } catch (Exception e) {
                String sql = "SELECT * FROM STUDENT WHERE stuName = '" + stdName + "'";
                rs = stmt.executeQuery(sql);

            }

            if (rs.next()) {

                nameTxt.setText(rs.getString("stuName"));
                sGenderTxt.setText(rs.getString("gender"));
                fNameTxt.setText(rs.getString("stuFatherName"));
                sClassTxt.setText(rs.getString("stuClass"));
                sBloodTxt.setText(rs.getString("blood"));
                sCityTxt.setText(rs.getString("city"));
                sConNumberTxt.setText(rs.getString("contactNumber"));
            } else {
                JOptionPane.showMessageDialog(null, "No student with associated with ID : " + idTxt.getText(),
                        "Not Found Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }// GEN-LAST:event_searchBtnActionPerformed

    private void idTxtActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_idTxtActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_idTxtActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_resetBtnActionPerformed
        idTxt.setText("");
        nameTxt.setText("");
        sGenderTxt.setText("");
        fNameTxt.setText("");
        sClassTxt.setText("");
        sBloodTxt.setText("");
        sCityTxt.setText("");
        sConNumberTxt.setText("");
    }// GEN-LAST:event_resetBtnActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem about_about_subMenu;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField fNameTxt;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem home_file_subMenu;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout_file_subMenu;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton resetBtn;
    private javax.swing.JTextField sBloodTxt;
    private javax.swing.JTextField sCityTxt;
    private javax.swing.JTextField sClassTxt;
    private javax.swing.JTextField sConNumberTxt;
    private javax.swing.JTextField sGenderTxt;
    private javax.swing.JButton searchBtn;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
