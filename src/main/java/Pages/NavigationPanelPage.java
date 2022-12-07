package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationPanelPage {

    public NavigationPanelPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement signInBtn;

    @FindBy(css="a.logout.hidden-sm-down")
    WebElement signOutBtn;

    @FindBy(id = "category-3")
    WebElement clothes;


    public void goToSignInPage(){
        signInBtn.click();
    }

    public void signOutApp(){
        signOutBtn.click();
    }

    public void pressClothes(){
        clothes.click();
    }
}
