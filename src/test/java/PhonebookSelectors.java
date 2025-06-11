import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        FirstTest.pause(5);
        WebElement btnHeaderLogIn = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        btnHeaderLogIn.click();

        FirstTest.pause(5); // метод из FirstTest
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("elenam@gmail.com");

        FirstTest.pause(5);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("Password$1");

        FirstTest.pause(5);
        WebElement btnLogIn = driver.findElement(By.cssSelector("button[name='login']"));
        btnLogIn.click();

    }
}
