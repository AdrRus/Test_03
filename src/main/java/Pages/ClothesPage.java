package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClothesPage {

    public ClothesPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//section[@id='products']/div[3]/div/div[2]/article/div/div/a")
    WebElement sweater;

    public void choiceSweater(){
        sweater.click();
    }
}
