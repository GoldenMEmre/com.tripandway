package tests.test.US_23_24_25_26_27;


import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_24_OdemeDogrulama {


    @Test
    public void paymentTest(){

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
        userDashboard.packagesBookYourSeatButton.click();
        // odeme icin pay with carti tikla
        userDashboard.packagesPayWithCardButton.click();
        // karnumarasi gir
        userDashboard.packagesPayWithCardButton.sendKeys(ConfigReader.getProperty("cardNumber"));
        // kartin son kullanma tarihini gir
        userDashboard.packagesPayCardDate.sendKeys(ConfigReader.getProperty("cardDate"));
        // kartin cvc ni gir
        userDashboard.packagesPayCardCVC.sendKeys(ConfigReader.getProperty("cardCvc"));
        userDashboard.packagesPaySubmitButton.click();







    }


}
