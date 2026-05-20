package by.booklover.basetest;

import by.booklover.ui.driver.Driver;
import by.booklover.ui.page.personal.profile.HomePage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {
    protected HomePage homePage;

    @BeforeEach
    public void initDriverAndOpenHomePageAndCloseCookie() {
        homePage = new HomePage();
        homePage.open();
        homePage.clickAcceptCookie();
    }

    @AfterEach
    public void tearDown() {
        Driver.quitDriver();
    }
}
