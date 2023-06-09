package tests.test.US_07_13_37_38_39;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_07_footerSocialMedia {
    UserHomepage userHomePage = new UserHomepage();
    @Test
    public void US07(){
        //1-Browser acilir ve siteye gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //2-Acilan sayfada cookies kabul edilir
        userHomePage.cookiesAcceptButton.click();

        //3- Ana sayfada footer bolumune gidilir
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocial);

        //4- Facebook ikonunun görünür ve aktif oldugu dogrulanir
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialFacebook,3);
        Assert.assertTrue(userHomePage.footerAddressSocialFacebook.isDisplayed() && userHomePage.footerAddressSocialFacebook.isEnabled());

        //5- Twitter ikonunun görünür ve aktif oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialTwitter.isDisplayed()&& userHomePage.footerAddressSocialTwitter.isEnabled());

        //6- LinkedIn ikonunun görünür ve aktif oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialLinkedIn.isDisplayed()&& userHomePage.footerAddressSocialLinkedIn.isEnabled());

        //7- Pinterest ikonunun görünür ve aktif oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialPinterest.isDisplayed()&& userHomePage.footerAddressSocialPinterest.isEnabled());

        //8- instagram ikonunun görünür ve aktif oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialInstagram.isDisplayed()&& userHomePage.footerAddressSocialInstagram.isEnabled());

        //9- Browser kapatilir
        Driver.closeDriver();









    }

}
