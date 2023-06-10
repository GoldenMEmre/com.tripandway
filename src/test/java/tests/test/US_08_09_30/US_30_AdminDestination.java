package tests.test.US_08_09_30;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_30_AdminDestination {

    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void TC43() {

        //Go to https://qa.tripandway.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Admin Login bolumunde Email Adress'e 'admin01@tripandway.com' girilir
        ReusableMethods.waitAndSendText(adminDashboard.adminEmailBox,ConfigReader.getProperty("admin01Email"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Admin Login bolumunde Password'e '123123123' girilir
        ReusableMethods.waitAndSendText(adminDashboard.adminPasswordBox,ConfigReader.getProperty("adminPassword"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Login button'una tiklanir
        adminDashboard.adminLoginButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Admin Panel sayfasina ulasildigi dogrulanir
        String adminPanelExpectedTitle = "Admin Panel";
        String adminPanelActualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(adminPanelActualTitle, adminPanelExpectedTitle);
    }

    @Test(dependsOnMethods = "TC43")
    public void TC44() {

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // ADMIN PANEL bolumunde Destinations'a tiklanir
        adminDashboard.adminPanelDestinationsButton.click();

        // Destinations sayfasina ulasildigi dogrulanir
        Assert.assertTrue(adminDashboard.destinationsAddNewButton.isEnabled());

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Destinations sayfasinda '+Add New' butonuna tiklanir
        adminDashboard.destinationsAddNewButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // ve Add Destination sayfasina ulasildigi dogrulanir
        Assert.assertTrue(adminDashboard.addDestinationNameBox.isEnabled());
    }


    @Test(dependsOnMethods = "TC44")
    public void TC45() {

        // Add Destination sayfasinda gerekli bilgiler doldudulur,
        ReusableMethods.waitAndSendText(adminDashboard.addDestinationNameBox,ConfigReader.getProperty("addDestinationName"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Datei auswählen kismina page down edilir ve  istenilen fotografin dosya yolu girilerek o fotograf secilir,
        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.addDestinationPhotoButton);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli + ConfigReader.getProperty("HernePhotoHerkesteAyniOlanKisim");

        ReusableMethods.waitAndSendText(adminDashboard.addDestinationPhotoButton,dosyaYolu);


        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Submit butonuna tiklanir
        adminDashboard.addDestinationSubmitButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // 'Destination is added successfully!' text'inin gorulmesi beklenir
        Assert.assertTrue(adminDashboard.addDestinationSuccessfulAlert.isDisplayed());
    }

    @Test(dependsOnMethods = "TC45")
    public void TC46() {

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //View Destinations sayfasinda search Box'a kayit ettigimiz Destination adi yazilir
        ReusableMethods.waitAndSendText(adminDashboard.destinationsSearchBox,ConfigReader.getProperty("addDestinationName"));



        // Edit tusuna basilir ve yapilacak degisiklikler varsa yapilir
        adminDashboard.destinationsActionEditButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        adminDashboard.editDestinationNameBox.clear();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        ReusableMethods.waitAndSendText(adminDashboard.editDestinationNameBox,ConfigReader.getProperty("editDestinationName"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.editDestinationPhotoButton);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli + ConfigReader.getProperty("BochumPhotoHerkesteAyniOlanKisim");

        ReusableMethods.wait(2);

        adminDashboard.addDestinationPhotoButton.sendKeys(dosyaYolu);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // update tusuna basilir
        adminDashboard.editDestinationUpdateButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //'Destination is updated successfully!' text'o gorulmesi beklenir
        adminDashboard.editDestinationSuccessfulAlert.isDisplayed();



        // search Box'a kayit ettigimiz Destination adi yazilir
        ReusableMethods.waitAndSendText(adminDashboard.destinationsSearchBox,ConfigReader.getProperty("editDestinationName"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Kayit ettigimiz Destination'in delete butonuna basilir
        adminDashboard.destinationsDeleteButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Alert'a gecis yapilir ve alert accept edilir
        Driver.getDriver().switchTo().alert().accept();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Destination is deleted successfully! yazisinin gorundugu teyit edilir
        Assert.assertTrue(adminDashboard.destinationDeletedSuccessfulAlert.isDisplayed());

        // 2 saniye bekler
        ReusableMethods.wait(2);

        Driver.closeDriver();

    }
}
