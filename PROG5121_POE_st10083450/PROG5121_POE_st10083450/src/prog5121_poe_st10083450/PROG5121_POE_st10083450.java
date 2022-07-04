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
        //code attribution
        //this method was taken from StackAbuse
        //https://stackabuse.com/how-to-declare-and-initialize-an-array-in-java/
        //Mohamed Echout
        //https://stackabuse.com/author/mohamed/
        Task[] theTasks = new Task[50];

        int currentNumTasks = 0;

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
        int userChoice = 0;
        while (userChoice != 3)
        {

            userChoice = Integer.parseInt(JOptionPane.showInputDialog(" Welcome to EasyKanban, Please select what you would like to do"
                    + "\n" + " 1 - Add Tasks "
                    + "\n" + " 2 - Show Report"
                    + "\n" + " 3 - Quit"));

            switch (userChoice)
            {
                case 1:
                    int numTasksToAdd = 0;

                    numTasksToAdd = Integer.parseInt(JOptionPane.showInputDialog("Please input the number of tasks you would like to add:"));
                    for (int i = 0; i < numTasksToAdd; i++)
                    {
                        Task currentTask = new Task();
                        currentTask.nameTask = JOptionPane.showInputDialog(" Please input task name");

                        currentTask.lengthDescription = JOptionPane.showInputDialog(" Please input task description");
                        JOptionPane.showMessageDialog(null, currentTask.DescriptTask(currentTask.lengthDescription));

                        currentTask.devName = JOptionPane.showInputDialog(" Please input Developer name and surname");

                        int taskHrs = Integer.parseInt(JOptionPane.showInputDialog(" Please input the hours of the task duration "));
                        currentTask.taskHrs = taskHrs;

                        Object[] options =
                        {
                            "To Do", "Done", "Doing"
                        };
                        Object selectionObject = JOptionPane.showInputDialog(null, "Choose", "Menu", JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        currentTask.selectionString = selectionObject.toString();

                        currentTask.numTask = currentNumTasks;
                        currentTask.createTaskID();
                        JOptionPane.showMessageDialog(null, currentTask.printTaskDetails());
                        JOptionPane.showMessageDialog(null, "Total Hours - " + currentTask.taskHrs);

                        theTasks[currentNumTasks] = currentTask;
                        currentNumTasks++;
                    }
                    break;

                case 2:
                    int arraySelection = 0;
                    arraySelection = Integer.parseInt(JOptionPane.showInputDialog("Please select what you would like to do:"
                            + "\n" + " 1 - Tasks that are done"
                            + "\n" + " 2 - Show Task with Longest duration"
                            + "\n" + " 3 - Search for Task with Task name"
                            + "\n" + " 4 - Search for Task with Developer name"
                            + "\n" + " 5 - Delete Task"
                            + "\n" + " 6 - Full report on all tasks"));

                    switch (arraySelection)
                    {

                        case 1:

                            for (int i = 0; i < currentNumTasks; i++)
                            {

                                if (theTasks[i].selectionString == ("Done"))
                                {

                                    JOptionPane.showMessageDialog(null, "Developer Name - " + theTasks[i].devName
                                            + "\n" + "Task Name - " + theTasks[i].nameTask
                                            + "\n" + "Task Duration - " + theTasks[i].taskHrs);

                                }
                            }
                            break;
                        case 2:
                            int longestTaskDuration = 0;
                            int taskLocation = 0;
                            for (int i = 0; i < currentNumTasks; i++)
                            {
                                if (theTasks[i].taskHrs > longestTaskDuration)
                                {
                                    longestTaskDuration = theTasks[i].taskHrs;
                                    taskLocation = i;
                                }
                            }

                            JOptionPane.showMessageDialog(null, "Developer Name - " + theTasks[taskLocation].devName
                                    + "\n" + "Task Name - " + theTasks[taskLocation].nameTask
                                    + "\n" + "Task Duration - " + theTasks[taskLocation].taskHrs);

                            break;

                        case 3:
                            String searchTName = JOptionPane.showInputDialog(" Search Task name ");
                            boolean flag = false;
                            for (int i = 0; i < currentNumTasks; i++)
                            {

                                if (theTasks[i].nameTask.equals(searchTName))
                                {

                                    JOptionPane.showMessageDialog(null, "Task Name - " + theTasks[i].nameTask
                                            + "\n" + "Developer Name - " + theTasks[i].devName
                                            + "\n" + "Task Status - " + theTasks[i].selectionString);

                                    flag = true;

                                    break;

                                }

                            }
                            if (!flag)
                            {
                                JOptionPane.showMessageDialog(null, "Task not Found!");
                            }

                            break;

                        case 4:

                            String searchDevName = JOptionPane.showInputDialog(" Search Developer name ");
                            boolean devFlag = false;
                            for (int i = 0; i < currentNumTasks; i++)
                            {

                                if (theTasks[i].devName.equals(searchDevName))
                                {

                                    JOptionPane.showMessageDialog(null, "Task Name - " + theTasks[i].nameTask
                                            + "\n" + "Task Status - " + theTasks[i].selectionString);

                                    devFlag = true;

                                    break;

                                }

                            }
                            if (!devFlag)
                            {
                                JOptionPane.showMessageDialog(null, "Developer not Found!");
                            }

                            break;
                        //code attribution
                        //this method was taken from StackAbuse
                        //https://stackabuse.com/remove-element-from-an-array-in-java/
                        //Luka Čupić
                        //https://stackabuse.com/author/lukacupic/
                        case 5:
                            String deleteTask = JOptionPane.showInputDialog(" Search Task name ");
                            boolean deleteFlag = false;
                            int deleteLocation = 0;
                            for (int i = 0; i < currentNumTasks; i++)
                            {

                                if (theTasks[i].nameTask.equals(deleteTask))
                                {

                                    deleteLocation = i;
                                    deleteFlag = true;
                                    JOptionPane.showMessageDialog(null, "Task has been deleted");
                                    break;

                                }

                            }
                            if (!deleteFlag)
                            {
                                JOptionPane.showMessageDialog(null, "Task not Found!");
                            } else
                            {
                                for (int i = deleteLocation; i < currentNumTasks; i++)
                                {
                                    theTasks[i] = theTasks[i + 1];
                                }
                                currentNumTasks--;
                            }
                            break;
                        case 6:
                            String fullReport = "";
                            for (int i = 0; i < currentNumTasks; i++)
                            {
                                fullReport += theTasks[i].printTaskDetails() + "\n\n";

                            }
                            JOptionPane.showMessageDialog(null, fullReport);

                            break;
                    }

                    break;
                case 3:
                    System.exit(0);
                    break;
            }

        }

    }

}
