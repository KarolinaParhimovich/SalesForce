package constants.pages;

import constants.Credentials;
import constants.Urls;
import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private static final Logger LOGGER=Logger.getLogger(LoginPage.class.getName());
    private By usernameInput= By.id("username");
    private By passwordInput=By.id("password");
    private By loginButton=By.id("Login");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @Step("Opening salesforce portal, entering username, password, click Login")
    public void loginToSale(){
        LOGGER.debug(String.format("Attempt to open url %s", Urls.SALES_FORCE_LOGIN));
       driver.get(Urls.SALES_FORCE_LOGIN);
       LOGGER.debug(String.format("Attempt to send username %s",Credentials.USERNAME));
       driver.findElement(usernameInput).sendKeys(Credentials.USERNAME);
        LOGGER.debug(String.format("Attempt to send password %s",Credentials.PASSWORD));
        driver.findElement(passwordInput).sendKeys(Credentials.PASSWORD);
        LOGGER.debug(String.format("Attempt to click element %s", loginButton));
        driver.findElement(loginButton).click();

    }
}
