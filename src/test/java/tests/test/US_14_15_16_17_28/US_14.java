package tests.test.US_14_15_16_17_28;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_14 extends TestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();

    // Kullanici anasayfaya gidebilmeli ve anasayfaya eristigini dogrulamali
    @Test
    public void TC16(){
        // Kullanici anasayfaya gidebilmeli
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        //anasayfaya eristigini dogrulamali
        String expectedHomePageUrl = ConfigReader.getProperty("tripUrl");
        String actualHomepageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHomepageUrl,expectedHomePageUrl);
        Driver.closeDriver();
    }

    // Kullanici Packages sayfasina gidebilmeli ve sayfaya eristigini dogrulamali
    @Test
    public  void TC17(){
        // Kullanici Packages sayfasina gidebilmeli
        userHomepage = new UserHomepage();
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.menuPackages.click();
        // Packages sayfasina eristigini dogrulamali
        String expectedPackagesUrl = ConfigReader.getProperty("packagesUrl");
        String actualPackagesUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualPackagesUrl,expectedPackagesUrl);
        Driver.closeDriver();
    }

    // Kullanici Packages sayfasindaki, packageslarin aktif oldugunu dogrulamali
    @Test
    public void TC18() {
        // Kullanici Packages sayfasina gidebilmeli
        userHomepage = new UserHomepage();
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.menuPackages.click();
        //packageslarin aktif oldugunu dogrulamali
        Assert.assertTrue(userHomepage.packages3DaysBuenosAires.isEnabled());
        Assert.assertTrue(userHomepage.packages10DaysBuenosAires.isEnabled());
        Assert.assertTrue(userHomepage.packagesIstanbul.isEnabled());
        Assert.assertTrue(userHomepage.packages3DaysBangkok.isEnabled());
        Assert.assertTrue(userHomepage.packages7DaysSalinaIsland.isEnabled());
        Assert.assertTrue(userHomepage.packages5DaysCalifornia.isEnabled());

        Driver.closeDriver();
    }
}
