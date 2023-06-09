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

public class US_29 extends TestBaseRapor {

    @Test
    public void TC40(){


        //Sitenin admin giris kismina erisim saglanir.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        AdminDashboard admin = new AdminDashboard();

        //Acilan sayfada EMail adresi girilir.
        admin.adminEmailBox.sendKeys(ConfigReader.getProperty("admin02Email"), Keys.TAB);
        // Sifre girilir.
        admin.adminPasswordBox.sendKeys(ConfigReader.getProperty("adminPassword"));
        //"Login" butonuna tiklanir.
        admin.adminLoginButton.click();
        //"Admin Panel" yazisinin görülebildigi dogrulanir.
        WebElement adminPanel = Driver.getDriver().findElement(By.xpath("//div[text()='Admin Panel']"));
        Assert.assertTrue(adminPanel.isDisplayed());
    }

    @Test(dependsOnMethods = "TC40")
    public void TC41(){
        AdminDashboard admin = new AdminDashboard();

        //Blog Section kismina tiklanir.
        admin.adminPanelBlogSectionButton.click();

        //Blogs kismina tiklanir.
        admin.adminPanelBlogSectionBlogsButton.click();

        //Acilan sayfada "Add New" butonuna tiklanir.
        admin.blogSectionBlogsAddNewButton.click();

        //Blog Title kismi girilir.
        admin.blogsBlogTitleBox.sendKeys(ConfigReader.getProperty("addBlogTitle"));

        //Blog Content kismi girilir.
        admin.addBlogBlogContentTextarea.sendKeys(ConfigReader.getProperty("addBlogContent"));

        //Blog Short Content kismi girilir.
        admin.addBlogBlogShortContentBox.sendKeys(ConfigReader.getProperty("addBlogShortContent"));

        //Blog Photo kismindan fotograf eklenir.
        String herkesdeFarkli = System.getProperty("user.dir");
        String dosyaYolu= herkesdeFarkli+ConfigReader.getProperty("BochumPhotoHerkesteAyniOlanKisim");
        admin.addBlogPhotoButton.sendKeys(dosyaYolu);

        //Select Category dropbox'undan uygun secenek secilir.
        Select select = new Select(admin.addBlogSelectCategoryDropdownMenu);
        select.selectByIndex(0);

        //Show Comment dropbox'undan uygun secenek secilir.
        Select select1 = new Select(admin.addBlogShowCommentDropdownMenu);
        select1.selectByIndex(0);

        //"Submit" butonuna tiklanir.
        admin.addBlogSubmitButton.click();

        //"Blog is added successfully!" mesajinin görüntülendigi dogrulanir.
        ReusableMethods.wait(3);
        Assert.assertTrue(admin.addBlogSuccessfulAlert.isDisplayed());
    }

    @Test(dependsOnMethods = "TC41")
    public void TC42(){
        AdminDashboard admin = new AdminDashboard();

        //Blog ismi searchBox'da aratilir.
        admin.blogsSearchBox.clear();
        admin.blogsSearchBox.sendKeys(ConfigReader.getProperty("addBlogTitle"),Keys.ENTER);
        ReusableMethods.wait(2);

        //Blog düzenleme butonuna tiklanir.
        admin.blogsActionEditButton.click();

        //Blog Title kisminda degisiklikler yapilir.
        admin.editBlogBlogTitleBox.clear();
        admin.editBlogBlogTitleBox.sendKeys(ConfigReader.getProperty("editBlogTitle"));
        ReusableMethods.wait(2);

        //Blog Content kisminda degisiklikler yapilir.
        admin.editBlogBlogContentBox.clear();
        admin.editBlogBlogContentBox.sendKeys(ConfigReader.getProperty("editBlogContent"));
        ReusableMethods.wait(2);

        //Blog Short Content kisminda degisiklikler yapilir.
        admin.editBlogBlogShortContentBox.clear();
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

        //Show Comment kisminda yeni bir secenek secilir.
        Select select1 = new Select(admin.editBlogShowCommentDropdownMenu);
        select1.selectByIndex(1);

        //Update butonuna tiklanir.
        admin.editBlogUpdateButton.click();

        //"Blog is updated successfully!" yazisinin görünürlügü dogrulanir.
        Assert.assertTrue(admin.addBlogSuccessfulAlert.isDisplayed());
        ReusableMethods.wait(5);

        //Sayfa yenilenir.
        Driver.getDriver().navigate().refresh();
        ReusableMethods.wait(5);

        //Blog ismi SearchBox'da aratilir.
        admin.blogsSearchBox.clear();
        admin.blogsSearchBox.sendKeys(ConfigReader.getProperty("editBlogTitle"),Keys.ENTER);
        ReusableMethods.wait(5 );

        //Silme butonuna tiklanir.
        admin.blogsActionDeleteButton.click();

        //Cikan Alert ekraninda "OK" secilir.
        Driver.getDriver().switchTo().alert().accept();

        //Ekranda "Blog is deleted successfully!" yazisinin göründügü dogrulanir.
        ReusableMethods.wait(2);
        Assert.assertTrue(admin.editBlogSuccessfulAlert.isDisplayed());
        Driver.closeDriver();
    }
}
