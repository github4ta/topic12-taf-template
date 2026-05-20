package by.booklover.ui.page.personal.profile;

import by.booklover.ui.driver.Driver;
import org.openqa.selenium.WebDriver;

public class BasePageComponent {
    protected WebDriver driver;

    public BasePageComponent() {
        this.driver = Driver.getDriver();
    }
}
