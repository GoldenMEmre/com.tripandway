package tests.test.US_18_32_33_34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class US_18 {
    @Test
    public void TC_01() {
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        Driver.getDriver().findElement(By.xpath("//*[@type='button']")).click();  // cookies

        Driver.getDriver().findElement(By.xpath("//*[text()='Registration']")).click();  // registration buttonu

        WebElement nameRegElementi= Driver.getDriver().findElement(By.xpath("//*[@type='text'][1]"));
        nameRegElementi.sendKeys("svd");

        WebElement emailRegElementi= Driver.getDriver().findElement(By.xpath("//*[@type='email']"));
        emailRegElementi.sendKeys("svdbsk3232@gmail.com");

        WebElement passwordRegElementi= Driver.getDriver().findElement(By.xpath("//*[@type='password']"));
        passwordRegElementi.sendKeys("svdbsk3232@");

        WebElement makeRegElementi =Driver.getDriver().findElement(By.xpath("//*[@type='submit']"));
        makeRegElementi.click();

        Driver.closeDriver();

    }

    @Test
    public void TC_02(){
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        WebElement ilkLoginElement = Driver.getDriver().findElement(By.xpath("//*[text()='Login']"));
        ilkLoginElement.click();

        WebElement emailLogginElementi = Driver.getDriver().findElement(By.xpath("//*[@type='text'][1]"));
        emailLogginElementi.sendKeys("svdbsk3232@gmail.com");

        WebElement passwordLoginElement = Driver.getDriver().findElement(By.xpath("//*[@type='password']"));
        passwordLoginElement.sendKeys("svdbsk3232@");

        WebElement ikinciLoginElementi = Driver.getDriver().findElement(By.xpath("//*[@type='submit'][1]"));
        ikinciLoginElementi.click();

        WebElement updatePasswordElement = Driver.getDriver().findElement(By.xpath("//*[text()='Update Profile']"));
        Assert.assertTrue(updatePasswordElement.isDisplayed());

        Driver.closeDriver();

    }

}
