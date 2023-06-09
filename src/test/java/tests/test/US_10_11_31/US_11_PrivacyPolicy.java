package tests.test.US_10_11_31;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_11_PrivacyPolicy extends TestBaseRapor {
    /*
        Bir ziyaretçi olarak  sitenin gizlilik politikalarının sayfasını görüntüleyebildiğimi doğrulayabilmeliyim
    */

    @Test
    public void TC13() {
        // browser ile tripandway anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        // Cookies kabul edilir
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.cookiesAcceptButton.click();

        // Sayfanin en altina inilir ve 'Privacy Policy' yazisinin oldugu test edilir
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();
        // Sayfa en alta inene kadar sureye ihtiyaci var!
        ReusableMethods.wait(1);

        String expectedText = "Privacy Policy";
        String actualText = userHomepage.footerPrivacyPolicy.getText();

        Assert.assertEquals(actualText,expectedText);

        // 'Terms and Conditions' yazisi tiklanir ve 'Terms and Conditions'  sayfasina gidilir
        // Gidilen sayfada basligin 'TERMS AND CONDITIONS' oldugu test edilir
        userHomepage.footerPrivacyPolicy.click();
        String expectedTitle = "PRIVACY POLICY";
        String actualTitle = userHomepage.privacyPolicyTitle.getText();

        Assert.assertEquals(actualTitle,expectedTitle);

        // Sayfa kapatilir
        Driver.closeDriver();

    }

}
