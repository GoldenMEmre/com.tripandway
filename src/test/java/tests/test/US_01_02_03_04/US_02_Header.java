package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_02_Header extends TestBaseRapor {

    @Test
    public void TC02 (){

        extentTest = extentReports.createTest("Header Test", "Header kismindaki menu butonlari gorunur ve aktif olmali");

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Cookies kabul edilir
        UserHomepage userHomepage = new UserHomepage();

        // 2 saniye bekler
        ReusableMethods.wait(2);

        userHomepage.cookiesAcceptButton.click();



        // 2 saniye bekler
        ReusableMethods.wait(4);

        //Header bolumundeki iletişim bilgilerinin gorunur oldugu test edilir
        Assert.assertTrue(userHomepage.headerConnection.isDisplayed());



        //Header bolumundeki registration ve login linklerinin gorunur ve aktif olduğu test edilir
        Assert.assertTrue(userHomepage.headerRegAndLog.isDisplayed());
        Assert.assertTrue(userHomepage.registrationLink.isDisplayed());
        Assert.assertTrue(userHomepage.registrationLink.isEnabled());
        Assert.assertTrue(userHomepage.loginLink.isDisplayed());
        Assert.assertTrue(userHomepage.loginLink.isEnabled());

        //Header bolumundeki logo linkinin gorunur ve aktif olduğu test edilir
        Assert.assertTrue(userHomepage.headerLogo.isDisplayed());
        Assert.assertTrue(userHomepage.headerLogo.isEnabled());

        //Header bolumundeki home linkinin gorunur ve aktif olduğu test edilir
        String homeExpectedText="HOME";
        String homeActualText = userHomepage.menuHome.getText();
        Assert.assertEquals(homeActualText,homeExpectedText);
        Assert.assertTrue(userHomepage.menuHome.isEnabled());

        //Header bolumundeki services linkinin gorunur ve aktif olduğu test edilir
        String servicesExpectedText="SERVICES";
        String servicesActualText = userHomepage.menuServices.getText();
        Assert.assertEquals(servicesActualText,servicesExpectedText);
        Assert.assertTrue(userHomepage.menuServices.isEnabled());

        //Header bolumundeki destinations linkinin gorunur ve aktif olduğu test edilir
        String destinationsExpectedText="DESTINATIONS";
        String destinationsActualText = userHomepage.menuDestinations.getText();
        Assert.assertEquals(destinationsActualText,destinationsExpectedText);
        Assert.assertTrue(userHomepage.menuDestinations.isEnabled());

        //Header bolumundeki packages linkinin gorunur ve aktif olduğu test edilir
        String packagesExpectedText="PACKAGES";
        String packagesActualText = userHomepage.menuPackages.getText();
        Assert.assertEquals(packagesActualText,packagesExpectedText);
        Assert.assertTrue(userHomepage.menuPackages.isEnabled());

        //Header bolumundeki about us linkinin gorunur ve aktif olduğu test edilir
        String aboutusExpectedText="ABOUT US";
        String aboutusActualText = userHomepage.menuAboutus.getText();
        Assert.assertEquals(aboutusActualText,aboutusExpectedText);
        Assert.assertTrue(userHomepage.menuAboutus.isEnabled());

        //Header bolumundeki faq linkinin gorunur ve aktif olduğu test edilir
        String faqExpectedText="FAQ";
        String faqActualText = userHomepage.menuFaq.getText();
        Assert.assertEquals(faqActualText,faqExpectedText);
        Assert.assertTrue(userHomepage.menuFaq.isEnabled());

        //Header bolumundeki blog linkinin gorunur ve aktif olduğu test edilir
        String blogExpectedText="BLOG";
        String blogActualText = userHomepage.menuBlog.getText();
        Assert.assertEquals(blogActualText,blogExpectedText);
        Assert.assertTrue(userHomepage.menuBlog.isEnabled());

        //Header bolumundeki contact linkinin gorunur ve aktif olduğu test edilir
        String contactExpectedText="CONTACT";
        String contactActualText = userHomepage.menuContact.getText();
        Assert.assertEquals(contactActualText,contactExpectedText);
        Assert.assertTrue(userHomepage.menuContact.isEnabled());

        extentTest.pass("TEST PASSED");

        // Driver kapatilir
        Driver.closeDriver();

    }
}

