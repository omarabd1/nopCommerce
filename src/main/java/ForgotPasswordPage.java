import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage extends PageBase{
    public ForgotPasswordPage(WebDriver driver)
    {
        super(driver);
    }
    By Email = By.className("email");
    By RecoverButton =By.name("send-email");

    public void EnterEmail(String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void ClickOnRecoverButton()
    {
        driver.findElement(RecoverButton).click();
    }
}
