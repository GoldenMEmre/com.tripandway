package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_01_Home extends TestBaseRapor{

    @Test(groups = "grup1")
    public void TC01() {

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        extentTest=extentReports.createTest("tripandwaytestUrl");

        //Cookies kabul edilir
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.cookiesAcceptButton.click();

        //https://qa.tripandway.com Url basliginin gorunur oldugu test edilir
        String expectedUrl = "https://qa.tripandway.com/";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        extentTest.pass("Url'in dogru oldugu test edildi");

        // Driver kapatilir
        Driver.closeDriver();
    }

}

