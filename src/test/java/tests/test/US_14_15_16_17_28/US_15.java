package tests.test.US_14_15_16_17_28;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_15 extends TestBaseRapor {

    UserHomepage userHomepage = new UserHomepage();
    // Kullanici olarak hakkimizda sayfasina ulasabilmeli ve
    // tum ogelerin gorunur oldugunu dogrulamali
    @Test
    public void TC19() {
        // Kullanici anasayfaya gidebilmeli
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        // anasayfaya eristigini dogrulamali
        String expectedHomePageUrl = ConfigReader.getProperty("tripUrl");
        String actualHomepageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHomepageUrl, expectedHomePageUrl);

        // hakkimizda sayfasina ulasabilmeli ve
        // tum ogelerin gorunur oldugunu dogrulamali
        userHomepage.menuAboutus.click();
        Assert.assertTrue(userHomepage.aboutUsOurMissionText.isDisplayed());
        Assert.assertTrue(userHomepage.aboutUsOurVisionText.isDisplayed());

        Driver.closeDriver();
    }
}
