package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.JSUtilities;

import static utilities.Driver.driver;

public class US_05 {

    @Test
    public void TC_05(){
        Driver.getDriver().get("https://qa.tripandway.com/");
        WebElement label1 = Driver.getDriver().findElement(By.xpath("//*[text()='Latest Packages']"));
        JSUtilities.scrollToElement(driver,label1);
        WebElement link1 = Driver.getDriver().findElement(By.linkText("5 Day California"));
        Assert.assertTrue(link1.isDisplayed());
        Assert.assertTrue(link1.isEnabled());

        WebElement link2 = Driver.getDriver().findElement(By.xpath("(//*[text()='7 days in Salina Island'])[3]"));
        Assert.assertTrue(link2.isDisplayed());
        Assert.assertTrue(link2.isEnabled());

        WebElement link3 = Driver.getDriver().findElement(By.xpath("(//*[text()='3 days in Bangkok'])[3]"));
        Assert.assertTrue(link3.isDisplayed());
        Assert.assertTrue(link3.isEnabled());

        WebElement link4 = Driver.getDriver().findElement(By.xpath("//*[text()='7 days in Istanbul']"));
        Assert.assertTrue(link4.isDisplayed());
        Assert.assertTrue(link4.isEnabled());

        WebElement link5 = Driver.getDriver().findElement(By.xpath("(//*[text()='10 days in Buenos Aires'])[3]"));
        Assert.assertTrue(link5.isDisplayed());
        Assert.assertTrue(link5.isEnabled());

        Driver.closeDriver();
    }
}
