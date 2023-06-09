package tests.test.US_14_15_16_17_28;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_17 {
    UserHomepage userHomepage = new UserHomepage();
    Actions actions = new Actions(Driver.getDriver());
    String actualTestData = "";
    String expectedTestData = "";

    // Kullanici olarak anasayfaya ulasilmali, anasayfada oldugu dogrulanmali
    @Test
    public void TC22(){
        // Kullanici olarak anasayfaya ulasilmali
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        // anasayfada oldugu dogrulanmali
        expectedTestData = ConfigReader.getProperty("tripUrl");
        actualTestData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTestData,expectedTestData);
        Driver.closeDriver();
    }

    // Kullanici olarak Contact sayfasina ulasabilmeli ve aktif oldugu dogrulanmali
    @Test
    public void TC23() {
        // Kullanici contact sayfasina gidebilmeli
        userHomepage = new UserHomepage();
        actions = new Actions(Driver.getDriver());
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        userHomepage.cookiesAcceptButton.click();
        userHomepage.menuContact.click();
        // Kullanici contact sayfasinda oldugunda dogrulamali
        expectedTestData = ConfigReader.getProperty("menuContactUrl");
        actualTestData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTestData, expectedTestData);
        Assert.assertTrue(userHomepage.contactTitle.isDisplayed());

        // Contact sayfasinin aktif oldugu dogrulanmali
        actions.sendKeys(userHomepage.menuContactNameBox,"WiseQuarter")
                .sendKeys(Keys.TAB)
                .sendKeys("019128881630")
                .sendKeys(Keys.TAB)
                .sendKeys("info@wisequarter.com")
                .sendKeys(Keys.TAB)
                .sendKeys("Tesekkurler")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

        ReusableMethods.waitFor(2);
        Assert.assertTrue(userHomepage.contactMessageGonderildiOkeyi.isDisplayed());

        // OK alert mesaji alabilmeli
        expectedTestData = ConfigReader.getProperty("contactFormSendAlert");
        actualTestData = userHomepage.contactMessageGonderildiOkeyi.getText();
        Assert.assertEquals(actualTestData,expectedTestData);

        Driver.closeDriver();
    }
}
