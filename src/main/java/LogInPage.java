import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends PageBase {
    public LogInPage(WebDriver driver)
    {
        super(driver);
    }
    By Email = By.className("email");
    By Password = By.id("Password");
    By LogIn = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");
    By ForgotPassword=By.className("forgot-password");

    public void  EnterEmail (String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void  EnterPassword (String password)
    {
        driver.findElement(Password).sendKeys(password);
    }
    public void  ClickLogIn ()
    {
        driver.findElement(LogIn).click();
    }
    public void  ClickOnforgotPassword ()
    {
        driver.findElement(ForgotPassword).click();
    }




}
