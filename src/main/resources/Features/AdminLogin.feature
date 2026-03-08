Feature:
  As a AdminUser I want to login on Ndosi website so that I can approve the users and manage the content on the platform.


  Background:
    Given the user is on the login page

  Scenario Outline: Successful approve the users and manage the content with valid credentials
    When the user enters a valid username <username>
    And  the user enters a valid password <password>
    And  the user clicks the login button
    And the user is redirected to the dashboard
    And the user clicks the admin button
    And the user clicks the admin Panel
    And the user is redirected to the admin Panel dashboard
    And the user clicks Approvals on the admin panel dashboard
    And the user navigates to the seach box and search for the user by typing in the email address <email>
    And the user clicks the approve button
    And the user should see a confirmation message indicating successful approval of the user
    And the user clicks Users on the admin panel dashboard
    And the user is redirected to the user Management page
    And the user clicks the search box and search for the user by typing in the email address <email>
    And the user clicks the user dropdown
    And the user clicks admin
    And the user should see a message "are you sure you want to change this user's role to admin?"
    And the user clicks ok to confirm the role change
    And the user should see a confirmation message " User role updated to "admin" successfully!"
    And the user clicks "back to website" button
    And the user should be redirected to the home page
    And the user clicks the logout button
    And the user should see the message "Are you sure you want to logout?"
    And the user clicks ok to confirm logout



    Examples:
      | username          | password  |
      | admin@gmail.com   | @12345678 |