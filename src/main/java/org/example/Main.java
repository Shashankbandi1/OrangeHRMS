package org.example;

import org.example.Elements.Dropdown;
import org.example.factory.DriverFactory;
import org.example.utils.Constants;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DriverFactory.init(new FirefoxDriver());

        //Dropdown testing
        Dropdown dropdown = new Dropdown();
        dropdown.test();

        //Checkbox testing
//        Checkbox checkbox = new Checkbox();
//        checkbox.test();

    }
}