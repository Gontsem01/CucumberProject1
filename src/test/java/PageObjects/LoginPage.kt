@Smoketest(priority = 1, description = "Login to the application")
package PageObjects

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class LoginPage(driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(id = "navLoginButton")
    lateinit var navLoginButton: WebElement

    @FindBy(id = "username")
    lateinit var usernameField: WebElement

    @FindBy(id = "password")
    lateinit var passwordField: WebElement

    @FindBy(id = "loginButton")
    lateinit var loginButton: WebElement

    @FindBy(id = "loginSuccessMessage")
    lateinit var loginSuccessMessage: WebElement

    @FindBy(id = "signUpHere")
    lateinit var signUpHereLink: WebElement

    fun clickNavLoginButton() {
        navLoginButton.click()
    }

    fun enterUsername(username: String) {
        usernameField.sendKeys(username)
    }

    fun enterPassword(password: String) {
        passwordField.sendKeys(password)
    }

    fun clickLoginButton() {
        loginButton.click()
    }

    fun getLoginSuccessMessage(): String {
        return loginSuccessMessage.text
    }

    fun clickSignUpHere() {
        signUpHereLink.click()
    }
}