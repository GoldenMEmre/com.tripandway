package tests.test.US_35_36_40_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class US_41_AdminLogoaut extends TestBaseRapor {

    @Test
    public void TC_61() throws IOException {



        // "https://qa.tripandway.com/admin/login" adresine gider.
        // Goes to "https://qa.tripandway.com/admin/login" address.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminDashboard adminDashboard = new AdminDashboard();


        // Email adresini,  Email adres kutusuna yazar.
        // Writes the email address in the mail address box.
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        ReusableMethods.wait(2);

        // Pasword'u password kutusuna yazar.
        // Writes the password in the password box.
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        ReusableMethods.wait(2);


        // Login butonuna tiklar.
        // Clicks the Login button.
        adminDashboard.adminLoginButton.click();

        ReusableMethods.wait(2);


        // Sayfanin sag ust kismindaki "Admin" butonuna tiklanir.
        //click on the "Admin" button at the top right of the page.
        adminDashboard.adminDropdownMenu.click();

        ReusableMethods.wait(2);


        //"Logout" sekmesi secilir ve sayfdan cikis yapilir.
        // Select the "Logout" tab and exit the page.
        adminDashboard.adminDropDownLogoutButton.click();

        ReusableMethods.wait(2);


        // Site ana sayfasina dönus yapilip yapilmadigi dogrulanmali.
        // It should be verified whether the site is returned to the home page.

        String expectedTitle="homePageTitle";
        String actualTitle= Driver.getDriver().getTitle();
        extentTest = extentReports.createTest("Trip and Way Homepage", "Homepage e geri donmeliyiz");
        extentTest.info("Kullanici logout yaptiktan sonra trip and way anasayfaya donmeli");

        ReusableMethods.getScreenshot("Anasayfa");
        //Ana sayfaya donmuyor, Bug var
        Assert.assertEquals(actualTitle,expectedTitle);


        Driver.closeDriver();

    }}

