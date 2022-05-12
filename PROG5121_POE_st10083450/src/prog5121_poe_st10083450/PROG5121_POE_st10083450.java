package prog5121_poe_st10083450;

import javax.swing.*;

/**
 *
 * @author chris
 */
public class PROG5121_POE_st10083450
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Login register = new Login();

        String firstName = JOptionPane.showInputDialog("Name: ");
        String secondName = JOptionPane.showInputDialog("Lastname: ");
        String userName = JOptionPane.showInputDialog("Username: ");
        String passWord = JOptionPane.showInputDialog("Password: ");
        JOptionPane.showMessageDialog(null, register.registerUser(userName, passWord));

        String loginUserName = JOptionPane.showInputDialog("Username: ");
        String loginPassWord = JOptionPane.showInputDialog("Password: ");

        JOptionPane.showMessageDialog(null, register.loginUser(userName, loginUserName, passWord, loginPassWord));
        JOptionPane.showMessageDialog(null, register.returnLoginStatus(userName, loginUserName, passWord, loginPassWord));
    }
}
