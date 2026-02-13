package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingScreen {
     WebDriver driver;
     @FindBy(id = "menubutton")
    WebElement menuButton_id;

    public LandingScreen(WebDriver driver) {
        this.driver = driver;
    }
    public void clickMenuButton() {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(menuButton_id));
        menuButton_id.isDisplayed();
        
    }
}
