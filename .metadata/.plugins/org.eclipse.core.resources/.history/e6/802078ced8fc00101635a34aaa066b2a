
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    // "My Account" menu item in the top bar
    @FindBy(linkText = "My Account")
    private WebElement myAccountMenu;

    // "Login" option under My Account (may open as link or dropdown)
    @FindBy(linkText = "Login")
    private WebElement loginOption;

    // Search textbox
    @FindBy(id = "ctl00_TopSearch1_txtSearch")
    private WebElement searchBox;

    // Search button
    @FindBy(id = "ctl00_TopSearch1_ImageButton1")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openSite() {
        driver.get("https://www.bookswagon.com");
    }

    public void goToLoginFromMyAccount() {
        myAccountMenu.click();   // click "My Account" first
        loginOption.click();     // then click "Login"
    }

    public void searchBook(String bookName) {
        searchBox.clear();
        searchBox.sendKeys(bookName);
        searchButton.click();
    }
}
