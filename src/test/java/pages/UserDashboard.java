package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserDashboard {
    public UserDashboard(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(css= ".fas.fa-sign-out-alt")
    public WebElement logoutButton;


}
