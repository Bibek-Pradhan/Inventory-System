
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bibek10
 */
public class Login_Page extends javax.swing.JFrame {

    private RegisterForm register;
    ArrayList<Registration_Data> loginList;

    /**
     * Creates new form Login_Page
     */
    public Login_Page() {
        initComponents();

        //cretae the form center
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginForm = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();
        createAcc = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Form");
        setBackground(new java.awt.Color(43, 30, 70));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(71, 190, 4));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 9, 9)));
        loginPanel.setForeground(new java.awt.Color(228, 109, 16));

        loginForm.setBackground(new java.awt.Color(193, 25, 25));
        loginForm.setFont(new java.awt.Font("Ani", 1, 24)); // NOI18N
        loginForm.setForeground(new java.awt.Color(17, 41, 225));
        loginForm.setText("Login Form");

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginForm)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(loginForm)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        username.setText("Username:");

        password.setText("Password:");

        btnLogin.setBackground(new java.awt.Color(5, 100, 239));
        btnLogin.setForeground(new java.awt.Color(227, 232, 239));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        tfUsername.setForeground(new java.awt.Color(18, 8, 8));
        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        tfPassword.setForeground(new java.awt.Color(18, 8, 8));

        createAcc.setText("Click here to create a new account");
        createAcc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createAccMouseClicked(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(239, 10, 5));
        btnExit.setForeground(new java.awt.Color(227, 232, 239));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(tfPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(createAcc))
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(username)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(createAcc)
                .addGap(33, 33, 33))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int confirmed = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit ?", "Exit Program",
                JOptionPane.YES_NO_OPTION);

        if (confirmed == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void createAccMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createAccMouseClicked
        // TODO add your handling code here:
        RegisterForm rgf = new RegisterForm();
        rgf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createAccMouseClicked

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = "";
        char[] pass;
        String pass1 = null;
        
        try {
            userName = tfUsername.getText();
            pass = tfPassword.getPassword();
            pass1 = new String(pass);
        } catch (NullPointerException e) {
            return;
        }

        register = new RegisterForm();

         It_Store wareHouse = new It_Store();
        wareHouse.setVisible(true);
        wareHouse.pack();
        // close the current form (login)
        this.dispose();
//        if (!userName.isEmpty() && !pass.isEmpty()) {
//            try {
//                for (Registration_Data rd : loginList) {
//                    if (userName.equals(rd.getUsername())) {
//                        if (pass.equals(rd.getPassword())) {
//                            JOptionPane.showMessageDialog(rootPane, "Login successfully.", "Message", 1);
//                            It_Store wareHouse = new It_Store();
//                            wareHouse.setVisible(true);
//                            wareHouse.pack();
//                            // close the current form (login)
//                            this.dispose();
//                        } else {
//                            JOptionPane.showMessageDialog(rootPane, "Password doesn't match.", "Error", 0);
//                        }
//                    } else {
//
//                        JOptionPane.showMessageDialog(rootPane, "Username doesn't found.", "Error", 0);
//                    }
//                }
//            } catch (NullPointerException e) {
//                JOptionPane.showMessageDialog(rootPane, "Please register first.", "Error", 0);
//            }
//        }
    }//GEN-LAST:event_btnLoginActionPerformed

    public void setArray(ArrayList<Registration_Data> rd) {
        this.loginList = rd;
    }

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel createAcc;
    private javax.swing.JLabel loginForm;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
