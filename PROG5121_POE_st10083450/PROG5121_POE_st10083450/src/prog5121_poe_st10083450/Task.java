package prog5121_poe_st10083450;

import javax.swing.*;

public class Task
{

    public String lengthDescription;
    int selection;
    String nameTask;
    public int numTask;
    String devName;
    int totalDurationHrs;
    int taskHrs;
    String statusTask;
    String theTaskNumStr;
    String allTheTaskDetails;
    String taskToDo = " To Do";
    String taskDone = " Done ";
    String taskDoing = " Doing ";
    
    public boolean checkTaskDescription(String lengthDescription)
    {
        boolean scriptlength = false;
        if (lengthDescription.length() < 51)
        {
            scriptlength = true;
        }
        return scriptlength;
    }

    public String DescriptTask(String lengthDescription)
    {

        if (checkTaskDescription(lengthDescription))
        {
            return "Task successfully captured";
        } else
        {
            return "Please enter a task description of less than 50 characters";
        }
    }

    public int returnTotalHours()
    {
        taskHrs = +totalDurationHrs;
        return totalDurationHrs;
    }

    public String createTaskID(String nameTask, String devName)
    {
        String lastThreeLetters = null;
        String firstTwoLetters;

        if (nameTask.length() == 3)
        {
            lastThreeLetters = nameTask;
        }

        if (nameTask.length() > 3)
        {
            lastThreeLetters = nameTask.substring(nameTask.length() - 3);
        }

        if (devName.length() < 2)
        {
            firstTwoLetters = devName;
        } else
        {
            firstTwoLetters = devName.substring(0, 2);
        }

        return firstTwoLetters.toUpperCase() + ":" + Integer.toString(numTask - 1) + ":" + lastThreeLetters.toUpperCase();

    }
    public String printTaskDetails(){
        
       String printTask= "Task Status - "  + statusTask            
                            + "\n" + "Developer Name - " + devName
                            + "\n" + "Task Number - " + theTaskNumStr
                            + "\n" + "Task Name - " + nameTask
                            + "\n" + "Task Description - " + lengthDescription
                            + "\n" + "Task ID - " + createTaskID(nameTask, devName)
                            + "\n" + "Task Duration - " + taskHrs + "hrs";
        
        
       return printTask;  
  
        
        
           
    }
}
