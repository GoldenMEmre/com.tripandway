package tests.test.US_07_13_37_38_39;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_39_AdminChangePhoto {
    AdminDashboard adminDashboard = new AdminDashboard();

    @Test
    public void US39(){
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

        //Admin DropDown menüden Change Photo butonu tiklanir
        adminDashboard.adminMenuChangePhotoButton.click();

        //Profil resmi güncelleme sayfasinin görüntülenebildigi dogrulanir
        String actualTitle=adminDashboard.adminMenuChangePhotoPage.getText();
        String expectedTitle="Edit Photo";
        Assert.assertEquals(actualTitle,expectedTitle);

        //Browser kapatilir
        Driver.closeDriver();





















    }
}


