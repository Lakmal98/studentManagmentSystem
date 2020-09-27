package studentmgtsystem;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class ShowStudent extends javax.swing.JFrame {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    public ShowStudent() {
        super("Student");
        initComponents();
        conn = DatabaseConnection.connection();
        showRecord();
    }

    public void showRecord() {

        try {
            stmt = conn.createStatement();
            String sql = "SELECT * FROM STUDENT";
            ResultSet res = stmt.executeQuery(sql);
            studentDetailsTable.setModel(DbUtils.resultSetToTableModel(res));

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Check for the database connection.", "Database Error",
                    JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Try again Later in some times.", "Server Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        studentDetailsTable = new javax.swing.JTable();
        backBtn = new javax.swing.JButton();
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
                "StudentDetails", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        studentDetailsTable
                .setModel(new javax.swing.table.DefaultTableModel(
                        new Object[][] { { null, null, null, null }, { null, null, null, null },
                                { null, null, null, null }, { null, null, null, null } },
                        new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
        jScrollPane1.setViewportView(studentDetailsTable);

        backBtn.setBackground(new java.awt.Color(0, 0, 0));
        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/back.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 490, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createSequentialGroup().addGap(192, 192, 192).addComponent(backBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(backBtn).addContainerGap()));

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

        setSize(new java.awt.Dimension(518, 523));
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

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem about_about_subMenu;
    private javax.swing.JButton backBtn;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem home_file_subMenu;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logout_file_subMenu;
    private javax.swing.JTable studentDetailsTable;
    // End of variables declaration//GEN-END:variables
}
