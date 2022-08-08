package tests;

import modals.NewAccountModel;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountsPage;
import pages.LoginPage;
import testdata.PrepareNewAccountData;

public class CreateAccountTest extends BaseTest{
    @Test
    public void createAccountTest(){
        LoginPage loginPage=new LoginPage(driver);
        loginPage.loginToSale();
        AccountsPage accountsPage=new AccountsPage(driver);
        NewAccountModel accountModel= PrepareNewAccountData.getValidData();
        accountsPage.openAccountsPage()
                .openNewAccountPage()
                .fillInAccountForm(accountModel);
        String accountName=accountsPage.accountName();
        Assert.assertEquals(accountName,accountModel.getAccountName());
    }
}
