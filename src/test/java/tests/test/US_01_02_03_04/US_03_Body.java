package tests.test.US_01_02_03_04;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserHomepage;
import utilities.*;

public class US_03_Body extends TestBaseRapor {

    @Test
    public void TC03() {

        // https://qa.tripandway.com/ adresine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("tripUrl"));

        //Cookies kabul edilir
        UserHomepage userHomepage = new UserHomepage();
        userHomepage.cookiesAcceptButton.click();

        //Body bolumundeki slider ile previous, next ve read more butonlarinin gorunur ve aktif olduğu test edilir
        ReusableMethods.waitForVisibility(userHomepage.sliderItem,5);
        Assert.assertTrue(userHomepage.sliderItem.isDisplayed());
        Assert.assertTrue(userHomepage.sliderItemPrev.isDisplayed());
        Assert.assertTrue(userHomepage.sliderItemPrev.isEnabled());
        Assert.assertTrue(userHomepage.sliderItemNext.isDisplayed());
        Assert.assertTrue(userHomepage.sliderItemNext.isEnabled());

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();
        ReusableMethods.wait(5);
        WebElement bodyMiddleButton = Driver.getDriver().findElement(By.xpath("(//div[@class='owl-dot'])[1]"));
        bodyMiddleButton.click();
        ReusableMethods.wait(5);

        String readMoreExpectedText="READ MORE";
        String readMoreActualText= userHomepage.sliderItemReadmore.getText();
        ReusableMethods.wait(5);
        Assert.assertEquals(readMoreActualText,readMoreExpectedText);
        ReusableMethods.wait(5);
        Assert.assertTrue(userHomepage.sliderItemReadmore.isEnabled());

        //Scroll yardımıyla body'deki our services basligina gidilir
        //JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.bodyOurServices);

        ReusableMethods.wait(5);
        //Body bolumundeki our services basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String ourServicesExpectedText = "OUR SERVICES";
        String ourServicesActualText = userHomepage.bodyOurServices.getText();
        ReusableMethods.wait(5);
        Assert.assertEquals(ourServicesActualText, ourServicesExpectedText);
        Assert.assertTrue(userHomepage.bodyOurServices.isDisplayed());

        //Assert.assertTrue(userHomepage.bodyOurServicesFirstItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesFirstItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyOurServicesSecondItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesSecondItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyOurServicesThirdItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesThirdItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyOurServicesFourthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesFourthItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyOurServicesFifthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesFifthItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyOurServicesSixthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurServicesSixthItem.isEnabled());

        //Scroll yardımıyla body'deki Featured Packages basligina gidilir
        JSUtilities.scrollToElement(Driver.getDriver(),userHomepage.bodyFeaturedPackagesTitle);

        //Body bolumundeki featured packages basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String featuredPackagesExpectedText = "FEATURED PACKAGES";
        ReusableMethods.wait(3);

        String featuredPackagesActualText = userHomepage.bodyFeaturedPackagesTitle.getText();
        Assert.assertEquals(featuredPackagesActualText, featuredPackagesExpectedText);
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesTitle.isDisplayed());

        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.DOWN).perform();

        userHomepage.bodyFeaturedPackagesLeftButton.click();

        ReusableMethods.wait(1);

        Assert.assertTrue(userHomepage.bodyFeaturedPackagesFirstItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesFirstItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesSecondItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesSecondItem.isEnabled());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesThirdItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesThirdItem.isEnabled());

        userHomepage.bodyFeaturedPackagesRightButton.click();

        ReusableMethods.wait(1);

        Assert.assertTrue(userHomepage.bodyFeaturedPackagesFourthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyFeaturedPackagesFourthItem.isEnabled());

        //Body bolumundeki sayisal bilgilerin gorunur oldugu test edilir
        Assert.assertTrue(userHomepage.bodyCounter.isDisplayed());

        //Body bolumundeki destination basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String destinationExpectedTitle = "DESTINATION";
        String destinationActualTitle = userHomepage.bodyDestinationTitle.getText();
        Assert.assertEquals(destinationActualTitle, destinationExpectedTitle);
        Assert.assertTrue(userHomepage.bodyDestinationTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyDestinationFirstItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationFirstItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationSecondItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationSecondItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationThirdItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationThirdItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationFourthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationFourthItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationFifthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationFifthItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationSixthItem.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationSixthItemMagnify.isEnabled());
        Assert.assertTrue(userHomepage.bodyDestinationSeeAllDestinations.isDisplayed());
        Assert.assertTrue(userHomepage.bodyDestinationSeeAllDestinations.isEnabled());

        //Body bolumundeki team members basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String teamMembersExpectedText = "TEAM MEMBERS";
        String teamMembersActualText = userHomepage.bodyTeamMembersTitle.getText();
        Assert.assertEquals(teamMembersActualText, teamMembersExpectedText);
        Assert.assertTrue(userHomepage.bodyTeamMembersTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyTeamMember1Photo.isDisplayed());
        Assert.assertTrue(userHomepage.bodyTeamMember1FacebookLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember1TwitterLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember1InstagramLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember1DetailLink.isEnabled());

        Assert.assertTrue(userHomepage.bodyTeamMember2Photo.isDisplayed());
        Assert.assertTrue(userHomepage.bodyTeamMember2FacebookLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember2TwitterLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember2InstagramLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember2DetailLink.isEnabled());

        Assert.assertTrue(userHomepage.bodyTeamMember3Photo.isDisplayed());
        Assert.assertTrue(userHomepage.bodyTeamMember3FacebookLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember3TwitterLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember3InstagramLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember3DetailLink.isEnabled());

        Assert.assertTrue(userHomepage.bodyTeamMember4Photo.isDisplayed());
        Assert.assertTrue(userHomepage.bodyTeamMember4FacebookLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember4TwitterLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember4InstagramLink.isEnabled());
        Assert.assertTrue(userHomepage.bodyTeamMember4DetailLink.isEnabled());

        //Body bolumundeki testimonial basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String testimonialExpectedTitle = "TESTIMONIAL";
        String testimonialActualTitle = userHomepage.bodyTestimonialTitle.getText();
        Assert.assertEquals(testimonialActualTitle, testimonialExpectedTitle);
        Assert.assertTrue(userHomepage.bodyTestimonialTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyTestimonial1.isEnabled());
        Assert.assertTrue(userHomepage.bodyTestimonial2.isEnabled());
        Assert.assertTrue(userHomepage.bodyTestimonial3.isEnabled());
        Assert.assertTrue(userHomepage.bodyTestimonial4.isEnabled());

        //Body bolumundeki latest blog basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String latestBlogExpectedTitle = "LATEST BLOG";
        String latestBlogActualTitle = userHomepage.bodyLatestBlogTitle.getText();
        Assert.assertEquals(latestBlogActualTitle, latestBlogExpectedTitle);
        Assert.assertTrue(userHomepage.bodyLatestBlogTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyLatestBlog1Link.isEnabled());
        Assert.assertTrue(userHomepage.bodyLatestBlog2Link.isEnabled());
        Assert.assertTrue(userHomepage.bodyLatestBlog3Link.isEnabled());
        Assert.assertTrue(userHomepage.bodyLatestBlog4Link.isEnabled());
        Assert.assertTrue(userHomepage.bodyLatestBlog5Link.isEnabled());
        Assert.assertTrue(userHomepage.bodyLatestBlog6Link.isEnabled());

        //Body bolumundeki our client basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String ourClientExpectedTitle = "OUR CLIENT";
        String ourClientActualTitle = userHomepage.bodyOurClientTitle.getText();
        Assert.assertEquals(ourClientActualTitle, ourClientExpectedTitle);
        Assert.assertTrue(userHomepage.bodyOurClientTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyOurClientImage1.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage2.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage3.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage4.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage5.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage6.isDisplayed());
        Assert.assertTrue(userHomepage.bodyOurClientImage7.isDisplayed());

        //Body bolumundeki newsletter basligi ile bu baslik altindaki elementlerin gorunur ve aktif olduğu test edilir
        String newsletterExpectedTitle = "NEWSLETTER";
        String newsletterActualTitle = userHomepage.bodyNewsletterTitle.getText();
        Assert.assertEquals(newsletterActualTitle, newsletterExpectedTitle);
        Assert.assertTrue(userHomepage.bodyNewsletterTitle.isDisplayed());

        Assert.assertTrue(userHomepage.bodyNewsletterEmailBox.isDisplayed());
        Assert.assertTrue(userHomepage.bodyNewsletterSubmitButton.isEnabled());

        // Driver kapatilir
        Driver.closeDriver();





    }
}
