import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class BuildYourOwnComputerPage extends PageBase{
    public BuildYourOwnComputerPage(WebDriver driver)
    {
        super(driver);
    }
    By Processor = By.xpath("//*[@id='product_attribute_1']");
    By Ram = By.xpath("//*[@id='product_attribute_2']");
    By HDD ;
    By OS;
    By Software;
    By Quantity = By.id("product_enteredQuantity_1");
    By AddToCart = By.xpath("//*[@id='add-to-cart-button-1']");

    public void ChooseProcessor(String processor)
    {
        Select select = new Select(driver.findElement(Processor));
        select.selectByVisibleText(processor);
    }
    public void ChooseRam(String ram)
    {
        Select select = new Select(driver.findElement(Ram));
        select.selectByVisibleText(ram);
    }

    public void  ChooseHDD (String hdd)
    {
        HDD = By.id(hdd);
        driver.findElement(HDD).click();
    }
    public void  ChooseOS (String os)
    {
        OS = By.id(os); // product_attribute_4_8 Vista Home // id="product_attribute_4_9 Vist Premium
        driver.findElement(OS).click();
    }
    public void  ChooseSoftware (String software)
    {
        Software = By.id(software); //product_attribute_5_10 micro//product_attribute_5_11 asrbot//product_attribute_5_12 total
        driver.findElement(Software).click();
    }
    public void  EnterQuantity (String quantity)
    {
        driver.findElement(Quantity).sendKeys(quantity);
    }
    public void  clearQuantity ()
    {
        driver.findElement(Quantity).clear();
    }

    public void  ClickOnAddToCart()
    {
        driver.findElement(AddToCart).click();
    }






}
