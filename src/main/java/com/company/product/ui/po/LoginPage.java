package com.company.product.ui.po;

public class LoginPage extends BasePage {

    public boolean isVisible() {
        logger.info("Login page s visible");
        return true;
    }

    public void fillLogin(String login) {
        logger.info("Fill login with '{}'", login);
    }

    public void fillPassword(String pass) {
        logger.info("Fill password with '{}'", pass);
    }

    public String getTitleText() {
        String title = "Lagin";
        logger.info("Login Page title is '{}'", title);
        return title;
    }
}
