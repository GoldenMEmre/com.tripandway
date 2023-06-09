package tests.test.US_19_20_21_22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_21_PaymentHistory {
    @Test
    public void TC27()  {


        // https://qa.tripandway.com/traveller/login sitesine  giriş yapın.
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userHomepage=new UserHomepage();
        UserDashboard userDashboard= new UserDashboard();
        //cookies'e tiklayin
        userHomepage.cookiesAcceptButton.click();
        //Login linkine tiklayin
        userHomepage.loginLink.click();
        //  Kullanıcı hesap sayfasına dogru email adresi ve sifre ile yönlendirildiğinizi doğrulayın.
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("tlnEmail"));
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("tlnPassword"));
        //sayfayi yukariya dogru kaydirin
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.loginSubmitButton);
        // login butonuna basin
        userHomepage.loginSubmitButton.click();
        //3 saniye bekleyin
        ReusableMethods.wait(3);
        //Ödeme geçmişi seçeneğini  bulun ve o butona tıklayın.
        userDashboard.paymentHistoryButton.click();
        //3 saniye bekleyin
        ReusableMethods.wait(3);
        // Ödeme geçmişi sayfasının açıldığını doğrulayın ve odeme geçmişi sayfasında,  ödemelerin bir tablo
        // şeklinde siparis numarasi, ödeme tutarı,para birimi,, ödeme durumu vb. bilgilerin görüntülendiğini test edin.
        String expectedTitle="View All Payments";
        String actualTitle=userDashboard.SuccessfulPaymentHistory.getText();
        Assert.assertEquals(actualTitle,expectedTitle);
        //Sayfa kapatin
        Driver.closeDriver();



    }

}
