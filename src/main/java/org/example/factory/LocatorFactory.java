package org.example.factory;

import org.openqa.selenium.By;

public class LocatorFactory {
    public static By getByName(String name) {
        return By.name(name);
    }
    public static By getById(String id) {
        return By.id(id);
    }
    public static By getByXpath(String xpath) {
        return By.xpath(xpath);
    }
    public static By getByCssSelector(String cssSelector) {
        return By.cssSelector(cssSelector);
    }
    public static By getByLinkText(String linkText) {
        return By.linkText(linkText);
    }
    public static By getByTagName(String tagName) {
        return By.tagName(tagName);
    }
    public static By getByClassName(String className) {
        return By.className(className);
    }
    public static By getByText(String text) {
        return By.xpath("//*[text()='" + text + "']");
    }
}
