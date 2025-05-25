import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookIlCarroXPath {

    WebDriver driver = new ChromeDriver();

    @Test
    public void xpathTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));//CSS div[id='root']
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);
        System.out.println("=======================");
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("zxc_mail123@mymail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Password123!");
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();
        driver.quit();
    }

    @Test
    public void iLCarroXpath(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSignUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSignUp.click();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName.sendKeys("Bilbo");
        WebElement inputLastName =
                driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
        inputLastName.sendKeys("Baggins");
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail.sendKeys("bilbo_baggins_12345@mail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
        inputPassword.sendKeys("Password123!");
        WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
        checkBox.click();
        WebElement btnYalla = driver.findElement(By.xpath("//button[@type='submit']"));
        btnYalla.click();
    }
}