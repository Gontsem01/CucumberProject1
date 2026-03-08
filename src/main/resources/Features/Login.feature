Feature: User login test

  Background:
    Given the user is on the login page

  Scenario Outline: Successful login with valid credentials
    When the user enters a valid username <username>
    And  the user enters a valid password <password>
    And  the user clicks the login button
    And the user is redirected to the dashboard
    And the user clicks the button with the user's name on the dashboard and a dropdown menu appears
    And the user clicks Admin panel on the dropdown menu
    And the user is redirected to the admin panel dashboard
    And the user clicks Users on the admin panel dashboard
    And the user is redirected to the user management page
    And the user clicks the search box and search for the user by typing in the email address <email>
    And the user sees the user details displayed on the user management page with the role of the user as Admin

    Examples:
      | username          | password  |
      | stella@yopmail.com | Testing@123 |