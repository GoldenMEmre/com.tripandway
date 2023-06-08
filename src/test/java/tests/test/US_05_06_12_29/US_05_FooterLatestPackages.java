package tests.test.US_05_06_12_29;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;


public class US_05_FooterLatestPackages {

    @Test
    public void TC_05(){
        //Siteye erisim saglanir.
        Driver.getDriver().get("https://qa.tripandway.com/");
        UserHomepage userhomepage = new UserHomepage();

        //Sitenin footer bölümüne gidilir.
        JSUtilities.scrollToElement(Driver.getDriver(),userhomepage.footerLatestPackages);
        ReusableMethods.waitFor(3);

        //1. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages1.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages1.isEnabled());


        //2. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages2.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages2.isEnabled());


        //3. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages3.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages3.isEnabled());


        //4. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages4.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages4.isEnabled());


        //5. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages5.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages5.isEnabled());

        Driver.closeDriver();
    }
}
