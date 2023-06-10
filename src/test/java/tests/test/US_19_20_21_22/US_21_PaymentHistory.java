package tests.test.US_19_20_21_22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.*;

public class US_21_PaymentHistory extends TestBaseRapor {
    @Test
    public void TC27()  {


        // https://qa.tripandway.com/traveller/login sitesine  giriş yapın.
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userHomepage=new UserHomepage();
        UserDashboard userDashboard= new UserDashboard();
        //cookies'e tiklayin
        userHomepage.cookiesAcceptButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Login linkine tiklayin
        userHomepage.loginLink.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //  Kullanıcı hesap sayfasına dogru email adresi ve sifre ile yönlendirildiğinizi doğrulayın.
        userHomepage.loginEmailBox.sendKeys(ConfigReader.getProperty("tlnEmail"));

        // 2 saniye bekler
        ReusableMethods.wait(2);
        userHomepage.loginPasswordBox.sendKeys(ConfigReader.getProperty("tlnPassword"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //sayfayi yukariya dogru kaydirin
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.loginSubmitButton);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // login butonuna basin
        userHomepage.loginSubmitButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

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
