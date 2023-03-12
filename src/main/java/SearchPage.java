import io.netty.buffer.ByteBuf;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchPage extends PageBase{
    public SearchPage(WebDriver driver)
    {
        super(driver);
    }
    By Searchkeyword = By.className("search-text");
    By AdvancedSearch =By.xpath("//*[@id='advs']");
    By Category = By.xpath("//*[@id='cid']");
    By Manufacturer = By.xpath("//*[@id='mid']");
    By SearchButton = By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[1]/form/div[2]/button");

    public void Searchkeyword(String searchkeyword)
    {
        driver.findElement(Searchkeyword).sendKeys(searchkeyword);
    }
    public void  ClickOnAdvancedSearch()
    {
        driver.findElement(AdvancedSearch).click();
    }
    public void ChooseCategory(String category)
    {
        Select select= new Select(driver.findElement(Category));
        select.selectByVisibleText(category);
    }
    public void ChooseManufacturer(String manufacturer)
    {
        Select select= new Select(driver.findElement(Manufacturer));
        select.selectByVisibleText(manufacturer);
    }
    public void  ClickOnSearchButton()
    {
        driver.findElement(SearchButton).click();
    }






}
