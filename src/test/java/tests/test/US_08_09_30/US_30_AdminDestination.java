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

        //Admin Login bolumunde Email Adress'e 'admin01@tripandway.com' girilir
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));

        //Admin Login bolumunde Password'e '123123123' girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login button'una tiklanir
        adminDashboard.adminLoginButton.click();

        // Admin Panel sayfasina ulasildigi dogrulanir
        String adminPanelExpectedTitle = "Admin Panel";
        String adminPanelActualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(adminPanelActualTitle, adminPanelExpectedTitle);
    }

    @Test(dependsOnMethods = "TC43")
    public void TC44() {

        ReusableMethods.wait(2);
        // ADMIN PANEL bolumunde Destinations'a tiklanir
        adminDashboard.adminPanelDestinationsButton.click();

        // Destinations sayfasina ulasildigi dogrulanir
        Assert.assertTrue(adminDashboard.destinationsAddNewButton.isEnabled());

        // Destinations sayfasinda '+Add New' butonuna tiklanir
        adminDashboard.destinationsAddNewButton.click();

        // ve Add Destination sayfasina ulasildigi dogrulanir
        Assert.assertTrue(adminDashboard.addDestinationNameBox.isEnabled());
    }


    @Test(dependsOnMethods = "TC44")
    public void TC45() {
        // Add Destination sayfasinda gerekli bilgiler doldudulur,


        adminDashboard.addDestinationNameBox.sendKeys(ConfigReader.getProperty("addDestinationName"));
        ReusableMethods.wait(1);


        // Datei auswählen kismina page down edilir ve  istenilen fotografin dosya yolu girilerek o fotograf secilir,
        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.addDestinationPhotoButton);
        ReusableMethods.wait(2);

        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli + ConfigReader.getProperty("HernePhotoHerkesteAyniOlanKisim");

        adminDashboard.addDestinationPhotoButton.sendKeys(dosyaYolu);
        ReusableMethods.wait(2);

        // Submit butonuna tiklanir
        adminDashboard.addDestinationSubmitButton.click();

        // 'Destination is added successfully!' text'inin gorulmesi beklenir
        Assert.assertTrue(adminDashboard.addDestinationSuccessfulAlert.isDisplayed());
    }

    @Test(dependsOnMethods = "TC45")
    public void TC46() {
        //View Destinations sayfasinda search Box'a kayit ettigimiz Destination adi yazilir
        adminDashboard.destinationsSearchBox.sendKeys(ConfigReader.getProperty("addDestinationName"));

        // Edit tusuna basilir ve yapilacak degisiklikler varsa yapilir
        adminDashboard.destinationsActionEditButton.click();

        adminDashboard.editDestinationNameBox.clear();

        adminDashboard.editDestinationNameBox.sendKeys(ConfigReader.getProperty("editDestinationName"));

        JSUtilities.scrollToElement(Driver.getDriver(), adminDashboard.editDestinationPhotoButton);
        ReusableMethods.wait(2);

        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli + ConfigReader.getProperty("BochumPhotoHerkesteAyniOlanKisim");

        ReusableMethods.wait(2);

        adminDashboard.addDestinationPhotoButton.sendKeys(dosyaYolu);

        // update tusuna basilir
        adminDashboard.editDestinationUpdateButton.click();

        ReusableMethods.wait(2);

        //'Destination is updated successfully!' text'o gorulmesi beklenir
        adminDashboard.editDestinationSuccessfulAlert.isDisplayed();

        // search Box'a kayit ettigimiz Destination adi yazilir
        adminDashboard.destinationsSearchBox.sendKeys(ConfigReader.getProperty("editDestinationName"));

        // 1 saniye bekler
        ReusableMethods.wait(1);

        // Kayit ettigimiz Destination'in delete butonuna basilir
        adminDashboard.destinationsDeleteButton.click();

        // 1 saniye bekler
        ReusableMethods.wait(1);

        // Alert'a gecis yapilir ve alert accept edilir
        Driver.getDriver().switchTo().alert().accept();

        // Destination is deleted successfully! yazisinin gorundugu teyit edilir
        Assert.assertTrue(adminDashboard.destinationDeletedSuccessfulAlert.isDisplayed());

    }
}
