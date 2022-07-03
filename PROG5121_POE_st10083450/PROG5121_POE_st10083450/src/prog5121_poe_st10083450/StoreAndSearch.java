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

    public void showTaskInformation()
    {
        for (int i = 0; i < theDev.length; i++)
        {
            JOptionPane.showMessageDialog(null, "Developer: " + theDev[i]
                    + "\n" + "Task Name: " + theTaskName[i]
                    + "\n" + "Task ID: " + idTask[i]
                    + "\n" + "Task Duration: " + durationTask[i]
                    + "\n" + "Task Status: " + taskStats[i]);
        }

    }

    public void showTaskInfoStatusDone()
    {
        for (int i = 0; i < theDev.length; i++)
        {

            if (taskStats[i] == ("Done"))
            {

                JOptionPane.showMessageDialog(null, "Developer Name: " + theDev[i]
                        + "\n" + "Task Name: " + theTaskName[i]
                        + "\n" + "Task Duration: " + durationTask[i]);

            }
        }
    }

    public void displayLongestDuration()
    {

        int longestTaskDuration = 0;
        String longestTaskID = " ";
        int taskIndex = 0;
        for (int i = 0; i < theDev.length; i++)
        {
            if (durationTask[i] > longestTaskDuration)
            {

                longestTaskDuration = durationTask[i];
                longestTaskID = idTask[i];
                taskIndex = i;
            }
        }

        JOptionPane.showMessageDialog(null, "Developer Name: " + theDev[taskIndex]
                + "\n" + "Task Name: " + theTaskName[taskIndex]
                + "\n" + "Task Duration: " + durationTask[taskIndex]);

    }

    public void locateTheTask(String taskLocation)
    {
        int taskIndex = 0;
        for (int i = 0; i < theDev.length; i++)
        {

            if (theTaskName[i] == (taskLocation))
            {
                taskIndex = i;
            }
        }
        if (taskIndex == 0)
        {
            JOptionPane.showMessageDialog(null, "Tasks not Found!");
        } else
        {
            JOptionPane.showMessageDialog(null, "Developer Name: " + theDev[taskIndex]
                    + "\n" + "Task Name: " + theTaskName[taskIndex]
                    + "\n" + "Task Duration: " + durationTask[taskIndex]);

        }
    }

    public void searchForTasks(String developerName)
    {
        int taskIndex = 0;
        for (int i = 0; i < theDev.length; i++)
        {
            if (theDev[i] == (developerName))
            {
                taskIndex = i;
            }
        }
        if (taskIndex == 0)
        {
            JOptionPane.showMessageDialog(null, "Task not Found!");
        } else
        {
            JOptionPane.showMessageDialog(null, "Task Name: " + theTaskName[taskIndex]);
        }
    }

    public void taskTermination(String tasklocation)
    {
        int taskIndex = 1;
        for (int i = 0; i < theDev.length; i++)
        {
            JOptionPane.showMessageDialog(null, theTaskName[i] + " " + i + " " + tasklocation);
            if (theTaskName[i] == tasklocation)
            {
                taskIndex = i;
            }
        }
        if (taskIndex == 1)
        {
            JOptionPane.showMessageDialog(null, "Developer not Found!");
        } else
        {

            theDev[taskIndex] = " ";
            theTaskName[taskIndex] = " ";
            idTask[taskIndex] = " ";
            durationTask[taskIndex] = 0;
            taskStats[taskIndex] = " ";

            JOptionPane.showMessageDialog(null, "Task has been deleted");
        }
    }

}
