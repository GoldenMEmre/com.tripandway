package tests.test.US_05_06_12_29;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_12 extends TestBaseRapor {

    @Test
    public void TC14(){
        //Siteye erisim saglanir.
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));
        UserHomepage userhomepage = new UserHomepage();

        //"Hizmetler" butonuna tiklanir.
        userhomepage.menuServices.click();

        //Sayfada 3. Elementin oldugu kisima kadar asagi inilir.
        JSUtilities.scrollToElement(Driver.getDriver(), userhomepage.bodyOurServicesThirdItem);
        ReusableMethods.wait(3);

        //1. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesFirstItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesFirstItem.isEnabled());

        //2. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesSecondItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesSecondItem.isEnabled());

        //3. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesThirdItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesThirdItem.isEnabled());

        //4. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesFourthItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesFourthItem.isEnabled());

        //5. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesFifthItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesFifthItem.isEnabled());

        //6. Ögenin görüntülenebilir ve aktif durumda oldugu test edilir.
        Assert.assertTrue(userhomepage.bodyOurServicesSixthItem.isDisplayed());
        Assert.assertTrue(userhomepage.bodyOurServicesSixthItem.isEnabled());

        Driver.closeDriver();
    }
}
