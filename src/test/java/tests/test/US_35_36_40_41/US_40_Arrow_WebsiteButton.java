package tests.test.US_35_36_40_41;

import org.bouncycastle.math.ec.custom.sec.SecT113Field;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.Set;

public class US_40_Arrow_WebsiteButton extends TestBaseRapor {

    @Test
    public void TC_59() {

        // "https://qa.tripandway.com/admin/login" adresine gider.
        // Goes to "https://qa.tripandway.com/admin/login" address.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminDashboard adminDashboard = new AdminDashboard();

        // Email adresini,  Email adres kutusuna yazar.
        // Writes the email address in the mail address box.
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        // Pasword'u password kutusuna yazar.
        // Writes the password in the password box.
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // Login butonuna tiklar.
        // Clicks the Login button.
        adminDashboard.adminLoginButton.click();

        // Admin Panel'in altinda yeralan daraltma ok isaretine tiklanir.
        // Click on the narrowing arrow under the Admin Panel.
        adminDashboard.adminPanelArrowButton.click();

        // Ok isaretine tiklanabildigi dogrulanir.
        // Check that the arrow can be clicked.
        Assert.assertTrue(adminDashboard.adminPanelArrowButton.isEnabled());

        Driver.closeDriver();

    }

    @Test
    public void TC_60() {

        // "https://qa.tripandway.com/admin/login" adresine gider.
        // Goes to "https://qa.tripandway.com/admin/login" address.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String firsWebSiteWH = Driver.getDriver().getWindowHandle();

        AdminDashboard adminDashboard = new AdminDashboard();

        // Email adresini,  Email adres kutusuna yazar.
        // Writes the email address in the mail address box.
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        // Pasword'u password kutusuna yazar.
        // Writes the password in the password box.
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // Login butonuna tiklar.
        // Clicks the Login button.
        adminDashboard.adminLoginButton.click();

        // Admin sayfasinin ust kisminda yer alan "visit Webseite" butonuna tiklanir.
        // Click on the "visit Webseite" button at the top of the admin page.
        adminDashboard.adminVisitWebsiteButton.click();

        ReusableMethods.switchToWindow("Tripandway");

        // "Visit Webseite" butonun calisip calismadigi dogrulanir.
        // Verify whether the "visit Webseite" button works.
        Set<String> window= Driver.getDriver().getWindowHandles();

        for (String eachWindow:window) {

            if ( ! firsWebSiteWH.equals(eachWindow)) {
            }
        }
        String expectedTitle= "Tripandway";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));

        Driver.quitDriver();


    }
}