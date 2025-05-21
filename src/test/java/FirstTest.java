import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTest {
    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        pause(3);
        WebElement btnLetCarWork = driver.findElement(By.cssSelector("a[id='1']"));
        btnLetCarWork.click();

        pause(3);
        WebElement btnTermsOfUse = driver.findElement(By.cssSelector("*[ng-reflect-router-link=\"terms-of-use\"]"));
        btnTermsOfUse.click();
        System.out.println(btnTermsOfUse.getText());

        pause(5);
        WebElement btnSignUp = driver.findElement(By.cssSelector("a[href='/registration?url=%2Fterms-of-use']"));
        btnSignUp.click();
        pause(3);
        WebElement inputName = driver.findElement(By.id("name"));
        inputName.sendKeys("Rosa");
        pause(2);
        WebElement inputLastName = driver.findElement(By.cssSelector("input[autocomplete=\"family-name\"]"));
        inputLastName.sendKeys("Vasilkova");
        pause(2);
        WebElement inputEmail = driver.findElement(By.cssSelector("input[autocomplete=\"email\"]"));
        inputEmail.sendKeys("zhiu@gmail.com");
        pause(2);
        WebElement inputPassword = driver.findElement(By.cssSelector("input[autocomplete=\"new-password\"]"));
        inputPassword.sendKeys("AS42%");
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
