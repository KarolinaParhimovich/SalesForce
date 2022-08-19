package pages;

import constants.Urls;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage extends BasePage {
    private static final Logger LOGGER = Logger.getLogger(AccountsPage.class.getName());
    private By newButton = By.xpath("//ul[contains(@class, 'branding-actions')]//a[@title='New']");

    public AccountsPage(WebDriver driver) {
        super(driver);
    }

    public AccountsPage openAccountsPage() {
        driver.get(Urls.SALES_FORCE_LOGIN.concat(Urls.ACCOUNTS_URL));
        return this;
    }

    public NewAccountPage openNewAccountPage() {
        driver.findElement(newButton).click();
        return new NewAccountPage(driver);
    }

    public String accountName() {
        LOGGER.debug("Attempt to find new account's name");
        return driver.findElement(By.xpath("//div[contains(@class, 'slds-grid')]//lightning-formatted-text[contains(@class, 'custom')]")).getText();
    }
}
