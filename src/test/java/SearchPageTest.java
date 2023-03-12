import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchPageTest extends TestBase{
    HomePage homePage;
    SearchPage searchPage;

    @Test
    public void HappySenarioTrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("computer");
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).getText().contains("Build your own computer"));
    }

    @Test
    public void HappySenario_2TrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("computer");
        searchPage.ClickOnAdvancedSearch();
        searchPage.ChooseCategory("Computers >> Desktops");
        searchPage.ChooseManufacturer("All");
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).getText().contains("Build your own computer"));
    }
    @Test
    public void HappySenario_3TrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("Apple");
        searchPage.ClickOnAdvancedSearch();
        searchPage.ChooseCategory("Computers >> Notebooks");
        searchPage.ChooseManufacturer("Apple");
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/h2/a")).getText().contains("Apple MacBook Pro 13-inch"));
    }
    @Test
    public void BadSenario_1TrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("Ape"); // wrong letter
        searchPage.ClickOnAdvancedSearch();
        searchPage.ChooseCategory("Computers >> Notebooks");
        searchPage.ChooseManufacturer("Apple");
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.className("no-result")).getText().contains("No products were found that matched your criteria."));
    }
    @Test
    public void BadSenario_2TrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("Apple");
        searchPage.ClickOnAdvancedSearch();
        searchPage.ChooseCategory("Books");// wrong in Choose category
        searchPage.ChooseManufacturer("Apple");
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.className("no-result")).getText().contains("No products were found that matched your criteria."));
    }
    @Test
    public void BadSenario_3TrySearch()
    {
        homePage=new HomePage(driver);
        searchPage=new SearchPage(driver);
        homePage.ClickOnSearch();
        searchPage.Searchkeyword("Apple");
        searchPage.ClickOnAdvancedSearch();
        searchPage.ChooseCategory("Computers >> Notebooks");
        searchPage.ChooseManufacturer("HP"); // wrong in Choose Manufacturer
        searchPage.ClickOnSearchButton();
        Assert.assertTrue(driver.findElement(By.className("no-result")).getText().contains("No products were found that matched your criteria."));
    }



}
