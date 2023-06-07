package tests.test.US_23_24_25_26_27;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_26_AdminPanelGirisdogrulama {
    @Test
    public void adminLoginTest(){

        // Anasayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();

        // admin emailboxu tikla ve  mail yolla
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        // admin passwordu tikla ve  mail yolla
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        // login buttonunu tikla ve gir
        adminDashboard.adminLoginButton.click();

        String expectedUrl="https://qa.tripandway.com/admin/dashboard";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        // Aranan url ve beklenen urlyi esit mi test edin
        Assert.assertEquals(actualUrl,expectedUrl);

        // sayfayi kapat
        Driver.closeDriver();

    }
}
