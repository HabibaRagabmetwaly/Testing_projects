public class Home_Page {

    import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class DemoblazeTest {
        WebDriver driver;

        @BeforeMethod
        public void setup() {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.demoblaze.com/");
            driver.manage().window().maximize();
        }

        @Test
        public void testSelectPhonesCategory() throws InterruptedException {
            WebElement phonesCategory = driver.findElement(By.linkText("Phones"));
            phonesCategory.click();
            Thread.sleep(2000);
            WebElement samsungGalaxyS6 = driver.findElement(By.xpath("//h4[@class='card-title']/a[text()='Samsung galaxy s6']"));
            Assert.assertTrue(samsungGalaxyS6.isDisplayed(), "Samsung Galaxy S6 is not displayed!");
        }

        @AfterMethod
        public void tearDown() {
            driver.quit();
        }
    }
}
