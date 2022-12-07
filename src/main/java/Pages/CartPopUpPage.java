package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPopUpPage {

    public CartPopUpPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement cartBtn;


    public void pressCardBtn(){
        cartBtn.click();
    }
}
