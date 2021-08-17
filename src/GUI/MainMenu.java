
package GUI;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addStudentButton = new javax.swing.JButton();
        studentListButton = new javax.swing.JButton();
        addStaffButton = new javax.swing.JButton();
        addTeacherButton = new javax.swing.JButton();
        teacherListButton = new javax.swing.JButton();
        staffListButton = new javax.swing.JButton();
        logoutButton = new javax.swing.JButton();
        addUserButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setMinimumSize(new java.awt.Dimension(740, 450));
        setResizable(false);

        jPanel1.setLayout(null);

        addStudentButton.setBackground(new java.awt.Color(255, 255, 255));
        addStudentButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addStudentButton.setForeground(new java.awt.Color(0, 0, 0));
        addStudentButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addStudentButton.setText("Admission Form");
        addStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addStudentButton);
        addStudentButton.setBounds(30, 127, 175, 60);

        studentListButton.setBackground(new java.awt.Color(255, 255, 255));
        studentListButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        studentListButton.setForeground(new java.awt.Color(0, 0, 0));
        studentListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        studentListButton.setText("Student Data");
        studentListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(studentListButton);
        studentListButton.setBounds(30, 259, 180, 60);

        addStaffButton.setBackground(new java.awt.Color(255, 255, 255));
        addStaffButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addStaffButton.setForeground(new java.awt.Color(0, 0, 0));
        addStaffButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addStaffButton.setText("Staff Form");
        addStaffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addStaffButton);
        addStaffButton.setBounds(531, 127, 180, 60);

        addTeacherButton.setBackground(new java.awt.Color(255, 255, 255));
        addTeacherButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addTeacherButton.setForeground(new java.awt.Color(0, 0, 0));
        addTeacherButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Add.png"))); // NOI18N
        addTeacherButton.setText("Teacher Form");
        addTeacherButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTeacherButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addTeacherButton);
        addTeacherButton.setBounds(280, 127, 180, 60);

        teacherListButton.setBackground(new java.awt.Color(255, 255, 255));
        teacherListButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        teacherListButton.setForeground(new java.awt.Color(0, 0, 0));
        teacherListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        teacherListButton.setText("Teacher Data");
        teacherListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(teacherListButton);
        teacherListButton.setBounds(280, 259, 180, 60);

        staffListButton.setBackground(new java.awt.Color(255, 255, 255));
        staffListButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        staffListButton.setForeground(new java.awt.Color(0, 0, 0));
        staffListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/Search.png"))); // NOI18N
        staffListButton.setText("Staff Data");
        staffListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffListButtonActionPerformed(evt);
            }
        });
        jPanel1.add(staffListButton);
        staffListButton.setBounds(531, 259, 180, 60);

        logoutButton.setBackground(new java.awt.Color(255, 255, 255));
        logoutButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(0, 0, 0));
        logoutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/logout.png"))); // NOI18N
        logoutButton.setText("Logout");
        logoutButton.setToolTipText("click here to logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });
        jPanel1.add(logoutButton);
        logoutButton.setBounds(614, 367, 84, 30);

        addUserButton.setBackground(new java.awt.Color(255, 255, 255));
        addUserButton.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        addUserButton.setForeground(new java.awt.Color(0, 0, 0));
        addUserButton.setText("+Add User");
        addUserButton.setToolTipText("click here to add new user");
        addUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addUserButton);
        addUserButton.setBounds(30, 369, 84, 25);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 102));
        jLabel1.setText("           School Management System");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 255, 102), 3));
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 10, 717, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/images/school.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 740, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStudentButtonActionPerformed
        StudentForm student = new StudentForm();
        this.hide();
        student.setVisible(true);
    }//GEN-LAST:event_addStudentButtonActionPerformed

    private void addUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserButtonActionPerformed
        UserRegisteration user = new UserRegisteration();
        this.hide();
        user.setVisible(true);

    }//GEN-LAST:event_addUserButtonActionPerformed

    private void addTeacherButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTeacherButtonActionPerformed
        TeacherForm teacher = new TeacherForm();
        this.hide();
        teacher.setVisible(true);
    }//GEN-LAST:event_addTeacherButtonActionPerformed

    private void addStaffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffButtonActionPerformed
        StaffRec staff = new StaffRec();
        this.hide();
        staff.setVisible(true);
    }//GEN-LAST:event_addStaffButtonActionPerformed

    private void studentListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentListButtonActionPerformed
        StudentRecord record = new StudentRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_studentListButtonActionPerformed

    private void teacherListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherListButtonActionPerformed
        TeacherRecord record = new TeacherRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_teacherListButtonActionPerformed

    private void staffListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffListButtonActionPerformed
        StaffRecord record = new StaffRecord();
        this.hide();
        record.setVisible(true);
    }//GEN-LAST:event_staffListButtonActionPerformed

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutButtonActionPerformed
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_logoutButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaffButton;
    private javax.swing.JButton addStudentButton;
    private javax.swing.JButton addTeacherButton;
    private javax.swing.JButton addUserButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutButton;
    private javax.swing.JButton staffListButton;
    private javax.swing.JButton studentListButton;
    private javax.swing.JButton teacherListButton;
    // End of variables declaration//GEN-END:variables
}
