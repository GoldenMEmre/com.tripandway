package tests.test.US_01_02_03_04;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_04_FooterFeaturedPackages extends TestBaseRapor {

    @Test
    public void TC04() throws InterruptedException {

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Cookies kabul edilir
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.cookiesAcceptButton.click();

        //Scroll yardımıyla Footer'daki Featured Packages basligina gidilir
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.footerFeaturedPackagesTitle);

        // 5 saniye beklenir
        ReusableMethods.waitFor(5);

        //Featured Packages basliginin gorunur oldugu test edilir
        String expectedText="Featured Packages";
        String actualText = userHomepage.footerFeaturedPackagesTitle.getText();
        Assert.assertEquals(actualText,expectedText);
        Assert.assertTrue(userHomepage.footerFeaturedPackagesTitle.isDisplayed());

        // Featured Packages'in 1. ogesinin gorunur ve aktif oldugu test edilir
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem1.isDisplayed());
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem1.isEnabled());

        // Featured Packages'in 2. ogesinin gorunur ve aktif oldugu test edilir
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem2.isDisplayed());
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem2.isEnabled());

        // Featured Packages'in 3. ogesinin gorunur ve aktif oldugu test edilir
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem3.isDisplayed());
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem3.isEnabled());

        // Featured Packages'in 4. ogesinin gorunur ve aktif oldugu test edilir
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem4.isDisplayed());
        Assert.assertTrue(userHomepage.footerFeaturedPackagesItem4.isEnabled());

        // Driver kapatilir
        Driver.closeDriver();

    }



    }



