package tests.test.US_08_09_30;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import java.io.ObjectInputFilter;

public class US_09 {

    UserHomepage userHomepage =new UserHomepage();
    Faker faker = new Faker();

    @Test
    public void TC10(){


        //Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        //Page Down yapilarak sayfanin Newsletter kismina ulasilir
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.bodyNewsletterTitle);

        //2 saniye bekler
        ReusableMethods.wait(2);

        // Newsletter Email Box ve Submit Button erisilebilir mi kontrol edilir
        Assert.assertTrue(userHomepage.bodyNewsletterEmailBox.isEnabled());
        Assert.assertTrue(userHomepage.bodyNewsletterSubmitButton.isEnabled());

    }

    @Test(dependsOnMethods = "TC10")
    public void TC11(){

        //Email kutusunun icine gecerli bir email adresi yazilir
        userHomepage.bodyNewsletterEmailBox.sendKeys(faker.internet().emailAddress());

        // 'SUBMIT' butonuna tiklanir
        userHomepage.bodyNewsletterSubmitButton.click();

        //2 saniye bekler
        ReusableMethods.wait(2);

        //To activate your subscription please check your email and follow instruction there. text'inin goruntulendigi dogrulanir
        Assert.assertTrue(userHomepage.newsletterSuccessfulAlert.isDisplayed());
    }

}
