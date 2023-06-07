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
        //WebElement label1 = Driver.getDriver().findElement(By.xpath("//*[text()='Latest Packages']"));
        //Sitenin footer bölümüne gidilir.
        JSUtilities.scrollToElement(Driver.getDriver(),userhomepage.footerLatestPackages);
        ReusableMethods.waitFor(3);
        //WebElement link1 = Driver.getDriver().findElement(By.linkText("5 Day California"));
        //1. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages1.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages1.isEnabled());

        //WebElement link2 = Driver.getDriver().findElement(By.xpath("(//*[text()='7 days in Salina Island'])[3]"));
        //2. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages2.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages2.isEnabled());

        //WebElement link3 = Driver.getDriver().findElement(By.xpath("(//*[text()='3 days in Bangkok'])[3]"));
        //3. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages3.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages3.isEnabled());

        //WebElement link4 = Driver.getDriver().findElement(By.xpath("//*[text()='7 days in Istanbul']"));
        //4. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages4.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages4.isEnabled());

        //WebElement link5 = Driver.getDriver().findElement(By.xpath("(//*[text()='10 days in Buenos Aires'])[3]"));
        //5. Ögenin görünebilir ve aktif durumda olup olmadigi dogrulanir
        Assert.assertTrue(userhomepage.footerLatestPackages5.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages5.isEnabled());

        Driver.closeDriver();
    }
}
