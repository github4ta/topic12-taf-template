package com.company.product.ui;

import com.company.product.ui.po.HomePage;
import com.company.product.ui.po.LoginPage;
import net.datafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class UiTest {
    static final Logger logger = LogManager.getLogger();

    @Test
    public void test1() {
        HomePage hp = new HomePage();
        hp.open();
        hp.clickEnterButton();
        LoginPage lp = new LoginPage();

        Assertions.assertTrue(lp.isVisible());
    }

    @Disabled
    @Test
    public void test2() {
        HomePage hp = new HomePage();
        hp.open();
        hp.clickEnterButton();

        LoginPage lp = new LoginPage();
        Faker faker = new Faker();

        String login = faker.internet().emailAddress();
        String pass = faker.internet().password();

        lp.fillLogin(login);
        lp.fillPassword(pass);

        Assertions.assertEquals("Login", lp.getTitleText());
    }
}
