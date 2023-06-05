package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_01_Home {

    @Test
    public void Test01() {

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        //Cookies kabul edilir
        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();

        //HOME ogesi locate edilir
        WebElement homeTitle= Driver.getDriver().findElement(By.xpath("(//a[@href='https://qa.tripandway.com'])[3]"));

        //Home basliginin gorunur oldugu test edilir
        String expectedTitle = "HOME";
        String actualTitle = homeTitle.getText();
        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertTrue(homeTitle.isDisplayed());

        // Driver kapatilir
        Driver.closeDriver();
    }

}

