package tests.test.US_07_13_37_38_39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

public class US_13_Destinations {
    UserHomepage userHomePage = new UserHomepage();
    @Test
    public void US13(){
        //1-Browser acilir ve siteye gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //2-Acilan sayfada cookies kabul edilir
        userHomePage.cookiesAcceptButton.click();

        //3- Destinations ögesine tiklanir
        userHomePage.menuDestinations.click();

        //4- Destinations sayfasinda oldugu test edilir
        String expectedTitle="Destinations";
        String actuelTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(actuelTitle,expectedTitle);

        //5- Destinationslarin görünür ve aktif olduklari dogrulanir
        Assert.assertTrue(userHomePage.bodyDestinationSeeAllDestinations.isDisplayed());

        List<WebElement> destinationsList= new ArrayList<>(userHomePage.destinationsList);
        for (int i = 1; i <destinationsList.size() ; i++) {
            Assert.assertTrue(destinationsList.get(i).isEnabled());

        }

        //6- Browser kapatilir
        Driver.closeDriver();



    }
}