

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
    public WebElement registrationLink;


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






    // Body Item Slider
    @FindBy(xpath = "(//div[@class='slider-bg'])[5]")
    public WebElement sliderItem;

    // Slider Item Next Button
    @FindBy(xpath = "(//*[@class='owl-next'])[1]")
    public WebElement sliderItemNext;

    // Slider Item Previous Button
    @FindBy(xpath = "(//*[@class='owl-prev'])[1]")
    public WebElement sliderItemPrev;

    // Slider Item Read Read More Button
    @FindBy(xpath = "(//*[text()='Read More'])[1]")
    public WebElement sliderItemReadmore;






    // Body Title Our Services
    @FindBy(xpath = "(//div[@class='headline'])[1]")
    public WebElement bodyOurServices;


    // Body Item Our Services International Tour
    @FindBy(xpath = "(//h4)[1]")
    public WebElement bodyOurServicesFirstItem;

    // Body Item Our Services Advantage Tour
    @FindBy(xpath = "(//h4)[2]")
    public WebElement bodyOurServicesSecondItem;

    // Body Item Our Services Culture Tour
    @FindBy(xpath = "(//h4)[3]")
    public WebElement bodyOurServicesThirdItem;

    // Body Item Our Services Businness Tour
    @FindBy(xpath = "(//h4)[4]")
    public WebElement bodyOurServicesFourthItem;

    // Body Item Our Services Health Tour
    @FindBy(xpath = "(//h4)[5]")
    public WebElement bodyOurServicesFifthItem;

    // Body Item Our Services Religious Tour
    @FindBy(xpath = "(//h4)[6]")
    public WebElement bodyOurServicesSixthItem;





    // Body Title Featured Packages
    @FindBy(xpath = "(//div[@class='headline'])[2]")
    public WebElement bodyFeaturedPackages;

    //Featured Packages First Item
    @FindBy(xpath = "(//h4)[7]")
    public WebElement bodyFeaturedPackagesFirstItem;

    //Featured Packages Second Item
    @FindBy(xpath = "(//h4)[8]")
    public WebElement bodyFeaturedPackagesSecondItem;

    //Featured Packages Third Item
    @FindBy(xpath = "(//h4)[9]")
    public WebElement bodyFeaturedPackagesThirdItem;

    //Featured Packages Fourth Item
    @FindBy(xpath = "(//h4)[10]")
    public WebElement bodyFeaturedPackagesFourthItem;




    // Sayisal Bilgiler
    @FindBy(xpath = "//div[@class='bg-counterup']")
    public WebElement bodyCounter;






    //Body Destination Title
    @FindBy(xpath = "(//div[@class='headline'])[3]")
    public WebElement bodyTitleDestination;

    //Body Destination Item First
    @FindBy(xpath = "(//div[@class='photo-title'])[1]")
    public WebElement bodyDestinationFirstItem;

    //Body Destination Item First Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[1]")
    public WebElement bodyDestinationFirstItemMagnify;

    //Body Destination Item Second
    @FindBy(xpath = "(//div[@class='photo-title'])[2]")
    public WebElement bodyDestinationSecondItem;

    //Body Destination Item Second Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[2]")
    public WebElement bodyDestinationSecondItemMagnify;

    //Body Destination Item Third
    @FindBy(xpath = "(//div[@class='photo-title'])[3]")
    public WebElement bodyDestinationThirdItem;

    //Body Destination Item Third Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[3]")
    public WebElement bodyDestinationBangkokThirdItemMagnify;

    //Body Destination Item Fourth
    @FindBy(xpath = "(//div[@class='photo-title'])[4]")
    public WebElement bodyDestinationFourthItem;

    //Body Destination Item Fourth Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[4]")
    public WebElement bodyDestinationFourthItemMagnify;

    //Body Destination Item Fifth
    @FindBy(xpath = "(//div[@class='photo-title'])[5]")
    public WebElement bodyDestinationFifthItem;

    //Body Destination Item Fifth Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[5]")
    public WebElement bodyDestinationFifthItemMagnify;

    //Body Destination Item Sixth
    @FindBy(xpath = "(//div[@class='photo-title'])[6]")
    public WebElement bodyDestinationSixthItem;

    //Body Destination Item Sixth Buyutme
    @FindBy(xpath = "(//a[@class='magnific'])[6]")
    public WebElement bodyDestinationSixthItemMagnify;

    //Body Destination See All Destinations Item
    @FindBy(xpath = "//*[text()='See All Destinations']")
    public WebElement bodyDestinationSeeAllDestinations;











    //Body Team Members Title
    @FindBy(xpath = "(//div[@class='headline'])[4]")
    public WebElement bodyTeamMembersTitle;

    // member1 foto
    @FindBy(xpath = "(//div[@class='team-photo'])[5]")
    public WebElement bodyTeamMember1Photo;

    // member1 facebook link
    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[1]")
    public WebElement bodyTeamMember1FacebookLink;

    // member1 twitter link
    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[2]")
    public WebElement bodyTeamMemberTwitterLink;

    //member1 instagram link
    @FindBy(xpath = "(//div[@class='team-social'])[5]//ul//li[3]")
    public WebElement bodyTeamMember1InstagramLink;



    // member2 foto
    @FindBy(xpath = "(//div[@class='team-photo'])[6]")
    public WebElement bodyTeamMember2Photo;

    // member2 facebook link
    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[1]")
    public WebElement bodyTeamMember2FacebookLink;

    // member2 twitter link
    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[2]")
    public WebElement bodyTeamMember2TwitterLink;

    //member2 instagram link
    @FindBy(xpath = "(//div[@class='team-social'])[6]//ul//li[3]")
    public WebElement bodyTeamMember2InstagramLink;



    // member3 foto
    @FindBy(xpath = "(//div[@class='team-photo'])[7]")
    public WebElement bodyTeamMember3Photo;

    // member3 facebook link
    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[1]")
    public WebElement bodyTeamMember3FacebookLink;

    // member3 twitter link
    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[2]")
    public WebElement bodyTeamMember3TwitterLink;

    //member3 instagram link
    @FindBy(xpath = "(//div[@class='team-social'])[7]//ul//li[3]")
    public WebElement bodyTeamMember3InstagramLink;


    // member4 foto
    @FindBy(xpath = "(//div[@class='team-photo'])[8]")
    public WebElement bodyTeamMember4Photo;

    // member4 facebook link
    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[1]")
    public WebElement bodyTeamMember4FacebookLink;

    // member4 twitter link
    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[2]")
    public WebElement bodyTeamMember4TwitterLink;

    //member4 instagram link
    @FindBy(xpath = "(//div[@class='team-social'])[8]//ul//li[3]")
    public WebElement bodyTeamMember4InstagramLink;







    //Body Testimonial Title
    @FindBy(xpath = "(//div[@class='headline'])[5]")
    public WebElement bodyTestimonialTitle;

    // Body Testimonial1
    @FindBy(xpath = "((//div[@class='owl-dots'])[3]//div[1]")
    public WebElement bodyTestimonial1;

    // Body Testimonial2
    @FindBy(xpath = "((//div[@class='owl-dots'])[3]//div[2]")
    public WebElement bodyTestimonial2;

    // Body Testimonial3
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]//div[3]")
    public WebElement bodyTestimonial3;

    // // Body Testimonial4
    @FindBy(xpath = "(//div[@class='owl-dots'])[3]//div[4]")
    public WebElement bodyTestimonial4;







    //Body Latest Blog Title
    @FindBy(xpath = "(//div[@class='headline'])[6]")
    public WebElement bodyLatestBlogTitle;

    // Body Latest Blog 1
    @FindBy(xpath = " (//div[@class='blog-image'])[4]")
    public WebElement bodyLatestBlog1Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin
    // Body Latest Blog 2
    @FindBy(xpath = " (//div[@class='blog-image'])[5]")
    public WebElement bodyLatestBlog2Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin

    // Body Latest Blog 3
    @FindBy(xpath = " (//div[@class='blog-image'])[6]")
    public WebElement bodyLatestBlog3Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin

    // Body Latest Blog 4
    @FindBy(xpath = " (//div[@class='blog-image'])[7]")
    public WebElement bodyLatestBlog4Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin

    // Body Latest Blog 5
    @FindBy(xpath = " (//div[@class='blog-image'])[8]")
    public WebElement bodyLatestBlog5Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin

    // Body Latest Blog 6
    @FindBy(xpath = " (//div[@class='blog-image'])[9]")
    public WebElement bodyLatestBlog6Link;
    // (//div[@class='button mt_15'])[5] >> read more // boyle de locate edebilirsin




    //Body Our Client Title
    @FindBy(xpath = "(//div[@class='headline'])[7]")
    public WebElement bodyOurClintTitle;





    //Body Newsletter Title
    @FindBy(xpath = "(//div[@class='headline'])[8]")
    public WebElement bodyNewsletterTitle;

    //Body Newsletter Email Kutusu
    @FindBy(xpath = "//input[@name='subs_email']")
    public WebElement bodyNewsletterEmailBox;

    //Body Newsletter Email Submit Butonu
    @FindBy(xpath = "//input[@type='submit']")
    public WebElement bodyNewsletterSubmitButton;




    // Footer Featured Packages Title
    @FindBy(xpath = "//*[text()='Featured Packages']")
    public WebElement footerFeaturedPackagesTitle;

    // Footer Featured Packages Item 1
    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[1]")
    public WebElement footerFeaturedPackagesItem1;

    // Footer Featured Packages Item 2
    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[2]")
    public WebElement footerFeaturedPackagesItem2;

    // Footer Featured Packages Item 3
    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[3]")
    public WebElement footerFeaturedPackagesItem3;

    // Footer Featured Packages Item 4
    @FindBy(xpath = "(//div[@class='footer-item mt_30'])[1]//ul//li[1]")
    public WebElement footerFeaturedPackagesItem4;





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
    public WebElement newsletterSuccessfulAlert;


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
    public WebElement packagesPhotoTitleIstanbul;


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



    //------------Body Team Members Detail Links--------------

    //Member1 Ayrinti
    @FindBy(xpath ="//a[@href ='https://qa.tripandway.com/team-member/knox-mitchell'])[2]")
    public WebElement bodyTeamMember1DetailLink;

    //Member2 Ayrinti
    @FindBy(xpath = "//a[@href ='https://qa.tripandway.com/team-member/zara-williams'])[2]")
    public WebElement bodyTeamMember2DetailLink;

    //Member3 Ayrinti
    @FindBy(xpath ="//a[@href ='https://qa.tripandway.com/team-member/jaxon-green'])[2]")
    public WebElement bodyTeamMember3DetailLink;

    //Member4 Ayrinti
    @FindBy(xpath = "//a[@href ='https://qa.tripandway.com/team-member/avery-johnson'])[2]")
    public WebElement bodyTeamMember4DetailLink;



    //------------Body Our Client İmages--------------

    //Our Client İmage1
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-1.png']")
    public WebElement bodyOurClientImage1;

    //Our Client İmage2
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-2.png']")
    public WebElement bodyOurClientImage2;

    //Our Client İmage3
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-3.png']")
    public WebElement bodyOurClientImage3;

    //Our Client İmage4
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-4.png']")
    public WebElement bodyOurClientImage4;

    //Our Client İmage5
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-5.png']")
    public WebElement bodyOurClientImage5;

    //Our Client İmage6
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-6.png']")
    public WebElement bodyOurClientImage6;

    //Our Client İmage7
    @FindBy(xpath = "//img[@src='https://qa.tripandway.com/public/uploads/client-7.png']")
    public WebElement bodyOurClientImage7;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement regAlreadyExistsMassage;
}

