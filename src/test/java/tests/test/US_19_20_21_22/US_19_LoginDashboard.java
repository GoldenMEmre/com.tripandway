package tests.test.US_19_20_21_22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.*;

public class US_19_LoginDashboard extends TestBaseRapor {
    @Test
    public void TC25() {

        extentTest = extentReports.createTest("US19LoginDashboardTC25","Kullanici dashboard'a basarili giris yapabilmeli");
        //https://qa.tripandway.com sitesine giris yapin
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userHomepage = new UserHomepage();
        UserDashboard userDashboard = new UserDashboard();
        //cookies'e tiklayin
        userHomepage.cookiesAcceptButton.click();
        // login linkine tiklayin
        userHomepage.loginLink.click();
        // gecerli email ve sifre yi ilgili kutulara yazin
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("tlnEmail"));
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("tlnPassword"));
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.loginSubmitButton);
        // login butonuna basin
        userHomepage.loginSubmitButton.click();
        //3 saniye bekleyin
        ReusableMethods.wait(3);
        // basarili olarak giris yapildigini test edin
        Assert.assertTrue(userDashboard.successfullLogin.isDisplayed());
        extentTest.pass("Kullanici basarili sekilde giris yapabildi");
        Driver.closeDriver();

    }
}
