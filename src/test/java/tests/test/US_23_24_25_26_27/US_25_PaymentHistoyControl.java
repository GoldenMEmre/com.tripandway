package tests.test.US_23_24_25_26_27;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_25_PaymentHistoyControl {

    @Test
    public void paymentHistory(){

        // anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        UserHomepage userHomepage = new UserHomepage();
        // login buttonu tikla
        userHomepage.loginLink.click();
        // login email tikla ve mail yolla
        userHomepage.registrationEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));
        // login password tikla ve password yolla
        userHomepage.registrationPasswordBox.sendKeys(ConfigReader.getProperty("loginPassword"));
        // cikan cookies accept et
        userHomepage.cookiesAcceptButton.click();
        // login buttonunu tikla
        userHomepage.loginSubmitButton.click();

        UserDashboard userDashboard=new UserDashboard();
        userDashboard.paymentHistoryButton.click();
        // sayfada completed ara
        String expectedIcerik="Completed";
        String actualIcerik=userDashboard.paymentHistoryCompleted.getAttribute("innerHTML");

        Assert.assertEquals(actualIcerik,expectedIcerik);



         Driver.closeDriver();

    }
}
