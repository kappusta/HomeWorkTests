import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.assertTrue;

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
        sleep(3);
        driver.get("https://eatstreet.com/");
        sleep(3);
    }

    @AfterMethod
    public void closeBrowser() {
        sleep(2);
        driver.quit();
    }

    @Test
    public void checkOpeningCart() {
        driver.findElement(By.xpath("//img[@alt='cart']")).click();
        assertTrue(driver.findElement(By.xpath("//div[@class='widget-header--menu__cart__header']")).isDisplayed());
    }

    @Test
    public void checkSigninAndSignUpPage() {
        driver.findElement(By.xpath("//a[@id='menu-signin']")).click();
        assertTrue(driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed());
        sleep(4);
        driver.findElement(By.xpath("//a[contains(text(),'Sign Up')]")).click();
        assertTrue(driver.findElement(By.xpath("//button[@id='signup']")).isDisplayed());
    }

    @Test
    public void checkDeliveryTakeoutToggle(){
        driver.findElement(By.xpath("//label[@for='home-checkbox-takeout']")).click();
        sleep(4);
        driver.findElement(By.xpath("//label[@for='home-checkbox-delivery']")).click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='home-checkbox-delivery']"))
                .getAttribute("class").contains("ng-valid-parse"));
    }

    @Test
    public void checkGetFedButtonWithEmptyLineAddress(){
        driver.findElement(By.xpath("//a[@id='find-restaurants']")).click();
        assertTrue(driver.findElement(By.xpath("//div[contains(text(), 'Address Search Attempt')]")).isDisplayed());
        sleep(4);
        driver.findElement(By.xpath("//a[@id='enter-address-btn']")).click();
        assertTrue(driver.findElement(By.xpath("//div[@class='row landing-callout__input-container']")).isDisplayed());
    }

    @Test
    public void checkAfricanFoodFilter(){
        driver.findElement(By.xpath("//label[contains(text(), 'Delivery')]")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Chicago\n");
        driver.findElement(By.xpath("//*[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//*[@id='find-restaurants']")).click();
        sleep(7);
        driver.findElement(By.xpath("//label[contains(text(), 'African Food')]")).click();
        assertTrue(driver.findElement(By.xpath("//div[@class='restaurants-list_active-filters']/div")).isDisplayed());
//        driver.findElement(By.xpath("//label[contains(text(), 'African Food')]/../input")).isSelected()
    }

    @Test
    public void checkSortByDeliveryFeeCategory() {
        driver.findElement(By.xpath("//label[contains(text(), 'Delivery')]")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Chicago\n");
        driver.findElement(By.xpath("//*[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//*[@id='find-restaurants']")).click();
        sleep(7);
        driver.findElement(By.xpath("//img[@alt='arrow-icon']")).click();
        driver.findElement(By.xpath("//button[@aria-label='delivery_fee']")).click();
        assertTrue(driver.findElement(By.xpath("//button[contains(text(), ' Delivery Fee ')]")).isDisplayed());
    }

    @Test
    public void checkSortByRatingCategory(){
        driver.findElement(By.xpath("//label[contains(text(), 'Delivery')]")).click();
        driver.findElement(By.xpath("//input[@id='input-food-search']")).sendKeys("Chicago\n");
        sleep(3);
        driver.findElement(By.xpath("//*[@id='enter-address-btn']")).click();
        driver.findElement(By.xpath("//*[@id='find-restaurants']")).click();
        sleep(7);
        driver.findElement(By.xpath("//img[@alt='arrow-icon']")).click();
        driver.findElement(By.xpath("//button[@aria-label='rating']")).click();
        driver.findElement(By.xpath("//img[@alt='arrow-icon']")).click();
        assertTrue(driver.findElement(By.xpath("//button[@aria-label='Sort by ratingis active']")).isDisplayed());
    }

    @Test
    public void checkOpeningToledoKitchenOrder(){
        driver.findElement(By.xpath("//button[contains(text(), 'Got it')]")).click();
        sleep(4);
        driver.findElement(By.xpath("//a[contains(text(), 'Toledo, OH')]")).click();
        sleep(4);
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(), 'View All Toledo Restaurants')]")).isDisplayed());
    }
}
