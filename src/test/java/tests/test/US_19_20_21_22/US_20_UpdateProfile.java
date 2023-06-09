package tests.test.US_19_20_21_22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

public class US_20_UpdateProfile {
    @Test
    public void TC26()  {

        // https://qa.tripandway.com/traveller/login sitesine  giriş yapın.
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userHomepage=new UserHomepage();
        UserDashboard userDashboard= new UserDashboard();
        //cookies'e tiklayin
        userHomepage.cookiesAcceptButton.click();
        // login linkine tiklayin
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
        // Profil düzenleme seçeneğini  bulun ve tiklayin.
        userDashboard.updateProfileButton.click();
        //Profil bilgilerinizi düzenlemek için gerekli alanları bulun ve İlgili alanlara mevcut bilgilerinizi girin.
        userDashboard.updateProfileName.clear();
        userDashboard.updateProfileName.sendKeys("Ayse");
        userDashboard.updateProfileEmail.clear();
        userDashboard.updateProfileEmail.sendKeys("brad.oconner@icloud.com");
        userDashboard.updateProfilePhone.clear();
        userDashboard.updateProfilePhone.sendKeys("123123");
        userDashboard.updateProfileCountry.clear();
        userDashboard.updateProfileCountry.sendKeys("Germany");
        userDashboard.updateProfileAddress.clear();
        userDashboard.updateProfileAddress.sendKeys("Akazienweg");
        userDashboard.updateProfileState.clear();
        userDashboard.updateProfileState.sendKeys("Cool");
        userDashboard.updateProfileCity.clear();
        userDashboard.updateProfileCity.sendKeys("Koln");
        userDashboard.updateProfileZipCode.clear();
        userDashboard.updateProfileZipCode.sendKeys("56070");
        //Güncellediğiniz bilgileri onaylamak için güncelle butonuna tıklayın.
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.loginSubmitButton);
        ReusableMethods.wait(3);
        userDashboard.updateProfileUpdateButton.click();
        //3 saniye bekleyin
        ReusableMethods.wait(3);
        //Profil güncelleme işleminin başarılı bir şekilde tamamlandığına dair onay mesajını test edin.
        Assert.assertTrue(userDashboard.updateProfileSuccessfulAlert.isDisplayed());
        //Sayfa kapatin
        Driver.closeDriver();



    }

}
