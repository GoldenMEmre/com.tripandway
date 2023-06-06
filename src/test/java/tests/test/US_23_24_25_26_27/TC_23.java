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

        userHomepage.registrationEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));
        userHomepage.registrationNameBox.sendKeys(ConfigReader.getProperty("loginPassword"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.girisLoginButtonu.click();
        UserDashboard userDashboard=new UserDashboard();
        userDashboard.logoutButton.click();

        String expectedUrl="https://qa.tripandway.com/traveller/login";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

        Driver.closeDriver();


    }
}
