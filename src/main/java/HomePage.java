import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageBase {

    public HomePage(WebDriver driver)
    {
        super(driver);
    }
    By RegisterButton = By.xpath("//a[@class='ico-register']");
    By LoginButton = By.xpath("//a[@class='ico-login']");
    By LogOut = By.className("ico-logout");
    By ContactUs = By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a");
    By Search = By.xpath("/html/body/div[6]/div[4]/div[1]/div[2]/ul/li[1]/a");
    By BuildYourOwnComputer =By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[1]/a/img");
    By MyAccount = By.className("ico-account");

    public void  ClickOnRegisterPage(){
        driver.findElement(RegisterButton).click();
    }
    public void  ClickOnLogInPage()
    {
        driver.findElement(LoginButton).click();
    }
    public void  ClickOnLogOut(){
        driver.findElement(LogOut).click();
    }
    public void  ClickOnContactUs(){
        driver.findElement(ContactUs).click();
    }
    public void  ClickOnSearch(){
        driver.findElement(Search).click();
    }
    public void  ClickOnBuildYourOwnComputer(){
        driver.findElement(BuildYourOwnComputer).click();
    }
    public void  ClickOnMyAccount(){
        driver.findElement(MyAccount).click();
    }



}
