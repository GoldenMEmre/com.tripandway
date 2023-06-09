package tests.test.US_14_15_16_17_28;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_28 extends TestBaseRapor {

    AdminDashboard adminDashboard = new AdminDashboard();
    String expectedTestData = "";
    String actualTestData = "";

    /*  Admin girişi yaptıktan sonra Blog Section bölümünde Kategegoriler kısmına yeni kategori ekleyip
        eklediğim kategorinin düzenlenebildiğini  ve silinebildiğini sırayla doğrulayabilmeliyim */

    @Test @Ignore
    public void TC35 (){
        // Kullanici admin sayfasina giris yapar
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        // Admin sayfasinda oldugunda dogrular
        expectedTestData = ConfigReader.getProperty("adminDashboardUrl");
        actualTestData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTestData,expectedTestData);
        Assert.assertTrue(adminDashboard.adminPanelDashbordButton.isEnabled());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void TC36(){
        // Kullanici Blog Section menusunden kategoriler kismina erisir ve sayfada oldugunu dogrular
        adminDashboard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        adminDashboard.adminPanelBlogSectionButton.click();
        adminDashboard.adminPanelBlogSectionCategoriesButton.click();
        // kategoriler sayfasinda oldugunu dogrular
        expectedTestData = ConfigReader.getProperty("adminCategoriesUrl");
        actualTestData = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualTestData,expectedTestData);
        Assert.assertTrue(adminDashboard.blogSectionCategoriesAddNewButton.isEnabled());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void TC37(){
        // Kullanici yeni kategori ekler ve ekledigini dogrular
        adminDashboard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        adminDashboard.adminPanelBlogSectionButton.click();
        adminDashboard.adminPanelBlogSectionCategoriesButton.click();
        adminDashboard.blogSectionCategoriesAddNewButton.click();
        adminDashboard.addCategoryNameBox.sendKeys("team1");
        adminDashboard.addCategorySubmitButton.click();
        // Yeni kategori ekledigini dogrular
        Assert.assertTrue(adminDashboard.addCategorySuccessfulAlert.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void TC38(){
        // Kullanici uptade islemi yapar ve uptade yaptigini dogrular
        adminDashboard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        adminDashboard.adminPanelBlogSectionButton.click();
        adminDashboard.adminPanelBlogSectionCategoriesButton.click();
        adminDashboard.categoriesSearchBox.sendKeys("team1");
        adminDashboard.categoriesActionEditButton.click();
        adminDashboard.addCategoryNameBox.clear();
        adminDashboard.addCategoryNameBox.sendKeys("team113");
        adminDashboard.editCategoryUpdateButton.click();
        // uptade yaptigini dogrular ve successfull mesaji alir
        Assert.assertTrue(adminDashboard.editCategorySuccessfulAlert.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }

    @Test
    public void TC39(){
        // Kullanici delete islemi yapar delete yaptigini dogrular
        adminDashboard = new AdminDashboard();
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin01Email"));
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        adminDashboard.adminLoginButton.click();
        adminDashboard.adminPanelBlogSectionButton.click();
        adminDashboard.adminPanelBlogSectionCategoriesButton.click();
        adminDashboard.categoriesSearchBox.sendKeys("team113");
        adminDashboard.categoriesActionDeleteButton.click();
        Driver.getDriver().switchTo().alert().accept();
        // delete yaptigini dogrular ve successfull mesaji alir
        Assert.assertTrue(adminDashboard.categoriesDeletedSuccessfulAlert.isDisplayed());
        ReusableMethods.waitFor(2);
        Driver.closeDriver();
    }



}
