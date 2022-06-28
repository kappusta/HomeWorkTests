import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestVariables {
    @Test
    public void runChromDriver() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    int A = 44;
    int c = summ(23, 23) + 5;
    int v = A + c;

    @Test
    public void checkSumm() {
        int result = summ(20, 30);
        System.out.println(result + 5);
    }

    public int summ(int a, int b) {
        return a + b;
    }
}
