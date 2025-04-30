package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.Alert;

public class AlertPopup implements TestInterface{
    /**
     * This method demonstrates how to handle an alert popup in Selenium WebDriver.
     * It sends a name to the input field, clicks the alert button, retrieves the alert text,
     * and then accepts the alert.
     *
     * @throws InterruptedException if the thread is interrupted during sleep
     */
    @Override
    public void test() throws InterruptedException {
        DriverFactory.findElement(LocatorFactory.getById("name")).sendKeys("shashank");
        DriverFactory.findElement(LocatorFactory.getById("alertbtn")).click();
        Alert alert = DriverFactory.switchToAlert();
        String alertText = alert.getText();
        System.out.println("Alert text is: " + alertText);
        Thread.sleep(3000);
        alert.accept();
    }
}
