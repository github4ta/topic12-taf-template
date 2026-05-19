package by.booklover.ui.page.personal.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordComponent {
    private final String FORGOT_PASSWORD_URL = "https://booklover.by/personal/profile/?forgot_password=yes";
    private final String TITLE_PASSWORD_RECOVERY = "//p[@class='registration__important-text']";
    private final String INPUT_EMAIL = "//input[@id='password-email']";
    private final String BUTTON_SUBMIT = "//button[@class='registration__button js-submit button-submit']";
    private final String LINK_LOGIN =  "//a[@class='registration__back-main']";
    private final String TEXT_ALERT = "//div[@class='alert alert-danger']";
    private final String TEXT_ERROR = "//span[@class='js-error']";

    private WebDriver driver;

    public ForgotPasswordComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonSubmit() {
        driver.findElement(By.xpath(BUTTON_SUBMIT)).click();
    }

    public void clickLinkLogin() {
        driver.findElement(By.xpath(LINK_LOGIN)).click();
    }

    public void setInputEmail(String email) {
        driver.findElement(By.xpath(INPUT_EMAIL)).sendKeys(email);
    }

    public String getTextTitlePasswordRecovery() {
        return driver.findElement(By.xpath(TITLE_PASSWORD_RECOVERY)).getText();
    }

    public String getTextAlert() {
        return driver.findElement(By.xpath(TEXT_ALERT)).getText();
    }

    public String getTextError() {
        return driver.findElement(By.xpath(TEXT_ERROR)).getText();
    }
}
