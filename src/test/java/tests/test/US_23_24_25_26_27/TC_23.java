package tests.test.US_23_24_25_26_27;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_23 {



    @Test
    public void loginTest(){

        //  anasayfaya gidelim

        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));


        UserHomepage userHomepage = new UserHomepage();
        userHomepage.loginLink.click();

        // email tikla ve maili gonder
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));
        // passwrodu tikla ve password gonder
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("loginPassword"));
        // cookies icin accept butonu tikla
        userHomepage.cookiesAcceptButton.click();
        // login buttonuna tikla
        userHomepage.loginSubmitButton.click();

        UserDashboard userDashboard=new UserDashboard();
        // logout buttonunu tikla
        userDashboard.logoutButton.click();

        String expectedUrl="https://qa.tripandway.com/traveller/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        Driver.closeDriver();


    }
}
