package tests.test.US_35_36_40_41;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_36_SubscribersSendEmail extends TestBaseRapor {

    @Test
    public void TC_55() throws InterruptedException {

        // "https://qa.tripandway.com/admin/login" adresine gider.
        // Goes to "https://qa.tripandway.com/admin/login" address.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminDashboard adminDashboard= new AdminDashboard();

        // Email adresini,  Email adres kutusuna yazar.
        // Writes the email address in the mail address box.
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        // Pasword'u password kutusuna yazar.
        // Writes the password in the password box.
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // Login butonuna tiklar.
        // Clicks the Login button.
        adminDashboard.adminLoginButton.click();

        // Admin Panel'de bulunan "Subscribers" butonu tiklanir
        // Click the "Subscribers" button in the Admin Panel
        adminDashboard.adminPanelSubscriberButton.click();

        // Acilan sekmeden "Send Email to Subscribers" secilip tiklanir.
        // Click "Send E-mail to Subscribers" from the tab that opens.
        adminDashboard.adminDropDownSendEmail.click();

        // Acilan sayfada "Subject" kutusuna Email'in konusu yazilir.
        //Write the subject of the e-mail in the "Subject" box on the page that opens.
        adminDashboard.adminSubscribersEmailSubjectBox.sendKeys(ConfigReader.getProperty("adminSubject")+Keys.TAB);

        //  "Massege" kutusu bolumune mesajin icerigi yazilir.
        // Write the content of the message in the "Massege" box.
        adminDashboard.adminSabscribersMassegeBox.sendKeys(ConfigReader.getProperty("adminEmailMassege")+ Keys.TAB);

        // "Submit" butonuna tiklanarak Email gönderilir.
        // Email is sent by clicking the "Submit" button.
        adminDashboard.adminSubscribersEmailSubmitButton.click();

        // Email'in gonderilip gonderimediginin dogrulanmasi.
        //Verifying whether the email was sent or not.
        ReusableMethods.wait(3);
        Assert.assertTrue(adminDashboard.adminSubscriberseMailToastMessage.isEnabled());


        Driver.quitDriver();

    }

}
