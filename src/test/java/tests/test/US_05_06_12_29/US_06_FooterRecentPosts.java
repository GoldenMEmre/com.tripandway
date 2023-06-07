package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;


public class US_06_TC_06 {

    @Test
    public void TC_06() throws InterruptedException {
        Driver.getDriver().get("https://qa.tripandway.com/");
        UserHomepage userhomepage = new UserHomepage();
        //WebElement label1 = Driver.getDriver().findElement(By.xpath("//*[text()='Recent Posts']"));
        JSUtilities.scrollToElement(Driver.getDriver(), userhomepage.footerRecentPosts);
        ReusableMethods.waitFor(3);
       // WebElement link1 = Driver.getDriver().findElement(By.xpath("(//*[text()='Discovering Greenville: A Hidden Gem in South Carolina'])[3]"));
        Assert.assertTrue(userhomepage.footerRecentPosts1.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts1.isEnabled());

        //WebElement link2 = Driver.getDriver().findElement(By.xpath("(//*[text()='Buenos Aires: The Paris of South America'])[3]"));
        Assert.assertTrue(userhomepage.footerRecentPosts2.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts2.isEnabled());

        //WebElement link3 = Driver.getDriver().findElement(By.xpath("(//*[text()='Bangkok: A City of Contrasts'])[3]"));
        Assert.assertTrue(userhomepage.footerRecentPosts3.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts3.isEnabled());

       // WebElement link4 = Driver.getDriver().findElement(By.xpath("(//*[text()='Salina Island: A Perfect Family Getaway'])[3]"));
        Assert.assertTrue(userhomepage.footerRecentPosts4.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts4.isEnabled());

       // WebElement link5 = Driver.getDriver().findElement(By.linkText("Discovering the Ancient Capital of the Hittites: Bogazkale and Hattusas"));
        Assert.assertTrue(userhomepage.footerRecentPosts5.isDisplayed());
        Assert.assertTrue(userhomepage.footerRecentPosts5.isEnabled());

        Driver.closeDriver();
    }
}
