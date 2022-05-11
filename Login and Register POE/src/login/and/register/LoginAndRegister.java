package login.and.register;

import javax.swing.*;

public class LoginAndRegister
{

    String natsu1;
    String dragneel2;
    String fairyTail3;
    String igneel4;

    public static boolean checkUserName(String u)
    {
        return u.length() < 6 && u.contains("_");

    }

    public static boolean checkPassWord(String p)
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

    public static void main(String[] args)
    {
        JTextField natsu = new JTextField();   //natsu = name
        JTextField dragneel = new JTextField(); //dragneel = surname
        JTextField fairyTail = new JTextField(); //fairyTail = username
        JTextField igneel = new JPasswordField(); //igneel = password
        Object[] message =
        {
            "Name:", natsu,
            "Surname:", dragneel,
            "Username:", fairyTail,
            "Password:", igneel

        };

        int option = JOptionPane.showConfirmDialog(null, message, "Sign Up", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION)
        {

            if (checkUserName(fairyTail.getText()))
            {
                System.out.println("Username successfully captured");

            } else
            {
                System.out.println("Username is not\n"
                        + "correctly formatted,\n"
                        + "please ensure that\n"
                        + "your username\n"
                        + "contains an\n"
                        + "underscore and is no\n"
                        + "more than 5\n"
                        + "characters in length.");
            }
            if (checkPassWord(igneel.getText()))
            {
                System.out.println("Password successfully captured");
            } else
            {
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

    public static Boolean loginUser()
    {
        boolean login = false;
        JTextField fairyTailZero = new JTextField();
        JTextField acnologia = new JPasswordField();
        Object[] message =
        {
            "Username:", fairyTailZero,
            "Password:", acnologia
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);

        if (option == JOptionPane.OK_OPTION)
        {
            if (fairyTailZero.getText().equals("") && acnologia.getText().equals("h"))
            {
                System.out.println("Login successful");
                login = true;
            } else
            {
                System.out.println("login failed");
            }
        } else
        {
            System.out.println("Login canceled");
        }
        return login;
        
    }

    public static String returnLoginStatus()
    {

        
        
        
        return returnLoginStatus() ;

    }

}

