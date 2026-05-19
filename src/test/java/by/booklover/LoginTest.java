package by.booklover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void testLoginPageIsOpened() {
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

        String textRegistrationInformationXpath = "//p[@class='registration__important-text']";
        WebElement textRegistrationInformation = driver.findElement(By.xpath(textRegistrationInformationXpath));
        String actual = textRegistrationInformation.getText();

        Assertions.assertEquals("Зарегистрируйтесь или авторизуйтесь,\n" +
                "чтобы получить доступ к личнмому кабинету", actual);
    }

    @Test
    public void testErrorIsDisplayed() {
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

        String buttonSubmitXpath = "//button[@class='registration__button js-submit button-submit']";
        WebElement buttonSubmit = driver.findElement(By.xpath(buttonSubmitXpath));
        buttonSubmit.click();

        String textErrorXpath = "//span[@class='js-error']";
        WebElement textError = driver.findElement(By.xpath(textErrorXpath));
        String actual = textError.getText();

        Assertions.assertEquals("!!! Пожалуйста, проверьте введенную вами информацию.", actual);
    }

    @Test
    public void testAlertIsDisplayed() {
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

        String inputPasswordXpath = "//input[@id='authorization-password']";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordXpath));
        inputPassword.sendKeys("123456");

        String buttonSubmitXpath = "//button[@class='registration__button js-submit button-submit']";
        WebElement buttonSubmit = driver.findElement(By.xpath(buttonSubmitXpath));
        buttonSubmit.click();

        String textAlertXpath = "//div[@class='alert alert-danger']";
        WebElement textAlert = driver.findElement(By.xpath(textAlertXpath));
        String actual = textAlert.getText();

        Assertions.assertEquals("Неверный телефон или пароль.", actual);
    }
}
