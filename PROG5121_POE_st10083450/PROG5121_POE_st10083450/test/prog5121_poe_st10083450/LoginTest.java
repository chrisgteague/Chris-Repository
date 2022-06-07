/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package prog5121_poe_st10083450;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author user-pc
 */
public class LoginTest
{
    
    public LoginTest()
    {}
    Login login = new Login();

    @Test
    public void testCheckUserNameCorrectlyFormatted()
    { boolean actual = login.checkUserName("kyl_1");
        assertTrue(actual);
    }

    
    @Test
    public void testCheckUserNamePoorlyFormatted()
    { boolean actual = login.checkUserName("ky1e!!!!!");
        assertFalse(actual);
    }
    
    @Test
    public void testCheckPassWordComplexitySuccess()
    { boolean actual = login.checkPassWordComplexity("Ch&&sec@ke99!");
        assertTrue(actual);
    }   

    @Test
    public void testCheckPassWordComplexityFaillure()
    { boolean actual = login.checkPassWordComplexity("password");
        assertFalse(actual);
    }   
    
    @Test
    public void testRegisterUser()
    {
    }

    @Test
    public void testLoginUser()
    {
    }

    @Test
    public void testReturnLoginStatus()
    {
    }
    
}
