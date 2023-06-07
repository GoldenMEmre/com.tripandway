package tests.test.US_23_24_25_26_27;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_27_AdminDashboardMenu {

    @Test
    public void adminGirisSonrasiButonTiklama() throws InterruptedException {

        // admin ana sayfaya git
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        AdminDashboard adminDashboard=new AdminDashboard();
        // email kutusuna mail gonder
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        // password kutusuna password gonder
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        // login butonunu tikla
        adminDashboard.adminLoginButton.click();

        // Dashbord butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelDashbordButton.isEnabled());

        // GeneralSettings butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelGeneralSettingsButton.isEnabled());

        // Settings butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelPageSettingsButton.isEnabled());

        // PaymentSettings butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelPaymentSettingsButton.isEnabled());

        // DymanicPages butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelDymanicPagesButton.isEnabled());

        // Language buttonu tikla
        Assert.assertTrue(adminDashboard.adminPanelLanguageButton.isEnabled());

        // WebsiteSection  butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelWebsiteSectionButton.isEnabled());

        // EmailTemplate  butonunu tikla
        Assert.assertTrue(adminDashboard.adminPanelEmailTemplateButton.isEnabled());




    }
}
