package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashboard {

    public AdminDashboard() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    // Admin giris Mail Box
    @FindBy(xpath = "//*[@id='email']")
    public WebElement adminEmailBox;

    //Admin giris Password Box
    @FindBy(xpath = "//*[@id='password']")
    public WebElement adminPasswordBox;

    // Admin giris Login Butonu
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement adminLoginButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[1]")
    public WebElement adminPanelDashbordButton;


    @FindBy(xpath = "//a[@aria-controls='collapseSetting']")
    public WebElement adminPanelGeneralSettingsButton;


    @FindBy(xpath = "//a[@aria-controls='collapsePageSettings']")
    public WebElement adminPanelPageSettingsButton;


    @FindBy(xpath = "//a[@aria-controls='collapsePayment']")
    public WebElement adminPanelPaymentSettingsButton;


    @FindBy(xpath = "//a[@aria-controls='collapseBlog']")
    public WebElement adminPanelBlogSectionButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[2]")
    public WebElement adminPanelDestinationsButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[3]")
    public WebElement adminPanelPackagesButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[4]")
    public WebElement adminPanelDymanicPagesButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[8]")
    public WebElement adminPanelEmailTemplateButton;


    @FindBy(xpath = "//a[@aria-controls='collapseWebsite']")
    public WebElement adminPanelWebsiteSectionButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[6]")
    public WebElement adminPanelOrderButton;


    @FindBy(xpath = "(//a[@class='nav-link'])[7]")
    public WebElement adminPanelTravellerButton;


    @FindBy(xpath = "//a[@aria-controls='collapseSubscriber']")
    public WebElement adminPanelSubscriberButton;


    @FindBy(xpath = "//*[text()='Categories']")
    public WebElement adminPanelBlogSectionCategoriesButton;


    @FindBy(xpath = "//*[text()=' Add New']")
    public WebElement blogSectionCategoriesAddNewButton;


    @FindBy(xpath = "//input[@name='category_name']")
    public WebElement addCategoryNameBox;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addCategorySubmitButton;


    @FindBy(xpath = "//div[@id='toast-container']")
    public WebElement addCategorySuccessfulAlert;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement categoriesSearchBox;


    @FindBy(xpath = "//tbody/tr/td[4]/a[1]")
    public WebElement categoriesActionEditButton;


    @FindBy(xpath = "//tbody/tr/td[4]/a[2]")
    public WebElement categoriesActionDeleteButton;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editCategoryUpdateButton;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement editCategorySuccessfulAlert;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement categoriesDeletedSuccessfulAlert;


    @FindBy(xpath = "//*[text()='Blogs']")
    public WebElement adminPanelBlogSectionBlogsButton;


    @FindBy(xpath = "//*[text()=' Add New']")
    public WebElement blogSectionBlogsAddNewButton;


    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement blogsBlogTitleBox;


    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement addBlogBlogTitleBox;


    @FindBy(xpath = "(//div/p)[1]")
    public WebElement addBlogBlogContentTextarea;


    @FindBy(xpath = "//textarea[@name='blog_content_short']")
    public WebElement addBlogBlogShortContentBox;


    @FindBy(xpath = "//input[@name='blog_photo']")
    public WebElement addBlogPhotoButton;


    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement addBlogSelectCategoryDropdownMenu;

    @FindBy(xpath = "//select[@name='comment_show']")
    public WebElement addBlogShowCommentDropdownMenu;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addBlogSubmitButton;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement addBlogSuccessfulAlert;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement blogsSearchBox;


    @FindBy(xpath = "//tbody/tr/td[5]/a[1]")
    public WebElement blogsActionEditButton;


    @FindBy(xpath = "//tbody/tr/td[5]/a[2]")
    public WebElement blogsActionDeleteButton;


    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement editBlogTitleBox;


    @FindBy(xpath = "//input[@name='blog_title']")
    public WebElement editBlogBlogTitleBox;


    @FindBy(xpath = "(//div/p)[1]")
    public WebElement editBlogBlogContentBox;


    @FindBy(xpath = "//textarea[@name='blog_content_short']")
    public WebElement editBlogBlogShortContentBox;


    @FindBy(xpath = "//input[@name='blog_photo']")
    public WebElement editBlogPhotoButton;


    @FindBy(xpath = "//select[@name='category_id']")
    public WebElement editBlogSelectCategoryDropdownMenu;

    @FindBy(xpath = "//select[@name='comment_show']")
    public WebElement editBlogShowCommentDropdownMenu;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editBlogUpdateButton;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement editBlogSuccessfulAlert;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement blogsDeletedSuccessfulAlert;


    @FindBy(xpath = "//*[text()=' Add New']")
    public WebElement destinationsAddNewButton;


    @FindBy(xpath = "//input[@name='d_name']")
    public WebElement addDestinationNameBox;


    @FindBy(xpath = "//input[@name='d_slug']")
    public WebElement addDestinationSlugBox;


    @FindBy(xpath = "//input[@name='d_heading']")
    public WebElement addDestinationHeadingBox;


    @FindBy(xpath = "//input[@name='d_short_description']")
    public WebElement addDestinationShortDescriptionBox;


    @FindBy(xpath = "//input[@name='d_package_heading']")
    public WebElement addDestinationPackageHeadingBox;


    @FindBy(xpath = "//input[@name='d_package_subheading']")
    public WebElement addDestinationPackageSubheadingBox;


    @FindBy(xpath = "//input[@name='d_detail_heading']")
    public WebElement addDestinationDetailHeadingBox;


    @FindBy(xpath = "//input[@name='d_detail_subheading']")
    public WebElement addDestinationDetailSubheadingBox;


    @FindBy(xpath = "//input[@name='d_photo']")
    public WebElement addDestinationPhotoButton;


    @FindBy(xpath = "(//div/p)[1]")
    public WebElement addDestinationIntroductionTextarea;


    @FindBy(xpath = "(//div/p)[3]")
    public WebElement addDestinationExperienceTextarea;

    @FindBy(xpath = "(//div/p)[5]")
    public WebElement addDestinationWeatherTextarea;


    @FindBy(xpath = "(//div/p)[7]")
    public WebElement addDestinationHotelTextarea;


    @FindBy(xpath = "(//div/p)[9]")
    public WebElement addDestinationTransportationTextarea;


    @FindBy(xpath = "(//div/p)[11]")
    public WebElement addDestinationCultureTextarea;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement addDestinationSubmitButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement addDestinationSuccessfulAlert;


    @FindBy(xpath = "//input[@name='d_name']")
    public WebElement editDestinationNameBox;


    @FindBy(xpath = "//input[@name='d_slug']")
    public WebElement editDestinationSlugBox;


    @FindBy(xpath = "//input[@name='d_heading']")
    public WebElement editDestinationHeadingBox;


    @FindBy(xpath = "//input[@name='d_short_description']")
    public WebElement editDestinationShortDescriptionBox;


    @FindBy(xpath = "//input[@name='d_package_heading']")
    public WebElement editDestinationPackageHeadingBox;


    @FindBy(xpath = "//input[@name='d_package_subheading']")
    public WebElement editDestinationPackageSubheadingBox;


    @FindBy(xpath = "//input[@name='d_detail_heading']")
    public WebElement editDestinationDetailHeadingBox;


    @FindBy(xpath = "//input[@name='d_detail_subheading']")
    public WebElement editDestinationDetailSubheadingBox;


    @FindBy(xpath = "//input[@name='d_photo']")
    public WebElement editDestinationPhotoButton;


    @FindBy(xpath = "(//div/p)[1]")
    public WebElement editDestinationIntroductionTextarea;


    @FindBy(xpath = "(//div/p)[3]")
    public WebElement editDestinationExperienceTextarea;


    @FindBy(xpath = "(//div/p)[5]")
    public WebElement editDestinationWeatherTextarea;


    @FindBy(xpath = "(//div/p)[7]")
    public WebElement editDestinationHotelTextarea;


    @FindBy(xpath = "(//div/p)[9]")
    public WebElement editDestinationTransportationTextarea;


    @FindBy(xpath = "(//div/p)[11]")
    public WebElement editDestinationCultureTextarea;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement editDestinationUpdateButton;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement editDestinationSuccessfulAlert;


    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement destinationDeletedSuccessfulAlert;


    @FindBy(xpath = "//input[@type='search']")
    public WebElement destinationsSearchBox;


    @FindBy(xpath = "//tbody/tr/td[4]/a[1]")
    public WebElement destinationsActionEditButton;


    @FindBy(xpath = "//tbody/tr/td[4]/a[2]")
    public WebElement destinationsDeleteButton;

    //Admin Packages sayfa basligi
    @FindBy(tagName = "h1")
    public WebElement adminPackagesTitle;

    //Packages sayfasindaki '+Add New' butonu
    @FindBy(xpath = "//*[text()=' Add New']")
    public WebElement packagesAddNewButton;

    //Packages sayfasindaki Search kutusu
    @FindBy(xpath = "//*[@type='search']")
    public WebElement packagesSearchBox;

    //Packages sayfasindaki tabloda Package Name altindaki hücre
    @FindBy(xpath = "//tbody/tr/td[3]")
    public WebElement packagesPackageName;

    //Packages sayfasindaki tabloda Action altindaki duzenleme butonu
    @FindBy(xpath = "//tbody/tr/td[7]/a[1]")
    public WebElement packagesActionEditButton;

    //Packages sayfasindaki tabloda Action altindaki silme butonu
    @FindBy(xpath = "//tbody/tr/td[7]/a[2]")
    public WebElement packagesActionDeleteButton;

    //************************************************
    //Add Package sayfasindaki Name kutusu
    @FindBy(xpath = "//*[@name='p_name']")
    public WebElement addPackageNameBox;

    //Add Package sayfasindaki Slug kutusu
    @FindBy(xpath = "//*[@name='p_slug']")
    public WebElement addPackageSlugBox;

    //Add Package sayfasindaki Photo 'Dosya Sec' butonu
    @FindBy(xpath = "//*[@name='p_photo']")
    public WebElement addPackagePhotoButton;

    //Add Package sayfasindaki Description text kutusu
    @FindBy(xpath = "(//div/p)[1]")
    public WebElement addPackageDescriptionTextarea;

    //Add Package sayfasindaki Short Description kutusu
    @FindBy(xpath = "//*[@name='p_description_short']")
    public WebElement addPackageShortDescriptionBox;

    //Add Package sayfasindaki Location kutusu
    @FindBy(xpath = "//*[@name='p_location']")
    public WebElement addPackageLocationBox;

    //Add Package sayfasindaki Start Date kutusu
    @FindBy(xpath = "//*[@name='p_start_date']")
    public WebElement addPackageStartDateBox;

    //Add Package sayfasindaki End Date kutusu
    @FindBy(xpath = "//*[@name='p_end_date']")
    public WebElement addPackageEndDateBox;

    //Add Package sayfasindaki Last Booking Date kutusu
    @FindBy(xpath = "//*[@name='p_last_booking_date']")
    public WebElement addPackageLastBookingDateBox;

    //Add Package sayfasindaki Map kutusu
    @FindBy(xpath = "//*[@name='p_map']")
    public WebElement addPackageMapBox;

    //Add Package sayfasindaki Itinerary text kutusu
    @FindBy(xpath = "(//div/p)[3]")
    public WebElement addPackageItineraryTextarea;

    //Add Package sayfasindaki Price kutusu
    @FindBy(xpath = "//*[@name='p_price']")
    public WebElement addPackagePriceBox;

    //Add Package sayfasindaki Policy text kutusu
    @FindBy(xpath = "(//div/p)[5]")
    public WebElement addPackagePolicyTextarea;

    //Add Package sayfasindaki Terms text kutusu
    @FindBy(xpath = "(//div/p)[7]")
    public WebElement addPackageTermsTextarea;

    //Add Package sayfasindaki Is Featured? drop down menu
    @FindBy(xpath = "//*[@name='p_is_featured']")
    public WebElement addPackageIsFeaturedDropdownMenu;

    //Add Package sayfasindaki Destination drop down menu
    @FindBy(xpath = "//*[@class='selection']")
    public WebElement addPackageDestinationDropdownMenu;

    //Add Package sayfasindaki Destination Search Box'u
    @FindBy(xpath = "//*[@type='search']")
    public WebElement addPackageDestinationSearchBox;

    //Add Package sayfasindaki SEO Information baslik kutusu
    @FindBy(xpath = "//*[@name='seo_title']")
    public WebElement addPackageSeoTitleBox;

    //Add Package sayfasindaki SEO Information Meta Description kutusu
    @FindBy(xpath = "//*[@name='seo_meta_description']")
    public WebElement addPackageSeoMetaBox;

    //Add Package sayfasindaki Submit butonu
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement addPackageSubmitButton;

    //'Package is added successfully!' yazisi
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement addPackagesSuccessfulAlert;

    //************************************************
    //Edit Package sayfasindaki Name kutusu
    @FindBy(xpath = "//*[@name='p_name']")
    public WebElement editPackageNameBox;

    //Edit Package sayfasindaki Slug kutusu
    @FindBy(xpath = "//*[@name='p_slug']")
    public WebElement editPackageSlugBox;

    //Edit Package sayfasindaki Photo 'Dosya Sec' butonu
    @FindBy(xpath = "//*[@name='p_photo']")
    public WebElement editPackagePhotoButton;

    //Edit Package sayfasindaki Description text kutusu
    @FindBy(xpath = "(//div/p)[1]")
    public WebElement editPackageDescriptionTextarea;

    //Edit Package sayfasindaki Short Description kutusu
    @FindBy(xpath = "//*[@name='p_description_short']")
    public WebElement editPackageShortDescriptionBox;

    //Edit Package sayfasindaki Location kutusu
    @FindBy(xpath = "//*[@name='p_location']")
    public WebElement editPackageLocationBox;

    //Edit Package sayfasindaki Start Date kutusu
    @FindBy(xpath = "//*[@name='p_start_date']")
    public WebElement editPackageStartDateBox;

    //Edit Package sayfasindaki End Date kutusu
    @FindBy(xpath = "//*[@name='p_end_date']")
    public WebElement editPackageEndDateBox;

    //Edit Package sayfasindaki Last Booking Date kutusu
    @FindBy(xpath = "//*[@name='p_last_booking_date']")
    public WebElement editPackageLastBookingDateBox;

    //Edit Package sayfasindaki Map kutusu
    @FindBy(xpath = "//*[@name='p_map']")
    public WebElement editPackageMapBox;

    //Edit Package sayfasindaki Itinerary text kutusu
    @FindBy(xpath = "(//div/p)[3]")
    public WebElement editPackageItineraryTextarea;

    //Edit Package sayfasindaki Price kutusu
    @FindBy(xpath = "//*[@name='p_price']")
    public WebElement editPackagePriceBox;

    //Edit Package sayfasindaki Policy text kutusu
    @FindBy(xpath = "(//div/p)[5]")
    public WebElement editPackagePolicyTextarea;

    //Edit Package sayfasindaki Terms text kutusu
    @FindBy(xpath = "(//div/p)[7]")
    public WebElement editPackageTermsTextarea;

    //Edit Package sayfasindaki Is Featured? drop down menu
    @FindBy(xpath = "//*[@name='p_is_featured']")
    public WebElement editPackageIsFeaturedDropdownMenu;

    //Edit Package sayfasindaki Destination drop down menu
    @FindBy(xpath = "//*[@class='selection']")
    public WebElement editPackageDestinationDropdownMenu;

    //Edit Package sayfasindaki Destination Search Box'u
    @FindBy(xpath = "//*[@type='search']")
    public WebElement editPackageDestinationSearchBox;

    //Edit Package sayfasindaki SEO Information baslik kutusu
    @FindBy(xpath = "//*[@name='seo_title']")
    public WebElement editPackageSeoTitleBox;

    //Edit Package sayfasindaki SEO Information Meta Description kutusu
    @FindBy(xpath = "//*[@name='seo_meta_description']")
    public WebElement editPackageSeoMetaBox;

    //Edit Package sayfasindaki Update butonu
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement editPackageUpdateButton;

    //'Package is updated successfully!' yazisi
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement editPackagesSuccessfulAlert;

    //'Package is deleted successfully!' yazisi
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement packagesDeletedSuccessfulAlert;


    @FindBy(xpath = "//*[text()='View Orders']")
    public WebElement ordersViewOrderTitle;


    @FindBy(xpath = "//*[@id='dataTable_info']")
    public WebElement ordersShowingNumbers;


    @FindBy(xpath = "//tbody//tr[1]//td[11]//a[1]")
    public WebElement ordersFirstOrderDetailButton;


    @FindBy(xpath = "//h1[text()='Order Detail']")
    public WebElement ordersFirstOrderDetailTitle;


    @FindBy(xpath = "//tbody//tr[1]//td[11]//a[2]")
    public WebElement ordersFirstOrderInvoiceButton;


    @FindBy(xpath = "//*[text()='Print Invoice']")
    public WebElement ordersFirstOrderPrintInvoiceButton;

    //Admin sayfasi dropdown Subscribers /All Subscribers secimi
    @FindBy(xpath = "//*[@id='collapseSubscriber']/div/a[1]")
    public WebElement dropDownAllsubscribers;

    // Admin sayfasinda Subscriber üyelerinin göründügüne iliskin kelime (showing)
    @FindBy(xpath = "//*[@id='dataTable_info']")
    public WebElement showingSearchWord;

    //Admin sayfasi dropdown Subscribers /Send Email to Subscriber secimi
    @FindBy(xpath = "//*[@id='collapseSubscriber']/div/a[2]")
    public WebElement dropDownSendEmail;

    //Admin sayfasi Email ekrani Subject Box
    @FindBy(xpath = "//*[@class='form-control']")
    public WebElement subjectBox;

    //Admin sayfasi Email ekrani Massege Box
    @FindBy(xpath = " //*[@role='textbox']")
    public WebElement massegeBox;

    //Admin sayfasi Email ekrani Submit Butonu
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitSendMailButton;

    //Admin sayfasi Email ekrani onay yazisinin goruntulenmesi
    @FindBy(xpath = "//*[@id='page-top']/script[4]")
    public WebElement eMailExpectedText;

    //Admin sayfasi sag üst admin profil dropdown menu butonu
    @FindBy(xpath = "//a[@id='userDropdown']")
    public WebElement adminDropdownMenu;

    //Admin sayfasi sag üst admin profil dropdown menu acilmis görunumu
    @FindBy(xpath = "//*[@aria-labelledby='userDropdown']")
    public WebElement adminDropdownMenuFrame;


    @FindBy(xpath = "(//*[@class='dropdown-item'])[1]")
    public WebElement adminMenuchangePasswordButton;


    @FindBy(xpath = "//*[text()='Edit Profile']")
    public WebElement adminChangePasswordPage;


    @FindBy(xpath = "(//*[@class='dropdown-item'])[2]")
    public WebElement adminMenuChangePhotoButton;


    @FindBy(xpath = "(//*[text()='Edit Photo'])[1]")
    public WebElement adminMenuChangePhotoPage;

    //Admin sayfasi altinda yer alan daraltma butonu
    @FindBy(xpath = "//*[@id='sidebarToggle']")
    public WebElement adminPanelArrowButton;

    //Admin sayfasi üst kisminda yer alan "Visit Website" butonu
    @FindBy(xpath = "//*[@target='_blank']")
    public WebElement adminVisitWebsiteButton;

    //Admin sayfasindaki Admin dropdown/ Logout sekmesinin secimi
    @FindBy(xpath = "///*[@class='dropdown-item'][3]")
    public WebElement adminDropDownLogoutButton;

}
