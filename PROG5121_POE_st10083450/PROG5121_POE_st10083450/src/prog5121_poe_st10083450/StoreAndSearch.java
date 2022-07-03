package prog5121_poe_st10083450;

import javax.swing.*;

public class StoreAndSearch
{

    String theTaskName[] = new String[4];
    String idTask[] = new String[4];
    String taskStats[] = new String[4];
    int durationTask[] = new int[4];
    String theDev[] = new String[4];

    public void taskStorage(String theIdTaskNum, String devTask, int taskLocation, int theDuration, String statusOfTask, String specificTask)
    {
        idTask[taskLocation] = theIdTaskNum;
        durationTask[taskLocation] = theDuration;
        theTaskName[taskLocation] = specificTask;
        taskStats[taskLocation] = statusOfTask;
        theDev[taskLocation] = devTask;
    }

    public void showTaskInfoStatusDone()
    {
        for (int i = 0; i < theDev.length; i++)
        {

            if (taskStats[i] == ("Done"))
            {

                JOptionPane.showMessageDialog(null, "Developer Name - " + theDev[i]
                        + "\n" + "Task Name - " + theTaskName[i]
                        + "\n" + "Task Duration - " + durationTask[i]);

            }
        }
    }

    public void showTaskInformation()
    {
        for (int i = 0; i < theDev.length; i++)
        {
            if (theDev[i] != null)
            {
                JOptionPane.showMessageDialog(null, "Task Report: "
                        + "\n" + "Developer - " + theDev[i]
                        + "\n" + "Task Name - " + theTaskName[i]
                        + "\n" + "Task ID - " + idTask[i]
                        + "\n" + "Task Duration - " + durationTask[i]
                        + "\n" + "Task Status - " + taskStats[i]);
            }
        }

    }

    public void taskTermination(String currentTask)
    {
        int taskLocation = 1;
        for (int i = 0; i < theDev.length; i++)
        {
            JOptionPane.showMessageDialog(null, theTaskName[i] + " " + i + " " + currentTask);
            if (theTaskName[i] == currentTask)
            {
                taskLocation = i;
            }
        }
        if (taskLocation == 1)
        {
            JOptionPane.showMessageDialog(null, "Developer not Found!");
        } else
        {

            theDev[taskLocation] = " ";
            theTaskName[taskLocation] = " ";
            idTask[taskLocation] = " ";
            durationTask[taskLocation] = 0;
            taskStats[taskLocation] = " ";

            JOptionPane.showMessageDialog(null, "Task has been deleted");
        }
    }

    public void searchForDevTasks(String developerName)
    {
        int taskLocation = 0;
        for (int i = 0; i < theDev.length; i++)
        {
            if (theDev[i] == (developerName))
            {
                taskLocation = i;
            }
        }
        if (taskLocation == 0)
        {
            JOptionPane.showMessageDialog(null, "Task not Found!");
        } else
        {
            JOptionPane.showMessageDialog(null, "Task Name - " + theTaskName[taskLocation]);
        }
    }

    public void locateTheTask(String currentTask)
    {
        int taskLocation = 0;
        for (int i = 0; i < theDev.length; i++)
        {

            if (theTaskName[i] == (currentTask))
            {
                taskLocation = i;
            }
        }
        if (taskLocation == 0)
        {
            JOptionPane.showMessageDialog(null, "Tasks not Found!");
        } else
        {
            JOptionPane.showMessageDialog(null, "Developer Name - " + theDev[taskLocation]
                    + "\n" + "Task Name - " + theTaskName[taskLocation]
                    + "\n" + "Task Duration - " + durationTask[taskLocation]);

        }
    }

    public void displayLongestDuration()
    {

        int longestTaskDuration = 0;
        int taskLocation = 0;
        for (int i = 0; i < theDev.length; i++)
        {
            if (durationTask[i] > longestTaskDuration)
            {
                longestTaskDuration = durationTask[i];
                taskLocation = i;
            }
        }

        JOptionPane.showMessageDialog(null, "Developer Name - " + theDev[taskLocation]
                + "\n" + "Task Name - " + theTaskName[taskLocation]
                + "\n" + "Task Duration - " + durationTask[taskLocation]);

    }
}
