package by.booklover.profile;

import by.booklover.basetest.BaseTest;
import by.booklover.ui.page.personal.profile.LoginComponent;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginTest extends BaseTest {

    @BeforeEach
    public void clickLinkUserAccount() {
        homePage.clickProfileButton();
    }

    @Test
    public void testLoginPageIsOpened() {
        LoginComponent loginComponent = new LoginComponent();
        String actual = loginComponent.getTextRegistrationControl();

        Assertions.assertEquals("Авторизация", actual);
        System.out.println(actual);
    }
}
