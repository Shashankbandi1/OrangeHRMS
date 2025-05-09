package org.example.factory;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Set;

public class DriverFactory {
    private static WebDriver driver;
    public static void init(WebDriver webDriver) {
        driver = webDriver;
        driver.manage().window().maximize();
    }
    public static void quit() {
        if (driver != null) {
            driver.quit();
        }
    }
    public static void launchApplication(String url) {
        driver.get(url);
    }
    public static String getTitle(){
        return driver.getTitle();
    }
    public static List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }
    public static WebElement findElement(By by) {
        return driver.findElement(by);
    }
    public static void switchToFrame(String frameName) {
        driver.switchTo().frame(frameName);
    }
    public static void switchToFrame(int frameIndex) {
        driver.switchTo().frame(frameIndex);
    }
    public static void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
    public static Alert switchToAlert() {
        return driver.switchTo().alert();
    }
   public static Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }
    public static void switchToWindow(String windowHandle) {
        driver.switchTo().window(windowHandle);
    }
}
