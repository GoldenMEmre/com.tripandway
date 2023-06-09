package tests.test.US_19_20_21_22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_22_UpdatePassword {
    @Test
    public void TC_28(){

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
        // Kullanıcı hesap sayfasında şifre değiştirme seçeneğini bulun ve tiklayin.
        userDashboard.updatePasswordButton.click();
        //Yeni şifrenizi girin
        userDashboard.updatePasswordBox.sendKeys("Cev.1985");
        //Şifre değiştirme işlemini onaylayın.
        userDashboard.updatePasswordUpdateButton.click();
        //Başarılı bir şekilde şifre değiştirildiğine dair onay mesajını  doğrulayın.
        Assert.assertTrue(userDashboard.updatePasswordSuccessfulAlert.isDisplayed());
        //Sayfa kapatilir
        Driver.closeDriver();
    }
    @Test
    public void TC_29(){

        //https://qa.tripandway.com sitesine giris yapin
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userHomepage=new UserHomepage();
        UserDashboard userDashboard= new UserDashboard();
        //cookies'e tiklayin
        userHomepage.cookiesAcceptButton.click();
        // login linkine tiklayin
        userHomepage.loginLink.click();
        //2 saniye bekleyin
        ReusableMethods.wait(2);
        //sayfayi yukariya dogru kaydirin
        JSUtilities.scrollToElement(Driver.getDriver(),userDashboard.loginForgetPasswordButton);
        //2 saniye bekleyin
        ReusableMethods.wait(2);
        // Sifremi unuttum butonuna tiklayin
        userDashboard.loginForgetPasswordButton.click();
        // Kayıtlı e-posta adresinizi girin
        userDashboard.resetPasswordEmailBox.sendKeys(ConfigReader.getProperty("tlnEmail"));
        // Sifre sıfırlama isteğini gönderin.
        userDashboard.resetPasswordSubmitButton.click();
        //Basarili giris yaptiginizi test edin
        Assert.assertTrue(userDashboard.resetPasswordSuccessfulAlert.isDisplayed());
        //Sayfa kapatin
        Driver.closeDriver();



    }

}
