

    package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;


    public class UserHomepage {

        public UserHomepage(){
            PageFactory.initElements(Driver.getDriver(),this);
        }

        //Anasayfa Kullanıcı kayıt linki
        @FindBy(xpath = "//*[text()='Registration']")
        WebElement registrationlink;

        @FindBy(css= ".fas.fa-lock")
        public WebElement loginButton;

        // login email kutussu
        @FindBy(xpath = "//input[@name='traveller_email']")
        public WebElement emailBox;

        @FindBy(xpath = "//input[@name='traveller_password']")
        public WebElement passwordKutusu;
        @FindBy(xpath = "//button[@name='form1']")
        public WebElement girisLoginButtonu;
        @FindBy(xpath = "//button[@class='wpcc-btn']")
        public WebElement cookiesAcceptButton;

        @FindBy(xpath = "(//div[@class='footer-item mt_30'])[4]")
        public WebElement addressElement;

        @FindBy(xpath = "//a[@target='_blank'])[38]")
        public WebElement adressFacebookButton;


        @FindBy(xpath = "(//a[@target='_blank'])[39]")
        public WebElement adressTwitterButton;






        //Registration Name Textbox

        //Home--> Destination/Bangkok experience
    }

