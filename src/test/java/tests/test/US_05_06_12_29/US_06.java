package tests.test.US_05_06_12_29;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;


public class US_06 extends TestBaseRapor {

    @Test
    public void TC06() throws InterruptedException {
        //Siteye erisim saglanir.
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userhomepage = new UserHomepage();

        //Sitenin footer bölümüne gidilir.
        JSUtilities.scrollToElement(Driver.getDriver(), userhomepage.footerRecentPosts);
        ReusableMethods.waitFor(3);

        //1. Ögenin görünebilir ve aktif durumda olup olmadigi test edilir
        Assert.assertTrue(userhomepage.footerRecentPosts1.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts1.isEnabled());

        //2. Ögenin görünebilir ve aktif durumda olup olmadigi test edilir
        Assert.assertTrue(userhomepage.footerRecentPosts2.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts2.isEnabled());

        //3. Ögenin görünebilir ve aktif durumda olup olmadigi test edilir
        Assert.assertTrue(userhomepage.footerRecentPosts3.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts3.isEnabled());

        //4. Ögenin görünebilir ve aktif durumda olup olmadigi test edilir
        Assert.assertTrue(userhomepage.footerRecentPosts4.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts4.isEnabled());


        //5. Ögenin görünebilir ve aktif durumda olup olmadigi test edilir
        Assert.assertTrue(userhomepage.footerRecentPosts5.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts5.isEnabled());

        Driver.closeDriver();
    }
}
