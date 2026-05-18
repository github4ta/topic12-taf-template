package com.company.product.ui;

import com.company.product.ui.po.HomePage;
import com.company.product.ui.po.LoginPage;
import io.qameta.allure.*;
import net.datafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UiTest {
    static final Logger logger = LogManager.getLogger();

    @Lead("Имя_Лида")
    @Owner("Иван Иванов")
    @Issue("BUG-9912")
    @TmsLink("CASE-404")
    @Flaky
    @Epic("Платежная система")
    @Feature("Оплата картой")
    @Story("Home Page testcase")
    @DisplayName("Home Page testcase")
    @Description("Summary ...")
    @Severity(SeverityLevel.CRITICAL)
    @Links({ @Link(name = "Wiki", url = "https://www.wiki.com") })
    @Test
    public void test1() {
        HomePage hp = new HomePage();
        hp.open();
        hp.clickEnterButton();
        LoginPage lp = new LoginPage();

        Assertions.assertTrue(lp.isVisible());
    }

    @Owner("Иван Иванов")
    @Issue("BUG-9912")
    @TmsLink("CASE-404")
    @Flaky
    @Epic("Платежная система")
    @Feature("Оплата картой")
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
