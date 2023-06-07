package tests.test.US_08_09_30;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_08_FooterAdress {
    UserHomepage userHomepage = new UserHomepage();
    Actions actions;



    @Test
    public void TC01(){

        // Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        // Page Down yapilarak sayfanin footer kismina ulasilir
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.footerAddress);


        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Footer kisminda 'Adress' bolumunun gorunur oldugu test edilir
        Assert.assertTrue(userHomepage.footerAddress.isDisplayed());
    }
}
