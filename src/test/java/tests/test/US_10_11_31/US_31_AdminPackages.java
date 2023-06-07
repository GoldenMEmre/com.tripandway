package tests.test.US_10_11_31;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;

public class US_31_AdminPackages {
    /*
        Admin girişi yaptıktan sonra Packages kısmına yeni package ekleyip
        eklediğim package'in düzenlenebildiğini ve silinebildiğini sırayla doğrulayabilmeliyim
     */

    @Test
    public void TC47() {
        //browser ile 'https://qa.tripandway.com/admin/login' sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Email Address kutusuna email adres girilir
        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        //Password kutusuna password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login butonuna basilir
        adminDashboard.adminLoginButton.click();

        //ADMIN PANEL'deki Packages kismina tiklanir
        adminDashboard.adminPanelPackagesButton.click();

        //'Packages' sayfasinda baslik yazisi 'Packages' olmali
        String expectedTitle = "Packages";
        String actualTitle = adminDashboard.adminPackagesTitle.getText();

        Assert.assertEquals(actualTitle,expectedTitle);

        //Sayfa kapatilir
        Driver.closeDriver();

    }

    @Test
    public void TC48() {
        //browser ile 'https://qa.tripandway.com/admin/login' sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Email Address kutusuna email adres girilir
        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        //Password kutusuna password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login butonuna basilir
        adminDashboard.adminLoginButton.click();

        //ADMIN PANEL'deki Packages kismina tiklanir
        adminDashboard.adminPanelPackagesButton.click();

        //Packages sayfasinda '+Add New' butonuna tiklanir ve
        //'Add Package' sayfasina ulasilabildigi test edilir
        adminDashboard.packagesAddNewButton.click();

        //Add Package sayfasindaki Add Pakage penceresindeki
        // 'Name' kismina 'Team1 Yeni Package' yazilarak doldurulur
        adminDashboard.addPackageNameBox.sendKeys(ConfigReader.getProperty("addPackagesName"));

        //Slug kismi doldurulur
        adminDashboard.addPackageSlugBox.sendKeys(ConfigReader.getProperty("addPackagesSlug"));

        //Photo kismina Local'den bir resim eklenir
        String differentPath = System.getProperty("user.dir");
        String samePath = "/src/test/java/tests/test/US_10_11_31/image.png";
        String filePath= differentPath+samePath;
        adminDashboard.addPackagePhotoButton.sendKeys(filePath);

        //Description kismina text yazilir
        adminDashboard.addPackageDescriptionTextarea.sendKeys(ConfigReader.getProperty("addPackagesDescription"));

        //Short Description kismina text yazilir
        adminDashboard.addPackageShortDescriptionBox.sendKeys(ConfigReader.getProperty("addPackagesShortDescription"));

        //Location kismina yer ismi girilir
        adminDashboard.addPackageLocationBox.sendKeys(ConfigReader.getProperty("addPackagesLocation"));

        //Start Date kismina baslangic tarihi girilir
        adminDashboard.addPackageStartDateBox.sendKeys(ConfigReader.getProperty("addPackagesStartDate"));

        //End Date kismina bitis tarihi girilir
        adminDashboard.addPackageEndDateBox.sendKeys(ConfigReader.getProperty("addPackagesEndDate"));

        //Last Booking Date kismina son rezervasyon tarihi girilir
        adminDashboard.addPackageLastBookingDateBox.sendKeys(ConfigReader.getProperty("addPackagesLastBookingDate"));

        //Map kismina harita bilgisi girilir
        adminDashboard.addPackageMapBox.sendKeys(ConfigReader.getProperty("addPackagesMap"));

        //Itinerary kismina text yazilir
        adminDashboard.addPackageItineraryTextarea.sendKeys(ConfigReader.getProperty("addPackagesItinerary"));

        //Price kismina fiyat girilir
        adminDashboard.addPackagePriceBox.sendKeys(ConfigReader.getProperty("addPackagesPrice"));

        //Policy kismina text yazilir
        adminDashboard.addPackagePolicyTextarea.sendKeys(ConfigReader.getProperty("addPackagesPolicy"));

        //Terms kismina text yazilir
        adminDashboard.addPackageTermsTextarea.sendKeys(ConfigReader.getProperty("addPackagesTerms"));

        //Is Featured? kismi Yes/No secilir
        Select select = new Select(adminDashboard.addPackageIsFeaturedDropdownMenu);
        select.selectByIndex(1);

        //Destination kisminda bir destination secilir
        adminDashboard.addPackageDestinationDropdownMenu.click();
        adminDashboard.addPackageDestinationSearchBox.sendKeys("addPackageDestinationBangkok");

        //SEO'daki Title kismina baslik yazilir
        adminDashboard.addPackageSeoTitleBox.sendKeys(ConfigReader.getProperty("addPackagesSEOTitle"));

        //SEO'daki Meta Description kismina text yazilir
        adminDashboard.addPackageSeoMetaBox.sendKeys(ConfigReader.getProperty("addPackagesSEOMeta"));

        //Submit butonuna tiklanir
        adminDashboard.addPackageSubmitButton.click();

        //Alert'teki yazinin 'Package is added successfully!' oldugu test edilir
        String expectedAlertText = "Package is added successfully!";
        String actualAlertText = adminDashboard.addPackagesSuccessfulAlert.getText();
        Assert.assertEquals(actualAlertText,expectedAlertText);

        //Sayfa kapatilir
        Driver.closeDriver();

    }

