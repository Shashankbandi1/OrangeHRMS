package org.example.Elements;

import org.example.factory.DriverFactory;
import org.example.factory.LocatorFactory;

import java.util.ArrayList;
import java.util.Set;


public class WindowHandles implements TestInterface {
    // This class is used to handle window handles in Selenium WebDriver
    /**
     * This method is used to test the window handles functionality.
     * It clicks on an element to open a new window, retrieves the window handles,
     * switches to the new window, and verifies the text of an element in the new window.
     *
     * @throws InterruptedException if the thread is interrupted while waiting
     */

    @Override
    public void test() throws InterruptedException {
        DriverFactory.findElement(LocatorFactory.getById("openwindow")).click();
        Set<String> windows = DriverFactory.getWindowHandles();
        System.out.println("windowsize: " + windows.size());
        ArrayList <String> windowList = new ArrayList<>(windows);
        DriverFactory.switchToWindow(windowList.get(1));
        Thread.sleep(5000);
        String ChildWindowText = DriverFactory.findElement(LocatorFactory.getByXpath("//span[contains(text(),'info@qaclickacademy.com')]")).getText();
        System.out.println("ChildWindowText : "+ ChildWindowText);
        if(ChildWindowText.equals("info@qaclickacademy.com")) {
            System.out.println("ChildWindowText verified successfully");
        }else {
            System.out.println("ChildWindowText not verified successfully");
        }
    }
}
