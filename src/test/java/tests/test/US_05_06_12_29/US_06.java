package tests.test.US_05_06_12_29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.JSUtilities;
import utilities.ReusableMethods;

import static utilities.Driver.driver;

public class US_06 {

    @Test
    public void TC_06() throws InterruptedException {
        Driver.getDriver().get("https://qa.tripandway.com/");
        WebElement label1 = Driver.getDriver().findElement(By.xpath("//*[text()='Recent Posts']"));
        JSUtilities.scrollToElement(driver, label1);
        ReusableMethods.waitFor(3);
        WebElement link1 = Driver.getDriver().findElement(By.xpath("(//*[text()='Discovering Greenville: A Hidden Gem in South Carolina'])[3]"));
        Assert.assertTrue(link1.isDisplayed());
        Assert.assertTrue(link1.isEnabled());

        WebElement link2 = Driver.getDriver().findElement(By.xpath("(//*[text()='Buenos Aires: The Paris of South America'])[3]"));
        Assert.assertTrue(link2.isDisplayed());
        Assert.assertTrue(link2.isEnabled());

        WebElement link3 = Driver.getDriver().findElement(By.xpath("(//*[text()='Bangkok: A City of Contrasts'])[3]"));
        Assert.assertTrue(link3.isDisplayed());
        Assert.assertTrue(link3.isEnabled());

        WebElement link4 = Driver.getDriver().findElement(By.xpath("(//*[text()='Salina Island: A Perfect Family Getaway'])[3]"));
        Assert.assertTrue(link4.isDisplayed());
        Assert.assertTrue(link4.isEnabled());

        WebElement link5 = Driver.getDriver().findElement(By.linkText("Discovering the Ancient Capital of the Hittites: Bogazkale and Hattusas"));
        Assert.assertTrue(link5.isDisplayed());
        Assert.assertTrue(link5.isEnabled());
    }
}
