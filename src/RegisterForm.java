
import java.util.ArrayList;
import java.util.regex.Pattern;
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
public class RegisterForm extends javax.swing.JFrame {

    int genderChoice;

    private ArrayList<Registration_Data> list = new ArrayList<>();

    /**
     * Creates new form RegisterForm
     */
    public RegisterForm() {
        initComponents();

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

        genderGroup = new javax.swing.ButtonGroup();
        loginPanel = new javax.swing.JPanel();
        loginForm = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfConfirmPassword = new javax.swing.JPasswordField();
        radioMale = new javax.swing.JRadioButton();
        radioFemale = new javax.swing.JRadioButton();
        radioOthers = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        tfDate = new com.toedter.calendar.JDateChooser();
        tfPassword = new javax.swing.JPasswordField();
        tfUsername = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfFirstName = new javax.swing.JTextField();
        tfLastName = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register Form");
        setResizable(false);

        loginPanel.setBackground(new java.awt.Color(71, 190, 4));
        loginPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(209, 9, 9)));
        loginPanel.setForeground(new java.awt.Color(228, 109, 16));

        loginForm.setBackground(new java.awt.Color(193, 25, 25));
        loginForm.setFont(new java.awt.Font("Ani", 1, 24)); // NOI18N
        loginForm.setForeground(new java.awt.Color(17, 41, 225));
        loginForm.setText("Register Form");

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

        jLabel1.setText("First Name:");

        jLabel2.setText("Last Name:");

        jLabel3.setText("Username:");

        jLabel4.setText("Gender:");

        jLabel5.setText("Date of Birth:");

        jLabel6.setText("Password:");

        jLabel7.setText("Confirm Password:");

        genderGroup.add(radioMale);
        radioMale.setText("Male");
        radioMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioMaleActionPerformed(evt);
            }
        });

        genderGroup.add(radioFemale);
        radioFemale.setText("Female");
        radioFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioFemaleActionPerformed(evt);
            }
        });

        genderGroup.add(radioOthers);
        radioOthers.setText("Others");
        radioOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOthersActionPerformed(evt);
            }
        });

        jLabel8.setText("Email:");

        tfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPasswordActionPerformed(evt);
            }
        });

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        btnRegister.setBackground(new java.awt.Color(22, 133, 230));
        btnRegister.setText("Register");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(radioMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(radioOthers)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfConfirmPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmail)
                            .addComponent(tfUsername))
                        .addGap(49, 49, 49))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                            .addComponent(tfLastName))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(radioMale)
                    .addComponent(radioFemale)
                    .addComponent(radioOthers))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPasswordActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void radioMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioMaleActionPerformed
        // TODO add your handling code here:
        genderChoice = 1;
    }//GEN-LAST:event_radioMaleActionPerformed

    private void radioFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioFemaleActionPerformed
        // TODO add your handling code here:
        genderChoice = 2;
    }//GEN-LAST:event_radioFemaleActionPerformed

    private void radioOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOthersActionPerformed
        // TODO add your handling code here:
        genderChoice = 3;
    }//GEN-LAST:event_radioOthersActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        register();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void register() {
        String fName = tfFirstName.getText().trim();
        String lName = tfLastName.getText().trim();
        String email = tfEmail.getText();
        String userName = tfUsername.getText().trim();
        char password1[] = tfPassword.getPassword();
        String password = new String(password1);
        char confirmPassword1[] = tfConfirmPassword.getPassword();
        String confirmPassword = new String(confirmPassword1);
        String date;
        String sex = "";

        if (genderChoice == 1) {
            sex = "Male";
        } else if (genderChoice == 2) {
            sex = "Female";
        } else if (genderChoice == 3) {
            sex = "Others";
        }

        if (!fName.isEmpty() && !lName.isEmpty() && !email.isEmpty() && !userName.isEmpty() && !password.isEmpty() && !confirmPassword.isEmpty() && !sex.isEmpty()) {
            if (!password.equals(confirmPassword)) {
                JOptionPane.showMessageDialog(rootPane, "Password don't match", "Error", 0);
                return;
            }

            if (Pattern.compile(".*@gmail.com*.").matcher(email).matches()) {
                for (Registration_Data rd : list) {
                    if (email.equals(rd.getEmail())) {
                        JOptionPane.showMessageDialog(rootPane, "This email is alreday registered.", "Repeat Email", 2);
                        return;
                    }
                }
                try {
                    date = tfDate.getDate().toString();
                } catch (NullPointerException e) {
                    JOptionPane.showMessageDialog(rootPane, "Please, insert the date.", "Error", 0);
                    return;
                }

                Registration_Data obj = new Registration_Data(fName, lName, sex, date, email, userName, password, confirmPassword);
                list.add(obj);
                JOptionPane.showMessageDialog(rootPane, "Register sucessfully.", "Message", 1);

                Login_Page login = new Login_Page();
                login.setVisible(true);
                login.setArray(list);
                login.pack();
                // close the current form (login)
                this.dispose();

                // printing date for testing
//                for (Registration_Data sh : list) {
//                    JOptionPane.showMessageDialog(rootPane, "DOB " + sh.getDob(), "Message", 1);
//                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Invalid Email.", "Error", 0);
            }

        } else if(fName.isEmpty() || lName.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Please, fill all the field and Try Again.", "Error", 0);
        }
        else if (sex.isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Please, select one gender.", "Error", 0);
        } else {
            JOptionPane.showMessageDialog(rootPane, "Please, fill all the field.", "Error", 0);
        }

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
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel loginForm;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JRadioButton radioFemale;
    private javax.swing.JRadioButton radioMale;
    private javax.swing.JRadioButton radioOthers;
    private javax.swing.JPasswordField tfConfirmPassword;
    private com.toedter.calendar.JDateChooser tfDate;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfFirstName;
    private javax.swing.JTextField tfLastName;
    private javax.swing.JPasswordField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}