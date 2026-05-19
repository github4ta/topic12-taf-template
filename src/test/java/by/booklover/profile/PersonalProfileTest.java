package by.booklover.profile;

import by.booklover.ui.page.personal.profile.PersonalProfilePage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PersonalProfileTest {

    @Test
    public void testForgotPasswordComponentIsDisplayed() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String homeUrl = "https://booklover.by/";
        driver.get(homeUrl);

        String buttonCookieAlertCloseXpath = "//span[@id='js-cookie-alert-close']";
        WebElement buttonCookieAlertClose = driver.findElement(By.xpath(buttonCookieAlertCloseXpath));
        buttonCookieAlertClose.click();

        String linkUserAccountXpath = "//a[@class='header__user-link user-link user-link--account']";
        WebElement linkUserAccount = driver.findElement(By.xpath(linkUserAccountXpath));
        linkUserAccount.click();

        PersonalProfilePage personalProfilePage = new PersonalProfilePage(driver);
        personalProfilePage.loginComponent.clickLinkForgotPassword();

        String actual = personalProfilePage.forgotPasswordComponent.getTextTitlePasswordRecovery();
        Assertions.assertEquals("Восстановление пароля", actual);
    }
}
