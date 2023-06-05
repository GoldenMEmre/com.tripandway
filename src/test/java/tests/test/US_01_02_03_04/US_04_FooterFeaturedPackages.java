package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;

import static utilities.Driver.driver;

public class US_04_FooterFeaturedPackages {

    @Test
    public void TC04() throws InterruptedException {

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        //Cookies kabul edilir
        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();

        //Features Packages ogesi locate edilir
        WebElement featuredPackagesText = Driver.getDriver().findElement(By.xpath("//*[text()='Featured Packages']"));
        //Scroll yardımıyla Footer'a gidilir
        JSUtilities.scrollToElement(driver,featuredPackagesText);
        // 5 saniye beklenir
        Thread.sleep(5000);
        //Features Packages'in gorunur oldugu test edilir
        String expectedText="Featured Packages";
        String actualText = featuredPackagesText.getText();
        Assert.assertEquals(expectedText,actualText);
        Assert.assertTrue(featuredPackagesText.isDisplayed());

        // Featured Packages'in 1. ogesi locate edilir
        WebElement element1 = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[1]//ul//li[1]"));
        //1. ogenin active oldugu test edilir
        Assert.assertTrue(element1.isEnabled());

        // Featured Packages'in 2. ogesi locate edilir
        WebElement element2 = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[1]//ul//li[2]"));
        //2. ogenin active oldugu test edilir
        Assert.assertTrue(element2.isEnabled());

        // Featured Packages'in 3. ogesi locate edilir
        WebElement element3 = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[1]//ul//li[3]"));
        // 3. ogenin active oldugu test edilir
        Assert.assertTrue(element3.isEnabled());

        // Featured Packages'in 4. ogesi locate edilir
        WebElement element4 = Driver.getDriver().findElement(By.xpath("(//div[@class='footer-item mt_30'])[1]//ul//li[4]"));
        // 4. ogenin active oldugu test edilir
        Assert.assertTrue(element4.isEnabled());

        // Driver kapatilir
        Driver.closeDriver();

    }



    }



