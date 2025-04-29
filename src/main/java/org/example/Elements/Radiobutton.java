package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.WebElement;

public class Radiobutton implements TestInterface {
    @Override
    public void test() throws InterruptedException {
        WebElement radio = DriverFactory.findElement(LocatorFactory.getByXpath("//label[contains(.,'Radio2')]//input[@type='radio']"));
        radio.click();
        if(radio.isSelected()) {
            String selectedValue = radio.getAttribute("value");
            System.out.println("Radio button selected: " + selectedValue);
        }else {
            System.out.println("Radio button not selected");
        }
    }


}
