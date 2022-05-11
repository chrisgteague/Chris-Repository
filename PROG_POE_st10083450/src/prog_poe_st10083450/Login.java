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

    private static String registerUser()
    {
        JTextField yourFirstName = new JTextField();
        JTextField yourSurName = new JTextField();
        JTextField signUpUserName = new JTextField();
        JTextField singUpPassword = new JPasswordField();
        Object[] message =
        {
            "Name:", yourFirstName,
            "Surname:", yourSurName,
            "Username:", signUpUserName,
            "Password:", singUpPassword
        
        };
        
        int option = JOptionPane.showConfirmDialog(null, message, "Sign Up", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_CANCEL_OPTION)
        {
            System.exit(0);
        }
        
        if (option == JOptionPane.OK_OPTION)
        {
            
            if (checkUserName(signUpUserName.getText()))
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
            if (checkPassWordComplexity(singUpPassword.getText()))
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
        return registerUser();
        
    }
    
    private Boolean loginUser()
    {
        
        registerUser();
        JTextField fairyTailZero = new JTextField(); //fairyTailZero = username
        JTextField acnologia = new JPasswordField(); //acnologia = password
        Object[] message =
        {
            "Username:", fairyTailZero,
            "Password:", acnologia
        };
        
        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_CANCEL_OPTION)
        {
            System.exit(0);
        }
        if (option == JOptionPane.OK_OPTION)
        {
            if (fairyTailZero.getText().equals("") && acnologia.getText().equals("h"))
            {
                JOptionPane.showMessageDialog(null, "Login successful");
            } else
            {
                JOptionPane.showMessageDialog(null, "login failed");
            }
        } else
        {
            JOptionPane.showMessageDialog(null, "Login canceled");
        }
        
        return loginUser();
        
    }
    
    public static String returnLoginStatus()
    {
        
        return returnLoginStatus();
        
    }
}
