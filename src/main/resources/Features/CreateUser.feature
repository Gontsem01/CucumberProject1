Feature:
    As a user I want to create an account on Ndosi website so that I can access the learning materials and resources available on the platform.

    Background:
        Given the user is on the login page page

    Scenario Outline: Successfully creating an account with valid details
        When the user clicks on Login
        And the user is redirected to the Create your account page
        And the user clicks the hyperlink Sign Up Here
        And the user enters a valid first name <firstName>
        And the user enters a valid Last name <lastName>
        And the user enters a valid email address <email>
        And the user enters a valid password <password>
        And the user confirms the password <confirmPassword>
        And the user click on the textbox to select the group from the dropdown menu
        And the user clicks the button Create Account
        Then the user should see a confirmation message indicating successful account creation

        Examples:
        | firstName | lastName | email              | password   | confirmPassword |
        | stella    | gontse  |  stella@yopmail.com |Testing@123 | Testing@123|