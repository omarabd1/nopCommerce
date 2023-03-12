import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InvalidLogInPage extends TestBase{
    LogInPage logInPage;
    HomePage homePage;
    @DataProvider(name="InvalidLoginData")
    public static Object[] [] Data()
    {
        return new Object[][]
                {
                        {"ahmeda@gamil.","1234567898"},// invalid email
                        {"assddd","1545484121"},// invalid email
                        {"ahmed.com","45454545457"},//invalid email
                        {"@gmail.com","88787878874"},// invalid email
                        {"omarrr@gmail.com","1234567899"},// not registered email
                        {"omarqwq@gmail.com","129"}, // wrong password
                        {"","1234567899"}, //empty  email field
                        {"omarrr@gmail.com",""},// empty password field

                };
    }
    @Test(dataProvider = "InvalidLoginData")
    public void login(String email,String password)
    {
        logInPage = new LogInPage(driver);
        homePage = new HomePage(driver);
        homePage.ClickOnLogInPage();
        logInPage.EnterEmail(email);
        logInPage.EnterPassword(password);
        logInPage.ClickLogIn();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[1]/h1")).getText().contains("Welcome, Please Sign In!"));
    }
}
