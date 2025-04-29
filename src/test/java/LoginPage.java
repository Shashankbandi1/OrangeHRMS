import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public static WebDriver login() {
        // Initialize WebDriver
        WebDriver driver = CommonCode.webdriverInitialize();
        driver.findElement(By.name("txtUserName")).sendKeys("shashank");
        driver.findElement(By.name("txtPassword")).sendKeys("shashank");
        driver.findElement(By.name("Submit")).click();
        return driver;
    }
}