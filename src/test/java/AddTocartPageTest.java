import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddTocartPageTest extends TestBase{
    HomePage homePage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @Test (priority = 1)
    public void HappySinario_CheckAddToCart()
    {
        buildYourOwnComputerPage=new BuildYourOwnComputerPage(driver);
        homePage=new HomePage(driver);
        homePage.ClickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.ChooseProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.ChooseRam("2 GB");
        buildYourOwnComputerPage.ChooseHDD("product_attribute_3_7");
        buildYourOwnComputerPage.ChooseOS("product_attribute_4_9");
        buildYourOwnComputerPage.ChooseSoftware("product_attribute_5_12");
        buildYourOwnComputerPage.clearQuantity();
        buildYourOwnComputerPage.EnterQuantity("80");
        buildYourOwnComputerPage.ClickOnAddToCart();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='bar-notification']/div/p")).getText().contains("The product has been added to your "));

    }
    /*@Test
    public void BadSinario1_CheckAddToCart()
    {
        buildYourOwnComputerPage=new BuildYourOwnComputerPage(driver);
        homePage=new HomePage(driver);
        homePage.ClickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.ChooseProcessor("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.ChooseRam("");// whitout Ram select
        buildYourOwnComputerPage.ChooseHDD("product_attribute_3_7");
        buildYourOwnComputerPage.ChooseOS("product_attribute_4_9");
        buildYourOwnComputerPage.ChooseSoftware("product_attribute_5_12");
        buildYourOwnComputerPage.clearQuantity();
        buildYourOwnComputerPage.EnterQuantity("80");
        buildYourOwnComputerPage.ClickOnAddToCart();
    }
    @Test
    public void BadSinario2_CheckAddToCart()
    {
        buildYourOwnComputerPage=new BuildYourOwnComputerPage(driver);
        homePage=new HomePage(driver);
        homePage.ClickOnBuildYourOwnComputer();
        buildYourOwnComputerPage.ChooseProcessor("");// Without select processor
        buildYourOwnComputerPage.ChooseRam("2 GB");
        buildYourOwnComputerPage.ChooseHDD("product_attribute_3_7");
        buildYourOwnComputerPage.ChooseOS("product_attribute_4_9");
        buildYourOwnComputerPage.ChooseSoftware("product_attribute_5_12");
        buildYourOwnComputerPage.clearQuantity();
        buildYourOwnComputerPage.EnterQuantity("80");
        buildYourOwnComputerPage.ClickOnAddToCart();
    }*/


}
