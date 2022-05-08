/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package login.and.register;

import javax.swing.*;

public class LoginAndRegister {

 

    public static boolean checkUserName(String u) {
        return u.length() < 6 && u.contains("_");

    }

    public static boolean checkPassWord(String p) {
        boolean hasCapitals = false;
        boolean hasSpecialChar = false;
        boolean hasNumbers = false;
        for (int i = 0; i < p.length(); i++) {

            if (Character.isUpperCase(p.charAt(i))) {
            hasCapitals = true;
            }
            if (Character.isDigit(p.charAt(i))) {
            hasNumbers = true;    
            }
            
            if (!Character.isAlphabetic(p.charAt(i)) && !hasNumbers && !Character.isWhitespace(p.charAt(i))) {
                hasSpecialChar = true;

            }
        }
       
        return p.length() >7 && hasCapitals && hasNumbers && hasSpecialChar;
    }

    public static void main(String[] args) {
        JTextField userName = new JTextField();
        JTextField passWord = new JPasswordField();
        Object[] message = {
            "Username:", userName,
            "Password:", passWord

        };

        int option = JOptionPane.showConfirmDialog(null, message, "Sign Up", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {

            if (checkUserName(userName.getText())) {
                System.out.println("Username successfully captured");

            } else {
                System.out.println("Username is not\n"
                        + "correctly formatted,\n"
                        + "please ensure that\n"
                        + "your username\n"
                        + "contains an\n"
                        + "underscore and is no\n"
                        + "more than 5\n"
                        + "characters in length.");
            }
            if (checkPassWord(passWord.getText())) {
                System.out.println("Password successfully captured");
            } else {
                System.out.println("\nPassword is not\n"
                        + "correctly formatted,\n"
                        + "please ensure that\n"
                        + "the password\n"
                        + "contains at least 8\n"
                        + "characters, a capital\n"
                        + "letter, a number and\n"
                        + "a special character.");
            }
        }

    }

}
