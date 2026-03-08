package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



    @FindBy(id = "firstName")
    WebElement firstNameField;

    @FindBy(id = "lastName")
    WebElement lastNameField;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "confirmPassword")
    WebElement confirmPasswordField;

    @FindBy(id = "group")
    WebElement groupDropdown;

    @FindBy(id = "createAccountButton")
    WebElement createAccountButton;

    @FindBy(id = "confirmationMessage")
    WebElement confirmationMessage;

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void selectGroup(String group) {
        groupDropdown.sendKeys(group);
    }

    public void clickCreateAccount() {
        createAccountButton.click();
    }

    public String getConfirmationMessage() {
        return confirmationMessage.getText();
    }

    public String createYourAccountPage() {
        return driver.getTitle();
    }

}