    @Test
    public void TC49() {
        //browser ile 'https://qa.tripandway.com/admin/login' sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Email Address kutusuna email adres girilir
        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        //Password kutusuna password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login butonuna basilir
        adminDashboard.adminLoginButton.click();

        //ADMIN PANEL'deki Packages kismina tiklanir
        adminDashboard.adminPanelPackagesButton.click();

        //Packages sayfasinda Search textbox'una addPackagesName yazilir
        adminDashboard.packagesSearchBox.sendKeys(ConfigReader.getProperty("addPackagesName"));

        //Tabloda Package Name'in altindaki hücrede addPackagesName yazisinin gorunur oldugu test edilir
        String expectedText = ConfigReader.getProperty("addPackagesName");
        String actualText = adminDashboard.packagesPackageName.getText();

        Assert.assertEquals(actualText,expectedText);

        //Tabloda Action'un altindaki hucrede duzenleme butonuna basilir
        adminDashboard.packagesActionEditButton.click();

        //Edit Package sayfasindaki Add Pakage penceresindeki
        // 'Name' kismina 'Team1 Yeni Package' yazilarak doldurulur
        adminDashboard.editPackageNameBox.clear();
        adminDashboard.editPackageNameBox.sendKeys(ConfigReader.getProperty("editPackagesName"));

        //Slug kismi doldurulur
        adminDashboard.editPackageSlugBox.sendKeys(ConfigReader.getProperty("editPackagesSlug"));

        //Photo kismina Local'den bir resim eklenir
        String differentPath = System.getProperty("user.dir");
        String samePath = "/src/test/java/tests/test/US_10_11_31/image1.png";
        String filePath = differentPath + samePath;
        adminDashboard.editPackagePhotoButton.sendKeys(filePath);

        //Description kismina text yazilir
        adminDashboard.editPackageDescriptionTextarea.clear();
        adminDashboard.editPackageDescriptionTextarea.sendKeys(ConfigReader.getProperty("editPackagesDescription"));

        //Short Description kismina text yazilir
        adminDashboard.editPackageShortDescriptionBox.clear();
        adminDashboard.editPackageShortDescriptionBox.sendKeys(ConfigReader.getProperty("editPackagesShortDescription"));

        //Location kismina yer ismi girilir
        adminDashboard.editPackageLocationBox.clear();
        adminDashboard.editPackageLocationBox.sendKeys(ConfigReader.getProperty("editPackagesLocation"));

        //Start Date kismina baslangic tarihi girilir
        adminDashboard.editPackageStartDateBox.clear();
        adminDashboard.editPackageStartDateBox.sendKeys(ConfigReader.getProperty("editPackagesStartDate"));

        //End Date kismina bitis tarihi girilir
        adminDashboard.editPackageEndDateBox.clear();
        adminDashboard.editPackageEndDateBox.sendKeys(ConfigReader.getProperty("editPackagesEndDate"));

        //Last Booking Date kismina son rezervasyon tarihi girilir
        adminDashboard.editPackageLastBookingDateBox.clear();
        adminDashboard.editPackageLastBookingDateBox.sendKeys(ConfigReader.getProperty("editPackagesLastBookingDate"));

        //Map kismina harita bilgisi girilir
        adminDashboard.editPackageMapBox.clear();
        adminDashboard.editPackageMapBox.sendKeys(ConfigReader.getProperty("editPackagesMap"));

        //Itinerary kismina text yazilir
        adminDashboard.editPackageItineraryTextarea.clear();
        adminDashboard.editPackageItineraryTextarea.sendKeys(ConfigReader.getProperty("editPackagesItinerary"));

        //Price kismina fiyat girilir
        adminDashboard.editPackagePriceBox.clear();
        adminDashboard.editPackagePriceBox.sendKeys(ConfigReader.getProperty("editPackagesPrice"));

        //Policy kismina text yazilir
        adminDashboard.editPackagePolicyTextarea.clear();
        adminDashboard.editPackagePolicyTextarea.sendKeys(ConfigReader.getProperty("editPackagesPolicy"));

        //Terms kismina text yazilir
        adminDashboard.editPackageTermsTextarea.clear();
        adminDashboard.editPackageTermsTextarea.sendKeys(ConfigReader.getProperty("editPackagesTerms"));

        //Is Featured? kismi Yes/No secilir
        Select select = new Select(adminDashboard.editPackageIsFeaturedDropdownMenu);
        select.selectByIndex(0);

        //Destination kisminda bir destination secilir
        //select = new Select(adminDashboard.addPackageDestinationDropdownMenu);
        //select.selectByValue("California, USA");
        adminDashboard.editPackageDestinationDropdownMenu.click();
        adminDashboard.editPackageDestinationSearchBox.sendKeys("editPackagesDestinationBuenos");

        //SEO'daki Title kismina baslik yazilir
        adminDashboard.editPackageSeoTitleBox.clear();
        adminDashboard.editPackageSeoTitleBox.sendKeys(ConfigReader.getProperty("editPackagesSEOTitle"));

        //SEO'daki Meta Description kismina text yazilir
        adminDashboard.editPackageSeoMetaBox.clear();
        adminDashboard.editPackageSeoMetaBox.sendKeys(ConfigReader.getProperty("editPackagesSEOMeta"));

        //Update butonuna tiklanir
        adminDashboard.editPackageUpdateButton.click();

        //Alert'teki yazinin 'Package is updated successfully!' oldugu test edilir
        String expectedAlertText = "Package is updated successfully!";
        String actualAlertText = adminDashboard.editPackagesSuccessfulAlert.getText();
        Assert.assertEquals(actualAlertText, expectedAlertText);

        //Sayfa kapatilir
        Driver.closeDriver();

    }

