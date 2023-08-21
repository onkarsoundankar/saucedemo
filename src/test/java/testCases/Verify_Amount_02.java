package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjects.LoginPage;
import PageObjects.VerifyAmount;
import testBase.BaseClass;

public class Verify_Amount_02 extends BaseClass {

    // Create a static instance of the LoginPage and VerifyAmount objects
    private static LoginPage loginPage;
    private static VerifyAmount verifyAmount;

    @Test
    public void verify_Amount() {
        try {
            if (loginPage == null) {
                loginPage = new LoginPage(driver);
            }
            loginPage.setusername(rb.getString("username"));
            loginPage.setpassword(rb.getString("password"));
            loginPage.loginbutton();

            logger.info("Login successful");

            if (verifyAmount == null) {
                verifyAmount = new VerifyAmount(driver);
            }
            verifyAmount.jacketname();

            boolean amount = verifyAmount.isAmountDisplayed();
            Assert.assertEquals(amount, true, "amount not displayed");
            verifyAmount.amountvalueget();
        } catch (Exception e) {
            Assert.fail();
        }
        logger.info("Finished verify amount test case");

        if (loginPage != null) {
            loginPage.menu();
            loginPage.Logout();
        }
    }
}