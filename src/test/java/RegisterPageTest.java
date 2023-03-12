import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.*;

public class RegisterPageTest extends TestBase{
    RegisterPage registerPage ;
    HomePage homePage ;
    @DataProvider(name="RegisterData")
    public static Object[] [] Data()
    {
        return new Object[][]
        {
                {"gender-female","mena","Khlid","18","April","1996","a44afdok554@gil.comma","iti","45f5fdf5dfdf","45f5fdf5dfdf"},
                {"gender-male","omar","Khlid","15","April","1997","okat4a554@gmail.com","iti","45f5fdf5dfdf","45f5fdf5dfdf"},
                {"gender-male","ahmed","Khlid","19","April","2001","tqaya4455@gmail.com","nti","45f5fdf5dfdf","45f5fdf5dfdf"},
                {"gender-female","lolia","Khlid","17","April","1999","oaqya4454@gmail.com","fwd","45f5fdf5dfdf","45f5fdf5dfdf"},
                {"gender-male","ali","Khlid","3","April","1998","okaaty@gmail.com","itida","45f5fdf5dfdf","45f5fdf5dfdf"},

        };
    }
    @Test (dataProvider = "RegisterData")
    public void ValidRegister(String gen , String fn ,String Ln ,String day , String month ,String year, String email,String comy,String pass,String Repass){
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        homePage.ClickOnRegisterPage();
        registerPage.ChooseGender(gen);
        registerPage.EnterFirstName(fn);
        registerPage.EnterLastName(Ln);
        registerPage.ChooseDate(day,month,year);
        registerPage.EnterEmail(email);
        registerPage.EnterCompany(comy);
        registerPage.EnterPassword(pass);
        registerPage.EnterConfirmPassword(Repass);
        registerPage.ClickOnRegisterButton();
        /* String actuall = driver.findElement(By.className("result")).getText();
        String expected = "Yourregistrationmpleted";
        Assert.assertTrue(actuall.contains(expected)); */ // anthor way
        Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("Your registration completed"));
     }







}
