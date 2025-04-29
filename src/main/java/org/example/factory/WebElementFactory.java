package org.example.factory;

import org.openqa.selenium.WebElement;

public class WebElementFactory {
    public static void click(WebElement element) {
        element.click();
    }
    public static void sendKeys(WebElement element, String keys) {
        element.sendKeys(keys);
    }
    public static void clear(WebElement element) {
        element.clear();
    }
    public static String getText(WebElement element) {
        return element.getText();
    }
}
