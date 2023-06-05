package tests.test.US_07_13_37_38_39;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.JSUtilities;

public class iki {



    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        JSUtilities.scrollToBottom(Driver.getDriver());
    }

}
