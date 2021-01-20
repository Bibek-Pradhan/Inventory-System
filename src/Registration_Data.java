/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bibek10
 */
public class Registration_Data {
    private String firstName;
    private String lastame;
    private String gender;
    private String dob;
    private String email;
    private String username;
    private String password;
    private String confirmPassword;

    public Registration_Data(String firstName, String lastame, String gender, String dob, String email, String username, String password, String confirmPassword) {
        this.firstName = firstName;
        this.lastame = lastame;
        this.gender = gender;
        this.dob = dob;
        this.email = email;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastame() {
        return lastame;
    }

    public String getGender() {
        return gender;
    }

    public String getDob() {
        return dob;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
    
    
}
