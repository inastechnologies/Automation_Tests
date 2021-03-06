package Pages;

import Utils.Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WelcomeToQNaturePage extends BasePage
{
    public WelcomeToQNaturePage(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(css = "span.image-circle.hand-pointer")
    public List<WebElement> HeaderIcons;

    @FindBy(xpath = "//h1[text()='Welcome to QNature']")
    public WebElement WelcomeToQNature;

    @FindBy(css = "img.image-size-user")
    public WebElement ProfileIcon;

    @FindBy(css = "div.options-pop")
    public WebElement LogoutButton;

    public PractitionerManageAppointmentsPage AfterSubmittingFormClickLogout()
    {
        Utils.WaitForAnElementToExist(driver, ProfileIcon);
        ProfileIcon.click();
        Utils.WaitForAnElementToExist(driver, LogoutButton);
        LogoutButton.click();
        return new PractitionerManageAppointmentsPage(driver);
    }
}
