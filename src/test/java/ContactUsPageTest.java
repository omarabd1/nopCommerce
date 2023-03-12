import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUsPageTest extends TestBase{
 HomePage homePage;
 ContactUsPage contactUsPage ;
 @Test (priority = 1)
    public void contactUs()
 {
     homePage =new HomePage(driver);
     contactUsPage = new ContactUsPage(driver);
     homePage.ClickOnContactUs();
     contactUsPage.EnterName("omar");
     contactUsPage.EnterEmail("omar@gmail.com");
     contactUsPage.EnterEnquiry("Does this site support purchases via Visacard?");
     contactUsPage.ClickOnSubmit();
     Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("Your enquiry has been successfully sent to the store owner."));
 }
    @Test (priority = 2)
    public void InvalidcontactUs()
    {
        homePage =new HomePage(driver);
        contactUsPage = new ContactUsPage(driver);
        homePage.ClickOnContactUs();
        contactUsPage.EnterName("omar");
        contactUsPage.EnterEmail("omargm");//invalid email
        contactUsPage.EnterEnquiry("Does this site support purchases via Visacard?");
        contactUsPage.ClickOnSubmit();
        //Assert.assertTrue(driver.findElement(By.className("result")).getText().contains("Your enquiry has been successfully sent to the store owner."));
    }

}
