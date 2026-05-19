package by.booklover;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {

    @Test
    public void testLegalInformationIsVisible() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String homeUrl = "https://booklover.by/";
        driver.get(homeUrl);

        String buttonCookieAlertCloseXpath = "//span[@id='js-cookie-alert-close']";
        WebElement buttonCookieAlertClose = driver.findElement(By.xpath(buttonCookieAlertCloseXpath));
        buttonCookieAlertClose.click();

        String textLegalInformationXpath = "//div[@class='footer__info']/p[1]/span";
        WebElement textLegalInformation = driver.findElement(By.xpath(textLegalInformationXpath));
        String actual = textLegalInformation.getText();

        Assertions.assertEquals("ИП Каждан Артур Леонидович", actual);
    }
}
