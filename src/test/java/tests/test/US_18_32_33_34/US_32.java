package tests.test.US_18_32_33_34;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_32 {

    @Test
    public void TC01(){
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

    }
}
