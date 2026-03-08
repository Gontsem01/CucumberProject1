package StepDefinitions;

import io.cucumber.java.en.*;
import Utils.Base;
import org.testng.Assert;
import io.cucumber.java.PendingException;

public class CreateUserSteps extends Base {

    @Given("the user is on the login page page")
    public void theUserIsOnTheLoginPagePage() {
        loginPage.clickNavLoginButton();
    }

    @When("the user clicks on Login")
    public void theUserClicksOnLogin() {
        // Assuming this clicks the login button on the page
        loginPage.clickLoginButton();
    }

    @And("the user is redirected to the Create your account page")
    public void theUserIsRedirectedToTheCreateYourAccountPage() {
        // Verify redirection to create account page
        String title = registerPage.createYourAccountPage();
        Assert.assertTrue(title.contains("Create") || title.contains("Account"), "Not redirected to create account page");
    }

    @And("the user clicks the hyperlink Sign Up Here")
    public void theUserClicksTheHyperlinkSignUpHere() {
        // Click the sign up here hyperlink
        loginPage.clickSignUpHere();
    }

    @And("the user enters a valid first name {string}")
    public void theUserEntersAValidFirstName(String firstName)
    { registerPage.enterFirstName(firstName);
    }

    @And("the user enters a valid Last name {string}")
    public void theUserEntersAValidLastName(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @And("the user enters a valid email address {string}")
    public void theUserEntersAValidEmailAddress(String email) {
        registerPage.enterEmail(email);
    }

    @And("the user enters a valid password {string}")
    public void theUserEntersAValidPassword(String password) {
        registerPage.enterPassword(password);
    }

    @And("the user confirms the password {string}")
    public void theUserConfirmsThePassword(String confirmPassword) {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @And("the user click on the textbox to select the group from the dropdown menu")
    public void theUserClickOnTheTextboxToSelectTheGroupFromTheDropdownMenu() {
        // Click on the group dropdown textbox
        // Assuming selectGroup with a default value or click
        registerPage.selectGroup("defaultGroup"); // Placeholder
    }

    @And("the user clicks the button Create Account")
    public void theUserClicksTheButtonCreateAccount() {
        registerPage.clickCreateAccount();
    }

    @Then("the user should see a confirmation message indicating successful account creation")
    public void theUserShouldSeeAConfirmationMessageIndicatingSuccessfulAccountCreation() {
        String message = registerPage.getConfirmationMessage();
        Assert.assertTrue(message.contains("successful"), "Expected confirmation message not found");
    }
}
