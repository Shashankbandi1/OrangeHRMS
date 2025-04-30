package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;
import org.openqa.selenium.WebElement;

public class Checkbox implements TestInterface {
    /**
     * This method is used to test the checkbox functionality.
     * It finds the checkbox element by its ID, clicks it, and checks if it is selected.
     * If the checkbox is selected, it prints "checkbox button selected", otherwise it prints "checkbox button not selected".
     *
     * @throws InterruptedException if the thread is interrupted while waiting
     */
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