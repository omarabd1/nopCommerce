import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage extends PageBase{
    public ContactUsPage(WebDriver driver)
    {
        super(driver);
    }

    By Nanme = By.className("fullname");
    By Email = By.className("email");
    By Enquiry = By.className("enquiry");
    By Submit = By.name("send-email");

    public void  EnterName (String name)
    {
        driver.findElement(Nanme).sendKeys(name);
    }
    public void  EnterEmail (String email)
    {
        driver.findElement(Email).sendKeys(email);
    }
    public void  EnterEnquiry (String enquiry)
    {
        driver.findElement(Enquiry).sendKeys(enquiry);
    }
    public void  ClickOnSubmit ()
    {
        driver.findElement(Submit).click();
    }
}

