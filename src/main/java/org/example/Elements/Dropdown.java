package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LoginFactory;
import org.example.utils.ElementLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown implements TestInterface {
    public void printDropdownElements(List<WebElement> dropdownElements) {
        System.out.println("Number of options in the dropdown: " + dropdownElements.size());
        for (WebElement element : dropdownElements) {
            System.out.println("Option: " + element.getText());
        }
    }

    @Override
    public void test() throws InterruptedException {
        // Login to the application
        LoginFactory.login();

        DriverFactory.switchToFrame(ElementLocators.HOME_PAGE_FRAME);

        WebElement dropdown = DriverFactory.findElement(By.name("loc_code"));

        List<WebElement> dropdownElements =  dropdown.findElements(By.tagName("option"));

        printDropdownElements(dropdownElements);

        Select select = new Select(dropdown);
        // Select an option by index
        select.selectByIndex(2);

        // Wait for 5 seconds
        Thread.sleep(5000);

        // Select another option (e.g., index 3)
        select.selectByVisibleText("Emp. Last Name");

    }
}
