package by.booklover.ui.page.personal.profile;

import by.booklover.ui.driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        this.driver = Driver.getDriver();
    }
}
