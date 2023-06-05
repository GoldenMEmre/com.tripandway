package tests.test.US_23_24_25_26_27;

import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_25 {
    public static void main(String[] args) {

        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));


        UserHomepage userHomepage = new UserHomepage();
        userHomepage.loginButton.click();

        userHomepage.emailBox.sendKeys(ConfigReader.getProperty("loginEmail"));
        userHomepage.passwordKutusu.sendKeys(ConfigReader.getProperty("loginPassword"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.girisLoginButtonu.click();


        Driver.closeDriver();
    }
}
