package tests.test.US_07_13_37_38_39;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_37_AdminProfil {
    UserHomepage userHomePage = new UserHomepage();
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void US37(){

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

        //Usue Profil menüsünün acildigini ve görüntülenebildigini dogrulanir
        Assert.assertTrue(adminDashboard.adminDropdownMenuFrame.isDisplayed());

        //Browser kapatilir
        Driver.closeDriver();
















    }















}
