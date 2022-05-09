/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog_poe_st10083450;

import javax.swing.*;

public class Login
{

    public static boolean checkUserName(String u)
    {
        return u.length() < 6 && u.contains("_");

    }

    public static boolean checkPassWordComplexity(String p)
    {
        boolean hasCapitals = false;
        boolean hasSpecialChar = false;
        boolean hasNumbers = false;
        for (int i = 0; i < p.length(); i++)
        {

            if (Character.isUpperCase(p.charAt(i)))
            {
                hasCapitals = true;
            }
            if (Character.isDigit(p.charAt(i)))
            {
                hasNumbers = true;
            }

            if (!Character.isAlphabetic(p.charAt(i)) && !hasNumbers && !Character.isWhitespace(p.charAt(i)))
            {
                hasSpecialChar = true;

            }
        }

        return p.length() > 7 && hasCapitals && hasNumbers && hasSpecialChar;
    }
    //void main(String[] args)

    public static String registerUser()
    {
        JTextField yourUserName = new JTextField();
        JTextField yourPassWord = new JPasswordField();
        Object[] message =
        {
            "Username:", yourUserName,
            "Password:", yourPassWord

        };

        int option = JOptionPane.showConfirmDialog(null, message, "Sign Up", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {

            if (checkUserName(yourUserName.getText()))
            {
                JOptionPane.showMessageDialog(null, "Username successfully captured");

            } else
            {
                JOptionPane.showMessageDialog(null, "Username is not\n"
                        + "correctly formatted,\n"
                        + "please ensure that\n"
                        + "your username\n"
                        + "contains an\n"
                        + "underscore and is no\n"
                        + "more than 5\n"
                        + "characters in length.");
            }
            if (checkPassWordComplexity(yourPassWord.getText()))
            {
                JOptionPane.showMessageDialog(null, "Password successfully captured");
            } else
            {
                JOptionPane.showMessageDialog(null, "\nPassword is not\n"
                        + "correctly formatted,\n"
                        + "please ensure that\n"
                        + "the password\n"
                        + "contains at least 8\n"
                        + "characters, a capital\n"
                        + "letter, a number and\n"
                        + "a special character.");
            }
        }
        return null;

    }

}
