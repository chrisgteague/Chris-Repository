package prog5121_poe_st10083450;

import javax.swing.*;

public class Login
{
//code attribution
//this method was taken from Stackoverflow
//https://stackoverflow.com/questions/26812602/password-w-specific-requirements-program
//Ben Buurstra
//https://stackoverflow.com/users/4229080/ben-buurstra
//halfer
//https://stackoverflow.com/users/472495/halfer
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
//code attribution
//this method was taken from Stackoverflow
//https://stackoverflow.com/questions/43158591/check-for-username-and-password-in-a-text-file
//j.DOE
//https://stackoverflow.com/users/7774504/j-doe

    public static String registerUser(String userName, String passWord)
    {
        String random = " ";

        {

            if (checkUserName(userName))
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
            if (checkPassWordComplexity(passWord))
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
        {
            return random;
        }
    }

    public static boolean loginUser(String userName, String loginUserName, String passWord, String loginPassWord)
    {

        return userName.equals(loginUserName) && passWord.equals(loginPassWord);

    }

    public static String returnLoginStatus(String userName, String loginUserName, String passWord, String loginPassWord, String firstName, String secondName)
    {
        if (loginUser(userName, loginUserName, passWord, loginPassWord))
        {
            return "Welcome " + firstName + " " + secondName + " it is great to see you";
        } else
        {
            return "You have failed to login";
        }

    }
}
