package tests.test.US_18_32_33_34;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class US_34 {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void tc53(){
        // Go to "https://qa.tripandway.com/admin/login"
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        String firstWH = Driver.getDriver().getWindowHandle();

        // Acilan sayfanin basliginin "Login" oldugu dogrulanmali
        String expectedTitle = "Login";
        Assert.assertEquals(expectedTitle,Driver.getDriver().getTitle());

        ReusableMethods.wait(1);
        // EmailBox'a email girilir
        ReusableMethods.waitForVisibility(adminDashboard.adminEmailBox,2);
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));

        ReusableMethods.wait(1);

        // PasswordBox'a password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        ReusableMethods.wait(1);

        // "Login" butonuna tiklanir
        adminDashboard.adminLoginButton.click();
        ReusableMethods.wait(1);

        // "Order" butonuna tiklanir
        adminDashboard.adminPanelOrderButton.click();
        ReusableMethods.wait(1);

        // ilk siparisteki "Invoice" butonuna tiklanir
        adminDashboard.ordersFirstOrderInvoiceButton.click();
        ReusableMethods.wait(2);

        // Acilan yeni sekmede "Print Invoice" butonunun gorunur oldugu dogrulanir.
        String secondWH = "";
        Set<String> WhSet = Driver.getDriver().getWindowHandles();
        for (String eachWh: WhSet
             ) {
            if (!eachWh.equals(firstWH)){
                secondWH=eachWh;
            }
        }
        Driver.getDriver().switchTo().window(secondWH);
        Assert.assertTrue(adminDashboard.ordersFirstOrderPrintInvoiceButton.isDisplayed());
        ReusableMethods.wait(2);

        // Quit to Browser.
        Driver.quitDriver();

    }
}
