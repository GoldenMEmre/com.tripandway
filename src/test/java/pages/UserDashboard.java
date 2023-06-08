package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //Login Dashboard sayfasina basarili giris elementi
    @FindBy(xpath = "//*[text()='Completed Orders']")
    public WebElement successfullLogin;


    @FindBy(xpath = "(//*[text()='Completed'])[1]")
    public WebElement paymentHistoryCompleted;


    //Login Dashboard sayfasindaki Update Profile elementi
    @FindBy(xpath = "//a[text()='Update Profile']")
    public WebElement updateProfileButton;

    //Login Dashboard sayfasinda Update Profile kismindaki isim elementi
    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement updateProfileName;

    // Login Dashboard sayfasinda profil duzenleme kismindaki email elementi
    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement updateProfileEmail;

    //Login Dashboard sayfasinda profil duzenleme kismindaki phone elementi
    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement updateProfilePhone;

    //Login Dashboard sayfasinda profil duzenleme kismindaki Country elementi
    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement updateProfileCountry;

    //Login Dashboard sayfasinda profil duzenleme kismindaki address elementi
    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement updateProfileAddress;

    //Login Dashboard sayfasinda profil duzenleme kismindaki State elementi
    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement updateProfileState;

    //Login Dashboard sayfasinda profil duzenleme kismindaki City elementi
    @FindBy(xpath = "(//input[@class='form-control'])[7]")
    public WebElement updateProfileCity;

    //Login Dashboard sayfasinda profil duzenleme kismindaki ZipCode elementi
    @FindBy(xpath = "(//input[@class='form-control'])[8]")
    public WebElement updateProfileZipCode;

    //Login Dashboard sayfasinda profil duzenleme kismindaki Update elementi
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement updateProfileUpdateButton;

    //Login Dashboard  sayfasinda basarili giris yesil cizgi elementi
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement updateProfileSuccessfulAlert;

    //Login Dashboard  sayfasinda odeme gecmisi butonu elementi
    @FindBy(xpath = "//a[text()='Payment History']")
    public WebElement paymentHistoryButton;

    //Login Dashboard  sayfasinda odeme gecmisi sayfasina basarili giris kontrol elementi
    @FindBy(tagName = "h1")
    public WebElement SuccessfulPaymentHistory;

    //Login Dashboard  sayfasinda sifre degistirme butonu elementi
    @FindBy(xpath = "//a[text()='Update Password']")
    public WebElement updatePasswordButton;

    //Login Dashboard  sayfasinda sifre degistirme kutusu elementi
    @FindBy(xpath = "//input[@type='password']")
    public WebElement updatePasswordBox;

    //Login Dashboard  sayfasinda sifre degistirme update elementi
    @FindBy(xpath = "//button[text()='Update']")
    public WebElement updatePasswordUpdateButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement updatePasswordSuccessfulAlert;



    //Login Dashboard  sayfasinda sifremi unuttum  elementi
    @FindBy(xpath = "//a[text()='Forget Password']")
    public WebElement loginForgetPasswordButton;

    //Login Dashboard  sayfasinda sifremi unuttum sayfasina basarili giris elementi
    @FindBy(xpath = "//*[text()='Reset Password']")
    public WebElement resetPasswordTitle;

    @FindBy(xpath = "//input[@name='traveller_email']")
    public WebElement resetPasswordEmailBox;

    //Login Dashboard  sayfasinda sifremi unuttum submit elementi
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement resetPasswordSubmitButton;

    //Login Dashboard sayfasinda basarili giris yesil cizgi elementi
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement resetPasswordSuccessfulAlert;


    @FindBy(xpath = "//*[text()='Logout']")
    public WebElement logoutButton;


    @FindBy(xpath = "//button[@class='btn btn-info btn-lg']")
    public WebElement packagesBookYourSeatButton;


    @FindBy(xpath = "//button[@type='submit']")
    public WebElement packagesPayWithCardButton;


    @FindBy(xpath = "//input[@id='card_number']")
    public WebElement packagesPayCardNumber;


    @FindBy(xpath = "//input[@id='cc-exp']")
    public WebElement packagesPayCardDate;


    @FindBy(xpath = "//input[@id='cc-csc']")
    public WebElement packagesPayCardCVC;


    @FindBy(xpath = "//button[@ID='submitButton']")
    public WebElement packagesPaySubmitButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement packagesPaySuccessfulAlert;


    @FindBy(xpath = "//tbody//tr[2]//td[5]")
    public WebElement packagesPaySuccessf;


    @FindBy (xpath ="//iframe[@class='stripe_checkout_app']")
    public WebElement packagesPayIframe;



















}
