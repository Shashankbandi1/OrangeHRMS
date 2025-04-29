package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.Alert;

public class AlertPopup implements TestInterface{
    @Override
    public void test() throws InterruptedException {
        DriverFactory.findElement(LocatorFactory.getById("name")).sendKeys("shashank");
        DriverFactory.findElement(LocatorFactory.getById("alertbtn")).click();
        Alert alert = DriverFactory.switchToAlert();
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        Thread.sleep(5000);
        alert.accept();
    }
}
