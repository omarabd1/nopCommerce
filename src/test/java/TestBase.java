import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import java.time.Duration;

public class TestBase {
public static WebDriver driver;
   @BeforeTest
   public void SetupDriver(){
      driver = new EdgeDriver();
      driver.get("https://demo.nopcommerce.com/");
      driver.manage().window().fullscreen();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
   }
   @AfterTest
   public void CloseBrowser(){
      driver.quit();
   }

}
