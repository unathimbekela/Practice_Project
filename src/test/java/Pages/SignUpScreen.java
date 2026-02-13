package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpScreen {

      WebDriver driver;
     @FindBy(id = "registerbutton")
    WebElement registerButton_id;

    public SignUpScreen(WebDriver driver) {
        this.driver = driver;
    }
    public void clickRegisterButton() {

        new WebDriverWait(driver, Duration.ofSeconds(10)).until(visibilityOf(registerButton_id));
        registerButton_id.isDisplayed();
    }
}