    @Test
    public void TC50() {
        //browser ile 'https://qa.tripandway.com/admin/login' sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Email Address kutusuna email adres girilir
        AdminDashboard adminDashboard = new AdminDashboard();

        adminDashboard.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"));

        //Password kutusuna password girilir
        adminDashboard.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        //Login butonuna basilir
        adminDashboard.adminLoginButton.click();

        //ADMIN PANEL'deki Packages kismina tiklanir
        adminDashboard.adminPanelPackagesButton.click();

        //Packages sayfasinda Search textbox'una '148 Days in Germany' yazilir
        adminDashboard.packagesSearchBox.sendKeys(ConfigReader.getProperty("editPackagesName"));

        //Tabloda Package Name'in altindaki hücrede '148 Days in Germany' yazisinin gorunur oldugu test edilir
        String expectedText = ConfigReader.getProperty("editPackagesName");
        String actualText = adminDashboard.packagesPackageName.getText();

        Assert.assertEquals(actualText,expectedText);

        //Tabloda Action'un altindaki hucrede duzenleme butonuna basilir
        adminDashboard.packagesActionDeleteButton.click();

        //Confirm ekraninda Tamam'a tiklanir
        Driver.getDriver().switchTo().alert().accept();

        //Alert'teki yazinin 'Package is deleted successfully!' oldugu test edilir
        String expectedAlertText = "Package is deleted successfully!";
        String actualAlertText = adminDashboard.packagesDeletedSuccessfulAlert.getText();
        Assert.assertEquals(actualAlertText, expectedAlertText);

        //Sayfa kapatilir
        Driver.closeDriver();

    }

}
