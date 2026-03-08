# Cucumber Automation Project - Ndosi Platform

## Overview
This is a Behavior-Driven Development (BDD) automation testing project built with Cucumber, Selenium, and Java/Kotlin. The project automates testing for the Ndosi learning platform with multiple user scenarios including login, user registration, and admin operations.

## Project Structure

```
CucumberProject1/
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   └── Main.java
│   │   └── resources/Features/
│   │       ├── AdminLogin.feature
│   │       ├── CreateUser.feature
│   │       └── Login.feature
│   └── test/
│       └── java/
│           ├── PageObjects/
│           │   ├── LoginPage.kt (Kotlin)
│           │   └── RegisterPage.java
│           ├── Runners/
│           │   └── TestRunner.java
│           ├── StepDefinitions/
│           │   ├── AdminLogin.java
│           │   ├── CreateUserSteps.java
│           │   └── LoginSteps.java
│           └── Utils/
│               ├── Base.java
│               ├── BrowserFactory.java
│               ├── ExtentReportManager.java
│               └── Listener.java
├── pom.xml
└── README.md
```

## Technologies & Dependencies

### Core Technologies
- **Java 21**: Primary programming language
- **Kotlin 2.2.20**: Secondary language (used for LoginPage)
- **Cucumber 7.15.0**: BDD framework for test automation
- **Selenium 4.15.0**: Web automation library
- **TestNG 7.8.0**: Testing framework
- **Maven**: Build and dependency management

### Key Dependencies
- **io.cucumber:cucumber-java**: Cucumber implementation for Java
- **io.cucumber:cucumber-junit-platform-engine**: JUnit Platform integration
- **io.cucumber:cucumber-testng**: TestNG integration with Cucumber
- **org.seleniumhq.selenium:selenium-java**: WebDriver API
- **com.aventstack:extentreports**: Advanced reporting framework
- **io.github.bonigarcia:webdrivermanager**: Automated WebDriver management
- **org.junit.jupiter:junit-jupiter**: JUnit 5 testing framework
- **junit:junit**: JUnit 4 compatibility

## Features & Test Scenarios

### 1. Login Feature (`Login.feature`)
- Tests user login functionality with valid credentials
- Validates successful redirection to dashboard
- Verifies welcome message display

**Step Definitions**: `LoginSteps.java`

### 2. Create User Feature (`CreateUser.feature`)
- Tests user account creation with valid details
- Validates form field entry (first name, last name, email, password)
- Tests dropdown group selection
- Verifies successful account creation confirmation

**Step Definitions**: `CreateUserSteps.java`

### 3. Admin Login Feature (`AdminLogin.feature`)
- Tests admin user authentication
- Validates admin panel access
- Tests user approval workflow
- Tests user role management
- Verifies logout functionality

**Step Definitions**: `AdminLogin.java`

## Page Objects

### LoginPage (Kotlin)
Located: `src/test/java/PageObjects/LoginPage.kt`

**Elements**:
- Navigation login button
- Username field
- Password field
- Login button
- Login success message
- Sign up hyperlink

**Methods**:
- `clickNavLoginButton()`: Click the navigation login button
- `enterUsername(username: String)`: Enter username
- `enterPassword(password: String)`: Enter password
- `clickLoginButton()`: Click login button
- `getLoginSuccessMessage()`: Retrieve success message
- `clickSignUpHere()`: Click sign up link

### RegisterPage (Java)
Located: `src/test/java/PageObjects/RegisterPage.java`

**Elements**:
- First name field
- Last name field
- Email field
- Password field
- Confirm password field
- Group dropdown
- Create account button
- Confirmation message

**Methods**:
- `enterFirstName(firstName: String)`: Enter first name
- `enterLastName(lastName: String)`: Enter last name
- `enterEmail(email: String)`: Enter email address
- `enterPassword(password: String)`: Enter password
- `enterConfirmPassword(confirmPassword: String)`: Confirm password
- `selectGroup(group: String)`: Select group from dropdown
- `clickCreateAccount()`: Click create account button
- `getConfirmationMessage()`: Get confirmation message
- `createYourAccountPage()`: Verify create account page

## Utility Classes

### Base.java
Base class for all step definitions providing:
- WebDriver initialization
- LoginPage instance
- RegisterPage instance
- Browser configuration

### BrowserFactory.java
Handles browser initialization and management:
- Chrome browser setup
- WebDriver instantiation
- URL navigation

### ExtentReportManager.java
Manages test reporting:
- Extent Reports integration
- Test result logging
- Report generation

### Listener.java
TestNG listener for test lifecycle events and logging

## Running Tests

### Prerequisites
- Java 21 or higher installed
- Maven installed
- Chrome browser installed
- Internet connection for webdrivermanager

### Execute All Tests
```bash
mvn test
```

### Run Specific Feature
```bash
mvn test -Dcucumber.features="src/main/resources/Features/Login.feature"
```

### Run with TestRunner
```bash
mvn test -Dtest=TestRunner
```

## Test Data

### Login Credentials (AdminLogin.feature)
- **Username**: admin@gmail.com
- **Password**: @12345678

### User Registration Data (CreateUser.feature)
- **First Name**: stella
- **Last Name**: gontse
- **Email**: stella@yopmail.com
- **Password**: Testing@123
- **Confirm Password**: Testing@123

## Test URL
**Base URL**: https://ndosisimplifiedautomation.vercel.app/

## Project Configuration

### POM.xml
The project uses Maven for dependency management with the following key configurations:
- **Source/Target**: Java 21
- **Encoding**: UTF-8
- **Kotlin Version**: 2.2.20

### Plugins
- Kotlin Maven Plugin: Compiles Kotlin code alongside Java
- Maven Compiler Plugin: Handles Java compilation with specific execution order

## Best Practices Implemented

1. **Page Object Model**: Separates page elements from test logic
2. **Step Definitions**: Clear, reusable BDD steps
3. **Base Class**: Centralized WebDriver management
4. **Utility Classes**: Reusable helper functions
5. **Feature Files**: Gherkin syntax for readable test scenarios
6. **Extent Reports**: Comprehensive test reporting with screenshots

## Future Enhancements

- Add more test scenarios for edge cases
- Implement data-driven testing with multiple datasets
- Add screenshot capture on test failures
- Implement CI/CD pipeline integration
- Add performance testing
- Expand admin operations testing

## Troubleshooting

### WebDriver Issues
- Ensure Chrome browser is installed and updated
- WebDriverManager will automatically download the correct driver version

### Compilation Errors
- Verify Java 21 is installed: `java -version`
- Run Maven clean: `mvn clean`
- Rebuild project: `mvn compile`

### Test Failures
- Check internet connectivity (required for application access)
- Verify test URL is accessible
- Review Extent Reports for detailed error messages
- Check browser logs for JavaScript errors

## Contributing
When adding new test scenarios:
1. Create feature files in `src/main/resources/Features/`
2. Implement page objects in `src/test/java/PageObjects/`
3. Add step definitions in `src/test/java/StepDefinitions/`
4. Extend `Base` class in step definitions
5. Follow existing naming conventions

## Author
CucumberProject1 - BDD Automation Suite for Ndosi Platform

## Last Updated
March 8, 2026
