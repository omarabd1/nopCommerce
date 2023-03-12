import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase{
    HomePage homePage;
    LogInPage logInPage;
    ForgotPasswordPage forgotPasswordPage;
    RegisterPage registerPage;

    @Test (priority = 1)
    public void Register(){
        registerPage = new RegisterPage(driver);
        homePage = new HomePage(driver);
        homePage.ClickOnRegisterPage();
        registerPage.ChooseGender("gender-female");
        registerPage.EnterFirstName("omar");
        registerPage.EnterLastName("ahmed");
        registerPage.ChooseDate("5","April","2000");
        registerPage.EnterEmail("ohme@gamil.com");
        registerPage.EnterCompany("ITI");
        registerPage.EnterPassword("123456789");
        registerPage.EnterConfirmPassword("123456789");
        registerPage.ClickOnRegisterButton();
        Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("Your registration completed"));
    }
    @Test (dependsOnMethods = "Register" , priority = 2)
    public void HappySenario_RecoverMyPassword()
    {
        forgotPasswordPage = new ForgotPasswordPage(driver);
        homePage= new HomePage(driver);
        logInPage= new LogInPage(driver);
        homePage.ClickOnLogInPage();
        logInPage.ClickOnforgotPassword();
        forgotPasswordPage.EnterEmail("ohme@gamil.com");
        forgotPasswordPage.ClickOnRecoverButton();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bar-notification']/div")).getText().contains("Email with instructions has been sent to you."));
    }
    /*@Test (priority = 3)
    public void BadSenario_RecoverMyPassword()
    {
        forgotPasswordPage = new ForgotPasswordPage(driver);
        homePage= new HomePage(driver);
        logInPage= new LogInPage(driver);
        homePage.ClickOnLogInPage();
        logInPage.ClickOnforgotPassword();
        forgotPasswordPage.EnterEmail("gohkmed@gamil.com"); // not registered email
        forgotPasswordPage.ClickOnRecoverButton();
        Assert.assertFalse(driver.findElement(By.xpath("//*[@id='bar-notification']/div")).getText().contains("Email with instructions has been sent to you."));
    }*/



}
