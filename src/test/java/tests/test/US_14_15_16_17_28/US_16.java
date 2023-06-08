package tests.test.US_14_15_16_17_28;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_16 {

    UserHomepage userHomepage = new UserHomepage();

    // Kullanici olarak FAQ sayfasina ulasabilmeli ve
    // FAQ sayfasinda oldugunu dogrulamali

    @Test
    public void TC20(){
        //Kullannici anasayfaya erisip, eristigini dogrulamali ve FAQ sayfasina ulasabilmeli
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        String expectedHomePageUrl = ConfigReader.getProperty("tripUrl");
        String actualHomepageUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHomepageUrl,expectedHomePageUrl);
        userHomepage.menuFaq.click();
        Driver.closeDriver();
    }
    @Test
    public void TC21() {
        // Kullanici olarak FAQ sayfasina ulasabilmeli ve FAQ sayfasinda oldugunu dogrulamali
        userHomepage = new UserHomepage();
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.menuFaq.click();
        // FAQ sayfasinda oldugunu dogrulamali ve FAQ yazisini gormeli
        String expectedUrl = ConfigReader.getProperty("menuFAQUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
        Assert.assertTrue(userHomepage.faqTitle.isDisplayed());
        Driver.closeDriver();
    }
}
