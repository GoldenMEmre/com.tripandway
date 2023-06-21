package tests.test.US_08_09_30;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_08_FooterAdress  extends TestBaseRapor {
    UserHomepage userHomepage = new UserHomepage();
    Actions actions;



    @Test(groups = "grup")
    public void TC08(){

        // Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        extentTest = extentReports.createTest("US08FooterAdressTC08","Driver anasayfaya gitmeli");
        extentTest.pass("anasayfaya ulasildi");

        //Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        ReusableMethods.wait(1);

        Driver.closeDriver();

    }

    @Test
    public void TC09(){

        // Go to https://qa.tripandway.com/
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        extentTest = extentReports.createTest("US08FooterAdressTC08","Driver anasayfaya gitmeli");
        extentTest.pass("anasayfaya ulasildi");

        //Acilan sayfada cookies kabul edilir
        userHomepage.cookiesAcceptButton.click();

        extentTest = extentReports.createTest("US08FooterAdressTC09","Driver sayfanin alt kismindaki adres bolumune ulasir ve iletisim linklerinin gorunur oldugu test edilir");
        // Adress bolumunde bulunan iletisim linkleri gorunur oldugu test edilir

        // Page Down yapilarak sayfanin footer kismina ulasilir
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.footerAddress);


        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Footer kisminda 'Adress' bolumunun gorunur oldugu test edilir
        Assert.assertTrue(userHomepage.footerAddress.isDisplayed());
        extentTest.pass("FooterAdress goruldugu dogrulandi");
        extentTest.pass("Iletisim linklerinin gorunur oldugu dogrulandi");


        Driver.closeDriver();
    }
}
