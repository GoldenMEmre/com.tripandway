

package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class UserHomepage {

    public UserHomepage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // cookies accept
    @FindBy(xpath = "//button[@class='wpcc-btn']")
    public WebElement cookiesAcceptButton;

    // Header iletisim bilgileri
    @FindBy(xpath = "//div[@class='top-header-left']")
    public WebElement headerConnection;

    // Header Registration Button and Login Button
    @FindBy(xpath = "//div[@class='top-header-right']")
    public WebElement headerRegAndLog;

    //Anasayfa registration button
    @FindBy(xpath = "//*[text()='Registration']")
    WebElement registrationLink;


    // Anasayfa login button
    @FindBy(xpath = "//*[text()='Login']")
    public WebElement loginLink;

    // Header Logo
    @FindBy(xpath = "//div[@class='logo']")
    public WebElement headerLogo;




    // Menu item Home
    @FindBy(xpath = "(//*[@id='menu']//li)[1]")
    public WebElement menuHome;

    // Menu item Services
    @FindBy(xpath = "(//*[@id='menu']//li)[2]")
    public WebElement menuServices;

    // Menu item Destinations
    @FindBy(xpath = "(//*[@id='menu']//li)[3]")
    public WebElement menuDestinations;

    // Menu item Packages
    @FindBy(xpath = "(//*[@id='menu']//li)[4]")
    public WebElement menuPackages;

    // Menu item About Us
    @FindBy(xpath = "(//*[@id='menu']//li)[5]")
    public WebElement menuAboutus;

    // Menu item FAQ
    @FindBy(xpath = "(//*[@id='menu']//li)[6]")
    public WebElement menuFaq;

    // Menu item Blog
    @FindBy(xpath = "(//*[@id='menu']//li)[7]")
    public WebElement menuBlog;

    // Menu item Contact
    @FindBy(xpath = "(//*[@id='menu']//li)[8]")
    public WebElement menuContact;






    // Body Slider Item
    @FindBy(xpath = "(//div[@class='slider-bg'])[5]")
    public WebElement sliderItem;

    // Slider Item Next Button
    @FindBy(xpath = "(//*[@class='owl-next'])[1]")
    public WebElement sliderItemNext;

    // Slider Item Previous Button
    @FindBy(xpath = "(//*[@class='owl-prev'])[1]")
    public WebElement sliderItemPrev;

    // Slider Item Read More Button
    @FindBy(xpath = "(//*[text()='Read More'])[1]")
    public WebElement sliderItemReadmore;






    // Body Item Our Services
    @FindBy(xpath = "(//div[@class='headline'])[1]")
    public WebElement bodyOurServices;


    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[1]")
    public WebElement bodyOurServicesFirstItem;

    // Body Item Our Services Advantage Tour
    @FindBy(xpath = "(//h4)[2]")
    public WebElement bodyOurServicesSecondItem;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[3]")
    public WebElement bodyOurServicesFirstItem1;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[4]")
    public WebElement bodyOurServicesFirstItem2;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[5]")
    public WebElement bodyOurServicesFirstItem3;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[6]")
    public WebElement bodyOurServicesFirstItem4;






    @FindBy(xpath = "(//div[@class='headline'])[2]")
    public WebElement bodyFeaturedPackages;


    @FindBy(xpath = "(//h4)[7]")
    public WebElement bodyFeaturedPackagesfirstItem;


    @FindBy(xpath = "(//h4)[8]")
    public WebElement bodyFeaturedPackagesfirstItem1;


    @FindBy(xpath = "(//h4)[9]")
    public WebElement bodyFeaturedPackagesfirstItem2;


    @FindBy(xpath = "(//h4)[10]")
    public WebElement bodyFeaturedPackagesfirstItem3;





    @FindBy(xpath = "//div[@class='bg-counterup']")
    public WebElement bodyCounter;







    @FindBy(xpath = "(//div[@class='headline'])[3]")
    public WebElement bodyDestination;


    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement bodyDestinationBangkok;


    @FindBy(xpath = "(//a[@class='magnific'])[1]")
    public WebElement bodyDestinationBangkokBuyutme;


    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement bodyDestinationBangkok1;


    @FindBy(xpath = "(//a[@class='magnific'])[2]")
    public WebElement bodyDestinationBangkokBuyutme1;


    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement bodyDestinationBangkok2;


    @FindBy(xpath = "(//a[@class='magnific'])[3]")
    public WebElement bodyDestinationBangkokBuyutme2;


    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement bodyDestinationBangkok3;


    @FindBy(xpath = "(//a[@class='magnific'])[4]")
    public WebElement bodyDestinationBangkokBuyutme3;


    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement bodyDestinationBangkok4;


    @FindBy(xpath = "(//a[@class='magnific'])[5]")
    public WebElement bodyDestinationBangkokBuyutme4;


    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement bodyDestinationBangkok5;


    @FindBy(xpath = "(//a[@class='magnific'])[6]")
    public WebElement bodyDestinationBangkokBuyutme5;


    @FindBy(xpath = "//*[text()='See All Destinations']")
    public WebElement seeall;












    @FindBy(xpath = "(//div[@class='headline'])[4]")
    public WebElement bodyTeamMembers;

    // member1
    @FindBy(xpath = "(//div[@class='team-photo'])[5]")
    public WebElement bodyTeamMembers1;


    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[1]")
    public WebElement bodyTeamMembers1facebook;


    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[2]")
    public WebElement bodyTeamMembers1facebook1;


    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[3]")
    public WebElement bodyTeamMembers1facebook2;



    // member2
    @FindBy(xpath = "(//div[@class='team-photo'])[6]")
    public WebElement bodyTeamMembers2;


    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[1]")
    public WebElement bodyTeamMembers2facebook;


    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[2]")
    public WebElement bodyTeamMembers2facebook1;


    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[3]")
    public WebElement bodyTeamMembers2facebook2;



    // member3
    @FindBy(xpath = "(//div[@class='team-photo'])[7]")
    public WebElement bodyTeamMembers3;


    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[1]")
    public WebElement bodyTeamMembers3facebook;


    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[2]")
    public WebElement bodyTeamMembers3facebook1;


    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[3]")
    public WebElement bodyTeamMembers3facebook2;


    // member4
    @FindBy(xpath = "(//div[@class='team-photo'])[8]")
    public WebElement bodyTeamMembers4;


    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[1]")
    public WebElement bodyTeamMembers4facebook;


    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[2]")
    public WebElement bodyTeamMembers4facebook1;


    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[3]")
    public WebElement bodyTeamMembers4facebook2;








    @FindBy(xpath = "(//div[@class='headline'])[5]")
    public WebElement bodyTestimonial;


    @FindBy(xpath = "((//div[@class='owl-dots'])[3]//div[1]")
    public WebElement bodyTestimonial1;


    @FindBy(xpath = "((//div[@class='owl-dots'])[3]//div[2]")
    public WebElement bodyTestimonial2;


    @FindBy(xpath = "(//div[@class='owl-dots'])[3]//div[3]")
    public WebElement bodyTestimonial3;


    @FindBy(xpath = "(//div[@class='owl-dots'])[3]//div[4]")
    public WebElement bodyTestimonial4;








    @FindBy(xpath = "(//div[@class='headline'])[6]")
    public WebElement bodyLatestblog;


    @FindBy(xpath = " (//div[@class='blog-image'])[4]")
    public WebElement bodyLatestblog1;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin

    @FindBy(xpath = " (//div[@class='blog-image'])[5]")
    public WebElement bodyLatestblog2;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin


    @FindBy(xpath = " (//div[@class='blog-image'])[6]")
    public WebElement bodyLatestblog3;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin


    @FindBy(xpath = " (//div[@class='blog-image'])[7]")
    public WebElement bodyLatestblog4;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin


    @FindBy(xpath = " (//div[@class='blog-image'])[8]")
    public WebElement bodyLatestblog5;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin


    @FindBy(xpath = " (//div[@class='blog-image'])[9]")
    public WebElement bodyLatestblog6;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin





    @FindBy(xpath = "(//div[@class='headline'])[7]")
    public WebElement bodyOurClint;






    @FindBy(xpath = "(//div[@class='headline'])[8]")
    public WebElement bodyNewsletter;


    @FindBy(xpath = "//input[@name='subs_email']")
    public WebElement bodyNewsletterEmail;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement bodyNewsletterSubmit;





    @FindBy(xpath = "//*[text()='Featured Packages']")
    public WebElement footerFeaturedPackages;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[1]")
    public WebElement footerFeaturedPackages1;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[2]")
    public WebElement footerFeaturedPackages2;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[3]")
    public WebElement footerFeaturedPackages3;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[1]")
    public WebElement footerFeaturedPackages4;





    // **********************OGUNNNNNNNN************************

    @FindBy(xpath = "//*[text()='Latest Packages']")
    public WebElement footerLatestPackages;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[2]//ul//li[1]")
    public WebElement footerLatestPackages1;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[2]//ul//li[2]")
    public WebElement footerLatestPackages2;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[2]//ul//li[3]")
    public WebElement footerLatestPackages3;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[2]//ul//li[4]")
    public WebElement footerLatestPackages4;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[2]//ul//li[5]")
    public WebElement footerLatestPackages5;



    @FindBy(xpath = "//*[text()='Recent Posts']")
    public WebElement footerRecentPosts;

    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[3]//ul//li[1]")
    public WebElement footerRecentPosts1;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[3]//ul//li[2]")
    public WebElement footerRecentPosts2;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[3]//ul//li[3]")
    public WebElement footerRecentPosts3;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[3]//ul//li[4]")
    public WebElement footerRecentPosts4;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[3]//ul//li[5]")
    public WebElement footerRecentPosts5;



    //*********** MUHAMMET *****************


    @FindBy(xpath = "//ul[@class='footer-social']")
    public WebElement footerAddressSocial;


    @FindBy(xpath = "(//a[@target='_blank'])[38]")
    public WebElement footerAddressSocialFacebook;


    @FindBy(xpath = "(//a[@target='_blank'])[39]")
    public WebElement footerAddressSocialTwitter;


    @FindBy(xpath = "(//a[@target='_blank'])[40]")
    public WebElement footerAddressSocialLinkedIn;


    @FindBy(xpath = "(//a[@target='_blank'])[41]")
    public WebElement footerAddressSocialPinterest;


    @FindBy(xpath = "(//a[@target='_blank'])[41]")
    public WebElement footerAddressSocialInstagram;




    // +++++++++ Burkay ++++++++++++++

    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[4]")
    public WebElement footerAddress;

    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement newsletterSubmitAlert;


    // ++++++++++++ Filik *******************

    //Footer'daki 'Terms and Conditions'
    @FindBy(xpath = "//*[text()='Terms and Conditions']")
    public WebElement footerTermsAndConditions;

    //'Terms and Conditions' sayfa basligi
    @FindBy(tagName = "h1")
    public WebElement termsAndConditionsTitle;

    //Footer'daki 'Privacy Policy'
    @FindBy(xpath = "//*[text()='Privacy Policy']")
    public WebElement footerPrivacyPolicy;

    //'Privacy Policy' sayfa basligi
    @FindBy(tagName = "h1")
    public WebElement privacyPolicyTitle;


    // ************* OGUNNNN ***************

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[1]")
    public WebElement servicesFirstItem;

    // Body Item Our Services Advantage Tour
    @FindBy(xpath = "(//h4)[2]")
    public WebElement servicesSecondItem;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[3]")
    public WebElement servicesFirstItem1;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[4]")
    public WebElement servicesFirstItem2;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[5]")
    public WebElement servicesFirstItem3;

    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[6]")
    public WebElement servicesFirstItem4;


    @FindBy(xpath = "//img")
    public List<WebElement> destinationsList;


    @FindBy(xpath = "//h1")
    public WebElement packagesTitle;


    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement packagesPhotoTitle1;


    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement packagesPhotoTitle2;


    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement packagesPhotoTitle3;


    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement packagesPhotoTitle4;

    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement packagesPhotoTitle5;


    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement packagesPhotoTitle6;


    @FindBy(xpath = "(//div[@class='photo-title'])[7]")
    public WebElement packagesPhotoTitle7;


    @FindBy(xpath = "(//div[@class='photo-title'])[8]")
    public WebElement packagesPhotoTitle8;


    @FindBy(xpath = "(//div[@class='photo-title'])[9]")
    public WebElement packagesPhotoTitle9;


    @FindBy(xpath = "//*[text()='OUR MISSION']")
    public WebElement aboutusTextTitle;


    @FindBy(xpath = "//*[text()='OUR VISION']")
    public WebElement aboutusTextTitle1;


    @FindBy(tagName = "h1")
    public WebElement faqTitle;


    @FindBy(tagName = "h1")
    public WebElement contactTitle;


    @FindBy(xpath = "//input[@name='traveller_name']")
    public WebElement registrationNameBox;

    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement registrationEmailBox;

    @FindBy(xpath = "//input[@name='traveller_password']")
    public WebElement registrationPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement registrationSubmitButton;


    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement loginEmailBox;


    @FindBy(xpath = "//input[@name='traveller_password']")
    public WebElement loginPasswordBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSubmitButton;


















    // login email kutussu


    @FindBy(xpath = "//button[@name='form1']")
    public WebElement girisLoginButtonu;


    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[4]")
    public WebElement addressElement;

    @FindBy(xpath = "//a[@target='_blank'])[38]")
    public WebElement adressFacebookButton;


    @FindBy(xpath = "(//a[@target='_blank'])[39]")
    public WebElement adressTwitterButton;


    //Registration Name Textbox

    //Home--> Destination/Bangkok experience
}

