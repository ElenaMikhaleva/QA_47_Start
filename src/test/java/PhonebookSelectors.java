import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhonebookSelectors {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phonebookTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        FirstTest.pause(5); // метод из FirstTest
        // HOMEWORK
    }
}
