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

        WebElement btnHeaderHome = driver.findElement(By.cssSelector("a[href='/home']"));
        btnHeaderHome.click();
        FirstTest.pause(3);
        WebElement btnHeaderAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnHeaderAbout.click();
        FirstTest.pause(3);
        WebElement btnHeaderLogIn = driver.findElement(By.cssSelector("a[href=\"/login\"]"));
        btnHeaderLogIn.click();

        FirstTest.pause(3);
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        inputEmail.sendKeys("elenam@gmail.com");
        FirstTest.pause(3);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[name='password']"));
        inputPassword.sendKeys("Password$1");
        FirstTest.pause(3);
        WebElement btnLogIn = driver.findElement(By.cssSelector("button[name='login']"));
        btnLogIn.click();

        FirstTest.pause(5);
        driver.quit();
    }
}
