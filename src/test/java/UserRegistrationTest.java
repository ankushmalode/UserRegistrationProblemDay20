import com.bridgelabz.UserRegistration;
import org.junit.Assert;
import org.junit.Test;
import junit.framework.*;

public class UserRegistrationTest {
    UserRegistration userRegistration=new UserRegistration();

    @Test
    public void giveFirstNameTrue(){
        boolean  result=userRegistration.firstName("Ankush");
        Assert.assertEquals(true,result);
    }

    @Test
    public void giveFirstNameFalse1(){
        boolean  result=userRegistration.firstName("ANkush");
        Assert.assertEquals(false,result);
    }

    @Test
    public void giveFirstNameFalse2(){
        boolean  result=userRegistration.firstName("ankush");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveLastNameTrue(){
        boolean result=userRegistration.lastName("Malode");
        Assert.assertEquals(true,result);
    }

    @Test
    public void  giveLastNameFalse(){
        boolean result=userRegistration.lastName("MalodE");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveLastNameFalse2(){
        boolean result=userRegistration.lastName("malode");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveEmailTrue(){
        boolean result=userRegistration.email("ankush@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void  giveEmailTrue2(){
        boolean result=userRegistration.email("ankush123@gmail.com");
        Assert.assertEquals(true,result);
    }

    @Test
    public void  giveEmailFalse(){
        boolean result=userRegistration.email("ankushgmail.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveEmailFalse2(){
        boolean result=userRegistration.email("abc123@.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveEmailFalse3(){
        boolean result=userRegistration.email("abc@abc@gmail.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void  giveEmailFalse4(){
        boolean result=userRegistration.email("abc..2002@gmail.com");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givePasswordTrue(){
        boolean result=userRegistration.phoneNumber("91 9629695246");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givePasswordFalse(){
        boolean result=userRegistration.phoneNumber("919629695246");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givePasswordTrue2(){
        boolean result=userRegistration.password("deep@111");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givePasswordFalse2(){
        boolean result=userRegistration.password("dee@11");
        Assert.assertEquals(false,result);
    }

    @Test
    public void givePasswordTrue3(){
        boolean result=userRegistration.password2("Deep@123");
        Assert.assertEquals(true,result);
    }
}
