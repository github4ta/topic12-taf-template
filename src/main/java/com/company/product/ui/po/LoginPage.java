package com.company.product.ui.po;

import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class LoginPage extends BasePage {

    public boolean isVisible() {
        logger.info("Login page s visible");
        return true;
    }

    @Step("Fill login with")
    public void fillLogin(String login) {
        logger.info("Fill login with '{}'", login);
    }

    @Story("Fill password with")
    public void fillPassword(String pass) {
        logger.info("Fill password with '{}'", pass);
    }

    @Step("")
    public String getTitleText() {
        String title = "Lagin";
        logger.info("Login Page title is '{}'", title);
        return title;
    }
}
