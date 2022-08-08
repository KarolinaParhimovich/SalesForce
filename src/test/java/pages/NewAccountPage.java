package pages;

import elements.DropDawnList;
import elements.TextInput;
import elements.Textarea;
import modals.NewAccountModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewAccountPage extends BasePage {
    private By SAVE_BUTTON = By.xpath("//div[contains(@class, 'modal-body')]//button[@title='Save']");
    private By ACCOUNT_NANE_INPUT = By.xpath("//div[contains(@class, 'modal-body')]//span[text()='Account Name']//parent::label//following-sibling::div//input");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void fillInAccountForm(NewAccountModel newAccount) {
        driver.findElement(ACCOUNT_NANE_INPUT).sendKeys(newAccount.getAccountName());
        new TextInput(driver, "Phone").inputText(newAccount.getPhone());
        new DropDawnList(driver, "Type").selectOptionInList(newAccount.getType());
        new DropDawnList(driver, "Industry").selectOptionInList(newAccount.getIndustry());
        new TextInput(driver, "Fax").inputText(newAccount.getFax());
        new TextInput(driver, "Website").inputText(newAccount.getWebsite());
        new TextInput(driver, "Employees").inputText(newAccount.getEmployees());
        new TextInput(driver, "Annual Revenue").inputText(newAccount.getAnnualRevenue());
        new Textarea(driver, "Description").inputText(newAccount.getDescription());
        new Textarea(driver, "Billing Street").inputText(newAccount.getBillingStreet());
        new Textarea(driver, "Shipping Street").inputText(newAccount.getShippingStreet());
        new TextInput(driver, "Billing City").inputText(newAccount.getBillingCity());
        new TextInput(driver, "Billing State/Province").inputText(newAccount.getBillingState());
        new TextInput(driver, "Shipping City").inputText(newAccount.getShippingCity());
        new TextInput(driver, "Shipping State/Province").inputText(newAccount.getShippingState());
        new TextInput(driver, "Billing Zip/Postal Code").inputText(newAccount.getBillingZip());
        new TextInput(driver, "Billing Country").inputText(newAccount.getBillingCountry());
        new TextInput(driver, "Shipping Zip/Postal Code").inputText(newAccount.getShippingZip());
        new TextInput(driver, "Shipping Country").inputText(newAccount.getShippingCountry());
        driver.findElement(SAVE_BUTTON).click();
    }
}
