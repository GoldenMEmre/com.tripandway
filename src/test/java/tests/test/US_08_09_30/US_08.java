package tests.test.US_08_09_30;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_08 {
    UserHomepage userHomepage = new UserHomepage();
    Actions actions;



    @Test
    public void TC01(){

        // Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Acilan sayfada cookies kabul edilir
        //userHomepage.cookiesAcceptButton.click();

        // Page Down yapilarak sayfanin footer kismina ulasilir

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();

        // Footer kisminda 'Adress' bolumunun gorunur oldugu test edilir

        Assert.assertTrue(userHomepage.addressElement.isDisplayed());

    }

    @Test
    public void tc02(){

        // Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        // Page Down yapilarak sayfanin footer kismina ulasilir

        actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN)
                .sendKeys(Keys.PAGE_DOWN).perform();




    }
}
