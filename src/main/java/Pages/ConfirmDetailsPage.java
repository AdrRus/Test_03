package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmDetailsPage {

    public ConfirmDetailsPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//button[@name='confirm-addresses']")
    WebElement confAddress;

    @FindBy(xpath = "//div[@class='col-xs-12 carriere-name-container']")
    WebElement prestaShop;

    @FindBy(xpath = "//button[@name='confirmDeliveryOption']")
    WebElement pressDelivery;

    @FindBy(xpath = "//label[@for='payment-option-1']")
    WebElement byCheck;

    @FindBy(xpath = "//input[@id='conditions_to_approve[terms-and-conditions]']")
    WebElement agreeCheck;


    @FindBy(xpath = "//button[@class='btn btn-primary center-block']")
    WebElement orderBtn;







    public void confirmAddressPress(){
        confAddress.click();
    }

    public void confirmDelivery(){
        prestaShop.click();
        pressDelivery.click();
    }

    public void paymentSetUp(){
        byCheck.click();
    }
    public void checkBox(){
        agreeCheck.click();
        orderBtn.click();
    }

}
