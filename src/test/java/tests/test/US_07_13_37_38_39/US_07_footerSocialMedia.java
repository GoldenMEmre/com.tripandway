package tests.test.US_07_13_37_38_39;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.text.AttributedString;
import java.util.Set;

public class US_07_footerSocialMedia {

    UserHomepage userHomePage = new UserHomepage();
    @Test
    public void US07_Test01(){
        //Browser acilir ve siteye gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Acilan sayfada cookies kabul edilir
        userHomePage.cookiesAcceptButton.click();

        //Ana sayfada footer bolumune gidilir
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocial);

        // Facebook ikonunun görünür oldugu dogrulanir
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialFacebook,3);
        Assert.assertTrue(userHomePage.footerAddressSocialFacebook.isDisplayed() && userHomePage.footerAddressSocialFacebook.isEnabled());

        //Twitter ikonunun görünür oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialTwitter.isDisplayed()&& userHomePage.footerAddressSocialTwitter.isEnabled());

        //LinkedIn ikonunun görünür oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialLinkedIn.isDisplayed()&& userHomePage.footerAddressSocialLinkedIn.isEnabled());

        //Pinterest ikonunun görünür oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialPinterest.isDisplayed()&& userHomePage.footerAddressSocialPinterest.isEnabled());

        //instagram ikonunun görünür oldugu dogrulanir
        Assert.assertTrue(userHomePage.footerAddressSocialInstagram.isDisplayed()&& userHomePage.footerAddressSocialInstagram.isEnabled());

        Driver.closeDriver();



    }
    @Test
    public void US07_Test02(){
        // Facebook ikonunun aktif oldugu dogrulanir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomePage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocialFacebook);
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialFacebook,15);
        userHomePage.footerAddressSocialFacebook.click();

        String ilkSayfaWindowHandleDeg = Driver.getDriver().getWindowHandle();

        Set<String> socialMediaWindowHandleDegerSet = Driver.getDriver().getWindowHandles();
        String ikinciSocialMediaWindowHandleDeg = "";
        for (String eachWhd : socialMediaWindowHandleDegerSet
        ) {

            if (!eachWhd.equals(ilkSayfaWindowHandleDeg)) {
                ikinciSocialMediaWindowHandleDeg = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSocialMediaWindowHandleDeg);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "facebook.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Facebook sayfasına gidilemedi");
        softAssert.assertAll();
        Driver.quitDriver();


    }

    @Test
    public void US07_Test03(){
        // Twitter ikonunun aktif oldugu dogrulanir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomePage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocialTwitter);
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialTwitter,15);
        userHomePage.footerAddressSocialTwitter.click();
        String ilkSayfaWindowHandleDeg = Driver.getDriver().getWindowHandle();
        Set<String> socialMediaWindowHandleDegerSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri = "";
        for (String eachWhd : socialMediaWindowHandleDegerSet
        ) {

            if (!eachWhd.equals(ilkSayfaWindowHandleDeg)) {
                ikinciSayfaHandleDegeri = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "twitter.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Twitter sayfasına gidilemedi");
        softAssert.assertAll();


        Driver.quitDriver();


    }

    @Test
    public void US07_Test04(){
        //LinkedIn ikonunun aktif oldugu dogrulanir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomePage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocialLinkedIn);
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialLinkedIn,15);
        userHomePage.footerAddressSocialLinkedIn.click();
        String ilkSayfaWindowHandleDeg = Driver.getDriver().getWindowHandle();
        Set<String> socialMediaWindowHandleDegerSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri = "";
        for (String eachWhd : socialMediaWindowHandleDegerSet
        ) {

            if (!eachWhd.equals(ilkSayfaWindowHandleDeg)) {
                ikinciSayfaHandleDegeri = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "linkedin.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "LinkedIn sayfasına gidilemedi");
        softAssert.assertAll();

        Driver.quitDriver();



    }

    @Test
    public void US07_Test05(){
        //Pinterest ikonunun aktif oldugu dogrulanir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomePage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocialPinterest);
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialPinterest,15);
        userHomePage.footerAddressSocialPinterest.click();
        String ilkSayfaWindowHandleDeg = Driver.getDriver().getWindowHandle();
        Set<String> socialMediaWindowHandleDegerSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri = "";
        for (String eachWhd : socialMediaWindowHandleDegerSet
        ) {

            if (!eachWhd.equals(ilkSayfaWindowHandleDeg)) {
                ikinciSayfaHandleDegeri = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "pinterest.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Pinterst sayfasına gidilemedi");
        softAssert.assertAll();

        Driver.quitDriver();




    }

    @Test
    public void US07_Test06(){
        //Instagram ikonunun aktif oldugu dogrulanir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomePage.cookiesAcceptButton.click();
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView();",userHomePage.footerAddressSocialInstagram);
        ReusableMethods.waitForVisibility(userHomePage.footerAddressSocialInstagram,15);
        userHomePage.footerAddressSocialInstagram.click();
        String ilkSayfaWindowHandleDeg = Driver.getDriver().getWindowHandle();
        Set<String> socialMediaWindowHandleDegerSet = Driver.getDriver().getWindowHandles();
        String ikinciSayfaHandleDegeri = "";
        for (String eachWhd : socialMediaWindowHandleDegerSet
        ) {

            if (!eachWhd.equals(ilkSayfaWindowHandleDeg)) {
                ikinciSayfaHandleDegeri = eachWhd;
            }
        }
        Driver.getDriver().switchTo().window(ikinciSayfaHandleDegeri);
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "instagram.com";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(actualUrl.contains(expectedUrl), "Instagram sayfasına gidilemedi");
        softAssert.assertAll();

        Driver.quitDriver();



    }

}
