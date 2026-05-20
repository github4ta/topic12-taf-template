package by.booklover.ui.page.personal.profile;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private final String LOGIN_URL = "https://booklover.by/personal/profile/?login=yes";
    private final String TITLE_REGISTRATION_CONTROL = "//a[@class='registration__control registration__control--current']";
    private final String INPUT_PHONE_NUMBER = "//input[@id='authorization-phone-number']";
    private final String INPUT_PASSWORD = "//input[@id='authorization-password']";
    private final String BUTTON_SUBMIT = "//button[@class='registration__button js-submit button-submit']";
    private final String LINK_FORGOT_PASSWORD =  "//a[@class='registration__back-main']";
    private final String TEXT_ALERT = "//div[@class='alert alert-danger']";
    private final String TEXT_ERROR = "//span[@class='js-error']";

    public LoginPage() {
        super();
    }

    public void clickButtonSubmit() {
        driver.findElement(By.xpath(BUTTON_SUBMIT)).click();
    }

    public void clickLinkForgotPassword() {
        driver.findElement(By.xpath(LINK_FORGOT_PASSWORD)).click();
    }

    public void setInputPhoneNumber(String phoneNumber) {
        driver.findElement(By.xpath(INPUT_PHONE_NUMBER)).sendKeys(phoneNumber);
    }

    public void setInputPassword(String password) {
        driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(password);
    }

    public String getTextRegistrationControl() {
        return driver.findElement(By.xpath(TITLE_REGISTRATION_CONTROL)).getText();
    }

    public String getTextAlert() {
        return driver.findElement(By.xpath(TEXT_ALERT)).getText();
    }

    public String getTextError() {
        return driver.findElement(By.xpath(TEXT_ERROR)).getText();
    }
}
