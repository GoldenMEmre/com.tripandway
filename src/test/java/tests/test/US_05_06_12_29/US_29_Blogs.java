package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;

public class US_29_Blogs {

    @Test
    public void TC_40(){

        //Sitenin admin giris kismina erisim saglanir.
        Driver.getDriver().get("https://qa.tripandway.com/admin/login");
        AdminDashboard admin = new AdminDashboard();

        //Acilan sayfada EMail adresi girilir.
        admin.adminEmailBox.sendKeys("admin02@tripandway.com", Keys.TAB);
        // Sifre girilir.
        admin.adminPasswordBox.sendKeys("123123123");
        //"Login" butonuna tiklanir.
        admin.adminLoginButton.click();
    }

    @Test(dependsOnMethods = "TC_40")
    public void TC_41(){
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
        Assert.assertTrue(admin.addBlogSuccessfulAlert.isDisplayed());
    }

    @Test(dependsOnMethods = "TC_41")
    public void TC_42(){
        AdminDashboard admin = new AdminDashboard();
        WebElement previous1 = Driver.getDriver().findElement(By.xpath("//*[@id='dataTable_previous']"));

        //Sayfanin en alt kismina inilir.
        JSUtilities.scrollToElement(Driver.getDriver(),previous1);

        //Blog düzenleme butonuna tiklanir.
        admin.blogsActionEditButton.click();

        //Blog Title kisminda degisiklikler yapilir.
        admin.editBlogBlogTitleBox.sendKeys(ConfigReader.getProperty("editBlogTitle"));

        //Blog Content kisminda degisiklikler yapilir.
        admin.editBlogBlogContentBox.sendKeys(ConfigReader.getProperty("editBlogContent"));

        //Blog Short Content kisminda degisiklikler yapilir.
        admin.editBlogBlogShortContentBox.sendKeys(ConfigReader.getProperty("editBlogShortContent"));

        //Yeni bir resim eklenir.
        String herkesteFarkli = System.getProperty("user.dir");
        String dosyaYolu = herkesteFarkli+ConfigReader.getProperty("HernePhotoHerkesteAyniOlanKisim");
        admin.editBlogPhotoButton.sendKeys(dosyaYolu);

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

        //Sayfanin en alt kismina gelinir.
        JSUtilities.scrollToElement(Driver.getDriver(),previous1);

        //Silme butonuna tiklanir.
        admin.blogsActionDeleteButton.click();

        //Cikan Alert ekraninda "OK" secilir.
        Driver.getDriver().switchTo().alert().accept();

        //Ekranda "Blog is deleted successfully!" yazisinin göründügü dogrulanir.
        Assert.assertTrue(admin.editBlogSuccessfulAlert.isDisplayed());

    }
}
