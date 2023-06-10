package tests.test.US_18_32_33_34;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class Us_32  extends TestBaseRapor {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void tc51(){
        extentTest = extentReports.createTest("Admin sayfasi Order bulumu kontrol testi");
        // Go to https://qa.tripandway.com/admin/login
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        // Acilan sayfanin basligi "Login" oldugu dogrulanmali
        String expectedTitle = "Login";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        // Email girilmeli
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin03Email"));

        // Password girilmeli
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // "Login" butonuna basilir
        adminDashboard.adminLoginButton.click();
        extentTest.info("Admin olarak basarili sekilde giris yapildi");

        // "Order" butonuna tiklanir
        adminDashboard.adminPanelOrderButton.click();

        // "Wiew Orders" yazisinin gorunur oldugu dogrulanmali
        Assert.assertTrue(adminDashboard.ordersViewOrderTitle.isDisplayed());
        extentTest.info("Wiew Orders yazisinin gorunurlugu kontrol edildi");

        // "Showing..." yazisinin gorunur oldugu dogrulanmali
        //Assert.assertTrue(adminDashboard.showingSearchWord.isDisplayed());

        extentTest.pass("Yapilan testlerin sonucu  olarak raporlar");
        // Browser kapatilir
        Driver.closeDriver();
        extentTest.info("Sayfayi kapatir");

    }
}
