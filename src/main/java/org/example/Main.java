package org.example;

import org.example.Elements.Checkbox;
import org.example.Elements.Dropdown;
import org.example.factory.DriverFactory;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        DriverFactory.init(new FirefoxDriver());

        //Dropdown testing
        Dropdown dropdown = new Dropdown();
        dropdown.test();

        //CheckBox testing
        Checkbox checkBox = new Checkbox();
        checkBox.test();

    }
}