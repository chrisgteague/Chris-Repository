//code attribution
//this method was taken from Examples Java code geeks
//https://examples.javacodegeeks.com/how-to-call-a-method-in-java/
//Firouzeh hejazi
//https://www.linkedin.com/in/firouzeh-hejazi/
package prog5121_poe_st10083450;

import javax.swing.*;

public class PROG5121_POE_st10083450
{

    public static void main(String[] args)
    {
        Login register = new Login();
        Task theTasks = new Task();

        String firstName = JOptionPane.showInputDialog("FirstName: ");
        String secondName = JOptionPane.showInputDialog("Lastname: ");
        String userName = JOptionPane.showInputDialog("Username: ");
        String passWord = JOptionPane.showInputDialog("Password: ");

        register.registerUser(userName, passWord);

        boolean loginInfo = false;
        while (loginInfo == false)
        {
            String loginUserName = JOptionPane.showInputDialog("Username: ");
            String loginPassWord = JOptionPane.showInputDialog("Password: ");

            JOptionPane.showMessageDialog(null, register.returnLoginStatus(userName, loginUserName, passWord, loginPassWord, firstName, secondName));
            boolean Login = register.loginUser(userName, loginUserName, passWord, loginPassWord);
            if (Login == true)
            {
                loginInfo = true;
            } else
            {
            }

        }
        while (theTasks.selection != 3)
        {

            theTasks.selection = Integer.parseInt(JOptionPane.showInputDialog(" Welcome to EasyKanban, Please select what you would like to do"
                    + "\n" + " 1 - Add Tasks "
                    + "\n" + " 2 - Show Report"
                    + "\n" + " 3 - Quit"));

            switch (theTasks.selection)
            {
                case 1:
                    theTasks.nameTask = JOptionPane.showInputDialog(" Please input task name");

                    int theTaskNum = theTasks.numTask++;
                    String theTaskNumStr = Integer.toString(theTaskNum);

                    theTasks.lengthDescription = JOptionPane.showInputDialog(" Please input task description");
                    JOptionPane.showMessageDialog(null, theTasks.DescriptTask(theTasks.lengthDescription));

                    theTasks.devName = JOptionPane.showInputDialog(" Please input Developer name and surname");

                    int taskHrs = Integer.parseInt(JOptionPane.showInputDialog(" Please input the hours of the task duration "));
                    theTasks.taskHrs = taskHrs;

                    int currentStatus = Integer.parseInt(JOptionPane.showInputDialog(" Welcome to EasyKanban, Please select what you would like to do"
                            + "\n" + " 1 - To Do "
                            + "\n" + " 2 - Done"
                            + "\n" + " 3 - Doing"));

                    JOptionPane.showMessageDialog(null, theTasks.printTaskDetails());
                    JOptionPane.showMessageDialog(null, "Total Hours" + theTasks.taskHrs);
                    
                    switch (currentStatus)
                    {

                        case 1:

                            theTasks.statusTask = " To Do ";
                            break;
                        case 2:
                            theTasks.statusTask = " Done ";
                            break;
                        case 3:
                            theTasks.statusTask = " Doing ";
                            break;

                    }

                   
                    
            
            
                case 2:

                    JOptionPane.showMessageDialog(null, "Coming Soon");
                    break;
                case 3:
                    System.exit(0);

            }

        }

    }
}
