package Utils;

import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import PageObjects.LoginPage;
import PageObjects.RegisterPage;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

}
