package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.WebElement;

public class Radiobutton implements TestInterface {
    @Override
    public void test() throws InterruptedException {
        WebElement radio = DriverFactory.findElement(LocatorFactory.getByXpath("//input[text() = 'radio3']"));
        radio.click();
        if(radio.isSelected()) {
            System.out.println("Radio button selected");
        }else {
            System.out.println("Radio button not selected");
        }
        DriverFactory.quit();
    }


}
