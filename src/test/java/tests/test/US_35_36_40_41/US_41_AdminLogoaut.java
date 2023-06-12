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




        extentTest=extentReports.createTest("Admin Panel'den Site Anasayfasina Donus Testi",
                "Kullanici Logaut Butonuna Tikladiginda Site Anasayfasina Donebilmeli.");

        // "https://qa.tripandway.com/admin/login" adresine gider.
        // Goes to "https://qa.tripandway.com/admin/login" address.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        extentTest.info("Kullanici Admin Login Anasayfaya Gider.");

        AdminDashboard adminDashboard = new AdminDashboard();


        // Email adresini,  Email adres kutusuna yazar.
        // Writes the email address in the mail address box.
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));
        extentTest.info("Mail kutusuna istenen EMmail'i girer.");

        ReusableMethods.wait(2);

        // Pasword'u password kutusuna yazar.
        // Writes the password in the password box.
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        extentTest.info("Password kutusuna istenen password'u girer.");

        ReusableMethods.wait(2);


        // Login butonuna tiklar.
        // Clicks the Login button.
        adminDashboard.adminLoginButton.click();
        extentTest.info("Login Butonuna tiklar.");

        ReusableMethods.wait(2);



        // Sayfanin sag ust kismindaki "Admin" butonuna tiklanir.
        //click on the "Admin" button at the top right of the page.
        adminDashboard.adminDropdownMenu.click();
        extentTest.info("Admin Dropdown Menu Butonuna tiklar.");

        ReusableMethods.wait(2);


        //"Logout" sekmesi secilir ve sayfdan cikis yapilir.
        // Select the "Logout" tab and exit the page.
        adminDashboard.adminDropDownLogoutButton.click();
        extentTest.info("Acilan sekmeden Logout Butonuna tiklar.");


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
        extentTest.pass("Istenen "+ ConfigReader.getProperty("Site Anasayfasina donmek") + " istenildiginde, arama sonucunda actual icerik oldugu test edildi");


        Driver.closeDriver();

    }}
