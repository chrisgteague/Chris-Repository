/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121_poe_st10083450;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TaskTest
{
      Task testTasks = new Task();
    
    public TaskTest() {
    }

     @Test
    public void testCreateTaskID() 
    {
        String expected = "LO:1:BYN";
        String actual = testTasks.createTaskID("Add login Feature", 1, "Robyn");
        assertEquals(expected,actual);
                    
    }

    
    @Test
    public void testReturnTotalHours() 
    {
        
    }

    @Test
    public void testPrintTaskDetails() 
    {
        
        int expected = 80;
        int actual = testTasks.returnTotalHours(2, 40);
        assertEquals(expected,actual);
    }

    @Test
    public void testAddSlackTime() 
    {
        // TestingLoops
        int expected = 40;
        int actual = testTasks.addSlackTime(2, 20, 10);
        assertEquals(expected,actual);
    }
}
