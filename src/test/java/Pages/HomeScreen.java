package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeScreen {
    WebDriver driver;

    @FindBy(id = "overview-hero")
    WebElement homeScreenTitle_id;

    @FindBy(id = "nav-btn-practice")
    WebElement learningMaterial_id;

    @FindBy(id = "exitButton")
    WebElement exitButton_id;

    public HomeScreen(WebDriver driver) {
        this.driver = driver;
    }
    public void verifyHomeScreenIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(homeScreenTitle_id));
        homeScreenTitle_id.isDisplayed();
    }

    public void clickOnLearningMaterial() {
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(learningMaterial_id));
        learningMaterial_id.click();
    }
        public void clickOnExitButton() {
//        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(exitButton_id));
        exitButton_id.click();
}

}