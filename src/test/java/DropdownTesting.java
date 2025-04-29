import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownTesting {
    public static void main(String[] args) {
        // Login to the application
        WebDriver driver = LoginPage.login();
        driver.switchTo().frame("rightMenu");
        WebElement dropdown = driver.findElement(By.name("loc_code"));
        List<WebElement> dropdownElements =  dropdown.findElements(By.tagName("option"));
        System.out.println("Number of options in the dropdown: " + dropdownElements.size());
        for (WebElement element : dropdownElements) {
            System.out.println("Option: " + element.getText());
        }
        Select select = new Select(dropdown);
        // Select an option by index
        select.selectByIndex(2);
//        select.selectByVisibleText("Emp. First Name");
    }
}
