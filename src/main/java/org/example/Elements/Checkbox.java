package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.WebElement;

public class Checkbox implements TestInterface {
    @Override
    public void test() throws InterruptedException {

        WebElement checkbox1 = DriverFactory.findElement(LocatorFactory.getById("checkBoxOption1"));
        checkbox1.click();
        if(checkbox1.isSelected()) {
            System.out.println("checkbox button selected");
        }else {
            System.out.println("checkbox button selected");
        }

    }
}