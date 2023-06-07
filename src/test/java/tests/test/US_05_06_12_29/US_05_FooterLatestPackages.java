package tests.test.US_05_06_12_29;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.Driver;
import utilities.JSUtilities;



public class US_05_TC_05 {

    @Test
    public void TC_05(){
        Driver.getDriver().get("https://qa.tripandway.com/");
        UserHomepage userhomepage = new UserHomepage();
        //WebElement label1 = Driver.getDriver().findElement(By.xpath("//*[text()='Latest Packages']"));
        JSUtilities.scrollToElement(Driver.getDriver(),userhomepage.footerLatestPackages);
        //WebElement link1 = Driver.getDriver().findElement(By.linkText("5 Day California"));
        Assert.assertTrue(userhomepage.footerLatestPackages1.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages1.isEnabled());

        //WebElement link2 = Driver.getDriver().findElement(By.xpath("(//*[text()='7 days in Salina Island'])[3]"));
        Assert.assertTrue(userhomepage.footerLatestPackages2.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages2.isEnabled());

        //WebElement link3 = Driver.getDriver().findElement(By.xpath("(//*[text()='3 days in Bangkok'])[3]"));
        Assert.assertTrue(userhomepage.footerLatestPackages3.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages3.isEnabled());

        //WebElement link4 = Driver.getDriver().findElement(By.xpath("//*[text()='7 days in Istanbul']"));
        Assert.assertTrue(userhomepage.footerLatestPackages4.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages4.isEnabled());

        //WebElement link5 = Driver.getDriver().findElement(By.xpath("(//*[text()='10 days in Buenos Aires'])[3]"));
        Assert.assertTrue(userhomepage.footerLatestPackages5.isDisplayed());
        Assert.assertTrue(userhomepage.footerLatestPackages5.isEnabled());

        Driver.closeDriver();
    }
}
