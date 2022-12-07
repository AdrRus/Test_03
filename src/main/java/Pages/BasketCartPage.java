package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasketCartPage {

    public BasketCartPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='text-sm-center']")
    WebElement btnProcescheckout;

    public void pressBtnCheckout(){
        btnProcescheckout.click();
    }
}
