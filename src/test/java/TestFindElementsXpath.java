import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestFindElementsXpath {
    WebDriver driver;

    public void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeMethod
    public void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        sleep(1);
        driver.get("https://eatstreet.com/");
    }

    @AfterMethod
    public void closeBrowser() {
        sleep(2);
        driver.get("https://klike.net/4007-ja-molodec-prikolnye-kartinki-50-foto.html");
        sleep(2);
        driver.quit();
    }

    @Test
    public void checkOpeningCart() {
        driver.findElement(By.xpath("//img[@alt='cart']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='widget-header--menu__cart__header']")).isDisplayed());
    }

    @Test
    public void checkSigninAndSignUpPage() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed());
        sleep(4);
        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//button[@id='signup']")).isDisplayed());
    }
}
