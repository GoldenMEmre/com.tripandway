package tests.test.US_35_36_40_41;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_35_Admin_Subscribers {

    @Test
    public void TC_54(){
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
        // adminDashboard.adminPanelSubscribersButton.click();

        // Acilan sekmeden "All Subscribers" secilip tiklanir.
        // Select "All Subscribers" from the tab that opens and click.
        adminDashboard.dropDownAllsubscribers.click();

        // Acilan sayfada üyelerin gorundugunu dogrulanir.
        // Verify that members are seen on the page that opens.
        String expectedContent ="Showing";
        String actualContent = adminDashboard.showingSearchWord.getText();
        Assert.assertTrue(actualContent.contains(expectedContent));

        Driver.getDriver().close();

    }
}

