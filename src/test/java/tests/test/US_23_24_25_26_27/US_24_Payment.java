package tests.test.US_23_24_25_26_27;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;


public class US_24_Payment extends TestBaseRapor {


    @Test
    public void paymentTest() throws IOException {

        extentReports.createTest("Payment Test","Kullanici sectigi package'i odeyebilmeli");

        UserHomepage userHomepage = new UserHomepage();

        //  anasayfaya gidelim

        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        // cookies icin accept butonu tikla
        userHomepage.cookiesAcceptButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);


        userHomepage.loginLink.click();

        // email tikla ve maili gonder
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("loginEmail"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // passwrodu tikla ve password gonder
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("loginPassword"));

        // 2 saniye bekler
        ReusableMethods.wait(2);


        // login buttonuna tikla
        userHomepage.loginSubmitButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Menude bulunan Packages tikla
        userHomepage.menuPackages.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Istanbul resimli olan turu tikla
        userHomepage.packagesIstanbul.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        UserDashboard userDashboard=new UserDashboard();
        // Book your seat butonunu tikla
        userDashboard.packagesBookYourSeatButton.submit();


        // 2 saniye bekler
        ReusableMethods.wait(2);

        // odeme icin pay with carti tikla
        userDashboard.packagesPayWithCardButton.submit();

        // 2 saniye bekler
        ReusableMethods.wait(2);


        Driver.getDriver().switchTo().frame(userDashboard.packagesPayIframe);




    //   userDashboard.packagesPayCardNumber.sendKeys(ConfigReader.getProperty("cardNumber"));
    //   extentTest.info("Card Number 42424242424242 olarak gonderilir");

      // karnumarasi gir
      userDashboard.packagesPayCardNumber.sendKeys("4242");
      // 2 saniye bekler
      ReusableMethods.wait(1);
      userDashboard.packagesPayCardNumber.sendKeys("4242");
      // 2 saniye bekler
      ReusableMethods.wait(1);
      userDashboard.packagesPayCardNumber.sendKeys("4242");
      // 2 saniye bekler
      ReusableMethods.wait(1);
      userDashboard.packagesPayCardNumber.sendKeys("4242");
      // 2 saniye bekler
      ReusableMethods.wait(1);

        // 2 saniye bekler
        ReusableMethods.wait(1);


       // userDashboard.packagesPayCardDate.sendKeys(ConfigReader.getProperty("cardDate"));
     // kartin son kullanma tarihini gir
     userDashboard.packagesPayCardDate.sendKeys("12");
     // 2 saniye bekler
     ReusableMethods.wait(1);
     userDashboard.packagesPayCardDate.sendKeys("34");

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // kartin cvc ni gir
        userDashboard.packagesPayCardCVC.sendKeys("567");

        // 2 saniye bekler
        ReusableMethods.wait(2);

        userDashboard.packagesPaySubmitButton.click();

        String expectedUrl="https://qa.tripandway.com/package/store/list";
        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl);

        Driver.closeDriver();


        extentTest.pass("Kullanici sectigi package'in odemesini basarili olarak gerceklestirir");
    }


}
