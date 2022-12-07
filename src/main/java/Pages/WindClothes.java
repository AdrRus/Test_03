package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class WindClothes {

    public WindClothes(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//select[@id='group_1']")
    WebElement size;
    @FindBy(xpath = "//button[@class='btn btn-touchspin js-touchspin bootstrap-touchspin-up']")
    WebElement quantity;
    @FindBy(xpath = "//button[@class='btn btn-primary add-to-cart']")
    WebElement addToCart;

    public void choiceSizeQuantity() throws InterruptedException {

        Select siZe = new Select(size);
        siZe.selectByValue("2");

        Thread.sleep(300);
        quantity.click();
        quantity.click();
        quantity.click();
        quantity.click();

        addToCart.click();

    }
}
