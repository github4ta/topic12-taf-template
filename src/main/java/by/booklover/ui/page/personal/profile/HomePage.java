package by.booklover.ui.page.personal.profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage() {
        super();
    }

    public void open() {
        String homeUrl = "https://booklover.by/";
        driver.get(homeUrl);
    }

    public void clickAcceptCookie() {
        String buttonCookieAlertCloseXpath = "//span[@id='js-cookie-alert-close']";
        WebElement buttonCookieAlertClose = driver.findElement(By.xpath(buttonCookieAlertCloseXpath));
        buttonCookieAlertClose.click();
    }

    public void clickProfileButton() {
        String linkUserAccountXpath = "//a[@class='header__user-link user-link user-link--account']";
        WebElement linkUserAccount = driver.findElement(By.xpath(linkUserAccountXpath));
        linkUserAccount.click();
    }
}
