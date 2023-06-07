package tests.test.US_08_09_30;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_30 {

    AdminDashboard adminDashboard = new AdminDashboard();
    @Test
    public void TC43(){

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
        Assert.assertEquals(adminPanelActualTitle,adminPanelExpectedTitle);
    }

    @Test (dependsOnMethods = "TC43")
    public void TC44(){
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
    public void TC45(){
        // 1-Add Destination sayfasinda gerekli bilgiler doldudulur,
        // Datei auswählen butonuna tiklanir ve istenilen fotografin dosya yolu girilerek o fotograf secilir,
        // Submit butonuna tiklanir ve
        //'Destination is added successfully!' text'inin gorulmesi beklenir
        adminDashboard.addDestinationNameBox.sendKeys(ConfigReader.getProperty("addDestinationName"));

        JSUtilities.scrollToElement(Driver.getDriver(),adminDashboard.addDestinationDetailSubheadingBox);

        ReusableMethods.wait(2);


        String herkesteFarkli = System.getProperty("user.dir");


        String dosyaYolu = herkesteFarkli + ConfigReader.getProperty("dosyaYoluHerkesteAyniOlanKisim");

        System.out.println(dosyaYolu);


        adminDashboard.addDestinationPhotoButton.sendKeys(dosyaYolu);

    }
}
