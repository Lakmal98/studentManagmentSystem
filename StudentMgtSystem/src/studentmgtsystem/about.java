package studentmgtsystem;

public class About extends javax.swing.JFrame {

    public About() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        aboutUsLogo = new javax.swing.JLabel();
        nameList = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        home_file_subMenu = new javax.swing.JMenuItem();
        logout_file_subMenu = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        about_about_subMenu = new javax.swing.JMenuItem();

        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.MatteBorder(null), "RAD_GROUP-19", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        aboutUsLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/about us.jpg"))); // NOI18N

        nameList.setText("<html> <h1 style=\"color:red;text-align:center;\">Group Members</h1><br/> <h4 style=\"color:blue;text-align:center;\">2018/IS/043 - Lakmal E.A.P.D</h4><br/> <h4 style=\"color:blue;text-align:center;\">2018/IS/067 - Samarasinghe D.M</h4><br/> <h4 style=\"color:blue;text-align:center;\">2018/IS/091 - Weerarathne T.M.P</h4><br/> </html>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(112, Short.MAX_VALUE)
                        .addComponent(aboutUsLogo)
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(nameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(aboutUsLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        fileMenu.setText("File");

        home_file_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        home_file_subMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/home.png"))); // NOI18N
        home_file_subMenu.setText("Home");
        home_file_subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                home_file_subMenuActionPerformed(evt);
            }
        });
        fileMenu.add(home_file_subMenu);

        logout_file_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        logout_file_subMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/logout.png"))); // NOI18N
        logout_file_subMenu.setText("Logout");
        logout_file_subMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_file_subMenuActionPerformed(evt);
            }
        });
        fileMenu.add(logout_file_subMenu);

        jMenuBar1.add(fileMenu);

        aboutMenu.setText("About");

        about_about_subMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        about_about_subMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmgtsystem/Images/about.png"))); // NOI18N
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
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(546, 511));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void home_file_subMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home_file_subMenuActionPerformed
        setVisible(false);
        new Home().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_home_file_subMenuActionPerformed

    private void logout_file_subMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_file_subMenuActionPerformed
        setVisible(false);
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logout_file_subMenuActionPerformed

    private void about_about_subMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_about_subMenuActionPerformed
        setVisible(false);
        new About().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_about_about_subMenuActionPerformed

    public static void main(String args[]) {
       /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new About().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JLabel aboutUsLogo;
    private javax.swing.JMenuItem about_about_subMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem home_file_subMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logout_file_subMenu;
    private javax.swing.JLabel nameList;
    // End of variables declaration//GEN-END:variables
}
