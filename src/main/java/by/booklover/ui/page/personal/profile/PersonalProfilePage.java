package by.booklover.ui.page.personal.profile;

import org.openqa.selenium.WebDriver;

public class PersonalProfilePage {
    public ForgotPasswordComponent forgotPasswordComponent;
    public LoginComponent loginComponent;
    public RegisterComponent registerComponent;

    private WebDriver driver;

    public PersonalProfilePage(WebDriver driver) {
        this.driver = driver;
        forgotPasswordComponent = new ForgotPasswordComponent(driver);
        loginComponent = new LoginComponent(driver);
        registerComponent = new RegisterComponent(driver);
    }
}
