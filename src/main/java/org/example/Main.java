package org.example;

import org.example.Elements.AlertPopup;
import org.example.Elements.Checkbox;
import org.example.Elements.Dropdown;
import org.example.Elements.Radiobutton;
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

//        DriverFactory.quit();
    }
}