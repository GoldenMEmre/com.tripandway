package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_29 {

    @Test
    public void TC40(){


        //Sitenin admin giris kismina erisim saglanir.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        AdminDashboard admin = new AdminDashboard();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Acilan sayfada EMail adresi girilir.
        admin.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"), Keys.TAB);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        // Sifre girilir.
        admin.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //"Login" butonuna tiklanir.
        admin.adminLoginButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //"Admin Panel" yazisinin görülebildigi dogrulanir.
        WebElement adminPanel = Driver.getDriver().findElement(By.xpath("//div[text()='Admin Panel']"));
        Assert.assertTrue(adminPanel.isDisplayed());
    }

    @Test(dependsOnMethods = "TC40")
    public void TC41(){
        AdminDashboard admin = new AdminDashboard();

        //Blog Section kismina tiklanir.
        admin.adminPanelBlogSectionButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Blogs kismina tiklanir.
        admin.adminPanelBlogSectionBlogsButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Acilan sayfada "Add New" butonuna tiklanir.
        admin.blogSectionBlogsAddNewButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Blog Title kismi girilir.
        admin.blogsBlogTitleBox.sendKeys(ConfigReader.getProperty("addBlogTitle"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Blog Content kismi girilir.
        admin.addBlogBlogContentTextarea.sendKeys(ConfigReader.getProperty("addBlogContent"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Blog Short Content kismi girilir.
        admin.addBlogBlogShortContentBox.sendKeys(ConfigReader.getProperty("addBlogShortContent"));

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Blog Photo kismindan fotograf eklenir.
        String herkesdeFarkli = System.getProperty("user.dir");
        String dosyaYolu= herkesdeFarkli+ConfigReader.getProperty("BochumPhotoHerkesteAyniOlanKisim");
        admin.addBlogPhotoButton.sendKeys(dosyaYolu);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Select Category dropbox'undan uygun secenek secilir.
        Select select = new Select(admin.addBlogSelectCategoryDropdownMenu);
        select.selectByIndex(0);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Show Comment dropbox'undan uygun secenek secilir.
        Select select1 = new Select(admin.addBlogShowCommentDropdownMenu);
        select1.selectByIndex(0);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //"Submit" butonuna tiklanir.
        admin.addBlogSubmitButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //"Blog is added successfully!" mesajinin görüntülendigi dogrulanir.
        ReusableMethods.wait(1);

        Assert.assertTrue(admin.addBlogSuccessfulAlert.isDisplayed());

        // 2 saniye bekler
        ReusableMethods.wait(2);
    }

    @Test(dependsOnMethods = "TC41")
    public void TC42(){
        AdminDashboard admin = new AdminDashboard();

        //Blog ismi searchBox'da aratilir.
        admin.blogsSearchBox.clear();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        admin.blogsSearchBox.sendKeys(ConfigReader.getProperty("addBlogTitle"),Keys.ENTER);
        ReusableMethods.wait(2);

        //Blog düzenleme butonuna tiklanir.
        admin.blogsActionEditButton.click();

        //Blog Title kisminda degisiklikler yapilir.
        admin.editBlogBlogTitleBox.clear();
        // 2 saniye bekler
        ReusableMethods.wait(2);

        admin.editBlogBlogTitleBox.sendKeys(ConfigReader.getProperty("editBlogTitle"));
        ReusableMethods.wait(2);

        //Blog Content kisminda degisiklikler yapilir.
        admin.editBlogBlogContentBox.clear();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        admin.editBlogBlogContentBox.sendKeys(ConfigReader.getProperty("editBlogContent"));
        ReusableMethods.wait(2);

        //Blog Short Content kisminda degisiklikler yapilir.
        admin.editBlogBlogShortContentBox.clear();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        admin.editBlogBlogShortContentBox.sendKeys(ConfigReader.getProperty("editBlogShortContent"));
        ReusableMethods.wait(5);

        //Yeni bir resim eklenir.
        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli+ConfigReader.getProperty("HernePhotoHerkesteAyniOlanKisim");
        admin.editBlogPhotoButton.sendKeys(dosyaYolu);
        ReusableMethods.wait(5);

        //Select Category kismindan yeni bir secenek secilir.
        Select select = new Select(admin.editBlogSelectCategoryDropdownMenu);
        select.selectByIndex(1);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Show Comment kisminda yeni bir secenek secilir.
        Select select1 = new Select(admin.editBlogShowCommentDropdownMenu);
        select1.selectByIndex(1);

        //Update butonuna tiklanir.
        admin.editBlogUpdateButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //"Blog is updated successfully!" yazisinin görünürlügü dogrulanir.
        Assert.assertTrue(admin.addBlogSuccessfulAlert.isDisplayed());
        ReusableMethods.wait(5);

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Sayfa yenilenir.
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(3);

        //Blog ismi SearchBox'da aratilir.
        admin.blogsSearchBox.clear();
        // 2 saniye bekler
        ReusableMethods.wait(2);
        admin.blogsSearchBox.sendKeys(ConfigReader.getProperty("editBlogTitle"),Keys.ENTER);
        ReusableMethods.wait(5 );

        //Silme butonuna tiklanir.
        admin.blogsActionDeleteButton.click();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        //Cikan Alert ekraninda "OK" secilir.
        Driver.getDriver().switchTo().alert().accept();

        // 2 saniye bekler
        ReusableMethods.wait(1);

        //Ekranda "Blog is deleted successfully!" yazisinin göründügü dogrulanir.

        Assert.assertTrue(admin.editBlogSuccessfulAlert.isDisplayed());
        Driver.closeDriver();
    }
}
