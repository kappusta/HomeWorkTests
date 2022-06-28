import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestingEverything {
    @Test
    public void doit() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    int A = 44;
    int c = summ(23, 23) + 5;
    int v = A + c;

    @Test
    public void pp() {
        int result = summ(20, 30);
        System.out.println(result + 5);
    }

    public int summ(int a, int b) {
        return a + b;
    }

    @Test
    public void total() {
        System.out.println(13 % 5);
        System.out.println(v);
    }
}
