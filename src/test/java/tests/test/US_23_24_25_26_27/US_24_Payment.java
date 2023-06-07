package tests.test.US_23_24_25_26_27;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_24_Payment {


    @Test
    public void paymentTest() throws InterruptedException {

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
        // Menude bulunan Packages tikla
        userHomepage.menuPackages.click();
        // Istanbul resimli olan turu tikla
        userHomepage.packagesPhotoTitleIstanbul.click();

        UserDashboard userDashboard=new UserDashboard();
        // Book your seat butonunu tikla
        userDashboard.packagesBookYourSeatButton.submit();
        // odeme icin pay with carti tikla
        userDashboard.packagesPayWithCardButton.submit();


        Driver.getDriver().switchTo().frame(userDashboard.packagesPayIframe);

        // karnumarasi gir
        userDashboard.packagesPayCardNumber.sendKeys("4242");
        userDashboard.packagesPayCardNumber.sendKeys("4242");
        userDashboard.packagesPayCardNumber.sendKeys("4242");
        userDashboard.packagesPayCardNumber.sendKeys("4242");

        // kartin son kullanma tarihini gir
        userDashboard.packagesPayCardDate.sendKeys("12");
        userDashboard.packagesPayCardDate.sendKeys("34");

        // kartin cvc ni gir
        userDashboard.packagesPayCardCVC.sendKeys("567");
        userDashboard.packagesPaySubmitButton.click();

        String expectedUrl="https://qa.tripandway.com/package/store/list";
        String actualUrl=Driver.getDriver().getCurrentUrl();

       Assert.assertEquals(actualUrl,expectedUrl);





    }


}
