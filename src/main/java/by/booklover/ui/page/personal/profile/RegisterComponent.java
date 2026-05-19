package by.booklover.ui.page.personal.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterComponent {
    private final String REGISTER_URL = "https://booklover.by/personal/profile/?register=yes";
    private final String TITLE_REGISTRATION = "//a[@class='registration__control registration__control--current']";
    private final String INPUT_LOGIN = "//input[@id='registration-login']";
    private final String INPUT_PHONE = "//input[@id='registration-phone']";
    private final String INPUT_PASSWORD = "//input[@id='registration-password']";
    private final String INPUT_PASSWORD_CONFIRM = "//input[@id='registration-password-confirm']";
    private final String INPUT_EMAIL = "//input[@id='registration-email']";
    private final String BUTTON_SUBMIT = "//button[@class='registration__button js-submit button-submit']";
    private final String LINK_LOGIN =  "//a[@class='registration__control']";
    private final String TEXT_ALERT = "//div[@class='alert alert-danger']";
    private final String TEXT_ERROR = "//span[@class='js-error']";

    private WebDriver driver;

    public RegisterComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonSubmit() {
        driver.findElement(By.xpath(BUTTON_SUBMIT)).click();
    }

    public void clickLinkLogin() {
        driver.findElement(By.xpath(LINK_LOGIN)).click();
    }

    public void setInputLogin(String login) {
        driver.findElement(By.xpath(INPUT_LOGIN)).sendKeys(login);
    }

    public void setInputPhone(String phone) {
        driver.findElement(By.xpath(INPUT_PHONE)).sendKeys(phone);
    }

    public void setInputPassword(String password) {
        driver.findElement(By.xpath(INPUT_PASSWORD)).sendKeys(password);
    }

    public void setInputPasswordConfirm(String passwordConfirm) {
        driver.findElement(By.xpath(INPUT_PASSWORD_CONFIRM)).sendKeys(passwordConfirm);
    }

    public void setInputEmail(String email) {
        driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
    }

    public String getTitleRegistration() {
        return driver.findElement(By.xpath(TITLE_REGISTRATION)).getText();
    }

    public String getTextAlert() {
        return driver.findElement(By.xpath(TEXT_ALERT)).getText();
    }

    public String getTextError() {
        return driver.findElement(By.xpath(TEXT_ERROR)).getText();
    }
}
