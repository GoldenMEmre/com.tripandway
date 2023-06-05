package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_02_Header {

    @Test
    public void tc02 (){

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        //Cookies kabul edilir
        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();

    }
}

