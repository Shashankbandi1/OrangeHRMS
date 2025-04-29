package org.example.factory;

import org.example.utils.Constants;
import org.example.utils.ElementLocators;

public class LoginFactory {
    public static void login() {
        DriverFactory.launchApplication(Constants.URL);
        DriverFactory.findElement(LocatorFactory.getByName(ElementLocators.USERNAME)).sendKeys(Constants.USERNAME);
        DriverFactory.findElement(LocatorFactory.getByName(ElementLocators.PASSWORD)).sendKeys(Constants.PASSWORD);
        DriverFactory.findElement(LocatorFactory.getByName(ElementLocators.LOGIN_BUTTON)).click();
    }
    public static void logout() {
        //
    }
}
