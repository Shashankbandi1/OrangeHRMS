package org.example;

import org.example.Elements.*;
import org.example.factory.DriverFactory;
import org.example.factory.LoginFactory;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        DriverFactory.init(new FirefoxDriver());
        LoginFactory.login();

        //Dropdown testing
        Dropdown dropdown = new Dropdown();
        dropdown.test();

        //CheckBox testing
        Checkbox checkBox = new Checkbox();
        checkBox.test();

        //RadioButton testing
        Radiobutton radioButton = new Radiobutton();
        radioButton.test();

        //Alert testing
        AlertPopup alertPopup = new AlertPopup();
        alertPopup.test();

        //Window handling
        WindowHandles windowHandling = new WindowHandles();
        windowHandling.test();

       DriverFactory.quit();
    }
}