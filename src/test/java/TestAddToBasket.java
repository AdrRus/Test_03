import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class TestAddToBasket {



    private static WebDriver driver;

    String url = "https://mystore-testlab.coderslab.pl.";



    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }


    @Test
    public void setBasketItem() throws InterruptedException, IOException {
        NavigationPanelPage navigationPanelPage = new NavigationPanelPage(driver);
        navigationPanelPage.goToSignInPage();

        SignInPage signInPage = new SignInPage(driver);
        signInPage.logIn("tester.aido22@gmail.com","Teste.01");
        navigationPanelPage.pressClothes();
        ClothesPage clothesPage = new ClothesPage(driver);
        clothesPage.choiceSweater();

        WindClothes windClothes = new WindClothes(driver);
        windClothes.choiceSizeQuantity();

        CartPopUpPage cartPage = new CartPopUpPage(driver);
        cartPage.pressCardBtn();

        BasketCartPage basketCartPage = new BasketCartPage(driver);
        basketCartPage.pressBtnCheckout();

        ConfirmDetailsPage confirmDetailsPage = new ConfirmDetailsPage(driver);
        confirmDetailsPage.confirmAddressPress();
        confirmDetailsPage.confirmDelivery();
        confirmDetailsPage.paymentSetUp();
        confirmDetailsPage.checkBox();
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"PNG",new File("C://CodersLab//Zrzut ekranu.png"));






    }

    @AfterTest
    public void tearDown(){
         driver.quit();

    }
}
