package stepDefinitions;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import org.testng.Assert;
import utils.Base;

public class LoginSteps extends Base {

    @Given("the user is on the login page")
    public void theuserisontheloginpage() {
        loginPage.clickNavLoginButton();

    }

    @When("the user enters a valid username {}")
    public void theuserentersavalidusername(String username) {
        loginPage.enterUsername(username);
    }

    @And("the user enters a valid password{}")
    public void theuserentersavalidpassword(String password) {
        loginPage.enterPassword(password);
    }

    @And("the user clicks the login button")
    public void theuserclickstheloginbutton() {
        loginPage.clickLoginButton();
    }

    @Then("the user is redirected to the dashboard")
    public void theuserisdirectedtothedashboard() {
        String actualValue = loginPage.getLoginSuccessMessage();
        System.out.println("Actual login success message: " + actualValue);
        String expectedValue = "Welcome back, stella! \uD83D\uDC4B";
        Assert.assertEquals(actualValue, expectedValue, "Expected message: " + expectedValue + ", but got: " + actualValue);
    }

    @And("the user clicks the button with the user's name on the dashboard and a dropdown menu appears")
    public void theUserClicksTheButtonWithTheUserSNameOnTheDashboardAndADropdownMenuAppears() {

        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();

    }


    @And("the user clicks Admin panel on the dropdown menu")
    public void theUserClicksAdminPanelOnTheDropdownMenu() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("the user is redirected to the admin panel dashboard")
    public void theUserIsRedirectedToTheAdminPanelDashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("the user clicks Users on the admin panel dashboard")
    public void theUserClicksUsersOnTheAdminPanelDashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("the user is redirected to the user management page")
    public void theUserIsRedirectedToTheUserManagementPage() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("the user clicks the search box and search for the user by typing in the email address <email>")
    public void theUserClicksTheSearchBoxAndSearchForTheUserByTypingInTheEmailAddressEmail() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @And("the user sees the user details displayed on the user management page with the role of the user as Admin")
    public void theUserSeesTheUserDetailsDisplayedOnTheUserManagementPageWithTheRoleOfTheUserAsAdmin() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

}



