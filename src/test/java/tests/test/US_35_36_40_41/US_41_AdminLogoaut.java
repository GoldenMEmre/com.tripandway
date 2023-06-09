package tests.test.US_35_36_40_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_41_AdminLogoaut extends TestBaseRapor {

    @Test
    public void TC_61() {

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

        // Sayfanin sag ust kismindaki "Admin" butonuna tiklanir.
        //click on the "Admin" button at the top right of the page.
        adminDashboard.adminDropdownMenu.click();

        //"Logout" sekmesi secilir ve sayfdan cikis yapilir.
        // Select the "Logout" tab and exit the page.
        adminDashboard.adminDropDownLogoutButton.click();

        // Site ana sayfasina dönus yapilip yapilmadigi dogrulanmali.
        // It should be verified whether the site is returned to the home page.

        String expectedTitle="homePageTitle";
        String actualTitle= Driver.getDriver().getTitle();

        //Ana sayfaya donmuyor, Bag var
        Assert.assertEquals(actualTitle,expectedTitle);

    }}

