package tests.test.US_07_13_37_38_39;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class US_38_AdminPassword {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void US38() throws IOException {



        //Browser acilir ve Admin Login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Acilan sayfada gecerli E-Mail, E-Mail kutusuna girilir
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        //Admin Password kutusuna gecerli sifre girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login butonuna tiklanir
        adminDashboard.adminLoginButton.click();

        //Admin User Profil bilgileri bölümüne tiklanir
        adminDashboard.adminDropdownMenu.click();

        // Admin DropDown menüden Change Password butonu tiklanir
        adminDashboard.adminMenuchangePasswordButton.click();

        //Sifre degistirme ekraninin görüntülenebildigini dogrulanir
        String expectedTitle="Password Change";
        String actualTitle=adminDashboard.adminChangePasswordPage.getText();
        Assert.assertEquals(actualTitle,expectedTitle);

        //Browser kapatilir
        Driver.closeDriver();


    }
}
