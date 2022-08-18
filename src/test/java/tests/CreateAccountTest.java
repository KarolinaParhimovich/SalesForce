package tests;

import modals.NewAccountModel;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest{
    private static final Logger LOGGER=Logger.getLogger(CreateAccountTest.class.getName());
    @Test
    public void createAccountTest(){
        LoginPage loginPage=new LoginPage(driver);
        LOGGER.info(String.format("Page %s initialized", LoginPage.class.getName()));
        LOGGER.info(String.format("Open %s page", LoginPage.class.getName()));
        loginPage.loginToSale();
        LOGGER.info("Input username, password, click Login");
        AccountsPage accountsPage=new AccountsPage(driver);
        LOGGER.info(String.format("Page %s initialized", AccountsPage.class.getName()));
        NewAccountModel accountModel= PrepareNewAccountData.getValidData();
        accountsPage.openAccountsPage()
                .openNewAccountPage()
                .fillInAccountForm(accountModel);
        LOGGER.info("Account form was filled");
        String accountName=accountsPage. accountName();
        LOGGER.info("Account's name is equals");
        Assert.assertEquals(accountName,accountModel.getAccountName());
    }
}
