import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidRegisterPageTest extends TestBase {

    RegisterPage registerPage ;
    HomePage homePage ;
    @DataProvider(name="InvalidRegisterData")
    public static Object[] [] Data()
    {
        return new Object[][]
                {
                       {"gender-female","asmma","Khlid","16","April","1998","dfdafqqddfd","ihi","45f5fdf5dfdf","45f5fdf5dfdf"},// invald Email
                        {"gender-female","lobna","Khlid","16","April","1995","qogavgavfv1@gmail.com","ihi","45f","45f"},//invalid password lass than 6
                        {"gender-female","heba","Khlid","16","April","1997","qoasdvavf2@gmail.com","ihi","fefefefefefef","45f5fdf5dfdf"},// invlid (password not matched)
                       {"gender-male","","Khlid","16","April","2000",".com","ihi","45f5fdf5dfdf","45f5fdf5dfdf"},// invald Email
                         {"gender-male","omar","Khlid","16","April","2000","@gmail.com","ihi","45f5fdf5dfdf","45f5fdf5dfdf"},//invald Email
                         {"gender-female","ahmed","Khlid","17","April","2000","","ihi","45f5fdf5dfdf","45f5fdf5dfdf"},//invald Email
                };
    }
    @Test (dataProvider = "InvalidRegisterData")
    public void InValidRegister(String gen , String fn ,String Ln ,String day , String month ,String year, String email,String comy,String pass,String Repass)
    {

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
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[1]/strong")).getText().contains("Your Personal Details"));
    }

}
