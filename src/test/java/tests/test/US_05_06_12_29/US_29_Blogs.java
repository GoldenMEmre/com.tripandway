package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AdminDashboard;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;

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


        //Select Category dropbox'undan uygun secenek secilir.

        //Show Comment dropbox'undan uygun secenek secilir.

        //"Submit" butonuna tiklanir.

    }

}
