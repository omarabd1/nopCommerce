import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {
    public RegisterPage(WebDriver driver)
    {
        super(driver);
    }
    By gender ;
    By FirstName = By.name("FirstName");
    By LastName = By.name("LastName");
    By DayDropDown = By.xpath("//select[@name='DateOfBirthDay']");
    By MonthDropDown = By.xpath("//select[@name='DateOfBirthMonth']");
    By YearDropDown = By.xpath("//select[@name='DateOfBirthYear']");
    By EmailField = By.id("Email");
    By CompanyFiled = By.id("Company");
    By PasswordField = By.id("Password");
    By RePasswordField = By.id("ConfirmPassword");
    By RegisterButton = By.id("register-button");


    public void  ChooseGender (String gen)
    {
        gender = By.id(gen);
        driver.findElement(gender).click();
    }
    public void  EnterFirstName (String firstName)
    {
        driver.findElement(FirstName).sendKeys(firstName);
    }
    public void  EnterLastName (String lastName)
    {
        driver.findElement(LastName).sendKeys(lastName);
    }
    public void ChooseDate(String day , String month , String year)
    {
        Select select = new Select(driver.findElement(DayDropDown));
        select.selectByVisibleText(day);

        select = new Select(driver.findElement(MonthDropDown));
        select.selectByVisibleText(month);

        select = new Select(driver.findElement(YearDropDown));
        select.selectByVisibleText(year);
    }
    public void  EnterEmail(String email)
    {
        driver.findElement(EmailField).sendKeys(email);
    }
    public void  EnterCompany(String company)
    {
        driver.findElement(CompanyFiled).sendKeys(company);
    }
    public void  EnterPassword(String password)
    {
        driver.findElement(PasswordField).sendKeys(password);
    }
    public void  EnterConfirmPassword(String RePassword)
    {
        driver.findElement(RePasswordField).sendKeys(RePassword);
    }
    public void  ClickOnRegisterButton()
    {
        driver.findElement(RegisterButton).click();
    }








}













